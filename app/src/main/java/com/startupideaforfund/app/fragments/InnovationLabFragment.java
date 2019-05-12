package com.startupideaforfund.app.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.startupideaforfund.app.R;
import com.startupideaforfund.app.helper.CustomBrowserClient;

/**
 * A simple {@link Fragment} subclass.
 */
public class InnovationLabFragment extends Fragment {
    WebView webView;

    public InnovationLabFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_innovation_labk, container, false);
        webView = (WebView) rootView.findViewById(R.id.webView);

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // Force links and redirects to open in the WebView instead of in a browser
        webView.setWebViewClient(new CustomBrowserClient());
        webView.loadUrl("file:///android_asset/html/innovation-lab.html");

        return rootView;
    }



}
