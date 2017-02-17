/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 *
 * @author campitos
 */
@Entity
public class Direccion {
    
    @Id
    @GeneratedValue
    @Column(name="id_direccion")
    Long id;
    
    @OneToOne
    @JoinColumn(name="id_cliente")
    Cliente cliente;
    
    String calle;
    String municipio;
    Long cp;

    public Direccion(Long id) {
        this.id = id;
    }

    public Direccion(Cliente cliente, String calle, String municipio, Long cp) {
        this.cliente = cliente;
        this.calle = calle;
        this.municipio = municipio;
        this.cp = cp;
    }

    public Direccion() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public Long getCp() {
        return cp;
    }

    public void setCp(Long cp) {
        this.cp = cp;
    }
    
    
    
}
