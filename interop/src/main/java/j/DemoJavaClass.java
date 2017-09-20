package j;

import hello.HelloWorld;
import k.DemoKotlinClass;
import k.Friendly;
import nullable.NullSafetyExample;

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

    private NullSafetyExample nullSafetyExample = new NullSafetyExample();

}
