package JavaSyntax.Level05.Lecture05;

/*Геттеры и сеттеры для класса Dog
Создать class Dog. У собаки должна быть кличка String name и возраст int age.
Создай геттеры и сеттеры для всех переменных класса Dog.
 */
public class GettersAndSettersForTheDogClass {
}

class Dog {
    private String name;
    private int age;

    public static void main(String[] args) {

    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}