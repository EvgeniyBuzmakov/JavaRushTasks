package JavaSyntax.Level04.Lecture02;
/*Учет котов
Напиши код в методе addNewCat, чтобы при его вызове количество котов увеличивалось на 1.
За количество котов отвечает переменная catsCount.
 */
public class CatCensus {
    private static int catsCount = 0;

    public static void addNewCat() {
        //напишите тут ваш код
        CatCensus.catsCount++;
    }

    public static void main(String[] args) {

    }
}