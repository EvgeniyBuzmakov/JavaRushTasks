package JavaSyntax.Level04.Lecture07;

/*Описываем числа
Ввести с клавиатуры целое число в диапазоне 1 - 999. Вывести его строку-описание следующего вида:
"четное однозначное число" - если число четное и имеет одну цифру,
"нечетное однозначное число" - если число нечетное и имеет одну цифру,
"четное двузначное число" - если число четное и имеет две цифры,
"нечетное двузначное число" - если число нечетное и имеет две цифры,
"четное трехзначное число" - если число четное и имеет три цифры,
"нечетное трехзначное число" - если число нечетное и имеет три цифры.
Если введенное число не попадает в диапазон 1 - 999, в таком случае ничего не выводить на экран.
Пример для числа 100:
четное трехзначное число
Пример для числа 51:
нечетное двузначное число
 */
import java.io.*;

public class DescribingNumbers {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        int remain = Math.abs(a) % 2;

        if (a<1 || a>999)
            return;

        if (a < 10 && remain == 0)
            System.out.println("четное однозначное число");

        if (a < 10 && remain == 1)
            System.out.println("нечетное однозначное число");

        if (a > 9 && a < 100 && remain == 0)
            System.out.println("четное двузначное число");

        if (a > 9 && a < 100 && remain == 1)
            System.out.println("нечетное двузначное число");


        if (a > 99 && a < 1000 && remain == 0)
            System.out.println("четное трехзначное число");

        if (a > 99 && a < 1000 && remain == 1)
            System.out.println("нечетное трехзначное число");

    }
}



//    public static void main(String[] args) throws Exception {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        int a = Integer.valueOf(reader.readLine());
//
//        if (a > 0 && a < 1000) {
//            String result = (a % 2 == 0 ? "четное" : "нечетное");
//
//            if (a < 10) {
//                result += " однозначное число";
//            } else if (a < 100) {
//                result += " двузначное число";
//            } else {
//                result += " трехзначное число";
//            }
//
//            System.out.println(result);
//        }
//    }
//}



//    public static void main(String[] args) throws Exception
//    {
//        //напишите тут ваш код
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        int a = Integer.parseInt(reader.readLine());
//        if ((a >=1) && (a <=999))
//        {
//            if (a%2 ==0)
//            {
//                if (a < 10)
//                    System.out.println("четное однозначное число");
//                if ((a >9) && (a <100 br="">                    System.out.println("четное двузначное число");
//                if ((a >99) && (a <999 br="">                    System.out.println("четное трехзначное число");
//            }
//            else
//            {
//                if (a < 10)
//                    System.out.println("нечетное однозначное число");
//                if ((a >9) && (a <100 br="">                    System.out.println("нечетное двузначное число");
//                if ((a >99) && (a <999 br="">                    System.out.println("нечетное трехзначное число");
//
//            }
//        }
//
//    }
//}


//    public static void main(String[] args) throws Exception
//    {
//        //напишите тут ваш код
//    if ((a > 0) & (a < 10) & (a%2)==0 ) {
//        System.out.println("четное однозначное число");
//        } else if ((a > 0) & (a < 10) & !((a%2)==0)) {
//        System.out.println("нечетное однозначное число");
//        }
//        if ((a > 9) & (a < 100) & (a%2)==0){
//        System.out.println("четное двузначное число");
//        } else if ((a > 9) & (a < 100) & !((a%2)==0)){
//        System.out.println("нечетное двузначное число");
//        }
//        if ((a > 99) & (a < 1000) & (a%2)==0){
//        System.out.println("четное трехзначное число");
//        } else if ((a > 99) & (a < 1000) & !((a%2)==0)){
//        System.out.println("нечетное трехзначное число");
//        }