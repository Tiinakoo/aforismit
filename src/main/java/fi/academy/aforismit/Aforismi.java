package fi.academy.aforismit;

import org.springframework.stereotype.Component;


public class Aforismi {
    private String nimi;
    private String sanonta;

    public Aforismi(){
    }

    public Aforismi(String nimi, String sanonta) {
        this.nimi = nimi;
        this.sanonta = sanonta;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public String getSanonta() {
        return sanonta;
    }

    public void setSanonta(String sanonta) {
        this.sanonta = sanonta;
    }

    @Override
    public String toString() {
        return "Aforismi{" +
                ", nimi='" + nimi + '\'' +
                ", sanonta='" + sanonta + '\'' +
                '}';
    }
}
