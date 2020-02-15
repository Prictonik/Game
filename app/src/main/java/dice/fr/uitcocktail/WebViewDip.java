package dice.fr.uitcocktail;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class WebViewDip extends AppCompatActivity {

    WebView webView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web_client);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        webView = findViewById(R.id.webviewclient);

        webView.getSettings().setJavaScriptEnabled(true);

        WebViewClient wcClient = new WebViewClient();
        webView.setWebViewClient(wcClient);
        webView.loadUrl("http://google.com");



    }
}
