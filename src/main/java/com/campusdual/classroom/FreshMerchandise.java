package com.campusdual.classroom;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FreshMerchandise extends Merchandise {

    private Date expirationDate;

    // Constructor para inicializar la fecha de caducidad
    public FreshMerchandise(String name, String uniqueId, String responsibleId, int zone, String area, String shelf,int quantity, Date expirationDate) {
        super(name, uniqueId, responsibleId, zone, area, shelf, quantity);
        this.expirationDate = expirationDate;
    }


    @Override
    public Object getSpecificData() {

        String formattedExpirationDate = getFormattedDate(expirationDate);

        String texto = "Localización: "+ getLocation()+ " \nCaducidad: "+ formattedExpirationDate;


        return texto;
    }

    public void printSpecificData() {

        System.out.println(getSpecificData());
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public String getFormattedDate(Date expirationDate) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        return dateFormat.format(expirationDate);
    }


    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }
}
