package demo.UPB;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MenuActivity extends Activity {

    private String [] productos = new String []{"Entradas", "Platos Fuertes", "Bebidas", "Postres"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        ListView lv = findViewById(android.R.id.list);
        ListAdapter la = new ArrayAdapter <String>(this, android.R.layout.simple_list_item_1, productos);
        lv.setAdapter(la);
    }
}
