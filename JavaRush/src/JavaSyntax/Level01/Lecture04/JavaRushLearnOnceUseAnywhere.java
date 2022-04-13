package JavaSyntax.Level01.Lecture04;
/* JavaRush. Learn once - use anywhere
Напиши программу, которая выводит на экран надпись: «JavaRush. Learn once - use anywhere» 10 раз.
*/
public class JavaRushLearnOnceUseAnywhere {
    public static void main(String[] args) {
        //напишите тут ваш код
        print5Times("JavaRush. Learn once - use anywhere");
        print5Times("JavaRush. Learn once - use anywhere");
    }

    public static void print5Times(String s) {
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
    }
}