/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David Soto y Esteban Cabrera
 */

public class TCilindrico extends Tanque{
    private int radio;
    
    public TCilindrico(String id, int alto, int radio, String[] nMunicipios){
        super.ide = id;
        super.alto = alto;
        this.radio = radio;
        for(int i = 0; i < super.valvulas.length; i++){
            String municipio = nMunicipios[i];
            super.valvulas[i] = new Valvula(municipio);
        }
    }
    /**
     * 
     */
    public void ingresarCapacidad(){
        double capacidad = Math.PI*Math.pow(radio, 2)*super.alto;
        int capacidadInt = Double.valueOf(capacidad).intValue();
        super.capacidad = capacidadInt;
        super.cantidadRestante = capacidadInt;
    }
}
