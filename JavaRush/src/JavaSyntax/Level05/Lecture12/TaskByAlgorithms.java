package JavaSyntax.Level05.Lecture12;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*Задача по алгоритмам Ӏ Java Syntax: 5 уровень, 12 лекция
Написать программу, которая:
1. считывает с консоли число N, которое должно быть больше 0
2. потом считывает N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
 */
public class TaskByAlgorithms {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum;

        //напишите тут ваш код
        int N = Integer.parseInt(reader.readLine());
        if (N<=0) return;

        int a;
        maximum = Integer.parseInt(reader.readLine());
        for (int i=0; i<N-1; i++) {
            a = Integer.parseInt(reader.readLine());
            if (a > maximum) {
                maximum = a;
            }
        }

        System.out.println(maximum);
    }
}

//    Если пользователь ошибся и ввел N <= 0 - программа завершит работу.
//        Возможно, лучше написать условие с циклом while:
//        while (true) {
//        if ((n = Integer.parseInt(br.readLine())) > 0) break;
//        }
//
//        В этом случае, пользователь будет вводить число  N до тех пор,
//        пока не введет положительное число. Тогда сработает команда break,
//        цикл while завершит работу, а программа продолжит выполнение.


//альтернативное решение с использованием Integer.MIN_VALUE
//    public static void main(String[] args) throws Exception {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        //напишите тут ваш код
//        int N = Integer.parseInt(reader.readLine());
//        if (N<=0) return;
//
//
//        int maximum = Integer.MIN_VALUE;
//
//        for (int i=1; i<N; i++) {
//            int number = Integer.parseInt(reader.readLine());
//            if (number > maximum) {
//                maximum = number;
//            }
//        }
//
//        System.out.println(maximum);
//    }