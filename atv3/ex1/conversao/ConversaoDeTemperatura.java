package conversao;

public class ConversaoDeTemperatura {
    public static double cToF(double c) {
        return (9.0/5.0)*c + 32;
    }
    public static double cToK(double c) {
        return c + 273.15;
    }
    public static double fToC(double f) {
        return (5.0/9.0)*(f-32);
    }
    public static double kToC(double k) {
        return k - 273.15;
    }
    public static double fToK(double f) {
        return (5.0/9.0)*(f+459.67);
    }
    public static double kToF(double k) {
        return (9.0/5.0)*k-459.67;
    }
}
