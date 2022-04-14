package JavaSyntax.Level03.Lecture06;
/*
Выведи на экран таблицу умножения 10 на 10 в следующем виде:
1 2 3 4 ...
2 4 6 8 ...
3 6 9 12 ...
4 8 12 16 ...
...
 */
public class MultiplicationTable {
    //Чтобы вывести ровно надо использовать функцию printf с аргументом форматирования "%4d"(т.е. выделяем под вывод 4 знака), а не print

    public static void main(String[] args) {
        //напишите тут ваш код
        for (int i=1; i<11; i++) {
            for (int j=1; j<11; j++) {
                System.out.printf("%4d",(i*j));
            }
            System.out.println ();
        }
    }
}

//    public static void main(String[] args) {
//        //напишите тут ваш код
//        for (int i=1; i<11; i++) {
//            for (int j=1; j<11; j++) {
//                System.out.print(i*j+" ");
//            }
//            System.out.println ();
//        }
//    }
//}

//    public static void main(String[] args) {
//        for (int j = 1; j < 11; j++) {
//            int row = j;
//            for (int i = 1; i <= 10; i++) {
//                int result = row * i;
//                if (i<10)
//                    System.out.print(result + " ");
//                else
//                    System.out.println(result + " ");
//
//            }
//        }
//    }
//}

