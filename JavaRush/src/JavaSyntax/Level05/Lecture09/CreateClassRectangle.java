package JavaSyntax.Level05.Lecture09;

/*Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (верхняя координата, левая, ширина и высота).
Создать для него как можно больше методов конструкторов.
Примеры:
- заданы 4 параметра: left, top, width, height
- ширина/высота не задана (оба равны 0)
- высота не задана (равно ширине) создаём квадрат
- создаём копию другого прямоугольника (он и передаётся в параметрах)
 */
public class CreateClassRectangle {
}

class Rectangle {
    //напишите тут ваш код
    public int top, left, width, height;

    public Rectangle (int top, int left, int width, int height) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public Rectangle (int top, int left) {
        this.top = top;
        this.left = left;
        this.width = 0;
        this.height = 0;
    }

    public Rectangle (int top, int left, int width) { //конструктор, где высота равна ширине
        this(top, left); //вызов конструктора вместо следующих двух строк кода
        //this.top = top;
        //this.left = left;
        this.width = width;
        this.height = width;
    }

    public Rectangle (Rectangle rec) { //конструктор копии другого прямоугольника
        this.top = rec.top;
        this.left = rec.left;
        this.width = rec.width;
        this.height = rec.width;
    }

    public static void main(String[] args) {

    }
}