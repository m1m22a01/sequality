package sequality;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3));
  }

  ////////////////////// printSumテスト//////////////////////////////
  @Test
  public void testprintSum() {
    Calculate calculate = new Calculate();

    // 入力値
    int x = 2, y = 3;

    // 予測される合計と平均の値
    int expected_sum = 5;
    double expected_ave = 2.0;

    String expected = "Sum of " + x + " and " + y + " is " + expected_sum + ". Average is " + expected_ave + ".";

    assertEquals(expected, calculate.printSum(x, y));
  }

  ////////////////////// printAllSumテスト//////////////////////////////
  @Test
  public void testprintAllSum() {
    Calculate calculate = new Calculate();

    // 入力値
    int start = 1, end = 10;

    // 予測される合計と平均の値
    int expected_sum = 55;
    double expected_ave = 5.5;

    // 予測される関数の返答
    String expected = "Sum of " + start + " to " + end + " is " + expected_sum + ". Average is " + expected_ave + ".";

    assertEquals(expected, calculate.printAllSum(start, end));
  }

  @Test
  public void testprintAllSumError() {
    Calculate calculate = new Calculate();

    // 入力値
    int start = 1, end = 10;

    // 予測される合計と平均の値
    int expected_sum = 55;
    double expected_ave = 5.5;

    // 予測される関数の返答
    String expected = "Sum of " + start + " to " + end + " is " + expected_sum + ". Average is " + expected_ave + ".";

    assertEquals(expected, calculate.printAllSum(start, end));
  }

  ////////////////////// printOdd_EvenSumテスト//////////////////////////////
  @Test
  public void testprintOdd_EvenSum() {
    Calculate calculate = new Calculate();

    // 入力値
    int start = 10, end = 1;

    // 予測される関数の返答
    String expected_return = "The first argument should be a number smaller than the second argument.";

    assertEquals(expected_return, calculate.printOdd_EvenSum(start, end));
  }

  @Test
  public void testprintOdd_EvenSumError() {
    Calculate calculate = new Calculate();

    // 入力値
    int start = 10, end = 1;

    // 予測される関数の返答
    String expected_return = "The first argument should be a number smaller than the second argument.";

    assertEquals(expected_return, calculate.printOdd_EvenSum(start, end));
  }
}
