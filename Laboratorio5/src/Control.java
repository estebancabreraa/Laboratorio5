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
    /**
     * Constructor de la clase Control
     */
    private DataBase dataBase = new DataBase();
    
    public Control(){
       //Vacio 
    }
    //Metodos
    /**
     * Metodo que sirve para crear un nuevo tanque
     * @param ide IDE del tanque
     * @param profundidad Profundidad del Tanque
     * @param ancho Ancho del tanque
     * @param radio Radio del tanque
     * @param alto Altura del tanque
     * @param tipo Tipo de tanque que se creara
     * @param mun1 Municipio de Valvula 1
     * @param mun2 Municipio de Valvula 2
     * @param mun3 Municipio de Valvula 3
     * @param mun4 Municipio de Valvula 4
     * @param mun5 Municipio de Valvula 5
     * @param mun6 Municipio de Valvula 6
     * @param mun7 Municipio de Valvula 7
     * @param mun8 Municipio de Valvula 8
     * @param mun9 Municipio de Valvula 9
     * @param mun10 Municipio de Valvula 10
     * @return Un tanque nuevo que se creo
     */
    public void crearTanque(String tipo, String ide, double profundidad, double ancho, double radio, double alto, String [] muni){
        if(tipo.equals("Cilindrico")){
            TCilindrico nuevoCilindrico = new TCilindrico(ide, alto, radio, muni);
            ingresarTanqueCIL(nuevoCilindrico);
        }if(tipo.equals("Cubico")){
            TCubico nuevoCubico = new TCubico(ide, alto, muni);
            ingresarTanqueCUB(nuevoCubico);
        }if(tipo.equals("Ortogonal")){
            TOrtogonal nuevoOrtogonal = new TOrtogonal(ide, alto, ancho, profundidad, muni);
            ingresarTanqueORT(nuevoOrtogonal);
        }
        
    }
    /**
     * Ingresa un tanque nuevo a la lista de tanques
     * @param nuevo El nuevo Tanque a Ingresar
     */
    public void ingresarTanqueCIL(TCilindrico nuevo){
        DataBase dataBase = new DataBase();
        dataBase.registrarTanqueCIL(nuevo);
        tanques[contadorIngreso] = nuevo;
        contadorIngreso = contadorIngreso + 1;
    }
    
    public void ingresarTanqueCUB(TCubico nuevo){
        DataBase dataBase = new DataBase();
        dataBase.registrarTanqueCUB(nuevo);
        tanques[contadorIngreso] = nuevo;
        contadorIngreso = contadorIngreso + 1;
    }
    
    public void ingresarTanqueORT(TOrtogonal nuevo){
        DataBase dataBase = new DataBase();
        dataBase.registrarTanqueORT(nuevo);
        tanques[contadorIngreso] = nuevo;
        contadorIngreso = contadorIngreso + 1;
    }
    /**
     * Reingresa un tanque a la lista con datos actualizados
     * @param posicion La posicion en que se encontraba el tanque sin actualizar
     * @param nuevo El tanque actualizado
     */
    public void reingresarTanque(int posicion, Tanque nuevo){
        tanques[posicion] = nuevo;
    }
    /**
     * 
     * Regresa un mensaje con una alerta del nivel del agua del tanque
     * @param porcentaje Porcentaje de agua que queda
     * @return El mensaje de alerta para avisar que el agua de el tanque que se esta utilizando casi se acaba 
     */
    public String Alerta(double porcentaje){
        String alerta = "";
        if(porcentaje<=25 && porcentaje>=10){
            alerta = "ALERTA: Menos de 25% de Agua";
        }if(porcentaje<10){
            alerta = "ALERTA: Menos de 10% Agua, Valvulas cerradas ";
        }
        return alerta;
    }
    /**
     * Cierra las valvulas de un tanque
     */
    public void cerrarValvulas(){
        //Nada
    }
    /**
     * Busca un Tanque por su IDE en la lista de Tanques
     * @param ide El IDE del tanque
     * @return Un tanque dentro de la lista de Tanques
     */
    public Tanque buscarTanque(String ide){
        Tanque busqueda = null;
        for(int i = 0;i<contadorIngreso; i++){
            Tanque prueba = null;
            prueba = tanques[i];
            if(ide.equals(prueba.getIDE())){
                busqueda = prueba;
                return busqueda;
            }
        }
        return busqueda;
    }
    /**
     * Busca la posicion en la que esta un tanque dentro de la lista por su IDE
     * @param ide El IDE del tanque que se busca
     * @return La posicion del tanque buscado
     */
    public int buscarTanque1(String ide){
        int posicion = -1;
        for(int i = 0;i<contadorIngreso; i++){
            Tanque prueba1 = null;
            prueba1 = tanques[i];
            if(ide.equals(prueba1.getIDE())){
                posicion = posicion + 1;
                return posicion;
            }
        }
        return posicion;
    }
    /**
     * Revisa si ya existe un tanque con determinando IDE en la lista
     * @param ide El IDE que se desea buscar en la lista
     * @return Un numero 1 si el IDE ya existe y un numero 0 si el IDE aun no existe
     */
    public int buscarTanque2(String ide){
        int prueba = 0;
        if(contadorIngreso == 0){
           return prueba; 
        }else{
            for(int i = 0;i<contadorIngreso; i++){
                Tanque prueba1 = null;
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
     * Calcula el numero de valvulas cilindricas que existen en total en los tanque en la lista
     * @return La cantidad de valvulas cilindricas totales
     */
    public int calcularCantidadValvulasCilindricas(){
        int cantidad = 0;
        for(int i = 0;i<tanques.length; i++){
            Tanque prueba = null;
            prueba = tanques[i];
            if(prueba instanceof TCilindrico){
                cantidad = cantidad + 10;
            }
        }
        return cantidad;
    }
    /**
     * Calcula la cantidad de metros cubicos de agua que restan entre todos los tanques
     * @return Cantidad de metros cubicos restantes
     */
    public double calcularCantidadAguaTotal(){
        double cantidadTotal = 0;
        for(int i = 0;i<contadorIngreso; i++){
            Tanque prueba = null;
            prueba = tanques[i];
            cantidadTotal = prueba.getCantidadRestante() + cantidadTotal;
        }
        return cantidadTotal;
    }
    /**
     * Devuelve el contador que lleva el numero de Tanques inngresados
     * @return Cantidad de tanques ingresados
     */
    public int getCOntador(){
        return contadorIngreso;
    }
    public void mostrarTanques(){
        //Solo este falta
    }
}
