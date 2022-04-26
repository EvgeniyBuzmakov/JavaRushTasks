package JavaSyntax.Level04.Lecture16;

import java.io.*;

/*Суммирование
Вводить с клавиатуры числа.
Если пользователь ввел -1, вывести на экран сумму всех введенных чисел и завершить программу.
-1 должно учитываться в сумме.
 */
public class Summation {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = 0;
        int sum = 0;
        while (a!=-1) {
            a = Integer.parseInt(br.readLine());
            sum += a;
        }
        System.out.println(sum);
    }
}


//    public static void main(String[] args) throws Exception {
//        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
//
//        int sum = 0;
//        Boolean stop = false;
//
//        while (!stop) {
//            String s = r.readLine();
//            int x = Integer.parseInt(s);
//            sum = sum + x;
//            if (x==-1)
//                stop = true;
//        }
//
//        System.out.println(sum);
//    }
//}



//    BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
//    int s=0;
//    while(true){
//    int i=Integer.parseInt(in.readLine());
//    s+=i;
//    if(i!=-1){}
//        else{
//          break;
//        }
//    }
//        System.out.println(s);
//        }
//        }