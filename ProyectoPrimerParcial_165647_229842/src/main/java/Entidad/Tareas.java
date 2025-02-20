/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.sql.Date;

/**
 *
 * @author aleja
 */
public class Tareas {
    
    int idTarea;
    String nombreAsignatura;
    String tarea;
    Date fechaEntrega;
    Boolean entregada;

    public Tareas(int idTarea, String nombreAsignatura, String tarea, Date fechaEntrega, Boolean entregada) {
        this.idTarea = idTarea;
        this.nombreAsignatura = nombreAsignatura;
        this.tarea = tarea;
        this.fechaEntrega = fechaEntrega;
        this.entregada = entregada;
    }

    public Tareas(String nombreAsignatura, String tarea, Date fechaEntrega, Boolean entregada) {
        this.nombreAsignatura = nombreAsignatura;
        this.tarea = tarea;
        this.fechaEntrega = fechaEntrega;
        this.entregada = entregada;
    }

    public Tareas(int idTarea, String nombreAsignatura, String tarea, Date fechaEntrega) {
        this.idTarea = idTarea;
        this.nombreAsignatura = nombreAsignatura;
        this.tarea = tarea;
        this.fechaEntrega = fechaEntrega;
    }

    
    
    

    public int getIdTarea() {
        return idTarea;
    }

    public void setIdTarea(int idTarea) {
        this.idTarea = idTarea;
    }

    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    public String getTarea() {
        return tarea;
    }

    public void setTarea(String tarea) {
        this.tarea = tarea;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Boolean getEntregada() {
        return entregada;
    }

    public void setEntregada(Boolean entregada) {
        this.entregada = entregada;
    }
    
    
}