package com.cybozu.benoit.androidstudiotipsdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

/**
 * 1.- Update Gradle
 * 2.- Fix gradle error with heap upgrade
 * 3.- Flavor with 21 as minSdkTarget
 *      Project Structure -> App -> Flavor
 * 4.- Enable instant run
 * 5.- Change VersionCode in the gradle.properties
 *      to show we should understand how changes affect the build
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText("皆様、元気か！？なるほど。");
    }
}
