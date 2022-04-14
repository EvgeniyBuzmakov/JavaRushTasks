package JavaSyntax.Level03.Lecture05;
/*Конвертируем время
Добавь метод public static int convertToSeconds(int hour) который будет конвертировать часы в секунды.
Вызови его дважды в методе main с любыми параметрами.
Результаты выведи на экран, каждый раз с новой строки.
 */
public class ConvertingTime {

    public static int convertToSeconds(int hour) {
        int sec = hour * 60 * 60;
        return sec;
    }

    public static void main(String[] args) {
        System.out.println(convertToSeconds(2));
        System.out.println(convertToSeconds(3));
    }
}