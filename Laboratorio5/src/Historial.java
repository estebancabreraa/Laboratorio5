
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Id;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David Soto y Esteban Cabrera
 */
@Embedded
public class Historial {
    //Atributos
    private String fecha;
    private String estado;
    
    @Id private ObjectId id;
    //Constructor
    /**
     * Contructor de Historial
     * @param fecha La fecha en que se realiza una accion en la valvula
     * @param estado La accion que se realiza en la valvula
     */
    public Historial(String fecha, String estado){
        this.fecha = fecha;
        this.estado = estado;
    }
    
}
