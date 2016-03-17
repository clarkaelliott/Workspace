package game.level;

import java.util.Random;

/**
 * Created by Clark Elliott on 6/7/2014.
 */

public class RandomLevel extends Level {

    private static final Random random = new Random();

    public RandomLevel(int width, int height) {
        super(width, height);
    }

    protected void generateRandomLevel() {
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                tiles[x+y*width] = random.nextInt(4);
            }
        }
    }

}
