/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tikape2.runko.domain;

import java.sql.Timestamp;
import tikape2.runko.domain.Retrievable;

/**
 *
 * @author jack
 */
public class Alue implements Retrievable<Alue>{
    
    private int id;
    private String otsikko;

   
    private String viimeisinViesti;
    private Integer viesteja_alueessa;
    
    public Alue(){};

    public Alue(int id, String otsikko) {
        this.id = id;
        this.otsikko = otsikko;
    }
    
    public Alue(String otsikko) {
        this.otsikko = otsikko;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOtsikko() {
        return otsikko;
    }

    public void setOtsikko(String otsikko) {
        this.otsikko = otsikko;
    }
    
     public String getViimeisinViesti() {
        return viimeisinViesti;
    }

    public void setViimeisinViesti(String viimeisinViesti) {
        this.viimeisinViesti = viimeisinViesti;
    }

    public Integer getViesteja_alueessa() {
        return viesteja_alueessa;
    }

    public void setViesteja_alueessa(Integer viesteja_alueessa) {
        this.viesteja_alueessa = viesteja_alueessa;
    }

    @Override
    public String toString() {
        return "Alue{" + "id=" + id + ", otsikko=" + otsikko + ", viimeisinViesti=" + viimeisinViesti + ", viesteja_alueessa=" + viesteja_alueessa + '}';
    }
    
    
    
}