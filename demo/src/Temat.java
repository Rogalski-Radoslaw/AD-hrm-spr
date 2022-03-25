public class Temat {
    private Integer idx = 0;
    private Integer godzin = 0;
    private String tekst;
    private String opis;

    Temat(Integer index, Integer godzin, String tekst) {
        this.idx = index;
        this.godzin = godzin;
        this.tekst = tekst;
    }

    public Integer getIdx() {
        return idx;
    }

    public Integer getGodzin() {
        return godzin;
    }

    public void setGodzin(Integer godzin) {
        this.godzin = godzin;
    }

    public String getTekst() {
        return tekst;
    }

    public void setTekst(String tekst) {
        this.tekst = tekst;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public String toString() {
        return "{#" + idx + "; G:" + godzin + "; T:" + tekst + "}";
    }
}