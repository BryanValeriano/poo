public class ex1 {
    public static void main(String[] args) {
        double ans = 0;
        boolean aux = true;

        for(double i = 1; i < 100000; i+=2) {
            aux = !aux; 
            ans += (aux? -1/i : 1/i);
        }

        System.out.println(ans*4);
    }
}
