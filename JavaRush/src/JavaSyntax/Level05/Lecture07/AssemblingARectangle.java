package JavaSyntax.Level05.Lecture07;

/*Собираем прямоугольник
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (верхняя координата, левая, ширина и высота).
Создать для него как можно больше методов initialize(...)
Примеры:
- заданы 4 параметра: left, top, width, height
- ширина/высота не задана (оба равны 0)
- высота не задана (равно ширине) создаём квадрат
- создаём копию другого прямоугольника (он и передаётся в параметрах)
 */
public class AssemblingARectangle {
}

class Rectangle {
    //напишите тут ваш код
    public int top, left, width, height;

    public void initialize (int top, int left, int width, int height) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public void initialize (int top, int left) {
        this.top = top;
        this.left = left;
        this.width = 0;
        this.height = 0;
    }

    public void initialize (int top, int left, int width) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = width;
    }

    public void initialize (Rectangle rec) {  //создаём копию другого прямоугольника (он и передаётся в параметрах)
        this.top = rec.top;
        this.left = rec.left;
        this.width = rec.width;
        this.height = rec.width;
    }

    public static void main(String[] args) {

    }
}