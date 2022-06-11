package JavaSyntax.Level06.Lecture05;

/*По 50 000 объектов Cat и Dog
task0603
Создать в цикле по 50 000 объектов Cat1 и Dog1.
(Java-машина должна начать уничтожать неиспользуемые, и метод finalize хоть раз да вызовется).

Дополнил программу счетчиками, чтобы видеть, сколько раз были вызваны методы finalize у каждого класса.
Есть вариант сделать массивы обьектов классов Cat1 и Dog1, но тогда метод finalize скорее всего не вызовется,
потому что каждый созданный обьект будет живым, на каждый обьект будут ссылки и сборщик мусора их не удалит.
 */
public class CatAndDog50000ObjectsEach {

    static int catCounter = 0;
    static int dogCounter = 0;

    public static void main(String[] args) {

        //напишите тут ваш код

        Cat1[] cats = new Cat1[500000];
        Dog1[] dogs = new Dog1[500000];

        for (int i=0; i<500000; i++) {
            cats[i] = new Cat1();
            dogs[i] = new Dog1();
//            Cat1 cat = new Cat1();
//            Dog1 dog = new Dog1();
        }
        System.out.println(catCounter);
        System.out.println(dogCounter);
    }
}

class Cat1 {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        CatAndDog50000ObjectsEach.catCounter++;
        System.out.println("Cat was destroyed " + CatAndDog50000ObjectsEach.catCounter);
    }
}

class Dog1 {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        CatAndDog50000ObjectsEach.dogCounter++;
        System.out.println("Dog was destroyed " + CatAndDog50000ObjectsEach.dogCounter);
    }
}