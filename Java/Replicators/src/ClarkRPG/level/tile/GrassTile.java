package ClarkRPG.level.tile;

import ClarkRPG.graphics.Screen;
import ClarkRPG.graphics.Sprite;

public class GrassTile extends Tile {

    // Grass Tile (1), Walkable, Buildable, No Value

    public GrassTile(Sprite sprite) {
        super(sprite);
    }

    public void render(int x, int y, Screen screen) {
        screen.renderTile(x << 4, y << 4, this);
    }

}