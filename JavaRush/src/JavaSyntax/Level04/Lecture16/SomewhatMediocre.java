package JavaSyntax.Level04.Lecture16;

import java.io.*;
import java.util.Arrays;

/*Как-то средненько
Ввести с клавиатуры три числа, вывести на экран среднее из них.
Т.е. не самое большое и не самое маленькое.
Если все числа равны, вывести любое из них.
 */
public class SomewhatMediocre {
    public static void main(String[] args)   throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a1 = Integer.parseInt(reader.readLine());
        int b1 = Integer.parseInt(reader.readLine());
        int c1 = Integer.parseInt(reader.readLine());

        if (a1>b1 & a1>c1 & c1>b1) System.out.println(c1);
        if (a1>b1 & a1>c1 & b1>c1) System.out.println(b1);
        if (b1>c1 & b1>a1 & c1>a1) System.out.println(a1);
    }
}


//    public static void main(String[] args) throws Exception {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        int[] arr = new int[3];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = Integer.parseInt(reader.readLine());
//        }
//
//        Arrays.sort(arr);
//        System.out.println(arr[1]);
//    }
//}



//    int min = a;
//     if (b < min) min = b;
//        if (c < min) min = c;
//
//        int max = a;
//        if (b > max) max = b;
//        if (c > max) max = c;
//
//        System.out.print(a+b+c - (min + max));



//    public static void main(String[] args) throws Exception {
//System.out.println(a+b+c-Math.min(Math.min(a,b),c)-Math.max(Math.max(a,b),c));



//    int max = Math.max(Math.max(a,b), c);
//    int min = Math.min(Math.min(a,b), c);
//    int med = (a+b+c)-(min + max);