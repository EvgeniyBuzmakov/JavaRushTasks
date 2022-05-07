package JavaSyntax.Level05.Lecture09;

/*Друзей не купишь
Создать класс Friend (друг) с тремя конструкторами:
- Имя
- Имя, возраст
- Имя, возраст, пол
 */
public class YouCantBuyFriends {
}

class Friend {
    //напишите тут ваш код
    private String name;
    private int age;
    private char sex;

    public Friend (String name) {
        this.name = name;
    }

    public Friend (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Friend (String name, int age, char sex) {
        this(name, age);//вызов конструктора вместо следующих двух строк кода
        //this.name = name;
        //this.age = age;
        this.sex = sex;
    }

    public static void main(String[] args) {

    }

}