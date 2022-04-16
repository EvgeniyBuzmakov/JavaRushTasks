package JavaSyntax.Level03.Lecture08;

/*Большая и чистая
Ввести с клавиатуры три имени, вывести на экран надпись:
name1 + name2 + name3 = Чистая любовь, да-да!
Пример:
Вася + Ева + Анжелика = Чистая любовь, да-да!
 */

import java.io.*;

public class BigAndClean {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));

        String name1 = br.readLine();
        String name2 = br.readLine();
        String name3 = br.readLine();


        //Вася + Ева + Анжелика = Чистая любовь, да-да!
        System.out.println(name1 + " + " + name2 + " + " + name3 + " = Чистая любовь, да-да!");
    }
}