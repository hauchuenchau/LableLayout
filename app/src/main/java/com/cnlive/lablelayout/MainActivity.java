package com.cnlive.lablelayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements LableView.OnTagClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<String> tags = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            tags.add("标签" + i);
        }

        LableView lableView0 = (LableView) findViewById(R.id.tag_cloud_view_0);
        lableView0.setTags(tags.subList(0, 4));
        lableView0.setOnTagClickListener(this);
        lableView0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "TagView onClick",
                        Toast.LENGTH_SHORT).show();
            }
        });

        final LableView lableView1 = (LableView) findViewById(R.id.tag_cloud_view_1);
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
        lableView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lableView1.singleLine(true);
                Toast.makeText(getApplicationContext(), "点击关闭标签",
                        Toast.LENGTH_SHORT).show();
            }
        });


        LableView lableView2 = (LableView) findViewById(R.id.tag_cloud_view_2);
        lableView2.setTags(tags);
        lableView2.setOnTagClickListener(this);
        lableView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "TagView onClick",
                        Toast.LENGTH_SHORT).show();
            }
        });

        LableView lableView3 = (LableView) findViewById(R.id.tag_cloud_view_3);
        lableView3.setTags(tags);
        lableView3.setOnTagClickListener(this);
        lableView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "TagView onClick",
                        Toast.LENGTH_SHORT).show();
            }
        });

        LableView lableView4 = (LableView) findViewById(R.id.tag_cloud_view_4);
        lableView4.setTags(tags);
        lableView4.setOnTagClickListener(this);
        lableView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "TagView onClick",
                        Toast.LENGTH_SHORT).show();
            }
        });

        LableView lableView5 = (LableView) findViewById(R.id.tag_cloud_view_5);
        lableView5.setTags(tags);
        lableView5.setOnTagClickListener(this);
        lableView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "TagView onClick",
                        Toast.LENGTH_SHORT).show();
            }
        });

        LableView lableView6 = (LableView) findViewById(R.id.tag_cloud_view_6);
        lableView6.setTags(tags);
        lableView6.setOnTagClickListener(this);
        lableView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "TagView onClick",
                        Toast.LENGTH_SHORT).show();
            }
        });

        LableView lableView7 = (LableView) findViewById(R.id.tag_cloud_view_7);
        lableView7.setTags(tags);
        lableView7.setOnTagClickListener(this);
        lableView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "TagView onClick",
                        Toast.LENGTH_SHORT).show();
            }
        });

        LableView lableView8 = (LableView) findViewById(R.id.tag_cloud_view_8);
        lableView8.setTags(tags);
        lableView8.setOnTagClickListener(this);
        lableView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "TagView onClick",
                        Toast.LENGTH_SHORT).show();
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

