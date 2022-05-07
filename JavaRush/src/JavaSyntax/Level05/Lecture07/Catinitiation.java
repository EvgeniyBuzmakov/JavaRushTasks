package JavaSyntax.Level05.Lecture07;

/*Кошкоинициация
Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес (чужой домашний кот)
Задача инициализатора - сделать объект валидным.
Например, если вес неизвестен, то нужно указать какой-нибудь средний вес.
Кот не может ничего не весить.
То же касается возраста и цвета.
А вот имени может и не быть (null).
То же касается адреса: null.
 */
public class Catinitiation {
}

class Cat {
    String name, address, color;
    int age, weight;

    public void initialize(String name) {
        this.name = name;
        this.color = name;
        this.age = name.length();
        this.weight = name.length();
    }

    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.color = name;
        this.age = age;
        this.weight = weight;
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.color = name;
        this.age = age;
        this.weight = 0;
    }

    public void initialize(int weight, String color) {
        this.color = color;
        this.age = weight;
        this.weight = weight;
    }

    public void initialize(int weight, String color, String address) {
        this.color = color;
        this.age = weight;
        this.weight = weight;
        this.address = address;
    }



    public static void main(String[] args) {

    }
}