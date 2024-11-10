package com.example.recyclerview_martin_rodriguez;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adaptador extends RecyclerView.Adapter<Adaptador.ContactoViewHolder>{
    ArrayList<Contactos> listaContactos;

    public Adaptador(ArrayList<Contactos> listaContactos) {
        this.listaContactos = listaContactos;
    }

    @NonNull
    @Override
    public Adaptador.ContactoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Adaptador.ContactoViewHolder contactoViewHolder =
                new ContactoViewHolder(
                        LayoutInflater.from(parent.getContext()).inflate(R.layout.vista_contacto,parent,false)
                );
        return contactoViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull Adaptador.ContactoViewHolder holder, int position) {
        Contactos contacto = listaContactos.get(position);
        holder.imagen.setImageResource(contacto.getImagen());
        holder.tvNombre.setText(contacto.getNombre());
        holder.tvApelllidos.setText(contacto.getApellidos());
        holder.tvEmail.setText(contacto.getEmail());
        holder.tvNumero.setText(contacto.getNumero());

    }

    @Override
    public int getItemCount() {
        return listaContactos.size();
    }

    public class ContactoViewHolder extends RecyclerView.ViewHolder{
        ImageView imagen;
        TextView tvNombre;
        TextView tvApelllidos;
        TextView tvEmail;
        TextView tvNumero;

        public ContactoViewHolder(@NonNull View itemView) {
            super(itemView);
            imagen = itemView.findViewById(R.id.imagen);
            tvNombre = itemView.findViewById(R.id.tvNombre);
            tvApelllidos = itemView.findViewById(R.id.tvApellidos);
            tvEmail = itemView.findViewById(R.id.tvEmail);
            tvNumero = itemView.findViewById(R.id.tvNumero);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(view.getContext(), listaContactos.get(getAdapterPosition()).toString(), Toast.LENGTH_SHORT).show();
                }});
        }
    }
}
