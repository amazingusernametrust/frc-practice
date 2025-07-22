import java.util.Scanner;

public class robotturnradius {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter Robot Speed (m/s):");
    double velocity = scanner.nextDouble();
    System.out.print("Enter Robot Angular Speed (degrees/s):");
    double turnRate = scanner.nextDouble();
    double turnRateRadians = Math.toRadians(turnRate);
    double turnRadius = velocity / turnRateRadians;
    Object system;
        system.out.println("Turn Radius is " + turnRadius + " meters");
    scanner.close();

    }

}
