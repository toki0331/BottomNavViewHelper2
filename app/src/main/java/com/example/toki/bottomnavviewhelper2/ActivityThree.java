package com.example.toki.bottomnavviewhelper2;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

/**
 * Created by User1 on 8/3/2017.
 */

public class ActivityThree extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);

       SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        ViewPager viewPager = (ViewPager) findViewById(R.id.container);
        setupViewPager(viewPager);

        TabLayout tablayout =(TabLayout) findViewById(R.id.tabs);
        tablayout.setupWithViewPager(viewPager);

        tablayout.getTabAt(0).setIcon(R.drawable.ic_arrow_back);
        tablayout.getTabAt(1).setIcon(R.drawable.ic_backup);
        tablayout.getTabAt(2).setIcon(R.drawable.ic_center_focus);



        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_Nav_View_Bar);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);

        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(3);
        menuItem.setChecked(true);


        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId())
                {
                    case R.id.ic_arrow:
                        Intent intent0 = new Intent(ActivityThree.this,MainActivity.class);
                        startActivity(intent0);
                        break;
                    case R.id.ic_android:
                        Intent intent1 = new Intent(ActivityThree.this,ActivityOne.class);
                        startActivity(intent1);break;
                    case R.id.ic_books:
                        Intent intent3 = new Intent(ActivityThree.this,ActivityTwo.class);
                        startActivity(intent3);break;
                    case R.id.ic_center_focus:

                    case R.id.ic_backup:
                        Intent intent4 = new Intent(ActivityThree.this,ActivityFour.class);
                        startActivity(intent4);break;
                }
                return false;
            }
        });
    }
    private void setupViewPager(ViewPager viewPager) {
        SectionsPagerAdapter adapter = new SectionsPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new Tab1Fragment());
        adapter.addFragment(new Tab2Fragment());
        adapter.addFragment(new Tab3Fragment());
            viewPager.setAdapter(adapter);
    }
}

