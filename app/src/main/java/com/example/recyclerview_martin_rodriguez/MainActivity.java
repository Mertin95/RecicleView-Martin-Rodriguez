package com.example.recyclerview_martin_rodriguez;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview_martin_rodriguez.Adaptador;
import com.example.recyclerview_martin_rodriguez.Contactos;
import com.example.recyclerview_martin_rodriguez.R;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Array de contactos//imagenes
        ArrayList<Contactos> contactos = new ArrayList<>(Arrays.asList(new Contactos[]{
                new Contactos("Nombre Contacto 1", "Apellidos Contacto 1", "emailContacto1@email.com", "145646", R.drawable.imagen4),
                new Contactos("Nombre Contacto 2", "Apellidos Contacto 2", "emailContacto2@email.com", "141231", R.drawable.imagen2),
                new Contactos("Nombre Contacto 3", "Apellidos Contacto 3", "emailContacto3@email.com", "376564", R.drawable.imagen3),
                new Contactos("Nombre Contacto 4", "Apellidos Contacto 4", "emailContacto4@email.com", "478788", R.drawable.imagen4),
                new Contactos("Nombre Contacto 5", "Apellidos Contacto 5", "emailContacto5@email.com", "564645", R.drawable.imagen4),
                new Contactos("Nombre Contacto 6", "Apellidos Contacto 6", "emailContacto6@email.com", "631231", R.drawable.imagen4),
                new Contactos("Nombre Contacto 7", "Apellidos Contacto 7", "emailContacto7@email.com", "766644", R.drawable.imagen4),
                new Contactos("Nombre Contacto 8", "Apellidos Contacto 8", "emailContacto8@email.com", "878878", R.drawable.imagen4),
                new Contactos("Nombre Contacto 9", "Apellidos Contacto 9", "emailContacto9@email.com", "944545", R.drawable.imagen4),
                new Contactos("Nombre Contacto 10", "Apellidos Contacto 10", "emailContacto10@email.com", "1045646", R.drawable.imagen4)
        }));


        Adaptador adaptador = new Adaptador(contactos);
        
        RecyclerView rvContactos = findViewById(R.id.rvContactos);
        
        rvContactos.setLayoutManager(new LinearLayoutManager(this));

        rvContactos.setAdapter(adaptador);



    }
}