package JavaSyntax.Level03.Lecture04;
/*Произведение 10 чисел
Вывести на экран произведение 10 чисел от 1 до 10.
Результат - это 1 число.
 */
public class ProductOf10Numbers {
    public static void main(String[] args) {
        //напишите тут ваш код
        int res = 1;
        for (int i=2; i < 11; i++) {
            res = res * i;
        }
        System.out.print(res);
    }
}