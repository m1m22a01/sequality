package sequality;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  // xとyの数字の合計と平均を返すメソッド
  public String printSum(int x, int y) {
    int ans = sum(x, y);
    double ave = ans / 2;

    return "Sum of " + x + " and " + y + " is " + ans + ". Average is " + ave + ".";
  }

  //StartからEndまでの数字の合計と平均を返すメソッド
  public String printAllSum(int start, int end) {
    int ans = 0;
    int count = 0;
    double ave;

    if (end < start) {
      //エラーメッセージ
      return "The first argument should be a number smaller than the second argument.";
    } else {
      // 合計の計算
      for (int i = start; i <= end; i++) {
        ans = sum(ans, i);
        count++;
      }
    }

    // 平均の計算
    ave = (double) ans / count;

    return "Sum of " + start + " to " + end + " is " + ans + ". Average is " + ave + ".";
  }

  // StartからEndまでの数字において奇数・偶数の各合計を返すメソッド
  public String printOdd_EvenSum(int start, int end) {
    int odd_ans = 0, even_ans = 0;

    if (end < start) {
      // エラーメッセージ
      return "The first argument should be a number smaller than the second argument.";
    } else {
      // 合計の計算
      for (int i = start; i <= end; i++) {
        if (i % 2 == 0) {
          even_ans = sum(even_ans, i);
        } else {
          odd_ans = sum(odd_ans, i);
        }
      }
    }

    return "Sum of odd " + start + " to " + end + " is " + odd_ans + ". Sum of even is " + even_ans + ".";
  }
}
