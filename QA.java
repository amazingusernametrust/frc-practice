import java.util.Scanner;

public class QA {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in)
    
}
public static double calculateMotorPower(double voltage , double current){
    return voltage * current;
}
public static double limitSpeed(double requestedSpeed , double maxSpeed){
    if (requestedSpeed > maxSpeed) {
        return maxSpeed;
    }
    return requestedSpeed;
}
public static double calculateTravelTime(double distance , double speed){
    if (speed == 0) {
        return Double.POSITIVE_INFINITY; //
    };
}
}
