public class WheelTest {
    public static void main(String[] args) {
        Wheel[] wheels = {new Wheel(4 * 0.0254, "Back Left"),
        new Wheel(4 * 0.0254, "Back Right"),
        new Wheel(4 * 0.0254, "Front Left"),
        new Wheel(4 * 0.0254, "Front Right")};
        for(Wheel w : wheels) {
            double rps = 10.0*Math.random();
        }
        w.setRotationSpeed(rps);
        }
    }
    
}
