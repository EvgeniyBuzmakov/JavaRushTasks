package JavaSyntax.Level04.Lecture13;

/*Рисуем линии
Используя цикл for вывести на экран:
- горизонтальную линию из 10 восьмёрок
- вертикальную линию из 10 восьмёрок (символ из горизонтальной строки не учитывается).
 */
public class DrawLines {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        for (int i=0; i<10; i++){
            System.out.print(8);
        }

        for (int i=0; i<10; i++){
            System.out.println(8);
        }
    }
}