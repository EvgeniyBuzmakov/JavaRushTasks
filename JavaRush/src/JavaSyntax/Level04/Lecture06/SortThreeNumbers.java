package JavaSyntax.Level04.Lecture06;

/*Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
Выведенные числа должны быть разделены пробелом.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class SortThreeNumbers {
    public static void main(String[] args) throws Exception {

        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer[] array = new Integer[3];
        array[0] = Integer.parseInt(reader.readLine());
        array[1] = Integer.parseInt(reader.readLine());
        array[2] = Integer.parseInt(reader.readLine());

        Arrays.sort(array, Collections.reverseOrder());

        for (int i=0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}


//    public static void main(String[] args) throws Exception {
//    int max =  Math.max(Math.max(a,b),c);
//    int min =  Math.min(Math.min(a,b),c);
//    int sum = (a+b+c)-min-max;
// System.out.println(max+" "+sum+" "+min);




//    public static void main(String[] args) throws Exception {
//        //напишите тут ваш код
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int[] vect = new int [3];
//
//        vect[0] = Integer.parseInt(br.readLine());
//        vect[1] = Integer.parseInt(br.readLine());
//        vect[2] = Integer.parseInt(br.readLine());
//
//        int k;
//        for (int i=0;i<vect.length;i++) {
//            for (int j=i; j<vect.length; j++) {
//                if (vect[j]>vect[i]) {
//                    k = vect[i];
//                    vect[i] = vect[j];
//                    vect[j] = k;
//                }
//            }
//        }
//
//        for (int i=0;i<vect.length;i++) {
//            System.out.print(vect[i]+" ");
//        }
//    }
//}



//    public static void main(String[] args) throws Exception {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        int x = Integer.parseInt(reader.readLine());
//        int y = Integer.parseInt(reader.readLine());
//        int z = Integer.parseInt(reader.readLine());
//
//        if (x>y && x>z) {
//            if (y>z) {
//                System.out.println(x + " " + y + " " + z);
//            } else {
//                System.out.println(x + " " + z + " " + y);
//            }
//        }
//
//        if (y>x && y>z) {
//            if (x>z) {
//                System.out.println(y + " " + x + " " + z);
//            } else {
//                System.out.println(y + " " + z + " " + x);
//            }
//        }
//
//        if (z>x && z>y) {
//            if (x>y) {
//                System.out.println(z + " " + x + " " + y);
//            } else {
//                System.out.println(z + " " + y + " " + x);
//            }
//        }
//    }
//}