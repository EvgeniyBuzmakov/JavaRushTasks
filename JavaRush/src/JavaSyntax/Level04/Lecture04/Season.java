package JavaSyntax.Level04.Lecture04;
/*Время года
Напиши метод checkSeason. По номеру месяца, метод должен определить время года (зима, весна, лето, осень) и вывести на экран.
Пример для номера месяца 2:
зима
Пример для номера месяца 5:
весна

 */
public class Season {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int mount) {
        //напишите тут ваш код
        if ((mount == 12) || (mount < 3))
            System.out.println("зима");
        else if ((mount > 2) && (mount < 6))
            System.out.println("весна");
        else if ((mount > 5) && (mount < 9))
            System.out.println("лето");
        else if ((mount > 8) && (mount < 12))
            System.out.println("осень");
        else System.out.println("такого времени года не существует");
    }
//альтернативное решение-----------------------------------------------------------------------
//    public static void checkSeason(int month) {
//        String seasons[] = {"зима","весна","лето","осень"};
//        System.out.println(seasons[(month % 12) / 3]);
//    }
//альтернативное решение-----------------------------------------------------------------------
//    public static void checkSeason(int month) {
//    switch(month)
//    {
//        case 1:
//        case 2:
//        case 12:
//            System.out.println("зима");
//            break;
//        case 3:
//        case 4:
//        case 5:
//            System.out.println("весна");
//            break;
//        case 6:
//        case 7:
//        case 8:
//            System.out.println("лето");
//            break;
//        case 9:
//        case 10:
//        case 11:
//            System.out.println("осень");
//            break;
//    }
//}

}