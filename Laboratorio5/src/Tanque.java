/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David Soto y Esteban Cabrera
 */
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Id;
import org.bson.types.ObjectId;

@Entity
public class Tanque {
    //Atributos
    @Id private ObjectId id;
    
    protected String ide;
    protected double cantidadRestante;
    protected double capacidad;
    protected double alto;
    
    @Embedded
    protected Valvula[] valvulas = new Valvula[10];
    //Constructor
    /**
     * Constructor de la clase Tanque
     */
    public Tanque(){}
    
    public Tanque(String ide, double alto){
        this.ide = ide;
        this.alto = alto;
        //this.valvulas = valvulas;
    }
    //Metodos
    /**
     * Ingresa la capacidad de un tanque
     */
    
    public void ingresarCapacidad(){
        //Vacio
    }
    /**
     * Calcula el porcentaje de agua que queda en un tanque
     * @return El porcentaje de agua que queda en el tanque
     */
    public double calcularPorcentajeAgua(){
        double porcentajito = ((cantidadRestante*1.0)/capacidad)*100;
        int porcentaje = (int)Math.floor(porcentajito);
        return porcentaje;
    }
    /**
     * Regresa el IDE del tanque
     * @return El IDE del tanque
     */
    public String getIDE(){
        return ide;
    }
    /**
     * Regresa la capacidad de un tanque
     * @return La capacidad de un tanque
     */
    public double getCapacidad(){
        return capacidad;
    }
    /**
     * Regresa la cantidad Restante de agua
     * @return La cantidad Restante de agua
     */
    public double getCantidadRestante(){
       return cantidadRestante; 
    }
    /**
     * Rellena un tanque nuevamente
     */
    
    public void rellenarTanque(){
        cantidadRestante = capacidad;
    }
    /**
     * Devuelve el municipio a la que pertenezca una valvula
     * @param posicion La posicion de la valvula que se desea consultar
     * @return El municipio al cual se dirige la valvula
     */
    public String getMunicipioDeValvula(int posicion){
        Valvula prueba = new Valvula();
        prueba = valvulas[posicion];
        String municipio = prueba.getIdMunicipio();
        return municipio;
    }
    /**
     * Abre una valvula y deja la fecha de apertura en un historial de la valvula y a su vez actualiza la valvuala y resta la cantidad de agua que se saco al abrirla
     * @param posicion La posicion en que se encuentra la valvula a abrir
     * @param fecha Fecha en que se abre la valvula
     */
    public void abrirValvula(int posicion, String fecha){
        Valvula prueba = new Valvula();
        prueba = valvulas[posicion];
        int poblacion = prueba.getPoblacion();
        Historial nuevo = new Historial(fecha, "Abrir");
        prueba.ingresarNuevaFecha(nuevo);
        valvulas[posicion]=prueba;
        cantidadRestante = cantidadRestante - poblacion;
        
    }
    /**
     * Cierra una valvula y deja la fecha de cerradura en un historial de la valvula y a su vez actualiza la valvuala
     * @param posicion La posicion en que se encuentra la valvula a cerrar
     * @param fecha Fecha en que se cierra la valvula
     */
    public void cerrarValvula(int posicion, String fecha){
       Valvula prueba = new Valvula();
        prueba = valvulas[posicion];
        Historial nuevo = new Historial(fecha, "Cerrar");
        prueba.ingresarNuevaFecha(nuevo);
        valvulas[posicion]=prueba;
    }
}
