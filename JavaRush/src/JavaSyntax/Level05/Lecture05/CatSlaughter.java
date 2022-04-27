package JavaSyntax.Level05.Lecture05;

/*Кошачья бойня
Создать три кота используя класс Cat.
Провести три боя попарно между котами.
Класс Cat создавать не надо. Для боя использовать метод boolean fight(Cat anotherCat).
Результат каждого боя вывести на экран c новой строки.
 */
public class CatSlaughter {
    public static void main(String[] args) {
        //напишите тут ваш код
        Cat barsik = new Cat("Барсик", 3, 6, 8);
        Cat rughik = new Cat("Рыжик", 2, 5, 7);
        Cat motya = new Cat("Мотя", 5, 9, 4);

        boolean first = barsik.fight(rughik);
        boolean second = barsik.fight(motya);
        boolean third = rughik.fight(motya);

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
    }

    public static class Cat {

        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int ageScore = Integer.compare(this.age, anotherCat.age);
            int weightScore = Integer.compare(this.weight, anotherCat.weight);
            int strengthScore = Integer.compare(this.strength, anotherCat.strength);

            int score = ageScore + weightScore + strengthScore;
            return score > 0; // return score > 0 ? true : false;
        }
    }
}
