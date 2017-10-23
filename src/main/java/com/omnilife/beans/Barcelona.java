/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.omnilife.beans;

import com.omnilife.interfaces.IEquipo;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 *
 * @author Paul Soberanes <paul.soberanes@omnilife.com>
 */
@Component
//@Repository -- Es la más común en el patrón DAO para la capa de datos.
//@Controller -- Es la más común para la capa del controlador.
//@Service
public class Barcelona implements IEquipo{

    @Override
    public String mostrar() {
        return "Barcelona FC";
    }
    
    
}
