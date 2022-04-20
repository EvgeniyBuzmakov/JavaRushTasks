package JavaSyntax.Level04.Lecture04;
/*
Существует ли пара?
Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел.
Если все три числа равны между собой, то вывести все три.
Примеры:
а) при вводе чисел
1
2
2
получим вывод
2 2
б) при вводе чисел
2
2
2
получим вывод
2 2 2
 */
import java.io.*;

public class IsThereACouple {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(reader.readLine());
        int y = Integer.parseInt(reader.readLine());
        int z = Integer.parseInt(reader.readLine());

        if (x==y  && x!=z && z!=y) {
            System.out.print(x + " " + y);
        }

        if (x==z && x!=y && y!=z) {
            System.out.print(x + " " + z);
        }

        if (y==z && y!=x && z!=x) {
            System.out.print(y + " " + z);
        }

        if (x==z && x==y && y==z) {
            System.out.println(x + " " + y + " " + z);
        }
    }
}

//  альтернативное решение
//    public static void main(String[] args) throws Exception
//    {
//        //напишите тут ваш код
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        int a = Integer.parseInt(reader.readLine());
//        int b = Integer.parseInt(reader.readLine());
//        int c = Integer.parseInt(reader.readLine());
//        if (a==b)
//        {
//            if (a==c)
//                System.out.print(a + " " + b + " " + c);
//            else
//                System.out.print(a + " " + b);
//        }
//        else
//        {
//            if (a==c)
//                System.out.print(a + " " + c);
//            if (b==c)
//                System.out.print(b + " " + c);
//        }
//
//
//
//    }
// }