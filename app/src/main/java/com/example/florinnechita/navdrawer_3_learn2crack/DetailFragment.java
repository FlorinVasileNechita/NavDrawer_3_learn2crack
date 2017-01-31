package com.example.florinnechita.navdrawer_3_learn2crack;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by florinnechita on 31/01/17.
 */

public class DetailFragment extends Fragment {

    TextView textView;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle args) {
        View view = inflater.inflate(R.layout.menu_detail_fragment, container, false);
        String menu = getArguments().getString("Menu");

        textView = (TextView) view.findViewById(R.id.detail);
        textView.setText(menu);

        return view;
    }
}
