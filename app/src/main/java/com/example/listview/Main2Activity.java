package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private String str =new String("dhcgvsdchsdvc" +
            "sdvsvsssvvvvvvvvvvvvvvvvvvvvvvvv" +
            "vvvvvvvvvvvvvvvvvvvvvv" +
            "dddddddddddddddddddddddddd" +
            "dddddddddddddddddddddddddddddddd" +
            "dddddddddddddddddddddddddddddddddd" +
            "ddddddddddddddddddddddddddddddd" +
            "ddddddddddddddddddd");
    private int[] image=new int[]{
            R.drawable.a1,
            R.drawable.a2,
            R.drawable.a3,R.drawable.a4,
            R.drawable.a5,R.drawable.a6,
            R.drawable.a7,
            R.drawable.a8,
            R.drawable.a9,
            R.drawable.a10
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
                String studentId = intent.getStringExtra("Id");
        int pos = intent.getIntExtra("pos",1);
              ImageView imgDetail = findViewById(R.id.detail_img);

               imgDetail.setImageResource(image[pos%10]);
            TextView textDetail = findViewById(R.id.detail_text);
        textDetail.setText(studentId+str);

    }
}
