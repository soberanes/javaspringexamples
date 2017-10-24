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
public class Jugador {
    
   private int id;
   private String nombre;
   private IEquipo equipo;
   private Camiseta camiseta;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public void setEquipo(IEquipo equipo) {
        this.equipo = equipo;
    }

    public Camiseta getCamiseta() {
        return camiseta;
    }

    public void setCamiseta(Camiseta camiseta) {
        this.camiseta = camiseta;
    }
    
   
}
