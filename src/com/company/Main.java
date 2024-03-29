package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Sætter spiller1 og spiller2's point til en begyndelses værdi på 0
        int spiller1point = 0, spiller2point = 0;

        //tur variablen holder styr på hvis tur det er, hvis den er lige er det spiller1's tur, hvis ulige er det spiller2's tur
        int tur = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Velkommen til terningspillet");
        System.out.println("- Et terninge spil for to spillere, regler er følgende: ");
        System.out.println("- første spiller til at ramme 40 point vinder.");
        System.out.println("- hvis der bliver slået et par 1, mister man alle sine point, men får en ekstra tur.");
        System.out.println("- hvis der bliver slået et dobbeltslag, får man en ekstra tur.");
        System.out.println("- I skal slå om hvem der starter spillet.");
        System.out.println("- Tryk enter for at slå med terningerne.\n");
        System.out.println("- God fornøjelse!\n\n");

        //indtast navnene på de to spillere, de bliver gemt i variablerne spiller1 og spiller2
        System.out.print("Indtast navnet på Spiller 1: ");
        String spiller1 = sc.next().toString();
        System.out.print("Indtast navnet på Spiller 2: ");
        String spiller2 = sc.next().toString();

        System.out.print("\nTryk enter for at slå om hvem det starter!");

        //Venter på tasteinput fra brugeren inden der bliver slået om hvem der starter spillet.
        try {
            System.in.read();
        } catch (Exception e) {
        }


        //Der bliver slået om hvilken spiller der starter vha. førsteKast i HvemStarter klassen
        HvemStarter startKast = new HvemStarter();

        //sætter tur til hhv. 2 eller 3 via resultatet fra førsteKast metoden.
        tur = startKast.førsteKast();


        //Et loop der kører indtil en af spillerne rammer 40 point.
        //spiller 1's tur.
        while (true) {
            if (tur % 2 == 0) {
                //opretter to nye terningekast.
                TerningeKast spiller1slag1 = new TerningeKast();
                TerningeKast spiller1slag2 = new TerningeKast();

                //Venter på tasteinput fra brugeren inden der bliver slået om hvem der starter spillet.
                try {
                    System.in.read();
                } catch (Exception e) {
                }

                //gemmer terningekastene i hhv. slag1 og slag2.
                int slag1 = spiller1slag1.getØjne();
                int slag2 = spiller1slag2.getØjne();

                //ligger de to slag sammen, og ligger dem så til spiller1's point
                int sum1 = slag1 + slag2;
                spiller1point = sum1 + spiller1point;

                //Hvis der bliver slået to 1'ere bliver spiller2's point sat til 0.
                if (slag1 == 1 && slag2 == 1) {
                    spiller1point = 0;
                }

                //Udskriver spiller1's slag og spiller1's samlede point
                System.out.println(spiller1 + " slår " + slag1 + " og " + slag2);
                System.out.println(spiller1 + " har nu: " + spiller1point + " point!\n");

                //hvis de 2 slag er ens bliver tur ikke sat en op og spiller1 får en ekstra tur
                if (slag1 == slag2) {
                    System.out.print("Ekstratur!");
                } else
                    tur++;

                //hvis spiller1 rammer 40 point eller derover bliver løkken afbrudt
                if (spiller1point >= 40) {
                    break;
                }
            }


            //spiller 2's tur
            if (tur % 2 != 0) {

                //opretter terninger til spiller 2
                TerningeKast spiller2slag1 = new TerningeKast();
                TerningeKast spiller2slag2 = new TerningeKast();

                //Venter på tasteinput fra brugeren inden der bliver slået om hvem der starter spillet.
                try {
                    System.in.read();
                } catch (Exception e) {
                }

                //gemmer terningekastene i hhv. slag1 og slag2.
                int slag1 = spiller2slag1.getØjne();
                int slag2 = spiller2slag2.getØjne();

                //ligger de to slag sammen, og ligger dem så til spiller2's point
                int sum2 = slag1 + slag2;
                spiller2point = sum2 + spiller2point;

                //Hvis der bliver slået to 1'ere bliver spiller2's point sat til 0.
                if (slag1 == 1 && slag2 == 1) {
                    spiller2point = 0;
                }

                //Udskriver spiller1's slag og spiller1's samlede point
                System.out.println(spiller2 + " slår " + slag1 + " og " + slag2);
                System.out.println(spiller2 + " har nu: " + spiller2point + " point!\n");

                //hvis de 2 slag er ens bliver tur ikke sat en op og spiller2 får en ekstra tur
                if (slag1 == slag2) {
                    System.out.print("Ekstratur!");
                } else
                    tur++;

                //hvis spiller2 rammer 40 point eller derover bliver løkken afbrudt
                if (spiller2point >= 40) {
                    break;
                }
            }
        }

        //udskriver vinderen og hvor mange point personen har og taberens point
        if (spiller1point > spiller2point) {
            System.out.println("\n\n\n\n" + spiller1 + " vinder med " + spiller1point + " point mod " + spiller2 + "'s " + spiller2point + " point");
        } else {
            System.out.println("\n\n\n\n" + spiller2 + " vinder med " + spiller2point + " point mod " + spiller1 + "'s " + spiller1point + " point");
        }
    }
}
