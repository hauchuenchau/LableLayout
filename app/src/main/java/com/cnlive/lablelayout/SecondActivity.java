package com.cnlive.lablelayout;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Mr.hou
 * @time 2017/3/28
 * @Desc
 */

public class SecondActivity extends AppCompatActivity implements LableView.OnTagClickListener{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        List<String> tags = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            tags.add("标签" + i);
        }
        final LableView lableView1 = (LableView) findViewById(R.id.lable);
        lableView1.setTags(tags);
        lableView1.setOnTagClickListener(new LableView.OnTagClickListener() {
            @Override
            public void onTagClick(int position) {
                if (position == -1) {
                    lableView1.singleLine(false);
                    Toast.makeText(getApplicationContext(), "点击展开标签",
                            Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "点击 position : " + position,
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public void onTagClick(int position) {
        if (position == -1) {
            Toast.makeText(getApplicationContext(), "点击末尾文字",
                    Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getApplicationContext(), "点击 position : " + position,
                    Toast.LENGTH_SHORT).show();
        }
    }
}
