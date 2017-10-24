/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.omnilife.spring;

import com.omnilife.beans.AppConfig;
import com.omnilife.beans.AppConfig2;
import com.omnilife.beans.Barcelona;
import com.omnilife.beans.Ciudad;
import com.omnilife.beans.Jugador;
import com.omnilife.beans.Juventus;
import com.omnilife.beans.Persona;
import com.omnilife.interfaces.IEquipo;
import java.util.Scanner;
import javax.annotation.Resource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 *
 * @author Paul Soberanes <paul.soberanes@omnilife.com>
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Elija un equipo: 1- Barcelona 2-Juventus");
        int respuesta = sc.nextInt();
        
        ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");
        Jugador per = (Jugador) appContext.getBean("jugador1");
        
        switch(respuesta){
            case 1: 
                per.setEquipo(new Barcelona());
                break;
            case 2:
                per.setEquipo(new Juventus());
                break;
            default:
                break;
        }
        
        

        System.out.println(per.getNombre() + "-" + per.getEquipo().mostrar()
                + "-" + per.getCamiseta().getNumero() 
                + "-" + per.getCamiseta().getMarca().getNombre());
        ((ConfigurableApplicationContext) appContext).close();
    }

}
