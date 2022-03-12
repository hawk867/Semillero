package com.danielesteban.semillerobackend.entity;

import com.danielesteban.semillerobackend.entity.numeradores.EstadoTarea;
import com.danielesteban.semillerobackend.entity.numeradores.ZonaCobertura;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "creacion_de_solicitudes")
public class CrearSolicitud {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String condiciones;
    @Column
    @Enumerated(EnumType.STRING)
    private ZonaCobertura zonaCobertura;
    @Column
    private Integer precio;
    @ManyToOne(optional = false)
    @JoinColumn(name = "id_cliente", foreignKey = @ForeignKey(name = "FK_CLIENTE_ID"))
    private Cliente cliente;
    @ManyToOne(optional = false)
    @JoinColumn(name = "id_tarea", foreignKey = @ForeignKey(name = "FK_TAREA_ID"))
    private Tarea tarea1;
    @Column(name = "fecha_creacion")
    private LocalDateTime fechaCreacion;
    @Column(name = "estado_de_tarea")
    @Enumerated(EnumType.STRING)
    private EstadoTarea estado;

    public CrearSolicitud() {
    }

    public CrearSolicitud(Integer id, String condiciones, ZonaCobertura zonaCobertura, Integer precio, Cliente cliente, Tarea tarea) {
        this.id = id;
        this.condiciones = condiciones;
        this.zonaCobertura = zonaCobertura;
        this.precio = precio;
        this.cliente = cliente;
        this.tarea1 = tarea;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCondiciones() {
        return condiciones;
    }

    public void setCondiciones(String condiciones) {
        this.condiciones = condiciones;
    }

    public ZonaCobertura getZonaCobertura() {
        return zonaCobertura;
    }

    public void setZonaCobertura(ZonaCobertura zonaCobertura) {
        this.zonaCobertura = zonaCobertura;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Tarea getTarea1() {
        return tarea1;
    }

    public void setTarea1(Tarea tarea) {
        this.tarea1 = tarea;
    }

    @PrePersist
    private void antesDeCrear(){
        this.fechaCreacion = LocalDateTime.now();
    }
}
