package com.startupideaforfund.app.helper;

import android.annotation.TargetApi;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import static android.support.constraint.Constraints.TAG;

public class CustomBrowserClient extends WebViewClient {
    @SuppressWarnings("deprecation")
    @Override
    public boolean shouldOverrideUrlLoading(WebView webView, String url)
    {
        return shouldOverrideUrlLoading(url);
    }

    @TargetApi(Build.VERSION_CODES.N)
    @Override
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest request)
    {
        Uri uri = request.getUrl();
        return shouldOverrideUrlLoading(uri.toString());
    }

    private boolean shouldOverrideUrlLoading(final String url)
    {
        Log.i(TAG, "shouldOverrideUrlLoading() URL : " + url);

        // Here put your code

        return false; // Returning True means that application wants to leave the current WebView and handle the url itself, otherwise return false.
    }
}
