package at.uastw.prog1;

interface Person {

    public void sID(int ID);
    public void svorname(String Name);
    public String gvorname();

    public void snachname(String Name);
    public String gnachname();

    public int gstation();
    public void sgetstation(int nr);

    public void anzeigen();
    public void stationzuweisen(int nr);
}