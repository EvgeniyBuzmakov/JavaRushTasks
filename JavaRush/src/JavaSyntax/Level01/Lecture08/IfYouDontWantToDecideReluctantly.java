package JavaSyntax.Level01.Lecture08;
/*Не хочешь - решай нехотя
Напиши программу, которая выводит на экран надпись: "Хочешь - решай задачи, не хочешь - решай нехотя" 16 раз.
 */
public class IfYouDontWantToDecideReluctantly {
    public static void main(String[] args)
    {
        //напишите тут ваш код
        print4Times("Хочешь - решай задачи, не хочешь - решай нехотя");
        print4Times("Хочешь - решай задачи, не хочешь - решай нехотя");
        print4Times("Хочешь - решай задачи, не хочешь - решай нехотя");
        print4Times("Хочешь - решай задачи, не хочешь - решай нехотя");
    }

    public static void print4Times(String s)
    {
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
    }
}