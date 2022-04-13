package JavaSyntax.Level01.Lecture04;
/*Закомментируйте лишнее
Закомментируйте часть кода, чтобы на экран вывелось сообщение "summa = 12".
Программа должна компилироваться.
*/
public class CommentOutTheExcess {
    public static void main(String[] args) {
        int a = 3;
//        int a = 10;
        int b = 6;
//        int b = 12;
//        int summa = 1 + a + b;
//        int summa = 2 + a + b;
        int summa = 3 + a + b;
//        int summa = 4 + a + b;

        System.out.println("summa = " + summa);

    }
}