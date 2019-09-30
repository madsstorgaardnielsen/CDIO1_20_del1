/*package com.company;

public class Tur {
    int spiller1point = 0, spiller2point = 0;
    int tur = 0;

    //Spillet starter og køre i et loop indtil nogen rammer 40 point.
        while(spiller1point!=40&&spiller2point!=40) {

        if (tur % 2 == 0) {

            //kaster 2 terninger for spiller 1
            TerningeKast spiller1slag1 = new TerningeKast();
            TerningeKast spiller1slag2 = new TerningeKast();

            int slag1 = spiller1slag1.getØjne();
            int slag2 = spiller1slag2.getØjne();

            //lægger summen til point
            spiller1point = slag1 + slag2 + spiller1point;
            int sum1 = slag1 + slag2;

            System.out.println(spiller1 + " slår " + slag1 + " og " + slag2 + " hvilket svarer til " + sum1);
            System.out.println(spiller1 + " har nu: " + spiller1point + " point!");
            tur++;

            if (spiller1point > 40) {
                break;
            }
        }
        if (tur % 2 != 0) {

            //opretter terninger til spiller 2
            TerningeKast spiller2slag1 = new TerningeKast();
            TerningeKast spiller2slag2 = new TerningeKast();

            //hokuspokus fra google der gør at der bliver ventet på enter bliver trykket før den ruller terningerne
            try {
                System.in.read();
            } catch (Exception e) {
            }

            int slag1 = spiller2slag1.getØjne();
            int slag2 = spiller2slag2.getØjne();

            spiller2point = slag1 + slag2 + spiller2point;
            int sum2 = slag1 + slag2;

            System.out.println(spiller2 + " slår " + slag1 + " og " + slag2 + " hvilket svarer til: " + sum2 + " point!");
            System.out.println(spiller2 + " har nu: " + spiller1point + " point!");
            tur++;

            if (spiller2point > 40) {
                break;
            }
        }
    }
}*/