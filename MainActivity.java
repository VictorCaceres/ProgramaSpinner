package victorcaceres.programaspinner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {
    Spinner Fruta;
    Spinner Bebida;
    Spinner Comida;

    String [] datosFruta = {"Manzana","Pera","Platano","Uva","Naranja"};
    String [] datosBebida = {"Coca-Cola","Agua","Horchata","Coca-Cola Ligth","Cerveza"};
    String [] datosComida = {"Sabritas","Chocolate","Galletas","Caramelos","Frituras"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fruta = (Spinner)findViewById(R.id.FrutaSpinn);
        Bebida = (Spinner)findViewById(R.id.BebidaSpin);
        Comida = (Spinner)findViewById(R.id.ComidaSpinn);

        ArrayAdapter <String> frutaadaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,datosFruta);
        Fruta.setAdapter(frutaadaptador);

        ArrayAdapter <String> bebidaadaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,datosBebida);
        Bebida.setAdapter(bebidaadaptador);

        ArrayAdapter <String> comidaadaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,datosComida);
        Comida.setAdapter(comidaadaptador);


        Fruta.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position)
                {
                    case 0:
                        Intent mz =  new Intent(MainActivity.this,Manzana.class);
                        startActivity(mz);
                        break;

                    case 1:
                        Intent pr =  new Intent(MainActivity.this,Pera.class);
                        startActivity(pr);
                        break;

                    case 2:
                        Intent pl =  new Intent(MainActivity.this,Platano.class);
                        startActivity(pl);
                        break;

                    case 3:
                        Intent uv =  new Intent(MainActivity.this,Uva.class);
                        startActivity(uv);
                        break;

                    case 4:
                        Intent na =  new Intent(MainActivity.this,Naranja.class);
                        startActivity(na);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
