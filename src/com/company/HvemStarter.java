package com.company;
class HvemStarter {

    //opretter to terningekast vha. TerningeKast klassen
    TerningeKast spiller1slag = new TerningeKast();
    TerningeKast spiller2slag = new TerningeKast();

    //Løkke der finder ud af hvilken en af spillerne der får lov at kaste først
    int førsteKast() {
        int tur = 2, startslag1,startslag2;;

        //Terningerne kastes og gemmes i startslag1 og startslag2
        do {
            startslag1 = spiller1slag.getØjne();
            startslag2 = spiller2slag.getØjne();

            //Slagene udskrives
            System.out.println("Spiller 1 slog: " + startslag1 + "\nSpiller 2 slog: " + startslag2);

            //Hvis slagene er ens udskrives der Omslag, og der bliver slået igen, indtil slagene ikke er ens
            if (startslag1 == startslag2) {
                System.out.println("Omslag!");
            }
        } while (startslag1 == startslag2);

        //Det højeste slag bliver fundet, og enten spiller 1 eller spiller 2 starter, alt efter om tur går en op eller ej.
        if (startslag1 > startslag2) {
            System.out.println("\nSpiller 1 starter!");
        } else {
            tur++;
            System.out.println("\nSpiller 2 starter!");
        }
        //Turs nye værdi bliver returneret så den rigtige spiller får lov at starte.
        return tur;
    }
}
