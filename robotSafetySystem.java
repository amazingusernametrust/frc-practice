import java.util.Scanner;
public class robotSafetySystem {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean frontObstacle;
    double robotSpeed;
    boolean enabled;
    System.out.print("frontObstacle (true/false)");
    frontObstacle = scanner.nextBoolean();

    System.out.print("robotSpeed (true/false)");
    robotSpeed = scanner.nextDouble();

    System.out.print("enabled (true/false)");
    enabled = scanner.nextBoolean();
    while (robotSpeed<100) {
        
        

    if (enabled) {
        System.out.print("Robot Disabled");
    }
    if (frontObstacle && robotSpeed>0.5){
        System.out.print("SLOW DOWN RN");
    }
    
    if (frontObstacle && robotSpeed<0.5 || robotSpeed>0){
        System.out.print("STOP THERES A THING OVER THERE");   
    }
    frontObstacle = scanner.nextBoolean();
    robotSpeed = scanner.nextDouble();
    enabled = scanner.nextBoolean();
    }
}
}
