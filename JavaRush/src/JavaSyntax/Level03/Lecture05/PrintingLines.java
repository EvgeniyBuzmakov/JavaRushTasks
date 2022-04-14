package JavaSyntax.Level03.Lecture05;
/*Печатаем строки
Реализуй метод public static void writeToConsole(String s), который добавляет к началу строки выражение "printing: " и выводит измененную строку на экран.
Пример вывода для "Hello world!":
printing: Hello world!
 */
public class PrintingLines {
    public static void main(String[] args) {
        writeToConsole("Hello world!");
    }

    public static void writeToConsole(String s) {
        System.out.println("printing: " + s);
    }
}