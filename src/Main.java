import nl.ordina.bruggen.BrugopeningAanvraag;
import nl.ordina.bruggen.BrugopeningChecker;
import nl.ordina.bruggen.BrugopeningConflict;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<BrugopeningAanvraag> aanvragen = Arrays.asList(
                new BrugopeningAanvraag("brug1",
                        LocalDateTime.of(2018, 1, 1, 1, 0),
                        LocalDateTime.of(2018, 1, 1, 2, 0)
                ),
                new BrugopeningAanvraag("brug1",
                        LocalDateTime.of(2018, 1, 1, 1, 30),
                        LocalDateTime.of(2018, 1, 1, 2, 30)
                ),
                new BrugopeningAanvraag("brug2",
                        LocalDateTime.of(2018, 1, 1, 1, 0),
                        LocalDateTime.of(2018, 1, 1, 3, 0)
                ),
                new BrugopeningAanvraag("brug2",
                        LocalDateTime.of(2018, 1, 1, 2, 0),
                        LocalDateTime.of(2018, 1, 1, 4, 0)
                ),
                new BrugopeningAanvraag("brug2",
                        LocalDateTime.of(2018, 1, 1, 5, 0),
                        LocalDateTime.of(2018, 1, 1, 6, 0)
                ),
                new BrugopeningAanvraag("brug3",
                        LocalDateTime.of(2018, 1, 1, 1, 0),
                        LocalDateTime.of(2018, 1, 1, 6, 0)
                )
        );

        List<BrugopeningConflict> conflicten = BrugopeningChecker.check(aanvragen);

        System.out.println(conflicten.size() + " conflicten gevonden:");
        conflicten.forEach(conflict -> {
            System.out.println(conflict.getBrugNaam() + " : " + conflict.getBegin() + " - " + conflict.getEind());
        });
    }
}
