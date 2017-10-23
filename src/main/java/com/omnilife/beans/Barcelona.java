/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.omnilife.beans;

import com.omnilife.interfaces.IEquipo;

/**
 *
 * @author Paul Soberanes <paul.soberanes@omnilife.com>
 */
public class Barcelona implements IEquipo{

    @Override
    public String mostrar() {
        return "Barcelona FC";
    }
    
    
}
