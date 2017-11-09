/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author esteb
 */
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.query.Query;
import com.mongodb.MongoClient;
import java.util.List;
import org.mongodb.morphia.Key;

public class DataBase {
    private Datastore ds;
    
    public DataBase(){
        MongoClient mongo = new MongoClient();
        Morphia morphia = new Morphia();
        morphia.map(Tanque.class);//.map(Valvula.class).map(TCilindrico.class).map(TCubico.class).map(TOrtogonal.class); // clases a guardar
        Datastore ds = morphia.createDatastore(mongo, "Acueducto"); // Base Datos
    }
    
    public void registrarTanqueCIL(TCilindrico tanque){
        ds.save(tanque);
    }
    
    public void registrarTanqueCUB(TCubico tanque){
        ds.save(tanque);
    }
    
    public void registrarTanqueORT(TOrtogonal tanque){
        ds.save(tanque);
    }
}
