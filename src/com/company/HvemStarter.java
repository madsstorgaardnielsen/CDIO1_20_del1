package com.company;

class HvemStarter {
    TerningeKast spiller1slag = new TerningeKast();
    TerningeKast spiller2slag = new TerningeKast();

    public int kør() {
        int tur = 2;
        int startslag1;
        int startslag2;

        do {
            startslag1 = spiller1slag.getØjne();
            startslag2 = spiller2slag.getØjne();
            System.out.println("spiller 1 slog: " + startslag1 + "\nspiller 2 slog: " + startslag2);
            //udskriver omslag inden nyt rul
            if (startslag1 == startslag2) {
                System.out.println("omslag!");
            }
        } while (startslag1 == startslag2);

        //giver turen til det højeste slag
        if (startslag1 > startslag2) {
            System.out.println("spiller 1 starter!");
        } else {
            tur++;
            System.out.println("spiller 2 starter!");
        }

        return tur;
    }
}
