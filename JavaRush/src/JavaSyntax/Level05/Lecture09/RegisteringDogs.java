package JavaSyntax.Level05.Lecture09;

/*Регистрируем собачек
Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет
 */
public class RegisteringDogs {
}

class Dog {
    //напишите тут ваш код
    private String name;
    private int height;
    private String color;

    public Dog (String name) {
        this.name = name;
    }

    public Dog (String name, int height) {
        this.name = name;
        this.height = height;
    }

    public Dog (String name, int height, String color) {
        this(name, height);//вызов конструктора вместо следующих двух строк кода
//        this.name = name;
//        this.height = height;
        this.color = color;
    }

    public static void main(String[] args) {

    }
}