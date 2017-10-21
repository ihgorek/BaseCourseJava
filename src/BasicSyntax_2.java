import java.math.BigInteger;
import java.util.*;

/**
 * Created by Игорь on 28.06.2017.
 */
public class BasicSyntax_2 {
    public static void main(String[] args) {
        /*
        А ЗДЕСЬ ВСЁ ОБЪЯВЛЯЕМ И ВЫЗЫВАЕМ ПРОГРАММУ//
        Here we declare and call the program
         */
        String[] roles,text_lines;
        int k = 0;
        String str;
        roles = new String[3];
        text_lines = new String[17];
        for (int i = 0; i < roles.length; i++){
            roles[i] = "a" + i;
        }
        for (int i = 0; i < text_lines.length; i++){
            str = "d" + i;
            text_lines[i] = roles[k]+ ":" + " " + str;
            k++;
            if (k == roles.length) {
                k = 0;
            }
        }
        //System.out.println(Arrays.toString(text_lines));
        System.out.println(printTextPerRole(roles,text_lines));

    }
    /*
                        ПРИМИТИВНЫЕ ТИПЫ / Primitive types
    1. На вход подается 4 переменные типа boolean вывести true, если только две из них true//

        4 boolean variables are output to the input, output true if only two of them are true
     */
    public static boolean true_false(boolean a, boolean b, boolean c, boolean d){
        return !((a == b) && (a == c) && (a == d) && (b == c) && (b == d) && (c == d)) && !(a ^ b ^ c ^ d);
    }

    /*
    2. Реализуйте метод, возвращающий ответ на вопрос: правда ли, что a + b = c?
    Допустимая погрешность – 0.0001 (1E-4)

    Implement the method that returns the answer to the question: Is it true that a + b = c?
    The permissible error is 0.0001 (1E-4)
     */
    public static boolean doubleExpression(double a, double b, double c) {
        return Math.abs(a - c + b)<=1E-4;
    }
    /*
    3. Реализуйте метод flipBit, изменяющий значение одного бита заданного целого
     числа на противоположное. Данная задача актуальна, например, при работе с битовыми полями.
     */
    public static int flipBit(int value, int bitIndex) {
        return value ^ (1<<bitIndex-1); // put your implementation here
    }
    /*
                        ПРЕОБРАЗОВАНИЕ ТИПОВ/ Type conversions
    4. Реализуйте метод, который возвращает букву, стоящую в таблице UNICODE после символа "\"
     (обратный слэш) на расстоянии a.

     Implement the flipBit method, which changes the value of one bit of the specified integer
     Numbers on the opposite. This task is relevant, for example, when working with bit fields.
     */
    public static char charExpression(int a) {
        return  (char) ((int)'\\' +  a);
    }
    /*
    5. Реализуйте метод, проверяющий, является ли заданное число по абсолютной величине степенью двойки.

    Implement a method that checks whether a given number in absolute value is a power of two.

    Integer.numberOfLeadingZeros - количестко нулевых битов после числа
    Integer.numberOfTrailingZeros - количество нулевых битов в числе(типа)
     */
    public static boolean isPowerOfTwo(int value) {
        value = Math.abs(value);
        return Integer.numberOfLeadingZeros(value) + Integer.numberOfTrailingZeros(value) == 31; // you implementation here
    }
    /*
                        МАССИВЫ И СТРОКИ / Arrays and strings
    6. Реализуйте метод, проверяющий, является ли заданная строка палиндромом.

    Implement a method that checks whether the given string is a palindrome.
     */
    public static boolean isPalindrome(String text) {
        String str,rep_str,str_new;
        StringBuffer rts;
        rep_str = "[^a-zA-Z0-9]"; //регулярное выражение
        str = text.replaceAll(rep_str, "");
        rts =  new StringBuffer(str);
        rts.reverse();
        str_new = new String(rts);
        return str.equalsIgnoreCase(str_new); // your implementation here
    }
    /*
                        УПРАВЛЯЮЩИЕ КОНСТРУКЦИИ: УСЛОВНЫЕ ОПЕРАТОРЫ И ЦИКЛЫ /
                        MANAGEMENT CONSTRUCTIONS: CONVENTIONAL OPERATORS AND CYCLES

    7. Реализуйте метод, вычисляющий факториал заданного натурального числа.
    Implement a method that calculates the factorial of a given natural number.
     */
    public static BigInteger factorial(int value) {
        BigInteger ans,v;
        ans = BigInteger.valueOf(1);
        for (int i = 0; i < value; i++){
            v = BigInteger.valueOf(i+1);
            ans = ans.multiply(v);
        }
        return ans; // your implementation here
    }
    /*
    Реализуйте метод, сливающий два отсортированных по неубыванию массива чисел в один
     отсортированный в том же порядке массив.
     */
    public static int[] mergeArrays(int[] a1, int[] a2) {
        int [] arr;
        int count1, count2;
        count1 = count2 = 0;
        arr = new int[a1.length + a2.length];
        for (int i = 0; i < arr.length; i++) {
            if (count1 > a1.length-1) {
                arr[i] = a2[count2];
                count2++;
                continue;
            }
            if (count2 > a2.length-1) {
                arr[i] = a1[count1];
                count1++;
                continue;
            }
            if (a1[count1] <= a2[count2]) {
                arr[i] = a1[count1];
                count1++;
            }
            else if (a2[count2] < a1[count1]) {
                arr[i] = a2[count2];
                count2++;
            }
        }
        return arr; // your implementation here
    }
    /*
    Вам дан список ролей и сценарий пьесы в виде массива строчек.

    Каждая строчка сценария пьесы дана в следующем виде:
    Роль: текст

    Текст может содержать любые символы.

    Напишите метод, который будет группировать строчки по ролям,
    пронумеровывать их и возвращать результат в виде готового текста
     */
    public static String printTextPerRole(String[] roles, String[] textLines) {
        String reg,name_character, character_words, ans, eo;
        StringBuilder str_new = new StringBuilder();
        int label;
        reg = ":";
        eo = "\n";
        for (int i = 0; i < roles.length; i++){
            //System.out.println(roles[i]+":");
            str_new = str_new.append(roles[i]).append(reg).append(eo);
            for (int j = 0; j < textLines.length; j++){
                label = textLines[j].indexOf(reg);
                name_character = textLines[j].substring(0,label);
                if (roles[i].equals(name_character)) {
                    character_words = textLines[j].substring(label+2,textLines[j].length());
                    //System.out.printf("%d)%s\n",j+1,character_words);
                    str_new =  str_new.append(j+1).append(") ").append(character_words).append(eo);
                }
            }
            if (i != roles.length-1){
                //System.out.println("");
                str_new = str_new.append(eo);
            }
        }
        ans = str_new.toString();
        return ans;
    }
}
