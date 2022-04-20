package JavaSyntax.Level04.Lecture04;
/*Хорошо или плохо?
Написать метод compare(int number), чтобы он:
- выводил на экран строку "Число меньше 5", если параметр метода меньше 5,
- выводил строку "Число больше 5", если параметр метода больше 5,
- выводил строку "Число равно 5", если параметр метода равен 5.
 */
public class GoodOrBad {
    public static void main(String[] args) {
        compare(3);
        compare(6);
        compare(5);
    }

    public static void compare(int a) {
        //напишите тут ваш код
        System.out.println(a > 5 ? "Число больше 5": a < 5 ? "Число меньше 5": "Число равно 5");

//второй вариант решения
//        if (a < 5)
//            System.out.println("Число меньше 5");
//        if (a > 5)
//            System.out.println("Число больше 5");
//        else if (a == 5)
//            System.out.println("Число равно 5");
    }
}