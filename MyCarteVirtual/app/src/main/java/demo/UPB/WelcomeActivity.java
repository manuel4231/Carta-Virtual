package demo.UPB;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;

public class WelcomeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }

    void VerMapa (View v) {

        Intent intencion = new Intent(this, MapsActivity.class);
        startActivity(intencion);
    }

    void ConsultarMenu (View v) {

        Intent intencion = new Intent(this, MenuActivity.class);
        startActivity(intencion);
    }
    void ReservarMesa (View v){

        String whatsApp = "com.whatsapp";
            PackageManager pm = getPackageManager();
            Intent i = pm.getLaunchIntentForPackage(whatsApp);
            startActivity(i);
    }
}
