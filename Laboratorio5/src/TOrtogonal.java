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
public class TOrtogonal extends Tanque{
    //Atributos
    private double largo;
    private double profundidad;
    //Constructor
    /**
     * Contructor de TOrtogonal
     * @param id El IDE del tanque
     * @param alto Altura del taque
     * @param largo Ancho del tanque
     * @param profundidad Profundidad del tanque
     * @param nMunicipios Arreglo de municipios para las valvulas
     */
    
    public TOrtogonal(){}
    
    public TOrtogonal(String id, double alto, double largo, double profundidad, String[] nMunicipios){
        super(id, alto);
        this.largo = largo;
        this.profundidad = profundidad;
        for(int i = 0; i < super.valvulas.length; i++){
            String municipio = nMunicipios[i];
            super.valvulas[i] = new Valvula(municipio);
        }
    }
    //Metodos
    /**
     * Ingresa la capacidad de un tanque Ortogonal
     */
    @Override
    public void ingresarCapacidad(){
        double capacidad = alto*largo*profundidad;
        int capacidadInt = Double.valueOf(capacidad).intValue();
        super.capacidad = capacidadInt;
        super.cantidadRestante = capacidadInt;
        System.out.println(capacidadInt);
    }
}
