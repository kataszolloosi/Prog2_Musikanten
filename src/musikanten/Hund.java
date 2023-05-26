package musikanten;

public class Hund extends Musikant {
	protected double bellLautstaerke;

	public double getBellLautstaerke() {
		return bellLautstaerke;
	}

	public Hund(int anzahlBeine, Instrument instrument , double bellLautstaerke) {
		super(anzahlBeine, instrument);
		this.bellLautstaerke = bellLautstaerke;
	}

	@Override
	public int verscheucheRaeuber() {
		if (bellLautstaerke > instrument.getLautstaerke()) {
			return (int) bellLautstaerke;
		} else {
			return (int) instrument.getLautstaerke();
		}
	}

	@Override
	public double spieleMusik() {
		return bellLautstaerke+instrument.getLautstaerke()/2;
	}
}
