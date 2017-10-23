/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.omnilife.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 *
 * @author Paul Soberanes <paul.soberanes@omnilife.com>
 */
public class Persona implements InitializingBean, DisposableBean{

    private int id;
    private String nombre;
    private String apodo;
    private Pais pais;
    private Ciudad ciudad;
    
    /*
    @PostConstruct
    private void initBean(){
        System.out.println("Antes de inicializar el bean persona");
    }

    @PreDestroy
    private void destroyBean(){
        System.out.println("Bean persona a punto de ser destruido");
    }
    */

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

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

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("AFTER PERSONA");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DESTROY PERSONA");
    }

}
