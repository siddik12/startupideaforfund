package com.startupideaforfund.app.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.smarteist.autoimageslider.DefaultSliderView;
import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderLayout;
import com.startupideaforfund.app.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {
    SliderLayout sliderLayout;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);

        sliderLayout = rootView.findViewById(R.id.imageSlider);
        sliderLayout.setIndicatorAnimation(IndicatorAnimations.SWAP); //set indicator animation by using SliderLayout.IndicatorAnimations. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
        sliderLayout.setSliderTransformAnimation(SliderAnimations.FADETRANSFORMATION);
        sliderLayout.setScrollTimeInSec(5); //set scroll delay in seconds :
        setSliderViews();

        return rootView;
    }

    private void setSliderViews() {

        for (int i = 0; i <= 3; i++) {

            DefaultSliderView sliderView = new DefaultSliderView(getContext());

            switch (i) {
                case 0:
                    sliderView.setImageUrl("https://startupideaforfund.com/wp-content/uploads/2019/04/04-Introduced-the-“Startup-Idea-for-Fund”-Competition-Internationally-1024x576.jpg");
                    break;
                case 1:
                    sliderView.setImageUrl("https://startupideaforfund.com/wp-content/uploads/2019/04/Introduced-the-“Startup-Idea-for-Fund”-Competition-Internationally-e1554637699929.jpg");
                    break;
                case 2:
                    sliderView.setImageUrl("https://startupideaforfund.com/wp-content/uploads/2019/04/30k-participants-Introduced-the-“Startup-Idea-for-Fund”-Competition-Internationally-e1554637114302.jpg");
                    break;
                case 3:
                    sliderView.setImageUrl("https://startupideaforfund.com/wp-content/uploads/2018/09/01-Final-Pitching-of-Season-01-e1554637435225.jpg");
                    break;
            }

            sliderView.setImageScaleType(ImageView.ScaleType.CENTER_CROP);

            //at last add this view in your layout :
            sliderLayout.addSliderView(sliderView);
        }

    }

}
