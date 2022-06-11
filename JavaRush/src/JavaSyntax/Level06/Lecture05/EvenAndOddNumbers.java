package JavaSyntax.Level06.Lecture05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Чётные и нечётные циферки
Ввести с клавиатуры положительное число. Определить, сколько в введенном числе четных цифр, а сколько нечетных.
Если число делится без остатка на 2 (т. е. остаток равен нулю), значит оно четное.
Увеличиваем на 1 счетчик четных цифр (статическая переменная even).
Иначе число нечетное, увеличиваем счетчик нечетных цифр (статическая переменная odd).
Вывести на экран сообщение: "Even: а Odd: b", где а - количество четных цифр, b - количество нечетных цифр.
Пример для числа 4445:
Even: 3 Odd: 1
 */
public class EvenAndOddNumbers {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        int a = 0;
        for (int i=0; i<s.length(); i++){
            a = Integer.parseInt(Character.toString(s.charAt(i)));

            if ((a % 2) == 0)
                even += 1;
            else
                odd += 1;
        }
        //Even: а Odd: b
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}