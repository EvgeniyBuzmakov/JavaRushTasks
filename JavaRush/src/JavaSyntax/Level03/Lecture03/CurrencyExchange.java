package JavaSyntax.Level03.Lecture03;
/*Обмен валют
Напиши код метода convertEurToUsd, который переводит евро в доллары по заданному курсу.
Для возврата результата из метода convertEurToUsd используй оператор return. Пример: return 123*435;
Вызови метод convertEurToUsd дважды в методе main с любыми параметрами.
Результаты выведи на экран, каждый раз с новой строки.
 */
public class CurrencyExchange {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(10, 1.15));
        System.out.println(convertEurToUsd(25, 1.15));
    }

    public static double convertEurToUsd(int eur, double course) {
        return eur * course;
    }
}