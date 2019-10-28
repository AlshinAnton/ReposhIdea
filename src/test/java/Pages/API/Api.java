package Pages.API;

/*import Interface.APIInterface;
import com.example.anton.autotestsreposh.Pages.API.ServiceAPI;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.HashSet;
import java.util.concurrent.TimeUnit;

import javafx.util.Callback;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.ResponseBody;

import javax.xml.ws.Response;

public class Api implements APIInterface {

    private HashSet<String> cookies = new HashSet<>();

    private int productId;

    @Override
    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Override
    public void loginApi() {
        String userName = "tester";
        String password = "qqq111qqq";
        Gson gson = new GsonBuilder().create();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://95.181.205.163:8888/v2.3/")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        ServiceAPI serviceAPI = retrofit.create(ServiceAPI.class);
        Call<ResponseBody> call = serviceAPI.login(userName, password);
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                if (response.isSuccessful()) {
                    for (String headerName : response.headers().names()) {
                        Log.i("OkHttp", "headerName = " + headerName);
                    }
                    String cookieHeader = response.headers().get("Set-Cookie");
                    if (cookieHeader != null && !cookieHeader.isEmpty()) {
                        cookies.add(response.headers().get("Set-Cookie"));
                    }

                    ResponseBody result = response.body();
                    System.out.println(result);
                    finalPublish();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                t.printStackTrace();
            }
        });
    }

    private OkHttpClient getOkHttpClient() {
        return new OkHttpClient.Builder()
                .addInterceptor(getCookieInterceptor())
                .connectTimeout(30, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
                .writeTimeout(30, TimeUnit.SECONDS)
                .build();
    }

    private Interceptor getCookieInterceptor() {
        return chain -> {
            Request.Builder builder = chain.request().newBuilder();

            for (String cookie : cookies) {
                builder.addHeader("Cookie", cookie);
                Log.i("HttpOK", "Setting Header: " + cookie);
            }

            return chain.proceed(builder.build());
        };
    }


    @Override
    public void finalPublish() {

        Gson gson = new GsonBuilder().create();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://95.181.205.163:8888/v2.3/")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(getOkHttpClient())
                .build();
        ServiceAPI serviceAPI = retrofit.create(ServiceAPI.class);
        Call<ResponseBody> call = serviceAPI.publish(productId);
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                if (response.isSuccessful()) {
                    ResponseBody result = response.body();

                    System.out.println(result);
                } else {
                    System.out.println(response.errorBody());
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                t.printStackTrace();
            }
        });
    }
}*/


//  http://95.181.205.163:8888/v2.3/product/5748/publish