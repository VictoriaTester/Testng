package OkhttpDemo;
import okhttp3.*;

import java.io.IOException;

public class OkhttpDemo2 {
    public static void main(String[] args) throws IOException {
        String url ="http://test.lemonban.com/ningmengban/mvc/user/login.json";
        //1.创建okhttpclient对象
        OkHttpClient client = new OkHttpClient();
        //2.创建requestbody
        MediaType type = MediaType.parse("application/x-www-form-urlencoded");
        RequestBody requestBody= RequestBody.create(type,"username=13212312312&password=123123");
        Request request= new Request.Builder()
                .url(url)
                .post(requestBody)
                .build();
        Response response=client.newCall(request).execute();
        System.out.println(response.code());
        System.out.println(response.headers());
        System.out.println(response.body().string());
    }
}
