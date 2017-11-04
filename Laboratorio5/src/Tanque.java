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
    public void ingresarCapacidad(){
        
    }
    public int calcularPorcentajeAgua(){
        double porcentajito = ((cantidadRestante*1.0)/capacidad)*100;
        int porcentaje = (int)Math.floor(porcentajito);
        System.out.println(porcentaje);
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
    public void abrirValvula(int posicion, String fecha){
        Valvula prueba = new Valvula();
        prueba = valvulas[posicion];
        int poblacion = prueba.getPoblacion();
        System.out.println(poblacion);
        Historial nuevo = new Historial(fecha, "Abrir");
        prueba.ingresarNuevaFecha(nuevo);
        valvulas[posicion]=prueba;
        cantidadRestante = cantidadRestante - poblacion;
        
    }
    public void cerrarValvula(){
        
    }
}
