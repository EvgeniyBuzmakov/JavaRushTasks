package JavaSyntax.Level02.Lecture05;
/*Самое нужное число
Закомментируй максимальное количество строк, чтобы на экран вывелось число 19
 */
public class MostNeededNumber {
    public static void main(String[] args) {
        int x = 1;
        int y = 0;

        y = y + x;

        x = x * 2;
        y = y + x;

        x = x * 2;
//        y = y + x;

        x = x * 2;
//        y = y + x;

        x = x * 2;
        y = y + x;

        System.out.println(y);
    }
}