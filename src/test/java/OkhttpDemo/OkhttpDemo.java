package OkhttpDemo;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;


public class OkhttpDemo {
    public static void main(String[] args) throws Exception {
        String url ="http://www.baidu.com";
        //1.创建okhttp client客户端对象
        OkHttpClient client = new OkHttpClient();
        //2.构建request请求
//         new Request.Builder().url
//                 .get()
//                 .build();
        Request request = new Request.Builder()
                .url(url)
                .get()
                .build();
        //使用client发送请求，返回一个响应
        Response response=client.newCall(request).execute();
        System.out.println(response.code());
        System.out.println(response.headers());
        System.out.println(response.body().string());
    }
}
