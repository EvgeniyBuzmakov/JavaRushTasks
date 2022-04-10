package JavaSyntax.Level02.Lecture01;
/*
Реализуем метод print
Допиши код в методе print, чтобы он выводил на экран каждую переданную в него строку 4 раза. Каждый раз с новой строки.
*/

public class ImplementingThePrintMethod {
    public static void main(String[] args) {
        print("Java is easy to learn!");
        print("Java is object-oriented!");
        print("Java is platform-independent!");
    }

    public static void print(String text) {
        //напишите тут ваш код

        System.out.println(text);
        System.out.println(text);
        System.out.println(text);
        System.out.println(text);
    }
}