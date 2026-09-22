package com.agushermawan.portofolio;
import android.os.Bundle; import android.webkit.WebSettings; import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
 WebView w;
 @Override protected void onCreate(Bundle b){super.onCreate(b);w=new WebView(this);setContentView(w);
 WebSettings s=w.getSettings();s.setJavaScriptEnabled(true);s.setDomStorageEnabled(true);s.setAllowFileAccess(true);s.setAllowContentAccess(true);
 w.loadUrl("file:///android_asset/index.html");}
 @Override public void onBackPressed(){if(w.canGoBack())w.goBack();else super.onBackPressed();}
}