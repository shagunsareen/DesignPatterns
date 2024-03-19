package sareen.shagun.design.patterns.Structural.Flyweight;

// Step 1 - Intrinsic State
public class Bullet {
    private Double weight;
    private Double radius;
    private String color;
    private BulletType type;

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public BulletType getType() {
        return type;
    }

    public void setType(BulletType type) {
        this.type = type;
    }

    public Bullet(Double weight, Double radius, String color, BulletType type) {
        this.weight = weight;
        this.radius = radius;
        this.color = color;
        this.type = type;
    }
}
