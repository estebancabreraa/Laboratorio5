import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Id;
import org.bson.types.ObjectId;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David Soto y Esteban Cabrera
 */
@Entity
public class TCilindrico extends Tanque{
    //Atributos
    private double radio;
    //Constructor
    /**
     * Constructor de la clase TCilindrico
     * @param id El IDE del Tanque
     * @param alto Altura del tanque
     * @param radio Radio del tanque
     * @param nMunicipios Arreglo de municipios para las valvulas
     */
    public TCilindrico(){}
    
    public TCilindrico(String id, double alto, double radio, String[] nMunicipios){
        super(id, alto);
        this.radio = radio;
        for(int i = 0; i < super.valvulas.length; i++){
            String municipio = nMunicipios[i];
            super.valvulas[i] = new Valvula(municipio);
        }
    }
    //Metodos
    /**
     * Ingresa la capacidad de un Tanque Cilindrico
     */
    @Override 
    public void ingresarCapacidad(){
        double capacidad = Math.PI*Math.pow(radio, 2)*alto;
        int capacidadInt = Double.valueOf(capacidad).intValue();
        super.capacidad = capacidadInt;
        super.cantidadRestante = capacidadInt;
        System.out.println(capacidadInt);
        
    }
}
