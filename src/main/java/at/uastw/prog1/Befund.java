package at.uastw.prog1;

public class Befund {
    private String Befund;
    private int Patientnr;

        public Befund(String Befund, int Patientnr){
            this.Befund = Befund;
            this.Patientnr = Patientnr;
        }

    public String getBefund() {
        return Befund;
    }

    public void setBefund(String Befund) {
        this.Befund = Befund;
    }

    public int getPatientnr() {
        return Patientnr;
    }

    public void setPatientnr(int Patientnr) {
        this.Patientnr = Patientnr;
    }
}
