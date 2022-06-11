package JavaSyntax.Level06.Lecture05;

/*Ставим котов на счётчик
task0604
В конструкторе класса Cat2 [public Cat2()] увеличивать счётчик котов (статическую переменную этого же класса catCount) на 1. В методе finalize уменьшать на 1.
 */
public class PuttingCatsOnTheCounter {
}

class Cat2 {
    public static int catCount = 0;

    //напишите тут ваш код
    public Cat2 () {
        catCount += 1;
    }

    @Override
    protected void finalize() {
        catCount -= 1;
    }

    public static void main(String[] args) {

    }
}