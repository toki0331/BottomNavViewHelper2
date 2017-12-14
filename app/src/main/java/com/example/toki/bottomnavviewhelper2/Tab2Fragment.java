package com.example.toki.bottomnavviewhelper2;


import android.support.v4.app.Fragment;

/**
 * Created by toki on 2017/12/13.
 */

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by User1 on 8/2/2017.
 */

public class Tab2Fragment extends Fragment {
    private static final String TAG = "Tab2Fragment";

    private ListView listview;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment2_layout,container,false);
        listview = (ListView) view.findViewById(R.id.listView);

        ArrayList<Card> list = new ArrayList<>();

        list.add(new Card("drawable://" + R.drawable.a, "Arizona Dessert"));
        list.add(new Card("drawable://" + R.drawable.b, "Bamf"));
        list.add(new Card("drawable://" + R.drawable.c, "Colorado Mountains"));
        list.add(new Card("drawable://" + R.drawable.d, "Cork"));
        list.add(new Card("drawable://" + R.drawable.e, "DavenPort California"));
        list.add(new Card("drawable://" + R.drawable.f, "Denmark Austrailia"));
        list.add(new Card("drawable://" + R.drawable.g, "Foggy Iceland"));
        list.add(new Card("drawable://" + R.drawable.h, "Havasu Falls"));
        list.add(new Card("drawable://" + R.drawable.i, "Hawaii RainForest"));
        list.add(new Card("drawable://" + R.drawable.a, "NewFoundLand Ice"));
        list.add(new Card("drawable://" + R.drawable.b, "Oregon Greens"));
        list.add(new Card("drawable://" + R.drawable.c, "Smokey Mountain"));

        CustomListAdapter adapter = new CustomListAdapter(getActivity(), R.layout.card_layout_main, list);
        listview.setAdapter(adapter);

        return view;
    }
}
