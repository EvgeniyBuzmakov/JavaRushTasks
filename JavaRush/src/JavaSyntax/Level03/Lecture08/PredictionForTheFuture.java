package JavaSyntax.Level03.Lecture08;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*Предсказание на будущее
Ввести с клавиатуры отдельно Имя, число1, число2.
Вывести надпись:
"Имя" получает "число1" через "число2" лет.
Пример:
Коля получает 3000 через 5 лет.
 */
public class PredictionForTheFuture {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

        String name = br.readLine();
        int value1 = Integer.parseInt(br.readLine());
        int value2 = Integer.parseInt(br.readLine());

        System.out.println(name + " получает " + value1 + " через " + value2 + " лет.");
    }
}