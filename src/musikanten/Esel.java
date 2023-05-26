package musikanten;

public class Esel extends Musikant {
    protected double trittkraft;

    public double getTrittkraft() {
        return trittkraft;
    }

    public Esel(int anzahlBeine, Instrument instrument, double trittkraft) {
        super(anzahlBeine, instrument);
        this.trittkraft = trittkraft;
    }

    @Override
    public int verscheucheRaeuber() {
        return (int) (trittkraft*anzahlBeine);
    }

    @Override
    public double spieleMusik() {
        return instrument.getLautstaerke();
    }
}
