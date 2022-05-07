package JavaSyntax.Level05.Lecture09;

/*Конструктор
Разберись, что делает программа.
Найди и исправь одну ошибку в классе Circle. Метод main изменять нельзя.
 */
public class Constructor {
}

class Circle {
    public Color color;

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.color.setDescription("Red");
        System.out.println(circle.color.getDescription());
    }

    public Circle() {         //убрали из сигнатуры тип возвращаемого значения и метод превратился в конструктор

        color = new Color();
    }

    public class Color {
        String description;

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }
}