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

public class TCilindrico extends Tanque{
    private int radio;
    private Valvula[] valvulas = new Valvula[10];
    
    public TCilindrico(String id, int capacidad, int alto, int cantidadRestante,  int radio, String nMunicipios[]){
        super(id, capacidad, cantidadRestante, alto);
        
    }
}
