package JavaSyntax.Level02.Lecture02;
/*
Наш первый конвертер!
Метод convertCelsiusToFahrenheit(int celsius) принимает значение в градусах Цельсия. Метод должен переводить температуру и возвращать значение в градусах Фаренгейта.
Температура по Цельсию TC и температура по Фаренгейту TF связаны следующим соотношением:
TF = (9 / 5) * TC + 32
 */
public class OurFirstConverter {
    public static void main(String[] args) {
        System.out.println(convertCelsiusToFahrenheit(41));
    }

    public static double convertCelsiusToFahrenheit(int celsius) {
        //напишите тут ваш код
        double tf = (double)celsius * 9 / 5 + 32;
        return tf;
    }
}