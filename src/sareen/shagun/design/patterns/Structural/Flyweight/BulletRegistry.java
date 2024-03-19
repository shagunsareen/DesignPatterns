package sareen.shagun.design.patterns.Structural.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class BulletRegistry {

    private Map<BulletType, Bullet> bullets = new HashMap<>();

    public void addBullet(Bullet bullet) {
        bullets.put(bullet.getType(), bullet);
    }

    public void getBullet(Bullet bullet) {
        bullets.get(bullet.getType());
    }
}
