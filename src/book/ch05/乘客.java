package book.ch05;

// Run with: java -XX:CompileCommand=dontinline,*.出境 乘客
public abstract class 乘客 {
  abstract void 出境 ();
  public static void main(String[] args) {
    乘客 a = new 中国人 ();
    乘客 b = new 外国人 ();
    long current = System.currentTimeMillis();
    for (int i = 1; i <= 2_000_000_000; i++) {
      if (i % 100_000_000 == 0) {
        long temp = System.currentTimeMillis();
        System.out.println(temp - current);
        current = temp;
      }
      乘客 c = (i < 1_000_000_000) ? a : b;
      c. 出境 ();
    }
  }
}
class 中国人 extends 乘客 { @Override void 出境 () {} }
class 外国人 extends 乘客 { @Override void 出境 () {} }
