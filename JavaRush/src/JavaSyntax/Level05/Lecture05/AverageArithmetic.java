package JavaSyntax.Level05.Lecture05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*Среднее арифметическое
Вводить с клавиатуры числа и вычислить среднее арифметическое.
Если пользователь ввел -1, вывести на экран среднее арифметическое всех чисел и завершить программу.
-1 не должно учитываться.
Примеры:
а) при вводе чисел
1
2
2
4
5
-1
получим вывод
2.8
 */
public class AverageArithmetic {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double sum = 0, count = 0, i = 0, result = 0;

        while(i!=-1) {
            i = Double.parseDouble(reader.readLine());
            if (i==-1)
                break;
            sum = sum + i;
            count++;
            result = sum/count;
        }

        System.out.println(result);
    }
}