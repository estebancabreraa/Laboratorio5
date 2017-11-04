/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David Soto y Esteban Cabrera
 */

import java.util.ArrayList;
import java.util.Random;


public class Valvula {
    //Atributos
    private String idMunicipio;
    private int poblacion;
    private ArrayList<Historial> historial;
    //Constructores
    public Valvula(){
        
    }
    public Valvula(String municipio){
        idMunicipio = municipio;
        historial = new ArrayList<Historial>();
        this.poblacion = 500 + (int)(Math.random() * 1000); 
    }
    //Metodos
    public String getIdMunicipio(){
        return this.idMunicipio;
    }
    
    public int getPoblacion(){
        return this.poblacion;
    }
    public void ingresarNuevaFecha(Historial fecha){
        historial.add(fecha);
    }
    
}
