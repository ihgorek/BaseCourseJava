/**
 * Created by ihgorek on 7/10/17.
 */
public final class ComplexNumber {
    private final double re;
    private final double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object){
            return true;
        }
        if (object == null) {
            return false;
        }
        if (getClass() !=  object.getClass()){
            return false;

        }
        ComplexNumber obj = (ComplexNumber) object;

        if (Double.compare(obj.re, re) != 0) {
            return false;
        }
        return Double.compare(obj.im, im) == 0;
    }

    @Override
    public int hashCode() {
        int ans;
        long a;
        a = Double.doubleToLongBits(re);
        ans = (int) (a ^ (a >>> 32));
        a = Double.doubleToLongBits(im);
        ans = 31 * result + (int) (a ^ (a >>> 32));
        return ans;
    }

}