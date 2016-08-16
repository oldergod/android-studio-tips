package com.cybozu.benoit.androidstudiotipsdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

/**
 * 1.- Enable multidex
 * 2.- Update Gradle
 * 3.- Fix gradle error with heap upgrade
 * 4.- Flavor with 21 as minSdkTarget
 *      Project Structure -> App -> Flavor
 * 5.- Enable instant run
 * 6.- Change VersionCode in the gradle.properties
 *      to show we should understand how changes affect the build
 *
 * Reference @see https://developer.android.com/studio/build/multidex.html
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText("皆様");
    }
}
