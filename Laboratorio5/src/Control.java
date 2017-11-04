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
    private int contadorIngreso = 0;
    //Constructor
    public Control(){
        
    }
    //Metodos
    /**
     * 
     * @param ide
     * @param profundidad
     * @param ancho
     * @param radio
     * @param alto
     * @param tipo
     * @param mun1
     * @param mun2
     * @param mun3
     * @param mun4
     * @param mun5
     * @param mun6
     * @param mun7
     * @param mun8
     * @param mun9
     * @param mun10
     * @return 
     */
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
            Tanque nuevoCubico = new TCubico(ide, alto, municipios);
            return nuevoCubico;
        }if(tipo.equals("Ortogonal")){
            Tanque nuevoOrtogonal = new TOrtogonal(ide, alto, ancho, profundidad, municipios);
            return nuevoOrtogonal;
        }
        return nuevo;
    }
    /**
     * 
     */
    public void ingresarTanque(Tanque nuevo){
        tanques[contadorIngreso] = nuevo;
        contadorIngreso = contadorIngreso + 1;
    }
    public void reingresarTanque(int posicion, Tanque nuevo){
        tanques[posicion] = nuevo;
    }
    /**
     * 
     * @return 
     */
    public String Alerta(int porcentaje){
        String alerta = "";
        if(porcentaje<=25 && porcentaje>=10){
            alerta = "ALERTA: Menos de 25% de Agua";
        }if(porcentaje<10){
            alerta = "ALERTA: Menos de 10% Agua, Valvulas cerradas ";
        }
        return alerta;
    }
    /**
     * 
     */
    public void cerrarValvulas(){
        //Nada
    }
    /**
     * 
     * @param posicion
     * @return 
     */
    public Tanque buscarTanque(String ide){
        Tanque busqueda = new Tanque();
        for(int i = 0;i<contadorIngreso; i++){
            Tanque prueba = new Tanque();
            prueba = tanques[i];
            if(ide.equals(prueba.getIDE())){
                busqueda = prueba;
                return busqueda;
            }
        }
        return busqueda;
    }
    public int buscarTanque1(String ide){
        int posicion = -1;
        for(int i = 0;i<contadorIngreso; i++){
            Tanque prueba1 = new Tanque();
            prueba1 = tanques[i];
            if(ide.equals(prueba1.getIDE())){
                posicion = posicion + 1;
                return posicion;
            }
        }
        return posicion;
    }
    public int buscarTanque2(String ide){
        int prueba = 0;
        if(contadorIngreso == 0){
           return prueba; 
        }else{
            for(int i = 0;i<contadorIngreso; i++){
                Tanque prueba1 = new Tanque();
                prueba1 = tanques[i];
                if(ide.equals(prueba1.getIDE())){
                    prueba = 1;
                    return prueba;
                }
            }
            return prueba;
        }
    }
    /**
     * 
     * @return 
     */
    public int calcularCantidadValvulasCilindricas(){
        int cantidad = 0;
        for(int i = 0;i<tanques.length; i++){
            Tanque prueba = new Tanque();
            prueba = tanques[i];
            if(prueba instanceof TCilindrico){
                cantidad = cantidad + 1;
            }
            return cantidad;
        }
        return cantidad;
    }
    
    public int calcularCantidadAguaTotal(String ide){
        int cantidadTotal = 0;
        for(int i = 0;i<tanques.length; i++){
            Tanque prueba = new Tanque();
            prueba = tanques[i];
            cantidadTotal = prueba.getCantidadRestante() + cantidadTotal;
            return cantidadTotal;
        }
        return cantidadTotal;
    }
    public int getCOntador(){
        return contadorIngreso;
    }
}
