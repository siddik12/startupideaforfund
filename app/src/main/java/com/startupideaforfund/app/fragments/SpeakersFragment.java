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
public class SpeakersFragment extends Fragment {

    ImageView speakers1,speakers2,speakers3,speakers4;
    public SpeakersFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.fragment_speakers, container, false);

        speakers1 = rootView.findViewById(R.id.speakers1);
        speakers2 = rootView.findViewById(R.id.speakers2);
        speakers3 = rootView.findViewById(R.id.speakers3);
        speakers4 = rootView.findViewById(R.id.speakers4);
        Glide.with(this).load("https://startupideaforfund.com/wp-content/uploads/2018/09/CEO-Faffodil-Family.jpg").into(speakers1);
        Glide.with(this).load("https://startupideaforfund.com/wp-content/uploads/2018/09/Head-DIE.jpg").into(speakers2);
        Glide.with(this).load("https://startupideaforfund.com/wp-content/uploads/2018/07/Syed-Raju.jpg").into(speakers3);
        Glide.with(this).load("https://startupideaforfund.com/wp-content/uploads/2019/04/GM-Kamal.gif").into(speakers4);

        return rootView;
    }

}
