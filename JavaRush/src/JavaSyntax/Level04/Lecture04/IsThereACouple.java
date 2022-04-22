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
//   альтернативное решение через массив
//    public static void main(String[] args) throws Exception {
//
//        //напишите тут ваш код
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int[] vect = new int [3];
//
//        for (int i = 0; i < vect.length; i++) {
//            vect[i] = Integer.parseInt(br.readLine());
//        }
//
//        int flag;
//        for (int i = 0; i < vect.length; i++) {
//            flag=0;
//            for (int j=0; j < vect.length; j++) {
//                if (vect[i]==vect[j] && i!=j && vect[i] != -1) {
//                    System.out.print(vect[j]+" ");
//                    vect[j] = -1;
//                    flag = 1;
//                }
//            }
//            if (flag == 1)
//                System.out.print(vect[i]);
//        }
//    }
//}


//    Внимательно нужно обращать внимание на условие задачи
//        1. у нас есть условие
//        -Если все три числа равны между собой, необходимо вывести все три.
//        -Если два числа равны между собой, необходимо вывести числа на экран.
//        Думаем логически, если у нас равны 3 числа, то нужно вывести их на экран.
//        Значит это будет у нас первое  if условие, затем пишем команду и сравниваем 3 числа.
//        НО НЕ ЗАБЫВАЕМ, ЧТО ЕСЛИ ЭТО ВЕРНЫЙ РЕЗУЛЬТАТ, ТО ДРУГИЕ ЧИСЛА УЖЕ НЕ НУЖНО ВЫВОДИТЬ.
//        Как это нам сделать?
//        Все просто
//        If (условие)   //Если выполняется основное условие, оставшийся команды не будут выведены.
//        команда_1;   //Но если основное условие не выполнено, то компилятор проверяет остальное.
//        else if If (условие)
//        команда_2;                     //сравниваем две стороны.
//        If (условие)
//        команда_3;                      //сравниваем две стороны.
//        If (условие)
//        команда_4;                      //сравниваем две стороны.
//
//        И получаем вывод на экран, если что-то совпадает увидем результат, если нет, то будет пусто.
//        Вывод если используем if, то он проверяет все команды.
//        Если используем if, затем else if (при выполнение первого условия, остальные условия не будут проверяться)
//        Из-за этого и выдает ошибку: если вы пытаетесь, все сделать через if.
//        Если все три числа равны между собой, необходимо вывести все три.
//(a == b && b == c)
//(a == b || a == c)
//(b == c)