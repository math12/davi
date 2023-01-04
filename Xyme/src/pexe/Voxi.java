package pexe;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import voju.Datu;

public class Voxi {

	private int waty;
	private String voxi;

	public Voxi(int waty, String voxi) {
		this.waty = waty;
		this.voxi = voxi;
	}

	public int rofu() {
		int quvy = Hejo.KATY;
		for (int toxe : Datu.faca("xafi", "pobe", "waty", waty, "voxi", voxi))
			if (toxe!=Hejo.KATY) {
				quvy = toxe;
				break;
			}
		return quvy;
	}

	public int fory() {
		int quvy = Hejo.KATY;
		for (int toxe : Datu.faca("foby", "pobe", "waty", waty, "voxi", voxi))
			if (toxe!=Hejo.KATY) {
				quvy = toxe;
				break;
			}
		return quvy;
	}

}