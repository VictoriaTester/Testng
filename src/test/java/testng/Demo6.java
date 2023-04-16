package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
// dataprivider 传参数
public class Demo6 {
    @Test(dataProvider = "datas")
    public void test1(String fn, String ln){
        System.out.println("demo5...test1");
        System.out.println(fn +" "+ ln);
    }

    @DataProvider(name="datas")
    public Object[][] datas() {
        Object[][] datas ={
                {"tom","qiao"},
                {"rocky","wang"}
        };
        return datas;
    }
}
