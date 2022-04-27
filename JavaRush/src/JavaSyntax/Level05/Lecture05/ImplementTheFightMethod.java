package JavaSyntax.Level05.Lecture05;

/*Реализовать метод fight
Реализуй метод boolean fight(Cat anotherCat):
продумай механизм драки котов в зависимости от их веса, возраста и силы.
Сравни каждый критерий по отдельности, чтобы победителем был тот, у кого были лучшие показатели по большинству критериев.
Метод должен определять, выиграли ли мы (this) бой или нет, т.е. возвращать true, если выиграли и false - если проиграли.
Если ничья и никто не выиграл, возвращаем false.
 */
public class ImplementTheFightMethod {
}

class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        int one = this.weight + this.strength - this.age;
        int two = anotherCat.weight + anotherCat.strength - anotherCat.age;
        if (one > two)
            return true;
        else
            return false;

//        альтернативная реализация
//        int ageScore = Integer.compare(this.age, anotherCat.age);
//        int weightScore = Integer.compare(this.weight, anotherCat.weight);
//        int strengthScore = Integer.compare(this.strength, anotherCat.strength);
//
//        int score = ageScore + weightScore + strengthScore;
//        return score > 0; // return score > 0 ? true : false;
    }

    public static void main(String[] args) {

    }
}
