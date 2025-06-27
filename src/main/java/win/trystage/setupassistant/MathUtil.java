package win.trystage.setupassistant;

public class MathUtil {
    public static double roundToHalf(double value) {
        return Math.round(value * 2.0) / 2.0;
    }
    public static float roundTo45s(double value) {
        return Math.round(value / 45.0) * 45;
    }
}
