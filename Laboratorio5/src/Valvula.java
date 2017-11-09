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
import org.mongodb.morphia.annotations.Embedded;

@Embedded
public class Valvula {
    //Atributos
    private String idMunicipio;
    private int poblacion;
    private ArrayList<Historial> historial;
    //Constructores
    /**
     * Constructor de la Valvula
     */
    public Valvula(){
        //Vacio
    }
    /**
     * Constructor de Valvula
     * @param municipio Municipio que corresponde a la valvula
     */
    public Valvula(String municipio){
        this.idMunicipio = municipio;
        this.historial = new ArrayList<Historial>();
        this.poblacion = 500 + (int)(Math.random() * 1000); 
    }
    //Metodos
    /**
     * Regresa el Municipio de la valvula
     * @return Municipio de la valvula
     */
    public String getIdMunicipio(){
        return this.idMunicipio;
    }
    /**
     * Regresa la cantidad de poblacion que hay en el municipio de la valvula
     * @return Poblacion del municipio de la valvula
     */
    public int getPoblacion(){
        return this.poblacion;
    }
    /**
     * Ingresa una nueva fecha al historial de la valvula
     * @param fecha Fecha para el historial de valvula
     */
    public void ingresarNuevaFecha(Historial fecha){
        historial.add(fecha);
    }
    
}
