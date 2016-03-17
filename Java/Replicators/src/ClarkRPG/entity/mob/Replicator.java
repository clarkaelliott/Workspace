package ClarkRPG.entity.mob;

import ClarkRPG.graphics.Sprite;

public class Replicator extends Mob {

    public static Mob replicator = new Replicator(50, 50, Sprite.replicator);

public Replicator(int x, int y, Sprite sprite) {
    this.x = x;
    this.y = y;
}


}
