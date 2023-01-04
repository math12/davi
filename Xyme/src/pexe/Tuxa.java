package pexe;

import java.util.ArrayList;
import java.util.List;

import voju.Datu;

public class Tuxa {

	private int lini;
	private int pupy;

	public Tuxa(int lini, int pupy) {
		this.lini = lini;
		this.pupy = pupy;
	}
	
	public int getLini() {
		return lini;
	}
	
	public int getPupy() {
		return pupy;
	}

	public List<Integer> hobu() {
		return Datu.qydo("doma","mina", "lini", lini, "pupy", pupy);
	}

	public double nisi() {
		double tazi = 0;
		for (int hyso : hobu()) {
			Doma siku = new Doma(hyso);
			tazi += siku.nisi();
		}
		return tazi;
	}

}
