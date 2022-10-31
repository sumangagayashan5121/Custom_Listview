package com.example.custom_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.custom_listview.databinding.ActivityMonthBinding;

public class MonthActivity extends AppCompatActivity {

    ActivityMonthBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMonthBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent intent = this.getIntent();

        if (intent != null){
            String name = intent.getStringExtra("name");
            String MonthNo = intent.getStringExtra("MonthNo");
            int imageid = intent.getIntExtra("imageid",R.drawable.a);
            String time=intent.getStringExtra("time");

            System.out.println(time);

            binding.nameProfile.setText(name);
            binding.monthNo.setText(MonthNo);
            binding.profileImage.setImageResource(imageid);
            binding.time.setText(time);


        }

    }
}