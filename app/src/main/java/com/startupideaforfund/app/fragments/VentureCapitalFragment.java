package com.startupideaforfund.app.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.startupideaforfund.app.R;
import com.startupideaforfund.app.helper.CustomBrowserClient;

/**
 * A simple {@link Fragment} subclass.
 */
public class VentureCapitalFragment extends Fragment {


    public VentureCapitalFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =  inflater.inflate(R.layout.fragment_venture_capital, container, false);
        WebView webView = (WebView) rootView.findViewById(R.id.webView);

        WebSettings webSettings = webView.getSettings();
        webSettings.setLoadsImagesAutomatically(true);
        webSettings.setJavaScriptEnabled(true);

        // Force links and redirects to open in the WebView instead of in a browser
        webView.setWebViewClient(new CustomBrowserClient());
        webView.loadUrl("http://venture.com.bd/");
        return rootView;
    }

}
