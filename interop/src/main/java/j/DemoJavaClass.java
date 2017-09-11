package j;

import k.DemoKotlinClass;

public class DemoJavaClass {

    public static void main(String[] args) {
        DemoKotlinClass demo = new DemoKotlinClass();
        System.out.println(demo.hello());
        System.out.println(demo.helloJava());
    }

    public String helloJava() {
        return "Hello, Java.";
    }

    public String helloKotlin() {
        return new DemoKotlinClass().hello();
    }

}
