package JavaSyntax.Level04.Lecture06;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*Три числа
Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой. Вывести на экран порядковый номер числа, отличного от остальных.
Пример для чисел 4 6 6:
1
Пример для чисел 6 6 3:
3
 */
public class ThreeNumbers {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if (a==b)  System.out.println(3);
        else {
            if (a==c)
                   System.out.println(2);
            else
                   System.out.println(1);
        }
    }
}


//    public static void main(String[] args) throws Exception {
//        //напишите тут ваш код
//        Scanner sc = new Scanner(System.in);
//        int[] vect = new int[3];
//        int[] vect2 = new int[3];
//
//
//        for (int i=0;i<3;i++) {
//            vect[i] = sc.nextInt();
//        }
//
//        int k = 0;
//        int k1 = 0;
//        int res = 0;
//        for (int i=0;i<3;i++) {
//            k = 0;
//            for (int j = 0; j < 3; j++)
//                if (vect[i] != vect[j]) {
//                    k += 1;
//                }
//            if (k == 2) {
//                res = i;
//                k1 += 1;
//
//            }
//        }
//        if (k1 == 1)
//            System.out.println(res+1);
//    }
//}