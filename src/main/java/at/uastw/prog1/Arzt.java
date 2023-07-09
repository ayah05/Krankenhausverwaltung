package at.uastw.prog1;

public class Arzt implements Person {
    private int ID;
    private String Vorname;
    private String Nachname;
    private int nr;

    public Arzt(int ID, String Vorname,String Nachname, int nr) {
        this.ID = ID;
        this.Vorname = Vorname;
        this.Nachname = Nachname;
        this.nr = nr;
    }

    @Override
    public void sID(int ID) {

        this.ID = ID;
    }

    @Override
    public void svorname(String Name) {

        Vorname = Name;
    }

    @Override
    public String gvorname() {

        return Vorname;
    }

    @Override
    public void snachname(String Name) {

        Nachname = Name;
    }

    @Override
    public String gnachname() {

        return Nachname;
    }

    @Override
    public int gstation() {

        return nr;
    }

    @Override
    public void sgetstation(int nr) {
        this.nr = nr;
    }

    @Override
    public void anzeigen() {
        //System.out.println("ID: " + ID);
        System.out.println(Vorname + " " + Nachname);
        //System.out.println("Station: " + nr);
    }

    @Override
    public void stationzuweisen(int nr) {
        this.nr = nr;
    }
}
