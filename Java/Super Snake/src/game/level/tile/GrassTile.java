package game.level.tile;

import game.graphics.Screen;
import game.graphics.Sprite;

/**
 * Created by Clark Elliott on 6/7/2014.
 */

public class GrassTile extends Tile {

    // Grass Tile (1), Walkable, Buildable, No Value

    public GrassTile(Sprite sprite) {
        super(sprite);
    }

    public void render(int x, int y, Screen screen) {
        screen.renderTile(x << 4, y << 4, this);
    }

}