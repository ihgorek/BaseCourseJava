/**
 * Created by ihgorek on 7/15/17.
 */

public class Zeroo {
    public static void main(String[] args) throws java.lang.Exception {
        /*double v= 7;
        Prov b = new Prov(3);
        Prov a = new Prov(4);
        Prov a = (Prov) b;*/
        System.out.println(Math.sqrt(9));
        System.out.println(sqrt(-4));

    }
    //@Override
    public static double sqrt(double x) {
        if (x <0)
            throw new IllegalArgumentException(x);
        else
            return Math.sqrt(x); // your implementation here
    }
    public static class IllegalArgumentException extends RuntimeException {
        public IllegalArgumentException (double x) {
            super("Expected non-negative number, got " + x);
        }
    }
}
