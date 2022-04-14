package JavaSyntax.Level03.Lecture08;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*План по захвату мира
Ввести с клавиатуры число и имя, вывести на экран строку:
"имя" захватит мир через "число" лет. Му-ха-ха!
Пример:
Вася захватит мир через 8 лет. Му-ха-ха!
Последовательность вводимых данных имеет большое значение.
 */
public class PlanToTakeOverTheWorld {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStreamReader sreader = new InputStreamReader (System.in);
        BufferedReader br = new BufferedReader (sreader);

        int age = Integer.parseInt(br.readLine());
        String name = br.readLine();

        System.out.println (name + " захватит мир через " + age + " лет. Му-ха-ха!");
    }
}