public class BaseShooter {
    protected double velocity;
    protected double angle;
    public void setVelocityAndAngle(double velocity, double angle) {
        this.velocity = angle;
        this.angle = angle;
    }
        
    public void shoot() {
        System.out.println("pew pew");
    }

    public void stop() {
        System.out.println("stopped pew pew");
    }
}