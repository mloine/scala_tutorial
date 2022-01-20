

/**
 * @Author mloine
 * @Description
 * @Date 4:06 PM 2022/1/8
 */
public class Student {

    private String name;

    private Integer age;

    private static String school = "哈士奇小学";

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void printInfo() {
        System.out.println(this.name + " " + this.age + " " + Student.school);
    }

    public static void main(String[] args) {
        Student xueyongkang = new Student("xueyongkang", 20);
        Student bob = new Student("bob", 23);

        xueyongkang.printInfo();
        bob.printInfo();
    }
}
