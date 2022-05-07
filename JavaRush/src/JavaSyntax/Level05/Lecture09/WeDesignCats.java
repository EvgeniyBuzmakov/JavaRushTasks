package JavaSyntax.Level05.Lecture09;

/*Конструируем котиков
Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст - неизвестные. Кот - бездомный)
- вес, цвет, адрес (чужой домашний кот)
Задача конструктора - сделать объект валидным.
Например, если вес не известен, то нужно указать какой-нибудь средний вес.
Кот не может ничего не весить.
То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
 */
public class WeDesignCats {
}

class Cat {
    //напишите тут ваш код
    private String name;
    private int weight;
    private int age;
    private String color;
    private String address;

    public Cat (String name) {
        this.name = name;
        this.weight = 5;
        this.age = 5;
        this.color = "black";
    }

    public Cat (String name, int weight, int age) {
        this.name = name;
        this.weight= weight;
        this.age = age;
        this.color = "black";
    }

    public Cat (String name, int age) {
        this.name = name;
        this.weight= 5;
        this.age = age;
    }

    public Cat (int weight, String color) {
        this.weight= weight;
        this.age = 5;
        this.color = color;
    }

    public Cat (int weight, String color, String address) {
        this.weight= weight;
        this.age = 5;
        this.color = color;
        this.address = address;
    }

    public static void main(String[] args) {

    }
}