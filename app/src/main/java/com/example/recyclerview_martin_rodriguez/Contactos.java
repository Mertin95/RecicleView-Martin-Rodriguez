package com.example.recyclerview_martin_rodriguez;

public class Contactos {
    private String nombre;
    private String apellidos;
    private String email;
    private String numero;
    private int imagen;

    public Contactos(String nombre, String apellidos, String email, String numero, int imagen) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.numero = numero;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    @Override
    public String toString() {

        return "Contacto{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", email='" + email + '\'' +
                ", numero='" + numero + '\'' +
                ", imagen=" + imagen +
                '}';
    }
}
