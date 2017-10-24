/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.omnilife.beans;

import com.omnilife.interfaces.IEquipo;
import org.springframework.stereotype.Component;

/**
 *
 * @author Paul Soberanes <paul.soberanes@omnilife.com>
 */
@Component
public class Juventus implements IEquipo{

    @Override
    public String mostrar() {
        return "Juventus";
    }
    
}
