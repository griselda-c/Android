package com.example.griselda.clase2_layouts.models;

import java.io.Serializable;

/**
 * Created by Griselda on 08/04/2017.
 */

public class Usuario implements Serializable {
    private String nombre;
    private String apellido;
    private String password;
    private String dni;

    public Usuario(String nombre, String apellido, String password, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.password = password;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
