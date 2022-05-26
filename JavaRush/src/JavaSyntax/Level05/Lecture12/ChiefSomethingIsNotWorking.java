package JavaSyntax.Level05.Lecture12;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*Шеф, что-то не пашет
Задача: Программа считывает два числа с клавиатуры и выводит их сумму на экран.
 */
public class ChiefSomethingIsNotWorking {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //int a = reader.readLine();  // несовместимые типы
        //int b = reader.read();      // возвращает на целое число, а число из кодировки символа char при приведении его к int.

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());


        int sum = a + b;
        System.out.println("Sum = " + sum);

    }
}