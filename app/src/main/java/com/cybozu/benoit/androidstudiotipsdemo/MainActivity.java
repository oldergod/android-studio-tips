package com.cybozu.benoit.androidstudiotipsdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

/**
 * TODO(benoit) prepare code for building demo
 * 1.- Flavor with 21 as minSdkTarget
 *      Project Structure -> App -> Flavor
 * 2.- Update Gradle
 * 3.- Fix gradle error with heap upgrade
 * 4.- Enable instant run
 * 5.- Change VersionCode in the gradle.properties
 *      to show we should understand how changes affect the build
 */
public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText("");
    }
}
