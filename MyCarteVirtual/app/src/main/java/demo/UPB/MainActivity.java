package demo.UPB;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    void VerMapa (View v){

        Intent intencion = new Intent(this, MapsActivity.class);
        startActivity(intencion);


    }
}
