package org.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

import com.squareup.okhttp.Call;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

public class HttpClientTest {

//            .connectTimeout(30,TimeUnit.SECONDS)
//            .readTimeout(30,TimeUnit.SECONDS)
//            .writeTimeout(30,TimeUnit.SECONDS).build();

    public static void main(String [] args) {
        String url = "http://172.16.34.231/gap/nodes?event=1";
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(url).build();
        Call call = client.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onResponse(Response response) throws IOException {
                Reader reader = response.body().charStream();
                BufferedReader in = new BufferedReader(reader);
                String line = null;
                while((line = in.readLine())!=null){
                    if(line.contains("CassiaFD_1.2"))
                        System.out.println(line);
                }
            }
            @Override
            public void onFailure(Request arg0, IOException arg1) {
                
            }
        });
        System.out.println("end");
    }
}
