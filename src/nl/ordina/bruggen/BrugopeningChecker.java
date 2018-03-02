package nl.ordina.bruggen;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BrugopeningChecker {

    public static List<BrugopeningConflict> check(List<BrugopeningAanvraag> aanvragen) {

        Map<String, List<BrugopeningAanvraag>> grouped = aanvragen.stream().collect(Collectors.groupingBy(BrugopeningAanvraag::getBrugNaam));

        return Collections.emptyList();
    }
}
