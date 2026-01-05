package com.ednovas.donguatv;

import android.os.Bundle;
import com.getcapacitor.BridgeActivity;

public class MainActivity extends BridgeActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // 状态栏设为黑色（与网站标题栏颜色匹配）
        getWindow().setStatusBarColor(android.graphics.Color.BLACK);
    }
}
