package com.lesson.lab03_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.widget.CompoundButton;

import com.lesson.lab03_1.databinding.ActivityLab034Binding;

public class Lab03_4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityLab034Binding binding = ActivityLab034Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.checkbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) binding.checkbox.setText("is Checked");
                else buttonView.setText("is Unchecked");
            }
        });
        //setContentView(R.layout.activity_lab034);
    }
}