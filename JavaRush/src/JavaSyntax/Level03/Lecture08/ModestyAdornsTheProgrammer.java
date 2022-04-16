package JavaSyntax.Level03.Lecture08;

import java.io.*;

/*Скромность украшает программиста
Ввести с клавиатуры имя и вывести надпись:
name зарабатывает $5,000. Ха-ха-ха!
Пример:
Тимур зарабатывает $5,000. Ха-ха-ха!
 */

public class ModestyAdornsTheProgrammer {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String name = br.readLine();
        System.out.println(name + " зарабатывает $5,000. Ха-ха-ха!");
    }
}