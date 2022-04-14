package JavaSyntax.Level02.Lecture08;
/*Да хоть на Луну!
- Амиго, ты знал, что сила тяжести на Луне составляет примерно 17% от силы тяжести на Земле?
- Нет.
- Вот и я не знал. А теперь этой информацией нужно пользоваться часто, и, чтобы не считать каждый раз, реализуй метод getWeight(int), который принимает вес тела (в Ньютонах) на Земле, и возвращает, сколько это тело будет весить на Луне (в Ньютонах).
Тип возвращаемого значения - double.
 */
public class YesEvenToTheMoon {
    public static void main(String[] args) {
        System.out.println(getWeight(888));
    }

    public static double getWeight(int earthWeight) {
        //напишите тут ваш код
        //return (double)earthWeight * 17 / 100;
        return earthWeight*0.17;
    }
}