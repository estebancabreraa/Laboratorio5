/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David Soto y Esteban Cabrera
 */
public class Tanque {
    //Atributos
    protected String ide;
    protected int cantidadRestante;
    protected int capacidad;
    protected int alto;
    protected Valvula[] valvulas = new Valvula[10];
    
    public Tanque(){
        
    }
    //Metodos
    public int calcularPorcentajeAgua(){
        int porcentaje = (cantidadRestante/capacidad)*100;
        return porcentaje;
    }
    public String getIDE(){
        return ide;
    }
    public int getCapacidad(){
        return capacidad;
    }
    public int getCantidadRestante(){
       return cantidadRestante; 
    }
    public void rellenarTanque(){
        cantidadRestante = capacidad;
    }
    public String getMunicipioDeValvula(int posicion){
        Valvula prueba = new Valvula();
        prueba = valvulas[posicion];
        String municipio = prueba.getIdMunicipio();
        return municipio;
    }
    public void abrirValvula(int posicion){
        Valvula prueba = new Valvula();
        prueba = valvulas[posicion];
        int poblacion = prueba.getPoblacion();
        cantidadRestante = cantidadRestante - poblacion;
    }
    public void cerrarValvula(){
        
    }
}
