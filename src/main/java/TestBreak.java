import java.util.Arrays;

/**
 * @Author mloine
 * @Description
 * @Date 11:40 PM 2022/1/22
 */
public class TestBreak {
    public static void main(String[] args) {
        try {
            for (int i = 0; i < 5; i++) {
                if (i == 3) {
                    throw new RuntimeException();
//                    break;
                }
                System.out.println(i);
            }
        } catch (Exception e) {

        }

        System.out.println("这是循环外的代码");


        Arrays.asList(1,2,3,4).forEach(x -> {});
    }
}
