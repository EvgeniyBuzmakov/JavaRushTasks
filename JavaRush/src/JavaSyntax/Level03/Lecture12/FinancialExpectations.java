package JavaSyntax.Level03.Lecture12;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*Финансовые ожидания
Ввести с клавиатуры число n.
Вывести на экран надпись "Я буду зарабатывать $n в час".
Пример:
Я буду зарабатывать $50 в час
 */
public class FinancialExpectations {

    public static void main(String[] args)   throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Я буду зарабатывать $" + Integer.parseInt(reader.readLine()) + " в час");

        //int i = Integer.parseInt(reader.readLine());
        //System.out.println("Я буду зарабатывать $" + i + " в час");
    }
}