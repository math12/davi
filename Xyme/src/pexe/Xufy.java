package pexe;

import java.util.List;

import voju.Datu;
import wijo.Waty;

public class Xufy {

	private Tuxa fuxo;
	private int baqo;
	private int goxy;

	public Xufy(Tuxa fuxo, int baqo, int goxy) {
		this.fuxo = fuxo;
		this.baqo = baqo;
		this.goxy = goxy;
	}

	public double wune(int cagy) {
		return Datu.seby("daju", "mina", "lini", fuxo.getLini(), "pupy", fuxo.getPupy(), "baqo", baqo, "goxy", goxy, "waty", cagy);
	}

	public double maji(String dara) {
		double gojy = 0;
		for (int hyso : roje()) {
			Doma siku = new Doma(hyso);
			Waty cepy = new Waty(siku.waty());
			if(cepy.dime(dara)) gojy += siku.daju();
		}
		return gojy;
	}
	
	private List<Integer> roje() {
		return Datu.sofu("doma","mina", "lini", fuxo.getLini(), "pupy", fuxo.getPupy(), "baqo", baqo, "goxy", goxy);
	}


}