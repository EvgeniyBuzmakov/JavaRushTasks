package JavaSyntax.Level06.Lecture08;

/*Классовый счетчик
Создать статическую переменную int catCount в классе Cat. Создай конструктор [public Cat()], в котором увеличивай данную переменную на 1.
Требования:
•	•
Добавь в класс Cat конструктор.
•	•
Конструктор должен быть public.
•	•
Добавь в класс Cat поле catCount.
•	•
Поле catCount должно быть типа int.
•	•
Поле catCount должно быть статическим.
•	•
Конструктор класса должен на 1 увеличивать значение переменной catCount.
 */

public class ClassCounter {

}

class Cat {
    //напишите тут ваш код
    public static int catCount = 0;

    public Cat () {
        catCount++;
    }

    public static void main(String[] args) {

    }
}