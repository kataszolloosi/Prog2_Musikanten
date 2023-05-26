package musikanten;

public class Katze extends Musikant {
	protected double kratzKraft;

	public double getKratzKraft() {
		return kratzKraft;
	}

	public Katze(int aB, Instrument i , double kratzKraft) {
		super(aB,i);
		this.kratzKraft = kratzKraft;
	}

	@Override
	public int verscheucheRaeuber() {
		if (anzahlBeine <2){
			return 1;
		} else if (anzahlBeine == 3) {
			return (int) (kratzKraft/2);
		} else {
			return (int) kratzKraft;
		}
	}

	@Override
	public double spieleMusik() {
		return instrument.getLautstaerke();
	}
}
