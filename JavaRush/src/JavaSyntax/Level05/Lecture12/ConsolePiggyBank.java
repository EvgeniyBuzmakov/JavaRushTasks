package JavaSyntax.Level05.Lecture12;

/*Консоль-копилка
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введет слово "сумма".
Вывести на экран полученную сумму.
Подсказка: реализовать считывание с клавиатуры, пока не будет введена определенная строка, например "exit", можно с помощью следующей конструкции:
BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
while (true)
{
	String s = buffer.readLine();
	if (s.equals("exit"))
		break;
}
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConsolePiggyBank {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String inp = "";
        int sum = 0;
        int a = 0;

        while (!inp.equals("сумма")) {
            inp =  br.readLine();
            try {
                a = Integer.parseInt(inp);
                sum += a;
            } catch (NumberFormatException e) {
                continue;
            }
        }
        System.out.println(sum);
    }
}