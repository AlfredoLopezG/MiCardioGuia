package com.example.daniel_alfredo.cardioguia.models;

/**
 * Created by daniel_alfredo on 15/09/15.
 */
public class Dato {
    private String fechayhora;
    private String presion;
    private String pulso;

    @Override
    public String toString() {
        return "Dato{" +
                ", fechayhora='" + fechayhora + '\'' +
                ", presion=" + presion +
                ", pulso='" + pulso + '\'' +
                '}';
    }

    public Dato(String FechayHora, String presion, String pulso) {
        this.fechayhora = FechayHora;
        this.presion = presion;
        this.pulso = pulso;
    }

    public String getFechayhora (){return fechayhora;}
    public String getPresion(){return presion;}
    public String getPulso(){return pulso;}

}
