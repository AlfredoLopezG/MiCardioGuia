package com.example.daniel_alfredo.cardioguia.models;

/**
 * Created by daniel_alfredo on 15/09/15.
 */
public class Presion {
    private String fechayhora;
    private String sistolica;
    private String diastolica;
    private String presion;

    @Override
    public String toString() {
        return "Presion{" +
                ", fechayhora='" + fechayhora + '\'' +
                ", sistolica=" + sistolica +
                ", diastolica='" + diastolica + '\'' +
                ", presion='" + presion + '\'' +
                '}';
    }

    public Presion(String FechayHora, String sistolica, String diastolica, String presion) {
        this.fechayhora = FechayHora;
        this.sistolica = sistolica;
        this.diastolica = diastolica;
        this.presion = presion;
    }

    public String getFechayhora (){return fechayhora;}
    public String getSistolica (){return sistolica;}
    public String getDiastolica (){return diastolica;}
    public String getPresion (){return presion;}

}
