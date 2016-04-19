package org.opencv.javacv.facerecognition;

import android.app.Application;

import com.parse.Parse;

public class App  extends Application {

    @Override
    public void onCreate()
    {
        super.onCreate();

        Parse.initialize(this, "JoDLgd8Sh23OeZb7lcFbQXguaw1sGcbKxXYkYkwa",
                "SE3UBrGTCLDArJ1NZYFDMyYW00ESulG9q8VagvBJ");

    }
}
