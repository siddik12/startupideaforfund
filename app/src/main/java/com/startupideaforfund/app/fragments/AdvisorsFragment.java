package com.startupideaforfund.app.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.startupideaforfund.app.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AdvisorsFragment extends Fragment {

    ImageView advison1,advison2;
    public AdvisorsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_advisors, container, false);
        advison1 = rootView.findViewById(R.id.advison1);
        advison2 = rootView.findViewById(R.id.advison2);
        Glide.with(this).load("https://startupideaforfund.com/wp-content/uploads/2019/04/GEN.jpg").into(advison1);
        Glide.with(this).load("https://startupideaforfund.com/wp-content/uploads/2019/04/Sabur-Khan.jpg").into(advison2);
        return rootView;
    }

}
