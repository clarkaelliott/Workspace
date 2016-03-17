package ClarkRPG;

import ClarkRPG.entity.mob.Replicator;
import ClarkRPG.graphics.Screen;
import ClarkRPG.input.Keyboard;
import ClarkRPG.level.Level;
import ClarkRPG.level.RandomLevel;
import javafx.scene.text.FontWeight;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.text.AttributedCharacterIterator;

public class Game extends Canvas implements Runnable {
    private static final long serialVersionUID = 1L;

    public static int width = 500;
    public static int height = width / 16 * 9;
    public static int scale = 3;
    public static String title = "Clark's RPG";

    private Thread thread;
    private JFrame frame;
    private Keyboard key;
    private boolean running = false;
    private Level level;
    private int moveSpeed = 4;

    private Screen screen;

    private BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    private int[] pixels = ((DataBufferInt)image.getRaster().getDataBuffer()).getData();


    public Game() {
        Dimension size = new Dimension(width * scale, height * scale);
        setPreferredSize(size);
        screen = new Screen(width, height);

        frame = new JFrame();
        key = new Keyboard();
        level = new RandomLevel(128, 128);

        addKeyListener(key);
    }

    public synchronized void start() {
        running = true;
        thread = new Thread(this, "Display");
        thread.start();
    }

    public synchronized void stop() {
        running = false;
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void run() {
        // TIMER
        long lastTime = System.nanoTime();
        long timer = System.currentTimeMillis();
        final double ns = 1000000000.0 / 60.0;
        double delta = 0;
        int frames = 0;
        int updates = 0;
        requestFocus();
        // Game Loop
        while (running) {
            long now = System.nanoTime();
            delta += (now - lastTime) / ns;
            lastTime = now;
            while (delta >= 1) {
                update();
                updates++;
                delta--;
            }
            render();
            frames++;

            if (System.currentTimeMillis() - timer > 1000) {
                timer += 1000;
                frame.setTitle(title + "   |   UPS: " + updates + "    FPS:" + frames + "  X: " + x + "  Y: " + y);
                updates = 0;
                frames = 0;
            }

        }
    }
    int x=0, y=0;
    public void update() {
        key.update();
        if (key.up) y -= moveSpeed;
        if (key.down) y += moveSpeed;
        if (key.left) x -= moveSpeed;
        if (key.right) x += moveSpeed;
    }

    public void render() {
        BufferStrategy bs = getBufferStrategy();
        if (bs == null) {
            createBufferStrategy(3);
            return;
        }
        screen.clear();
        level.render(x, y, screen);

        for (int i = 0; i < pixels.length; i++) {
            pixels[i] = screen.pixels[i];
        }

        Graphics g = bs.getDrawGraphics();
        {

            g.fillRect(0, 0, getWidth(), getHeight());
            g.drawImage(image, 0, 0, getWidth(), getHeight(), null);

        }

        Graphics overlayMenus = bs.getDrawGraphics();
        {
            overlayMenus.setColor(Color.BLACK);
            overlayMenus.fillRect(0, 0, 150, 70);
            overlayMenus.fillRect(250, 740, 1000, 100);
            overlayMenus.setColor(Color.RED);
            overlayMenus.drawRect(0, 0, 150, 70);
            overlayMenus.drawRect(250, 740, 1000, 100);
            overlayMenus.drawRect(260, 750, 80, 80);
            overlayMenus.drawRect(350, 750, 80, 80);
            overlayMenus.drawRect(440, 750, 80, 80);
            overlayMenus.setColor(Color.WHITE);
            overlayMenus.drawString("Replicators: ", 5, 15);
            overlayMenus.drawString("Intelligence: ", 5, 35);
            overlayMenus.drawString("Humans: ", 5, 55);
        }

        Replicator.replicator.render(screen);


        g.dispose();
        overlayMenus.dispose();
        bs.show();
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.frame.setResizable(false);
        game.frame.setTitle(Game.title);
        game.frame.add(game);
        game.frame.pack();
        game.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        game.frame.setLocationRelativeTo(null);
        game.frame.setVisible(true);

        game.start();
    }

}

