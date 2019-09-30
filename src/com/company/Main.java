package com.company;

import java.util.Scanner;

public class  Main {
    public static void main(String[] args) {
        int spiller1point = 0, spiller2point = 0;
        int tur=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Velkommen til terningspillet");
        System.out.println("- et terning spil for to spillere, regler er følgende: første spiller til at ramme 40 point vinder!");
        System.out.println("- Tast enter for at slå med terningerne");
        System.out.println("- God fornøjelse!\n\n");


        //indtast de to spilleres navne
        System.out.print("Indtast navnet på spiller 1: ");
        String spiller1=sc.next().toString();
        System.out.print("Indtast navnet på spiller 2: ");
        String spiller2=sc.next().toString();

        System.out.print("\n--- skal slå om hvem der starter, tast enter for at slå---");

        //hokuspokus fra google der gør at der bliver ventet på enter bliver trykket før den ruller terningerne
        try {
            System.in.read();
        } catch (Exception e) {
        }

        //Finder ud af hvem der starter spillet vha. HvemStarter metoden
        HvemStarter starter = new HvemStarter();

        tur = starter.kør();

        System.out.println("Værdier af tur: "+tur+" hvis 2 = player1, 3 = player2");


        //Spillet starter og kører i et loop indtil nogen rammer 40 point.
        while (true) {
            if (tur % 2 == 0) {

                //kaster 2 terninger for spiller 1
                TerningeKast spiller1slag1 = new TerningeKast();
                TerningeKast spiller1slag2 = new TerningeKast();

                //hokuspokus fra google der gør at der bliver ventet på enter bliver trykket før den ruller terningerne
                try {
                    System.in.read();
                } catch (Exception e) {
                }

                int slag1 = spiller1slag1.getØjne();
                int slag2 = spiller1slag2.getØjne();

                //lægger summen til point
                int sum1 = slag1+slag2;
                spiller1point = sum1+spiller1point;

                System.out.println(spiller1 + " slår " + slag1 + " og " + slag2 + " hvilket svarer til "+sum1);
                System.out.println(spiller1 + " har nu: " + spiller1point+" point!\n");
                tur++;

                if (spiller1point >= 40) {
                    break;
                }

                //spiller 2's tur
            } if (tur%2!=0) {

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

                int sum2 = slag1+slag2;
                spiller2point = sum2 +spiller2point;

                System.out.println(spiller2 + " slår " + slag1 + " og " + slag2 + " hvilket svarer til: " + sum2 + " point!");
                System.out.println(spiller2 + " har nu: " + spiller2point+" point!\n");
                tur++;

                if (spiller2point >= 40) {
                    break;
                }
            }
        }
        //udskriver vinderen og hvor mange point han/hun/hen har og taberens point
        if (spiller1point > spiller2point) {
            System.out.println("\n\n\n\n" + spiller1 + " vinder med " + spiller1point + " point mod " + spiller2 + "'s " + spiller2point + " point");
        } else {
            System.out.println("\n\n\n\n" + spiller2 + " vinder med " + spiller2point + " point mod " + spiller1 + "'s " + spiller1point + " point");
        }
    }
}
