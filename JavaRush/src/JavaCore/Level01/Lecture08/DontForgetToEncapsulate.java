package JavaCore.Level01.Lecture08;

/***Не забываем инкапсулировать
Посмотри внимательно на методы и добавь недостающие поля.
 */
public class DontForgetToEncapsulate {
    public static void main(String[] args) {
    }

    public class Cat {
        private String name;
        private int age;
        private int weight;
        private int speed;

        public Cat(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;

        }

        public String getName() {
            return null;
        }

        public int getAge() {
            return 0;
        }

        public void setWeight(int weight) {

        }

        public void setSpeed(int speed) {

        }
    }
}