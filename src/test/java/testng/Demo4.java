package testng;

import org.testng.annotations.*;
//beforemethod：测试方法前执行
//beforeclass：测试类前执行
//beforesuit：测试套件前执行
//beforetest：在xml中的每一个test标签执行前运行；


public class Demo4 {
    @BeforeSuite
    public void f1(){
        System.out.println("@BeforeSuit....");
    }
    @AfterSuite
    public void f2(){
        System.out.println("@Afersuit....");
    }
    @BeforeTest
    public void f3(){
        System.out.println("@beforetest....");
    }
    @AfterTest
    public void f4(){
        System.out.println("@aftertest....");
    }
    @BeforeClass
    public void f5(){
        System.out.println("@beforeclass....");
    }
    @AfterClass
    public void f6(){
        System.out.println("@afterclass....");
    }
    @BeforeMethod
    public void f7(){
        System.out.println("@beforemethod....");
    }
    @AfterMethod
    public void f8(){
        System.out.println("@aftermethod....");
    }

    @Test
    public void test1(){
        System.out.println("demo4...test1...");
    }
    @Test
    public void test2(){
        System.out.println("demo4...test2");
    }
}
