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
    
    private String idMunicipio;
    private int poblacion;
    private ArrayList<Historial> historial;
    
    public Valvula(String municipio){
        idMunicipio = municipio;
        historial = new ArrayList<Historial>();
        Random rn = new Random();
        this.poblacion = 500000 + (int)(rn.nextInt() * 1000000); 
    }
    
    public String getIdMunicipio(){
        return this.idMunicipio;
    }
    
    public int getPoblacion(){
        return this.poblacion;
    }
    
}
