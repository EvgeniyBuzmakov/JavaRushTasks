package JavaSyntax.Level04.Lecture06;

/*Фейс-контроль
Ввести с клавиатуры имя и возраст. Если возраст больше 20 вывести надпись "И 18-ти достаточно".
 */
import java.util.Scanner;

public class FaceControl {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int age = sc.nextInt();

        if (age>20)
            System.out.println("И 18-ти достаточно");
    }
}