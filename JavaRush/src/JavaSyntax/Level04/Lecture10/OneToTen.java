package JavaSyntax.Level04.Lecture10;

/*От 1 до 10
Вывести на экран числа от 1 до 10 включительно, используя цикл while. Каждое значение с новой строки.
 */
public class OneToTen {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int i = 1;

        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }
}