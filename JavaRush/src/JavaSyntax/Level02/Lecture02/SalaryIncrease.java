package JavaSyntax.Level02.Lecture02;
/*Прибавка к зарплате
В методе public static void hackSalary(int salary) увеличь зарплату на 100 и выведи на экран надпись: "Твоя зарплата составляет: <salary+100> долларов в месяц."
Где <salary+100> - это зарплата увеличенная на 100
 */
public class SalaryIncrease {
    public static void main(String[] args) {
        salary(700);
    }

    public static void salary(int a) {
        //напишите тут ваш код
        int b = a + 100;
        System.out.println("Твоя зарплата составляет: " + b + " долларов в месяц.");
    }
}