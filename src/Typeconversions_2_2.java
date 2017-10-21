/**
 * Created by Игорь on 27.06.2017.
 */

public class Typeconversions_2_2 {
    public static void main(String[] args) {
        int a;
        a = 16;
        System.out.println(isPowerOfTwo(a));
    }
    /*
    1. Реализуйте метод, который возвращает букву, стоящую в таблице UNICODE после символа "\"
     (обратный слэш) на расстоянии a.
     */
    public static char charExpression(int a) {
        return  (char) ((int)'\\' +  a);
    }
    /*
    2. Реализуйте метод, проверяющий, является ли заданное число по абсолютной величине степенью двойки.
    Integer.numberOfLeadingZeros - количестко нулевых битов после числа
    Integer.numberOfTrailingZeros - количество нулевых битов в числе(типа)
     */
    public static boolean isPowerOfTwo(int value) {
        value = Math.abs(value);
        return Integer.numberOfLeadingZeros(value) + Integer.numberOfTrailingZeros(value) == 31; // you implementation here
    }
}
