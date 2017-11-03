/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David Soto y Esteban Cabrera
 */

public class Control {
    //Atributos
    private Tanque[] tanques = new Tanque[10];
    //Constructor
    public Control(){
        
    }
    //Metodos
    /**
     * 
     * @return 
     */
    public Tanque crearTanque(){
       Tanque nuevo = new Tanque();
       return nuevo;
    }
    /**
     * 
     */
    public void ingresarTanque(){
        
    }
    /**
     * 
     * @return 
     */
    public String Alerta(){
        
        String alerta = "ALERTA";
        return alerta;
    }
    /**
     * 
     */
    public void cerrarValvulas(){
        
    }
    /**
     * 
     * @param posicion
     * @return 
     */
    public Tanque buscarTanque(int posicion){
        
        Tanque busqueda = new Tanque();
        return busqueda;
    }
    /**
     * 
     * @return 
     */
    public int calcularCantidadValvulasCilindricas(){
        
        int cantidad = 1;
        return cantidad;
    }
    
    public int calcularCantidadAguaTotal(){
        int cantidadTotal = 0;
        return cantidadTotal;
    }
}
