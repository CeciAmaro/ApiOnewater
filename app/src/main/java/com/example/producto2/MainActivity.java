package com.example.producto2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.producto2.client.OnWaterClient;
import com.example.producto2.databinding.ActivityMainBinding;
import com.example.producto2.entity.Message;
import com.example.producto2.service.OnWaterApiService;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends Activity {

    private TextView mTextView;
    private Button mButton;
    private ActivityMainBinding binding;
    private OnWaterApiService apiService;
    //private editTextNumberDecimal



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initView();
        initValues();
        getMessage(23.92323,-66.3);
    }
    private void initView(){
        mTextView = binding.notaTextView;
    }
    private void initValues(){
        apiService = OnWaterClient.getApiService();
    }
    private void getMessage(Double lat, Double lon){
        apiService.getMessageId(lat,lon).enqueue(new Callback<Message>() {
            @Override
            public void onResponse(Call<Message> call, Response<Message> response) {
                Message message = response.body();
                mTextView.setText(message.toString());
            }

            @Override
            public void onFailure(Call<Message> call, Throwable t) {
                mTextView.setText(t.getMessage());

            }
        });

    }


}