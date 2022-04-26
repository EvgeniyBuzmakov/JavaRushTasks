package JavaSyntax.Level04.Lecture13;

/*Треугольник из восьмерок
Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
Пример вывода на экран:
8
88
888
8888
88888
888888
8888888
88888888
888888888
8888888888
 */
public class TriangleOfEights {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        int n = 10;

        for (int i=1; i<=n; i++) {
            for (int j=0; j<i; j++) {
                System.out.print(8);
            }
            System.out.println();
        }
    }
}


//    public static void main(String[] args) throws Exception {
//        for (int i = 1; i <= 10; i++) {
//            for (int j = 1; j <= i; j++) {
//                if (j<i)
//                    System.out.print(8);
//                else
//                    System.out.println(8);
//            }
//        }
//    }
//}