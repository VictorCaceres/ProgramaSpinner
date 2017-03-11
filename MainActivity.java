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

    String [] datosFruta = {"Seleccionar Fruta","Manzana","Pera","Platano","Uva","Naranja"};
    String [] datosBebida = {"Seleccionar Bebida","Coca-Cola","Agua","Horchata","Coca-Cola Ligth","Cerveza"};
    String [] datosComida = {"Seleccionar Comida","Sabritas","Chocolate","Galletas","Caramelos","Frituras"};

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

                        break;

                    case 1:
                        Intent mz =  new Intent(MainActivity.this,Manzana.class);
                        startActivity(mz);
                        break;

                    case 2:
                        Intent pr =  new Intent(MainActivity.this,Pera.class);
                        startActivity(pr);
                        break;

                    case 3:
                        Intent pl =  new Intent(MainActivity.this,Platano.class);
                        startActivity(pl);
                        break;

                    case 4:
                        Intent uv =  new Intent(MainActivity.this,Uva.class);
                        startActivity(uv);
                        break;

                    case 5:
                        Intent na =  new Intent(MainActivity.this,Naranja.class);
                        startActivity(na);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        Bebida.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:

                        break;

                    case 1:
                        Intent cc = new Intent(MainActivity.this, CocaCola.class);
                        startActivity(cc);
                        break;

                    case 2:
                        Intent ag = new Intent(MainActivity.this, Agua.class);
                        startActivity(ag);
                        break;

                    case 3:
                        Intent hc = new Intent(MainActivity.this, Horchata.class);
                        startActivity(hc);
                        break;

                    case 4:
                        Intent ccl = new Intent(MainActivity.this, CocaLight.class);
                        startActivity(ccl);
                        break;

                    case 5:
                        Intent cv = new Intent(MainActivity.this, Cerveza.class);
                        startActivity(cv);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    Comida.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            switch (position) {
                case 0:

                    break;

                case 1:
                    Intent sb = new Intent(MainActivity.this, Sabritas.class);
                    startActivity(sb);
                    break;

                case 2:
                    Intent ct = new Intent(MainActivity.this, Chocolate.class);
                    startActivity(ct);
                    break;

                case 3:
                    Intent gt = new Intent(MainActivity.this, Galleta.class);
                    startActivity(gt);
                    break;

                case 4:
                    Intent ca = new Intent(MainActivity.this, Caramelo.class);
                    startActivity(ca);
                    break;

                case 5:
                    Intent fr = new Intent(MainActivity.this, Fritura.class);
                    startActivity(fr);
                    break;
            }
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    });
        }

    }

