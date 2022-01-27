/**
 * @Author mloine
 * @Description
 * @Date 10:19 PM 2022/1/25
 */
public class TestRecursion {

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(fact(5));
    }

    ///1.循环
    public static int factorial(int a) {
        int result = 1;

        for (int i = 1; i <= a; i++) {
            result *= i;
        }

        return result;
    }

    //2.递归
    public static int fact(int n) {
        if (n == 1) {
            return 1;
        }
        return fact(n - 1) * n;
    }
}
