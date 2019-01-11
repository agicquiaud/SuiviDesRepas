package fr.eni.javaee.bo;

import java.sql.DatabaseMetaData;
import java.util.Date;
import java.util.List;

public class Repas {
    private Date date;
    private List<Aliment> aliments;

    public Repas(){
        super();
    }

    public Repas(Date date, List<Aliment> aliments) {
        this.date = date;
        this.aliments = aliments;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Aliment> getAliments() {
        return aliments;
    }

    public void setAliments(List<Aliment> aliments) {
        this.aliments = aliments;
    }
}
