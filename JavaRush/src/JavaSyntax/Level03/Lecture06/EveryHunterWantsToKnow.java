package JavaSyntax.Level03.Lecture06;
/*Каждый охотник желает знать…
Создать 7 объектов, чтобы на экран вывелись 7 цветов радуги.
Пример вывода:
Red
Orange
Yellow
Green
Blue
Indigo
Violet
Каждый объект при создании выводит на экран определенный цвет.
*/
public class EveryHunterWantsToKnow {
    public static void main(String[] args) {
        Red redColor = new Red();
        Orange orColor = new Orange();
        Yellow yelColor = new Yellow();
        Green grColor = new Green();
        Blue blColor = new Blue();
        Indigo inrColor = new Indigo();
        Violet viColor = new Violet();
    }

    public static class Red {
        public Red() {
            System.out.println("Red");
        }
    }

    public static class Orange {
        public Orange() {
            System.out.println("Orange");
        }
    }

    public static class Yellow {
        public Yellow() {
            System.out.println("Yellow");
        }
    }

    public static class Green {
        public Green() {
            System.out.println("Green");
        }
    }

    public static class Blue {
        public Blue() {
            System.out.println("Blue");
        }
    }

    public static class Indigo {
        public Indigo() {
            System.out.println("Indigo");
        }
    }

    public static class Violet {
        public Violet() {
            System.out.println("Violet");
        }
    }
}