package ClarkRPG.entity.mob;

import ClarkRPG.entity.Entity;
import ClarkRPG.graphics.Sprite;

public abstract class Mob extends Entity {

    protected Sprite sprite;
    protected int dir = 0;
    protected boolean isMoving = false;

    public void move() {

    }

    public void update() {

    }

    private boolean collision() {
        return false;
    }

    


}
