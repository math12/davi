package pexe;

import voju.Datu;
import wijo.Waty;

public class Doma {

	private int sehy;

	public Doma(int sehy) {
		this.sehy = sehy;
	}

	public double daju() {
		return 	Datu.sucu("daju", "mina", "doma", sehy); 
	}

	public int waty() {
		return 	Datu.huni("waty", "mina","doma", sehy);
	}

	public double nisi() {
		Waty kybu = new Waty(waty());
		return daju()*kybu.nisi();
	}

}
