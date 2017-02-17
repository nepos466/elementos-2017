/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Facil {
    
    @Id
    @GeneratedValue        
    private Long id;

    private String titulo;
    private String cuerpo;
    @Column(name="fecha")
    private Date date;

    //Este es para hacer un select * from facil
    public Facil() {
    }

    //Sirve para borrar por id Y BUSCAR POR ID
    public Facil(Long id) {
        this.id = id;
    }

    //ESte sirve para guardar un registro
    public Facil(String titulo, String cuerpo, Date date) {
        this.titulo = titulo;
        this.cuerpo = cuerpo;
        this.date = date;
    }

    //ESte es para HACER UN UPDATE
    public Facil(Long id, String titulo, String cuerpo, Date date) {
        this.id = id;
        this.titulo = titulo;
        this.cuerpo = cuerpo;
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }
    
    
    
    
    
    
    
    
}
