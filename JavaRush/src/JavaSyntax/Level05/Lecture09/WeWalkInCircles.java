package JavaSyntax.Level05.Lecture09;

/*Ходим по кругу
Создать класс (Circle) круг, с тремя конструкторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
 */
public class WeWalkInCircles {
}

class Circle1 {
    //напишите тут ваш код
    private int centerX, centerY, radius,width, color;

    public Circle1 (int centerX, int centerY, int radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    public Circle1 (int centerX, int centerY, int radius, int width) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;

    }

    public Circle1 (int centerX, int centerY, int radius,  int width, int color) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
        this.color = color;

    }

    public static void main(String[] args) {

    }
}