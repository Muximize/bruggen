package nl.ordina.bruggen;

import java.time.LocalDateTime;

public class BrugopeningConflict {

    private String brugNaam;
    private LocalDateTime begin;
    private LocalDateTime eind;

    public String getBrugNaam() {
        return brugNaam;
    }

    public void setBrugNaam(String brugNaam) {
        this.brugNaam = brugNaam;
    }

    public LocalDateTime getBegin() {
        return begin;
    }

    public void setBegin(LocalDateTime begin) {
        this.begin = begin;
    }

    public LocalDateTime getEind() {
        return eind;
    }

    public void setEind(LocalDateTime eind) {
        this.eind = eind;
    }
}
