package JavaSyntax.Level04.Lecture06;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*Цель установлена!
Ввести с клавиатуры два целых числа, которые будут координатами точки, не лежащей на координатных осях OX и OY.
Вывести на экран номер координатной четверти, в которой находится данная точка.
Подсказка:
Принадлежность точки с координатами (a,b) к одной из четвертей определяется следующим образом:
для первой четверти a>0 и b>0;
для второй четверти a<0 и b>0;
для третьей четверти a<0 и b<0;
для четвертой четверти a>0 и b<0.
Пример для чисел 4 6:
1
Пример для чисел -6 -6:
3
 */
public class TargetSet {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());

        if (x==0 || y==0)
            return;

        if (x>0 && y>0)
            System.out.println(1);

        if (x<0 && y>0)
            System.out.println(2);

        if (x<0 && y<0)
            System.out.println(3);

        if (x>0 && y<0)
            System.out.println(4);
    }
}



//    public static void main(String[] args) throws Exception
//    {
//        //напишите тут ваш код
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        int a = Integer.parseInt(reader.readLine());
//        int b = Integer.parseInt(reader.readLine());
//
//        if (a > 0)
//        {
//            if (b > 0)
//                System.out.println(1);
//            else
//                System.out.println(4);
//        }
//        else
//        {
//            if (b > 0)
//                System.out.println(2);
//            else
//                System.out.println(3);
//        }
//
//    }
//}