package JavaSyntax.Level03.Lecture06;
/*Экранирование символов
Вывести на экран следующий текст - две строки:
It's a Windows path: "C:\Program Files\Java\jdk1.7.0\bin"
It's a Java string: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"
Подсказка:
\” – экранирование двойной кавычки;
\\ – экранирование обратной косой черты (\).
 */
public class EscapingCharacters {

    public static void main(String[] args) {
        System.out.println("It's Windows path: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"");
        System.out.println("It's Java string: \\\"C:\\\\Program Files\\\\Java\\\\jdk1.7.0\\\\bin\\\"");
    }
}