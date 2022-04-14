package JavaSyntax.Level03.Lecture04;
/*Сумма 5 чисел
Вывести на экран сумму чисел от 1 до 5 построчно (должно быть 5 строк):
1
1+2=3
1+2+3=6
 */
public class SumOf5Numbers {
    public static void main(String[] args) {
        int result = 0;
        for (int i = 1; i < 6; i++) {
            result = i + result;
            System.out.println(result);
        }
    }
}