package JavaSyntax.Level05.Lecture05;

/*Геттеры и сеттеры для класса Person
Создать class Person. У человека должно быть имя String name, возраст int age, пол char sex.
Создай геттеры и сеттеры для всех переменных класса Person.
 */
public class GettersAndSettersForThePersonClass {
}

class Person1 { //цифра 1 нужна для отличия от другого класса Person
    String name;
    String address;
    int age;
    char sex;

    //Геттеры
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public int getAge() {
        return age;
    }
    public char getSex() {
        return sex;
    }

    //Сеттеры
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setSex(char sex) {
        this.sex = sex;
    }

    public static void main(String[] args) {

    }
}