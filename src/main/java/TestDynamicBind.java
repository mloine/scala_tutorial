/**
 * @Author mloine
 * @Description
 * @Date 11:50 PM 2022/1/28
 */
public class TestDynamicBind {
    public static void main(String[] args) {
        Worker worker = new Worker();
        System.out.println(worker.name);
        worker.hello();


        Person person = new Worker();

        // 属性在编译期间 java就已经直接绑定死了
        System.out.println(person.name);
        person.hello();
    }
}

class Person {

    String name = "person";

    public void hello() {
        System.out.println("hello person");
    }
}

class Worker extends Person {

    String name = "worker";

    @Override
    public void hello() {
        System.out.println("hello worker");
    }

    public void hi() {
        System.out.println("hi");
    }
}
