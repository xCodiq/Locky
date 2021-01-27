package gg.xcodiq.locky.application;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import gg.xcodiq.locky.R;

public final class LockyApplication extends AppCompatActivity {

    private static LockyApplication instance;

    public LockyApplication() {
        LockyApplication.instance = this;
    }

    public static LockyApplication getInstance() {
        if (instance == null) throw new IllegalStateException("Instance cannot be null");
        return instance;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
