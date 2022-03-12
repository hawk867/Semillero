package com.danielesteban.semillerobackend.entity;

import com.danielesteban.semillerobackend.entity.numeradores.ZonaCobertura;

import javax.persistence.*;

@Entity
@Table(name = "registro_de_tareas")
public class RegistrarTarea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    @Enumerated(EnumType.STRING)
    private ZonaCobertura zonaCobertura;
    @Column
    private Integer precio;
    @OneToOne
    @JoinColumn(name = "id_socio",foreignKey = @ForeignKey(name = "FK_SOCIO_ID"))
    private Hacedor hacedor;
    @OneToOne
    @JoinColumn(name = "id_tarea", foreignKey = @ForeignKey(name = "FK_TAREA1_ID"))
    private Tarea tarea;

    public RegistrarTarea() {
    }

    public RegistrarTarea(Integer id, ZonaCobertura zonaCobertura, Integer precio, Hacedor hacedor, Tarea tarea) {
        this.id = id;
        this.zonaCobertura = zonaCobertura;
        this.precio = precio;
        this.hacedor = hacedor;
        this.tarea = tarea;
    }
}
