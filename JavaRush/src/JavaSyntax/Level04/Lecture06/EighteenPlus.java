package JavaSyntax.Level04.Lecture06;

/* 18+
Ввести с клавиатуры имя и возраст. Если возраст меньше 18 вывести надпись "Подрасти еще".
 */

import java.io.*;

public class EighteenPlus {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
        String name = br.readLine();
        int age = Integer.parseInt(br.readLine());

        if (age<18)
            System.out.println("Подрасти еще");
    }
}