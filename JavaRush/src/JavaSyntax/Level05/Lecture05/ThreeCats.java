package JavaSyntax.Level05.Lecture05;

/*Трикотаж
Пару задач назад студенты секретного центра JavaRush создавали класс Cat. Теперь пришла пора реализовать котов во плоти,
разумеется по образу и подобию класса Cat, а точнее - основываясь на нём, как на шаблоне.
Их - котов - должно быть трое. Наполните этих троих жизнью, то есть, конкретными данными.
 */
public class ThreeCats {
    public static void main(String[] args) {
        Cat a = new Cat("Барсик", 2, 4, 5);
        Cat b = new Cat("Путя", 3, 5, 7);
        Cat c = new Cat("Вася", 4, 6, 3);
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}