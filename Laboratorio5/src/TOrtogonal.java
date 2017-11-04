/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David Soto y Esteban Cabrera
 */

public class TOrtogonal extends Tanque{
    //Atributos
    private int largo;
    private int profundidad;
    //Constructor
    public TOrtogonal(String id, int alto, int largo, int profundidad, String[] nMunicipios){
        super.ide = id;
        super.alto = alto;
        this.largo = largo;
        this.profundidad = profundidad;
        for(int i = 0; i < super.valvulas.length; i++){
            String municipio = nMunicipios[i];
            super.valvulas[i] = new Valvula(municipio);
        }
    }
    //Metodos
    /**
     * 
     */
    public void ingresarCapacidad(){
        double capacidad = alto*largo*profundidad;
        int capacidadInt = Double.valueOf(capacidad).intValue();
        super.capacidad = capacidadInt;
        super.cantidadRestante = capacidadInt;
    }
}
