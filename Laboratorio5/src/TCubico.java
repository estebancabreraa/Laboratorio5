/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David Soto y Esteban Cabrera
 */

public class TCubico extends Tanque{
    //Atributos
        //No hay
    //Constructor
    /**
     * Constructor de TCubico
     * @param id El IDE del tanque
     * @param alto Altura del tanque
     * @param nMunicipios Arreglo de municipio para las valvulas
     */
    public TCubico(String id, int alto, String[] nMunicipios){
        super.ide = id;
        super.alto = alto;
        for(int i = 0; i < super.valvulas.length; i++){
            String municipio = nMunicipios[i];
            super.valvulas[i] = new Valvula(municipio);
        }
    }
    //Metodos
    /**
     * Ingresa la capacidad de TCubico
     */
    @Override
    public void ingresarCapacidad(){
        double capacidad = Math.pow(alto, 3);
        int capacidadInt = Double.valueOf(capacidad).intValue();
        super.capacidad = capacidadInt;
        super.cantidadRestante = capacidadInt;
        System.out.println(capacidadInt);
    }
}
