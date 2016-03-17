package ClarkRPG.level.tile;

import ClarkRPG.graphics.Screen;
import ClarkRPG.graphics.Sprite;

public class VoidTile extends Tile {

    // Void Tile (0), Walkable, Buildable, No Value

    public VoidTile(Sprite sprite) {
        super(sprite);
    }

    public void render(int x, int y, Screen screen) {
        screen.renderTile(x << 4, y << 4, this);
    }

}