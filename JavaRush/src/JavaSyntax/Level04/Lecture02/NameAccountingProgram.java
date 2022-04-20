package JavaSyntax.Level04.Lecture02;
/*Программа учета имен
Допишите код метода setName, чтобы с его помощью установить значение private String fullName равное значению локальной переменной String fullName.
 */
public class NameAccountingProgram {
    private String fullName;

    public void setName(String firstName, String lastName) {
        String fullName = firstName + " " + lastName;
        //напишите тут ваш код
        this.fullName = fullName;
    }

    public static void main(String[] args) {

    }
}