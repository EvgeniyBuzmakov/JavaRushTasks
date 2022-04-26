package JavaSyntax.Level04.Lecture16;

import java.util.Scanner;

/*Как назвали, так назвали
Ввести с клавиатуры строку name.
Ввести с клавиатуры дату рождения (три числа): y, m, d.
Вывести на экран текст:
"Меня зовут name.
Я родился d.m.y"
Пример вывода:
Меня зовут Вася.
Я родился 15.2.1988
 */
public class WhatTheyCalled {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();

        System.out.println("Меня зовут " + name + ".");
        System.out.print("Я родился " + d + "." + m + "." + y);
    }
}