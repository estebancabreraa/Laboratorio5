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
    
    public TCilindrico(String id,  int radio, String[] nMunicipios){
        super.ide = id;
        this.radio = radio;
        for(int i = 0; i < super.valvulas.length; i++){
            String municipio = nMunicipios[i];
            super.valvulas[i] = new Valvula(municipio);
        }
    }
    public int calcularCapacidad(){
        double capacidad = Math.PI*Math.pow(radio, 2);
        int capacidadInt = Double.valueOf(capacidad).intValue();
        return capacidadInt;
    }
}
