package JavaSyntax.Level03.Lecture08;

/*Не думать о секундах…
Напиши код, который считает сколько секунд прошло с 15:00, если на часах 15:30. Выведи результат на экран.
 */

import java.util.Date;

public class DontThinkAboutSeconds {

    public static void main(String[] args) {

        int secondsAfter15 = 0;

        Date date = new Date();
        date.setHours(15);
        date.setMinutes(30);

        Date date1 = new Date();
        date1.setHours(15);
        date1.setMinutes(00);

        //System.out.println((date.getTime() - date1.getTime())/1000);

        //secondsAfter15 = (int)(date.getTime() - date1.getTime()/1000);
        //System.out.println(secondsAfter15);

        secondsAfter15 = (date.getMinutes() - date1.getMinutes())*60;
        System.out.println(secondsAfter15);
    }
}