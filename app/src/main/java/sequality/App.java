/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sequality;

public class App {
  public String getGreeting() {
    return "Hello World!";
  }

  public static void main(String[] args) {
    Calculate calculate = new Calculate();

    System.out.println(new App().getGreeting());

    System.out.println(calculate.printSum(2, 3));
    System.out.println(calculate.printAllSum(1, 10));
    System.out.println(calculate.printOdd_EvenSum(1, 10));
  }
}
