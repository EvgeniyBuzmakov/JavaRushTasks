package JavaSyntax.Level04.Lecture06;

/*Минимум двух чисел Ӏ Java Syntax: 4 уровень, 6 лекция
Ввести с клавиатуры два целых числа, и вывести на экран минимальное из них.
Если два числа равны между собой, необходимо вывести любое.
 */
import java.io.*;

public class MinimumOfTwoNumbers {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(reader.readLine());
        int y = Integer.parseInt(reader.readLine());

        if (x<y)
            System.out.println(x);
        if (y<x)
            System.out.println(y);
        else
            System.out.println(x);
    }
}

//    public static void main(String[] args) throws Exception {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println(
//                (int) Math.min(
//                        Double.parseDouble(reader.readLine()),
//                        Double.parseDouble(reader.readLine())
//                )
//        );
//    }