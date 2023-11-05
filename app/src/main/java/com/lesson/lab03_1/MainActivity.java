package com.lesson.lab03_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout; //위젯에 있으면 xml파일에서 전체 경로 안써도 됨
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button trueBtn;
    private Button falseBtn;
    private TextView targetTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //내가 관리할 화면 결정 //R(res) 아래 layout 아래 act..파일 //상수값(res), 건들 수 없는 부분 -> R

        trueBtn = findViewById(R.id.btn_visible_true);
        targetTextView = findViewById(R.id.text_visible_target);
        falseBtn = findViewById(R.id.btn_visible_false);  //지금은 지역변수이지만 오버라이드 위에서 하면 소용 없음, 위치 기억하기

        trueBtn.setOnClickListener(this);
        falseBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v == trueBtn) {
            targetTextView.setVisibility(View.VISIBLE);
        } else if (v == falseBtn) {
            targetTextView.setVisibility(View.INVISIBLE);
        }
    }
}