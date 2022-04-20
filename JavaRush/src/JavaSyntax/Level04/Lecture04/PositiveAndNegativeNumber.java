package JavaSyntax.Level04.Lecture04;
/*Положительное и отрицательное число
Ввести с клавиатуры число.
Если число положительное, то увеличить его в два раза.
Если число отрицательное, то прибавить единицу.
Если введенное число равно нулю, необходимо вывести ноль.
Вывести результат на экран.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PositiveAndNegativeNumber {
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(reader.readLine());
        if (i > 0)
            System.out.println(i * 2);
        else if (i < 0)
            System.out.println(i + 1);
        else System.out.println(0);
    }

    //альтернативное решение
    //System.out.println(number==0?0:number<0?(number+1):number*2);

}