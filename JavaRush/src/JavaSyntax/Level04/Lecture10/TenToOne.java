package JavaSyntax.Level04.Lecture10;

/*От 10 до 1
Вывести на экран числа от 10 до 1 включительно, используя цикл while. Каждое значение с новой строки.
 */
public class TenToOne {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int i=10;

        while (i>0) {
            System.out.println(i);
            i--;
        }
    }
}