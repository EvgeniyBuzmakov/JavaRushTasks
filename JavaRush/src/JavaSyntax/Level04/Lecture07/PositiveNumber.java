package JavaSyntax.Level04.Lecture07;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*Положительное число
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел среди этих трех.
Примеры:
а) при вводе чисел
-4
6
6
получим вывод
2
б) при вводе чисел
-6
-6
-3
получим вывод
0
в) при вводе чисел
0
1
2
получим вывод
2
 */
public class PositiveNumber {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int polog=0;

        for (int i=0; i<3; i++) {
            int a = Integer.parseInt(br.readLine());
            if (a>0)
                polog += 1;
        }

        System.out.println("количество положительных чисел = " + polog);
    }
}