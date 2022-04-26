package JavaSyntax.Level04.Lecture10;

import java.io.*;

/*Хорошего много не бывает
Ввести с клавиатуры строку и число N больше 0.
Вывести на экран строку N раз используя цикл while. Каждое значение с новой строки.
Пример ввода:
абв
2
Пример вывода:
абв
абв
 */
public class ThereIsNotMuchGood {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int n = Integer.parseInt(br.readLine());

        int i=0;
        while (i<n) {
            System.out.println(s);
            i++;
        }
    }
}