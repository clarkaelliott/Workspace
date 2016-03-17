package ClarkRPG.level.tile;

import ClarkRPG.graphics.Screen;
import ClarkRPG.graphics.Sprite;

public class WaterTile extends Tile {

    // Water Tile (1), Walkable, Buildable, No Value

    public WaterTile(Sprite sprite) {
        super(sprite);
    }

    public void render(int x, int y, Screen screen) {
        screen.renderTile(x << 4, y << 4, this);
    }

}