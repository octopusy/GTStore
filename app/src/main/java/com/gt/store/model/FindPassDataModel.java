package com.gt.store.model;

import com.gt.store.http.RetrofitHttp;

import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import retrofit2.Callback;

/**
 * author：Richard
 * Date：16/6/23 下午8:06
 */
public class FindPassDataModel {

    public static void checkPhoneExist(Callback<ResponseBody> responseBodyCallback, String phone) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        RetrofitHttp.getRetrofit(builder.build()).findPassCheckPhoneExsit("findPassCheckPhoneExsit", phone)
                .enqueue(responseBodyCallback);

    }


    public static void updatePassword(Callback<ResponseBody> responseBodyCallback, String phone, String password) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        RetrofitHttp.getRetrofit(builder.build()).findPassUpdatePass("findPassUpdatePass", phone, password)
                .enqueue(responseBodyCallback);

    }


}
