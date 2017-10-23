/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.omnilife.beans;

import com.omnilife.interfaces.IEquipo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 *
 * @author Paul Soberanes <paul.soberanes@omnilife.com>
 */
@Component("messi")
public class Jugador {
    
    private int numero;
    @Value("Lionel Messi")
    private String nombre;
    
    @Autowired
//    @Qualifier("barcelonaQualifier")
    private IEquipo equipo;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public IEquipo getEquipo() {
        return equipo;
    }

//    @Required 
    public void setEquipo(IEquipo equipo) {
        this.equipo = equipo;
    }
    
    
}
