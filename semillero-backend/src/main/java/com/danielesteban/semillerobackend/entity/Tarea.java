package com.danielesteban.semillerobackend.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tareas")
public class Tarea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String nombre;
    @OneToOne(mappedBy = "tarea", cascade = CascadeType.ALL)
    private RegistrarTarea registrarTarea;
    @OneToMany(mappedBy = "tarea1", cascade = CascadeType.ALL)
    private List<CrearSolicitud> crearSolicitud;

    public Tarea() {
    }

    public Tarea(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
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

    public RegistrarTarea getRegistrarTarea() {
        return registrarTarea;
    }

    public void setRegistrarTarea(RegistrarTarea registrarTarea) {
        this.registrarTarea = registrarTarea;
    }
}
