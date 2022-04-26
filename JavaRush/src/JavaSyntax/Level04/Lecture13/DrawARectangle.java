package JavaSyntax.Level04.Lecture13;

import java.util.Scanner;

/*Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
 */
public class DrawARectangle {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner (System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i=0; i<a; i++) {
            for (int j=0; j<b; j++) {
                System.out.print("8");
            }
            System.out.println();
        }

    }
}


//    public static void main(String[] args) throws Exception {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        int m = Integer.parseInt(reader.readLine());
//        int n = Integer.parseInt(reader.readLine());
//
//        for (int j = 1; j<=m; j++) {
//            for (int i = 1; i <= n; i++) {
//                if (i < n)
//                    System.out.print(8);
//                else
//                    System.out.println(8);
//            }
//        }
//    }
//}