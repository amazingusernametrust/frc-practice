import java.security.spec.MGF1ParameterSpec;

public class Wheel {

private double diameter;
double rotationSpeed;
private int position;
public String name;
double circumference;

public Wheel(double wheelDiameter , String name) {
    this.diameter = wheelDiameter;
    this.name = name;
    this.rotationSpeed = 0.0;
    this.position = 0;
    circumference = Math.PI * diameter;
}

public void setRotationSpeed(double rps) {
    rotationSpeed = rps
}

public double getLinearSpeed() {
    return (circumference * rotationSpeed);
}

public double getVelocityInRPS() {
    return rotationSpeed;
}

public void addRotation(double r) {
    position += r;
}

public double getDistanceTraveled() {
    return (circumference * position)
}


