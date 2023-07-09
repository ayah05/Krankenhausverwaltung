package at.uastw.prog1;

public class Station {
    private String Name;
    private int Stationsnummer;

        public Station(String Name, int Stationsnummer){
            this.Name = Name;
            this.Stationsnummer = Stationsnummer;
}

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getStationsnummer() {
        return Stationsnummer;
    }

    public void setStationsnummer(int stationsnummer) {
        Stationsnummer = stationsnummer;
    }
}
