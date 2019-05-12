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
public class GalleryFragment extends Fragment {

    SliderLayout sliderLayout,sliderLayout2,sliderLayout3,sliderLayout4,sliderLayout5;
    public GalleryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_gallery, container, false);

        sliderLayout = rootView.findViewById(R.id.sif);

        sliderLayout.setIndicatorAnimation(IndicatorAnimations.SWAP); //set indicator animation by using SliderLayout.IndicatorAnimations. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
        sliderLayout.setSliderTransformAnimation(SliderAnimations.FADETRANSFORMATION);
        sliderLayout.setScrollTimeInSec(5); //set scroll delay in seconds :

        setSliderViews();


        return rootView;
    }

    private void setSliderViews() {

        for (int i = 0; i <= 14; i++) {

            DefaultSliderView sliderView = new DefaultSliderView(getContext());

            switch (i) {
                case 0:
                    sliderView.setImageUrl("https://startupideaforfund.com/wp-content/uploads/2019/04/Introduced-the-%E2%80%9CStartup-Idea-for-Fund%E2%80%9D-Competition-Internationally-e1554637699929-1150x700.jpg");
                    break;
                case 1:
                    sliderView.setImageUrl("https://startupideaforfund.com/wp-content/uploads/2019/04/Drone-30k-participants-Introduced-the-%E2%80%9CStartup-Idea-for-Fund%E2%80%9D-Competition-Internationally-e1554636774238-1150x700.jpg");
                    break;
                case 2:
                    sliderView.setImageUrl("https://startupideaforfund.com/wp-content/uploads/2019/04/04-Introduced-the-%E2%80%9CStartup-Idea-for-Fund%E2%80%9D-Competition-Internationally-e1554363293230-1150x700.jpg");
                    break;
                case 3:
                    sliderView.setImageUrl("https://startupideaforfund.com/wp-content/uploads/2018/09/01-Final-Pitching-of-Season-01-e1554637435225-1150x700.jpg");
                    break;
                case 4:
                    sliderView.setImageUrl("https://startupideaforfund.com/wp-content/uploads/2018/09/002-Final-Pitching-of-Season-01-e1554363801411-1150x700.jpg");
                    break;
                case 5:
                    sliderView.setImageUrl("https://startupideaforfund.com/wp-content/uploads/2018/09/03-Final-Pitching-of-Season-01-e1554637611961-1150x700.jpg");
                    break;
                case 6:
                    sliderView.setImageUrl("https://startupideaforfund.com/wp-content/uploads/2019/04/Grooming-by-Practical-experience-Season-01-e1554364023841-1150x700.jpg");
                    break;
                case 7:
                    sliderView.setImageUrl("https://startupideaforfund.com/wp-content/uploads/2019/04/IMG_4583-e1554363250607-1150x700.jpg");
                    break;
                case 8:
                    sliderView.setImageUrl("https://startupideaforfund.com/wp-content/uploads/2019/04/IMG_4573-e1554363384388-1150x700.jpg");
                    break;
                case 9:
                    sliderView.setImageUrl("https://startupideaforfund.com/wp-content/uploads/2019/04/IMG_4167-e1554364596927-1150x700.jpg");
                    break;
                case 10:
                    sliderView.setImageUrl("https://startupideaforfund.com/wp-content/uploads/2019/04/IMG_4186-e1554364582682-1150x700.jpg");
                    break;
                case 11:
                    sliderView.setImageUrl("https://startupideaforfund.com/wp-content/uploads/2019/04/Audition-of-season-01-1150x700.jpg");
                    break;
                case 12:
                    sliderView.setImageUrl("https://startupideaforfund.com/wp-content/uploads/2019/04/03-Discussion-Session-Season-01-1150x700.jpg");
                    break;
                case 13:
                    sliderView.setImageUrl("https://startupideaforfund.com/wp-content/uploads/2019/04/02-Discussion-Session-Season-01-1150x700.jpg");
                    break;
                case 14:
                    sliderView.setImageUrl("https://startupideaforfund.com/wp-content/uploads/2019/04/04-Discussion-Session-Season-01-1150x700.jpg");
                    break;
            }

            sliderView.setImageScaleType(ImageView.ScaleType.CENTER_CROP);

            //at last add this view in your layout :
            sliderLayout.addSliderView(sliderView);
        }

    }


}
