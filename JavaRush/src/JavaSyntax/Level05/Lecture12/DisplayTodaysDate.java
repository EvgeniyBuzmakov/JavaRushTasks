package JavaSyntax.Level05.Lecture12;

/*Вывести на экран сегодняшнюю дату
Вывести на экран текущую дату в аналогичном виде "21 02 2014".
 */

import java.text.SimpleDateFormat;
import java.util.Date;

public class DisplayTodaysDate {
    public static void main(String[] args) {

        //напишите тут ваш код
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat ("dd MM yyyy");

        System.out.println(format.format(date));
    }
}