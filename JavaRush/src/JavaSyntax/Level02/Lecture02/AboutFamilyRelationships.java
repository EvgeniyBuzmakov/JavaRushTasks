package JavaSyntax.Level02.Lecture02;
/*
О семейных отношениях
В методе main создай объект Man, сохрани ссылку на него в переменную man.
Создай также объект Woman и сохрани ссылку на него в переменную woman.
В man.wife сохрани ссылку на ранее созданный объект Woman.
В woman.husband сохрани ссылку на ранее созданный объект Man
*/
public class AboutFamilyRelationships {
    public static void main(String[] args) {
        //напишите тут ваш код
        Man man = new Man();
        Woman woman = new Woman();
        man.wife = woman;
        woman.husband = man;
    }

    public static class Man {
        public int age;
        public int height;
        public Woman wife;
    }

    public static class Woman {
        public int age;
        public int height;
        public Man husband;
    }
}
