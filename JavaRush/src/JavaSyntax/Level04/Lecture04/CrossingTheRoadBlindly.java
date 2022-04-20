package JavaSyntax.Level04.Lecture04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*Переходим дорогу вслепую
Работа светофора для пешеходов запрограммирована следующим образом:
в начале каждого часа в течение трех минут горит зелёный сигнал,
затем в течение одной минуты - жёлтый,
а потом в течение одной минуты - красный,
затем опять зелёный горит три минуты и т. д.
Ввести с клавиатуры вещественное число t, означающее время в минутах, прошедшее с начала очередного часа.
Определить, сигнал какого цвета горит для пешеходов в этот момент.
Результат вывести на экран в следующем виде:
"зелёный" - если горит зелёный цвет,
"жёлтый" - если горит жёлтый цвет,
"красный" - если горит красный цвет.
Пример для числа 2.5:
зелёный
Пример для числа 3:
жёлтый
Пример для числа 4:
красный
Пример для числа 5:
зелёный
 */
public class CrossingTheRoadBlindly {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        double t = Double.parseDouble(br.readLine());

        int b = (int) t;
        int remain = b % 5;
        if (remain == 3) {
            System.out.println("желтый");
            return;
        }

        if (remain == 4) {
            System.out.println("красный");
            return;
        }
        System.out.println("зелёный");
    }
}