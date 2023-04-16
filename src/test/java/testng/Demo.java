package testng;

import org.testng.Assert;
import org.testng.annotations.Test;
// test注解：
//dependsonmethods：写明依赖哪个case
//description: 说明
//alwaysrun: 设置为true 时， 无论什么情况都会运行
// enables：设置false 时失效
// dataprovider:数据提供者的名称


public class Demo {
    @Test(dependsOnMethods = "test2",alwaysRun = true)
    public void test1(){
        System.out.println( "test1..");
//        Assert.assertEquals(false, true);
    }
    @Test
    public void test2(){
        System.out.println("test2...");
        Assert.assertEquals(false, true);
    }
    @Test(enabled = false)
    public void test3(){
        System.out.println("test3..");
    }
}
