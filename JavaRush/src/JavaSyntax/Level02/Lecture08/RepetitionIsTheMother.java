package JavaSyntax.Level02.Lecture08;
/*Повторенье-мать
Реализуй метод print3. Метод должен вывести на экран переданную строку 3 раза.
Каждый раз с новой строки.
 */
public class RepetitionIsTheMother {
    public static void print3(String s) {
        //напишите тут ваш код
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);

    }

    public static void main(String[] args) {
        print3("I love you!");
    }
}