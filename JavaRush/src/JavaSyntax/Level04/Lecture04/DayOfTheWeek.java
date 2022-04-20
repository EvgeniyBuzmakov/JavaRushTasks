package JavaSyntax.Level04.Lecture04;

/*День недели
Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название
"понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье",
если введен номер больше 7 или меньше 1 - вывести "такого дня недели не существует".
Пример для номера 5:
пятница
Пример для номера 10:
такого дня недели не существует
 */

import java.io.*;

public class DayOfTheWeek {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(reader.readLine());

        if (i == 1)
            System.out.println("понедельник");
        else if (i == 2)
            System.out.println("вторник");
        else if (i == 3)
            System.out.println("среда");
        else if (i == 4)
            System.out.println("четверг");
        else if (i == 5)
            System.out.println("пятница");
        else if (i == 6)
            System.out.println("суббота");
        else if (i == 7)
            System.out.println("воскресенье");
        else
            System.out.println("такого дня недели не существует");

    }

    //альтернативное решение
//    String array[] = {"тест","понедельник","вторник","среда","четверг","пятница","суббота","воскресенье"};
//
//    И далее просто число которое ввели с клавиатуры я использовал как индекс элемента массива
//
//    if(day > 0 && day < 8){
//        System.out.println(array[day]);
//    }

    //альтернативное решение
    //System.out.println(y==1?"понедельник":y==2?"вторник":y==3?"среда":y==4?"четверг":y==5?"пятница":y==6?"суббота":y==7?"воскресенье":"такого дня недели не существует");

}