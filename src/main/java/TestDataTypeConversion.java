
/**
 * @Author mloine
 * @Description 隐式类型转换
 * @Date 12:02 AM 2022/1/14
 */
public class TestDataTypeConversion {

    public static void main(String[] args) {
        byte b = 10;
        test(b);

        char c = 'c';
        short c2 = (short)c;
        test(c2);

    }

    private static void test(byte b) {
        System.out.println("bbbb");
    }

    private static void test(short b) {
        System.out.println("ssss");
    }

//    private static void test(char b) {
//        System.out.println("cccc");
//    }

    private static void test(int b) {
        System.out.println("iiii");
    }
}
