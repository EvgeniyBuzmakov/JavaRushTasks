package JavaSyntax.Level04.Lecture13;

/*Четные числа
Используя цикл for вывести на экран чётные числа от 1 до 100 включительно.
Каждое значение вывести с новой строки.
 */
public class EvenNumbers {

    public static void main(String[] args) throws Exception {

//        for (int i = 2; i <= 100; i+=2)
//                System.out.println(i);

        for (int i = 1; i <= 50; i+=1)
            System.out.println(i * 2);
    }
}


//        for (int i = 1; i <= 100; i++)
//            if (i%2==0)
//                System.out.println(i);