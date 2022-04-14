package JavaSyntax.Level03.Lecture03;
/*Задача на проценты
Напиши код метода addTenPercent, который увеличивает переданное целое число на 10%.
Для возврата результата из метода addTenPercent используй оператор return.
 */
public class InterestTask {
    public static double addTenPercent(int i) {
        return i*1.1;
    }

    public static void main(String[] args) {
        System.out.println(addTenPercent(19));
    }
}