package com.creatersolutions.monitordeterremotos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView terremotoListView = (ListView) findViewById(R.id.eq_list_view);
       // ArrayList<String> paisesList =  new ArrayList<>();


        ArrayList<Terremoto> eqList = new ArrayList<>();

        eqList.add(new Terremoto("4.6", "97 kms S of Teruel, España"));
        eqList.add(new Terremoto("3.3", "97 kms S of Joshua, Indonesia"));
        eqList.add(new Terremoto("5.6", "54 kms N of Miami, EEUU"));


        //Nos añadimos los textos que nos van a aparecer en nuestro LisView a mano
       // paisesList.add("México");
       // paisesList.add("EEUU");
        //paisesList.add("España");
        //paisesList.add("Colombia");
       // paisesList.add("Perú");


        //ArrayAdapter<String> paisesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, paisesList);
        //En vez de crearel que viene por defecto creamos un TerremotoAdapter
        TerremotoAdapter terremotoAdapter = new TerremotoAdapter(this, R.layout.eq_list_item, eqList);


        //Vamos a insertar los datos
        //terremotoListView.setAdapter(paisesAdapter);
        terremotoListView.setAdapter(terremotoAdapter);
    }
}