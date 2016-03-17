package game;

import game.graphics.Screen;
import game.input.Keyboard;
import game.level.RandomLevel;
import game.level.Level;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;

/**
 * Created by Clark Elliott on 6/7/2014.
 */

public class Game extends Canvas implements Runnable {

      public static int width = 500;
      public static int height = width / 16 * 9;
      public static int scale = 3;
      public static String title = "Super Snake";

    private Thread thread;
    private JFrame frame;
    private Keyboard key;
    private boolean running = false;
    private Level level;
    private Screen screen;
    private int moveSpeed = 1;
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
        }   catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void run() {
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
        if (key.up && y >= -138) y-= moveSpeed;
            if (key.down && y <= 1280) y += moveSpeed;
            if (key.left && x >= -249) x -= moveSpeed;
            if (key.right && x <= 1280) x += moveSpeed;
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
            overlayMenus.drawRect((width/2*3), (height/2*3), (16*scale), (16*scale));
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