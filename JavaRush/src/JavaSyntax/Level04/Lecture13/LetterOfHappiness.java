package JavaSyntax.Level04.Lecture13;

import java.util.Scanner;

/*Письмо счастья
Ввести с клавиатуры имя и используя цикл for 10 раз вывести: <имя> любит меня.
Пример вывода на экран для имени Света:
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
 */
public class LetterOfHappiness {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        for (int i=0; i<10; i++)
            System.out.println(s + " любит меня.");
    }
}