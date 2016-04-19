package org.opencv.javacv.facerecognition;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;

public class Index extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
    }
    public void onClick(View v){
        if(v.getId()==R.id.bl){
            startActivity(new Intent(Index.this,FdActivity.class));
        }
        else if(v.getId()==R.id.k){
                 startActivity(new Intent(Index.this,Search.class));
            }

    }
}
