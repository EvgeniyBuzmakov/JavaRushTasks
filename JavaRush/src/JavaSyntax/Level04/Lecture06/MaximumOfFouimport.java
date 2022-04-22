package JavaSyntax.Level04.Lecture06;

/*Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
Если числа равны между собой, необходимо вывести любое.
 */

import java.io.*;
import java.util.Scanner;

public class MaximumOfFouimport {
    public static void main(String[] args) throws Exception {

        //напишите тут ваш код
        //int[] vect = new int [4];

//        Scanner sc = new Scanner(System.in);
//        int max = 0;
//        int a = 0;
//        for (int i=0; i<4; i++) {
////            System.out.print("Введите " + (i+1) + " число :");
//            a = sc.nextInt();
//            if (max <= a) {
//                max = a;
//            }
//        }
//        System.out.println(max);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n1 = Integer.parseInt(reader.readLine());
        int n2 = Integer.parseInt(reader.readLine());
        int n3 = Integer.parseInt(reader.readLine());
        int n4 = Integer.parseInt(reader.readLine());

        System.out.println(Math.max(Math.max(Math.max(n1,n2), n3),n4));

    }
}

//    public static void main(String[] args) throws Exception {
//
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        int n1 = Integer.parseInt(reader.readLine());
//        int n2 = Integer.parseInt(reader.readLine());
//        int n3 = Integer.parseInt(reader.readLine());
//        int n4 = Integer.parseInt(reader.readLine());
//
//        int max;
//        if (n1>n2 && n1>n3 && n1>n4) max=n1;
//        else if (n2>n3 && n2>n4) max=n2;
//        else if (n3>n4) max=n3;
//        else max=n4;
//        System.out.println(max);
//    }
//}


//    public static void main(String[] args) throws Exception {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        int a = Integer.parseInt(reader.readLine());
//        int b = Integer.parseInt(reader.readLine());
//        int c = Integer.parseInt(reader.readLine());
//        int d = Integer.parseInt(reader.readLine());
//
//        System.out.println(returnMax(returnMax(a, b), returnMax(c, d)));
//    }
//
//    private static int returnMax(int a, int b) {
//        return Math.max(a, b);
//    }
//}