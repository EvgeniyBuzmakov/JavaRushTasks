package JavaSyntax.Level03.Lecture12;
/*Сумма цифр трехзначного числа
Напиши код метода sumDigitsInNumber(int number). Метод на вход принимает целое трехзначное число. Нужно посчитать сумму цифр этого числа, и вернуть эту сумму.
Пример:
Метод sumDigitsInNumber вызывается с параметром 546.
Пример вывода:
15
 */
public class TheSumOfTheDigitsOfAThreeDigitNumber {

    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

//    public static int sumDigitsInNumber(int number) {
//        //напишите тут ваш код
//        int n100 = number / 100;
//
//        //вычитаем из исходного числа сотни, чтобы потом извлекать количество десяток:
//        int a = number - n100 * 100;
//
//        //извлекаем количество десяток:
//        int n10 = a / 10;
//
//        //удаляем десятки из исходного числа (который уже без сотен) и останутся только единицы:
//        int n1 = a - n10 * 10;
//
//        //Суммируем количество сотен, десяток и единиц:
//        int n4 = n100 + n10 + n1;
//
//        //Отдаем полученное число запрашиваемому методу:
//        return n4;
//    }

    public static int sumDigitsInNumber(int number) {
        String s = Integer.toString(number);      //перевёл число в строку

        char a1 = s.charAt(0);
        char a2 = s.charAt(1);
        char a3 = s.charAt(2);
        //разбил строку на символы

        int b1 = Integer.parseInt(a1 + "");
        int b2 = Integer.parseInt(a2 + "");
        int b3 = Integer.parseInt(a3 + "");
        //перевёл символы в целые числа, т.к. сразу складывая символы можно узнать что будут складываться коды этих же символов.

        int end = b1 + b2 + b3;                   //сложил переменные

        return end;                               //вернул результат
    }
}


// c использованием метода getNumericValue
// класса Character
//    int i1 = Character.getNumericValue(ch);
//    System.out.println(i1);
//
//            // c использованием метода digit класса Character
//            int i2 = Character.digit(ch,10);
//            System.out.println(i2);