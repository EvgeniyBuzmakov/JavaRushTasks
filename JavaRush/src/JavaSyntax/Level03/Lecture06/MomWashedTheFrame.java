package JavaSyntax.Level03.Lecture06;
/*Мама мыла раму
Вывести на экран все возможные комбинации слов "Мама", "Мыла", "Раму".
Подсказка: их 6 штук.
Каждую комбинацию вывести с новой строки. Слова не разделять.
Пример:
МылаРамуМама
РамуМамаМыла
...
 */
public class MomWashedTheFrame {
    public static void main(String[] args) {

        String mama = "Мама", mila = "Мыла", r = "Раму";

        System.out.println(mama + mila + r);
        System.out.println(mila + r + mama);
        System.out.println(r + mila + mama);
        System.out.println(mama + r + mila);
        System.out.println(mila + mama + r);
        System.out.println(r + mama + mila);
    }
}