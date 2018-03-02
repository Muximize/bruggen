package nl.ordina.bruggen;

import java.time.LocalDateTime;

public class BrugopeningAanvraag {

    private String brugNaam;
    private LocalDateTime open;
    private LocalDateTime dicht;

    public BrugopeningAanvraag(String brugNaam, LocalDateTime open, LocalDateTime dicht) {
        this.brugNaam = brugNaam;
        this.open = open;
        this.dicht = dicht;
    }

    public String getBrugNaam() {
        return brugNaam;
    }

    public LocalDateTime getOpen() {
        return open;
    }

    public LocalDateTime getDicht() {
        return dicht;
    }
}
