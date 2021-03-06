/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tikape2.runko.domain;

import java.sql.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author jack
 */
public class Alue  {
    
    private int id;
    private String otsikko;

   
    private Date viimeisinViesti;
    private String viimeisinViestiString;
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
    
     public Date getViimeisinViesti() {
        return viimeisinViesti;
    }

    public void setViimeisinViesti(Date viimeisinViesti) {
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
        /*
        for debugging
        */
        return "Alue{" + "id=" + id + ", otsikko=" + otsikko + ", viimeisinViesti=" + viimeisinViesti + ", viesteja_alueessa=" + viesteja_alueessa + '}';
    }

    public String getViimeisinViestiString() {
        /*
        Get date format working in html
        */
        try {
        String aikaleima = new SimpleDateFormat("dd-MM-YYYY HH:mm:ss").format(this.viimeisinViesti);
        return aikaleima;
        } catch (NullPointerException e){
            return "Ei viestejä";
        }
        
    }
    
    
    
}
