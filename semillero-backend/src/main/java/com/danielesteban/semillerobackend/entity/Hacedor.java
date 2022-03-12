package com.danielesteban.semillerobackend.entity;

import javax.persistence.*;

@Entity
@Table(name = "hacedores")
public class Hacedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 45)
    private String nombre;
    @Column(length = 45)
    private String apellido;
    @Column
    private String usuario;
    @Column
    private String contrasena;
    @OneToOne(mappedBy = "hacedor", cascade = CascadeType.ALL)
    private RegistrarTarea registrarTarea;

    public Hacedor() {
    }

    public Hacedor(Integer id, String nombre, String apellido, String usuario, String contrasena) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public RegistrarTarea getRegistrarTarea() {
        return registrarTarea;
    }

    public void setRegistrarTarea(RegistrarTarea registrarTarea) {
        this.registrarTarea = registrarTarea;
    }
}
