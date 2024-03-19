package sareen.shagun.design.patterns.Structural.Flyweight;


// Step 2 - Extrinsic state
public class FlyingBullet {
    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Double getZ() {
        return z;
    }

    public void setZ(Double z) {
        this.z = z;
    }

    public Double getDirection() {
        return direction;
    }

    public void setDirection(Double direction) {
        this.direction = direction;
    }

    public Bullet getBullet() {
        return bullet;
    }

    public void setBullet(Bullet bullet) {
        this.bullet = bullet;
    }

    private Double x, y, z;  //co-ordinates
    private Double direction;

    // Step 3 - Add a has-a relation
    private Bullet bullet;

    public FlyingBullet(Double x, Double y, Double z, Double direction, Bullet bullet) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.direction = direction;
        this.bullet = bullet;
    }

}
