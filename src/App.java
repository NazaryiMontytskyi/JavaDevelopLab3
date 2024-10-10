
import ExecutablePackage.ExecutableClass;
import NumbersPackage.DefinableNumbers;

/*
 * Головний клас у якому виводиться константа C11 та
 * запускається метод run() виконавчого класу
 */

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("C11: " + DefinableNumbers.C11.result(13));
        System.out.println("TASK: Define class Flight with at least 5 fields");
        ExecutableClass execClass = new ExecutableClass();
        execClass.run();
        
    }
}
