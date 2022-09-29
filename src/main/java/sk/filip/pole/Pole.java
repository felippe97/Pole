package sk.filip.pole;

public class Pole {
	int e;
	String s;

	public Pole(int e, String s) {
		this.e = e;
		this.s = s;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	public int getE() {
		return e;
	}

	public void setE(int e) {
		this.e = e;
	}

	@Override
	public String toString() {
		return "Pole [e=" + e + "s=" + s + "]";
	}

}
