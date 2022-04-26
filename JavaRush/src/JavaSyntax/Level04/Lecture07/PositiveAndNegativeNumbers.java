package JavaSyntax.Level04.Lecture07;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*Положительные и отрицательные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе, в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б",
где а, б - искомые значения.
Пример:
а) при вводе чисел
2
5
6
получим вывод
количество отрицательных чисел: 0
количество положительных чисел: 3
Пример:
б) при вводе чисел
-2
-5
6
получим вывод
количество отрицательных чисел: 2
количество положительных чисел: 1
 */
public class PositiveAndNegativeNumbers {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int otric=0;
        int polog=0;

        for (int i=0; i<3; i++) {
            int a = Integer.parseInt(br.readLine());
            if (a<0)
                otric += 1;
            if (a>0)
                polog += 1;
        }

        System.out.println("количество отрицательных чисел: " + otric);
        System.out.println("количество положительных чисел: " + polog);

    }
}