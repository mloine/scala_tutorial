/**
 * @Author mloine
 * @Description
 * @Date 11:50 PM 2022/1/16
 */
public class TestOperator {

    public static void main(String[] args) {
        // 字符常量
        String s1 = "hello";

        // 新对象
        String s2 = new String("hello");

        Boolean isEqual = s1 == s2;

        System.out.println(isEqual);

        Boolean isEqual1 = s1.equals(s2);

        System.out.println(isEqual1);


        System.out.println(true | false);
        System.out.println(true || false);

        //复制运算符号
        byte b = 10;
        b = (byte) (b + 1);
        b += 1;


        int x = 15;
        int y = x++;

        System.out.println("x=" + x + ",y=" + y);


        x = 23;
        x = x ++;
        System.out.println(x);

    }
}
