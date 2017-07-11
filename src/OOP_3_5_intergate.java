/**
 * Created by ihgorek on 7/10/17.
 */
import java.util.function.DoubleUnaryOperator;

public class OOP_3_5_intergate {
    public static void main(String[] args) {
        /*System.out.println(integrate(x -> 1, 0, 10));//10.0
        System.out.println(integrate(x -> x + 2, 0, 10));//70.0
        System.out.println(integrate(x -> Math.sin(x) / x , 1, 5));//0.603848*/
        byte[] example = {72, 101, 108, 108, 111, 33};
        AsciiCharSequence answer = new AsciiCharSequence(example);
        System.out.println("Последовательность - " + answer.toString());//Hello!
        System.out.println("Размер её - " + answer.length());//6
        System.out.println("Символ под № 1 - " + answer.charAt(1));//e
        System.out.println("Подпоследовательность - " + answer.subSequence(1, 5));//ello
//проверка на нарушение инкапсуляции private поля
        System.out.println(answer.toString());//Hello!
        example[0] = 74;
        System.out.println(answer.toString());//Hello!
    }

    public static double integrate (DoubleUnaryOperator f, double a, double b) {
        double ans,h,n;
        ans = 0;
        n = 1000000;
        h = (b-a)/n;
        for (int i =  0; i <  n; i ++) {
            ans += f.applyAsDouble(a+i*h);
        }
        return ans*h;
    }
}
