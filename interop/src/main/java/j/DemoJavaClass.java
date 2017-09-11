package j;

import k.DemoKotlinClass;
import k.Friendly;

public class DemoJavaClass implements Friendly {

    private DemoKotlinClass kotlin = new DemoKotlinClass();

    public static void main(String[] args) {
        DemoJavaClass java = new DemoJavaClass();
        System.out.println(java.hello());
        System.out.println(java.helloKotlin());
    }

    public String hello() {
        return "Hello, Java.";
    }

    private String helloKotlin() {
        return kotlin.hello();
    }

}
