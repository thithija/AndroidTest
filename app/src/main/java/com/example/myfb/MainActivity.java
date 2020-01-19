package com.example.myfb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    MyFragmentAdapter adapter;
    TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.fragment_pager);
        tabLayout=findViewById(R.id.tab);
        adapter = new MyFragmentAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
   }
//   public void change(View view){
//     /   String type=view.getTag().toString();
//        switch (type){
//            case "home":
//                viewPager.setCurrentItem(0);
//                break;
//            case "usr":
//                viewPager.setCurrentItem(1);
//                break;
//            case "bell":
//                viewPager.setCurrentItem(2);
//                break;
//            case "msg":
//                viewPager.setCurrentItem(3);
//                break;


        }
//   }
//}