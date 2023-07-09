package at.uastw.prog1;

import java.util.Scanner;

public class Main {

    static int ArztID = 1000;
    static int Arztcounter = 0;
    static int Befundcounter = 0;
    static Arzt[] aerzte = new Arzt[99];
    static Befund[] befunde = new Befund[500];

    static Station[] Krankenhaus = new Station[]{
            new Station("Interne", 1),
            new Station("HNO", 2),
            new Station("Chirugie", 3),
            new Station("Kinder", 4),
            new Station("Auge", 5),
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String befundtext;
        boolean nochmal = true;
        int stationsnummer;
        String vorname;
        String nachname;
        int patientennummer;
        int ausgaben;


        do {
            System.out.println();
            System.out.println("Welcher Befehl soll getätigt werden?");
            System.out.println("[1] Arzt anlegen");
            System.out.println("[2] Aerzte im Krankenhaus");
            System.out.println("[3] Arzt einer Station zuweisen");
            System.out.println("[4] Personal der Station");
            System.out.println("[5] Befund eines Patienten anfertigen, nachlesen oder bearbeiten");
            System.out.println("[6] Beenden");
            int input = sc.nextInt();
            switch (input) {
                case 1:
                    if (Arztcounter < aerzte.length) {
                        System.out.println("Bitte geben Sie den Vornamen des Arztes ein!");
                        vorname = sc.next();
                        System.out.println("Bitte geben Sie den Nachnamen des Arztes ein!");
                        nachname = sc.next();
                        System.out.println("Bitte geben Sie die zugeordnete Station des Arztes ein!");
                        System.out.println();
                        System.out.println("Verfügbare Stationen:");
                        for (int i = 0; i < Krankenhaus.length; i++) {
                            System.out.println(Krankenhaus[i].getStationsnummer() + " - " + Krankenhaus[i].getName());
                        }
                        stationsnummer = sc.nextInt()-1;
                        aerzte[Arztcounter] = new Arzt(ArztID, vorname, nachname, stationsnummer);
                        System.out.println("Der Arzt Namens " + aerzte[Arztcounter].gvorname() + " " + aerzte[Arztcounter].gnachname() + " der Station [" + Krankenhaus[stationsnummer].getStationsnummer() + "] - " + Krankenhaus[stationsnummer].getName() + " wurde erfolgreich hinzugefügt!");
                        Arztcounter++;
                        ArztID++;
                    } else {
                        System.out.println("Die Funktion ist nicht mehr verfügbar! Informieren Sie den Techniker");
                    }
                    break;
                case 2:
                    ausgaben = 0;
                    if (Arztcounter > 0) {
                        for (int i = 0; i < Arztcounter; i++) {
                            aerzte[i].anzeigen();
                            ausgaben++;
                        }
                        System.out.println("Ergebnisse: " + ausgaben);
                    } else {
                        System.out.println("Derzeit keine Aerzte im Krankenhaus");
                    }
                    break;
                case 3:
                    ausgaben = 0;
                    System.out.println();
                    System.out.println("Verfügbare Aerzte:");
                    for (int i = 0; i < Arztcounter; i++) {
                        System.out.println(aerzte[i].gvorname() + " " + aerzte[i].gnachname());
                        ausgaben++;
                    }
                    if (ausgaben > 0) {
                        System.out.println("Bitte geben Sie den Vornamen des gesuchten Arztes ein!");
                        vorname = sc.next();
                        System.out.println("Bitte geben Sie den Vornamen des gesuchten Arztes ein!");
                        nachname = sc.next();
                        System.out.println("Bitte geben Sie die Stationsnummer ein, dem der Arzt zugewiesen werden sollte!");
                        System.out.println();
                        System.out.println("Verfügbare Stationen:");
                        for (int i = 0; i < Krankenhaus.length; i++) {
                            System.out.println(Krankenhaus[i].getStationsnummer() + " - " + Krankenhaus[i].getName());
                        }
                        stationsnummer = sc.nextInt()-1;
                        ausgaben = 0;
                        for (int i = 0; i < Arztcounter; i++) {
                            if (aerzte[i].gvorname().equals(vorname) && aerzte[i].gnachname().equals(nachname)) {
                                if (aerzte[i].gstation() == stationsnummer) {
                                    System.out.println("Der Arzt " + aerzte[i].gvorname() + " " + aerzte[i].gnachname() + " wurde bereits dieser Stationsnummer zugewiesen!");
                                }else {
                                    aerzte[i].stationzuweisen(stationsnummer);
                                    System.out.println("Der Arzt Namens " + aerzte[i].gvorname() + " " + aerzte[i].gnachname() + " wurde der Station [" + Krankenhaus[stationsnummer].getStationsnummer() + "] - " + Krankenhaus[stationsnummer].getName() + " erfolgreich zugewiesen!");

                                }
                                ausgaben++;
                            }
                        }
                        if (ausgaben <= 0) {
                            System.out.println("Es konnten keine passenden Aerzte gefunden werden");
                        }
                    } else {
                        System.out.println("Derzeit keine Aerzte im Krankenhaus");
                    }
                    break;
                case 4:
                    ausgaben = 0;
                    for (int i = 0; i < Arztcounter; i++) {
                        ausgaben++;
                    }
                    if (ausgaben > 0) {
                        System.out.println("Bitte geben Sie die gewuenschte Stationsnummer ein");
                        System.out.println();
                        System.out.println("Verfügbare Stationen:");
                        for (int i = 0; i < Krankenhaus.length; i++) {
                            System.out.println(Krankenhaus[i].getStationsnummer() + " - " + Krankenhaus[i].getName());
                        }
                        stationsnummer = sc.nextInt()-1;
                        ausgaben = 0;
                        System.out.println("Die Aerzte der Station [" + Krankenhaus[stationsnummer].getStationsnummer() + "] - " + Krankenhaus[stationsnummer].getName() + ": ");
                        for (int i = 0; i < Arztcounter; i++) {
                            if (aerzte[i].gstation() == stationsnummer) {
                                aerzte[i].anzeigen();
                                ausgaben++;
                            }
                        }
                        System.out.println("Ergebnisse: " + ausgaben);
                        if (ausgaben <= 0) {
                            System.out.println("Es konnten keine passenden Aerzte gefunden werden");
                        }
                    }else{
                        System.out.println("Derzeit keine Aerzte im Krankenhaus");
                    }
                    break;
                case 5:
                    ausgaben = 0;
                    System.out.println("Bitte geben Sie die Patientennummer ein!");
                    patientennummer = sc.nextInt();
                    for (int i = 0; i < Befundcounter; i++) {
                        if (befunde[i].getPatientnr() == patientennummer) {
                            System.out.println("Der Befund der Patientennummer [" + patientennummer + "]: ");
                            System.out.println(befunde[i].getBefund());
                            System.out.println();
                            System.out.println("Soll der Befund bearbeitet werden? [true] [false]");
                            boolean ant = sc.nextBoolean();
                            if (ant){
                                System.out.println("Bitte geben Sie den neuen Befund ein!");
                                befundtext = sc.next();
                                befunde[i].setBefund(befundtext);
                                System.out.println("Der Befund der Patientennummer [" + patientennummer + "] wurde erfolgreich bearbeitet!");
                            }
                            ausgaben++;
                        }
                    }
                    if (ausgaben <= 0 && Befundcounter < befunde.length) {
                        System.out.println("Unter dieser Patientennummer konnten keine Befunde gefunden werden.");
                        System.out.println("Wollen Sie einen neuen Befund für die Patientennummer [" + patientennummer + "] anlegen? [true] [false]");
                        boolean wahl = sc.nextBoolean();
                        if (wahl) {
                            System.out.println("Geben Sie bitten den Befund ein");
                            befundtext = sc.next();
                            befunde[Befundcounter] = new Befund(befundtext, patientennummer);
                            Befundcounter++;
                            System.out.println("Der Befund der Patientennummer [" + patientennummer + "] wurde erfolgreich hinzugefügt.");
                        }
                    } else if(Befundcounter >= befunde.length && ausgaben <= 0) {
                        System.out.println("Die Funktion ist nicht mehr verfügbar! Informieren Sie den Techniker");
                    }
                    break;
                case 6:
                    System.out.println("Beende....");
                    nochmal = false;
                    break;
                default:
                    System.out.println("Fehlerhafte Eingabe!");
                    System.out.println("Bitte versuchen Sie es erneut!");
            }
        } while (nochmal);
    }
}
