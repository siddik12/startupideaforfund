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
public class SponsorsFragment extends Fragment {

    ImageView img1,img2,img3,img4,img5,img6,img7,img8;

    public SponsorsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_sponsors, container, false);
        img1 = rootView.findViewById(R.id.img1);
        img2 = rootView.findViewById(R.id.img2);
        img3 = rootView.findViewById(R.id.img3);
        img4 = rootView.findViewById(R.id.img4);
        img5 = rootView.findViewById(R.id.img5);
        img6 = rootView.findViewById(R.id.img6);
        img7 = rootView.findViewById(R.id.img7);
        img8 = rootView.findViewById(R.id.img8);
        Glide.with(this).load("https://startupideaforfund.com/wp-content/uploads/2018/08/BVCL.png").into(img1);
        Glide.with(this).load("https://startupideaforfund.com/wp-content/uploads/2018/08/DIU.png").into(img2);
        Glide.with(this).load("https://startupideaforfund.com/wp-content/uploads/2018/08/DBI.png").into(img3);
        Glide.with(this).load("https://startupideaforfund.com/wp-content/uploads/2018/08/CT.png").into(img4);
        Glide.with(this).load("https://startupideaforfund.com/wp-content/uploads/2018/08/IH.png").into(img5);
        Glide.with(this).load("https://startupideaforfund.com/wp-content/uploads/2018/08/DSM.png").into(img6);
        Glide.with(this).load("https://startupideaforfund.com/wp-content/uploads/2019/03/DIE.png").into(img7);
        Glide.with(this).load("https://startupideaforfund.com/wp-content/uploads/2018/08/CR.png").into(img8);

        return rootView;
    }

}
