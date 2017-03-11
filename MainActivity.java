package victorcaceres.programaspinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
    }
}
