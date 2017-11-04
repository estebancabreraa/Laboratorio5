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
    
    public Tanque crearTanque(String ide, int profundidad, int ancho, int radio, int alto,String tipo, String mun1,String mun2,String mun3,String mun4,String mun5,String mun6,String mun7,String mun8,String mun9,String mun10){
        String[] municipios = new String[10];
        municipios[0] = mun1;
        municipios[1] = mun2;
        municipios[2] = mun3;
        municipios[3] = mun4;
        municipios[4] = mun5;
        municipios[5] = mun6;
        municipios[6] = mun7;
        municipios[7] = mun8;
        municipios[8] = mun9;
        municipios[9] = mun10;
        Tanque nuevo = new Tanque();
        if(tipo.equals("Cilindrico")){
            Tanque nuevoCilindrico = new TCilindrico(ide, alto,radio, municipios);
            return nuevoCilindrico;
        }if(tipo.equals("Cubico")){
            Tanque nuevoCilindrico = new TCilindrico(ide, alto,radio, municipios);
            return nuevoCilindrico;
        }if(tipo.equals("Ortogonal")){
            Tanque nuevoCilindrico = new TCilindrico(ide, alto,radio, municipios);
            return nuevoCilindrico;
        }
        return nuevo;
    }
    /**
     * 
     */
    public void ingresarTanque(Tanque nuevo){
        tanques[tanques.length] = nuevo;
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
    public Tanque buscarTanque(String ide){
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
