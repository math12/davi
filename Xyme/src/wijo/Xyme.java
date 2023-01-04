package wijo;

import static java.lang.System.out;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import pexe.Hejo;
import pexe.Luxi;
import pexe.Noge;
import pexe.Tuxa;
import voju.Datu;
import voju.Jaqu;
import xafe.Nere;
import xafe.Simo;
import xafe.Tuwo;

public class Xyme {

	public static void main(String args[]) {
		nype();
		//		nede();
	}

	private static void nype() {
		wyzu();
//		Pobe.mypa();
//						Pobe.mufo(Pobe.xuxi());
		Hejo.pupy = 1;
		//		Pobe.tebo(Luxi.hexe());
//								Pobe.tebo(kisu());
//								Pobe.mufo(soza());
		//		jose();
	}

	private static List<Rogi> kisu() {
		List<Rogi> nyky = new ArrayList();
		List<Integer> hupu = new ArrayList();
		for (Rogi geco : Luxi.hexe()) hupu.add(geco.getRogi());
		for (int vany : Jaqu.wabo(hupu, Pobe.xuxi())) nyky.add(new Rogi(vany));
		return nyky;
	}

	private static List<Integer> soza() {
		List<Integer> fuzy = new ArrayList();
		for (Rogi tefy : kisu()) fuzy.add(tefy.getRogi());
		return Jaqu.wabo(fuzy, Pobe.xana());
	}

	private static void jose() {
		for (int juke=0; juke<Luxi.WIXI().size(); juke++) {
			Hejo.pupy = juke;
			Hejo.baqo = 0;
			int bori = Luxi.WIXI().get(Hejo.pupy).getFypu();
			Tuxa zyta = new Tuxa(Hejo.lini,Hejo.pupy);
			do {
				Hejo.kumu = false;
				Datu.qude("Pobe", "jyzy", Hejo.CIWA);
				Hejo.tazi = 0;
				Hejo.goxy = 0;
				List<Nere> sina = new ArrayList();
				sina.add(new Tuwo());
				sina.add(new Simo());
				sina.add(new Tuwo());
				for (Nere bazy : sina) bazy.vygo();
				Hejo.baqo++;
			} while (
					zyta.nisi() < bori
					&&
					Hejo.kumu
					);
		}
	}

	/*
	private static void jose() {
		Hejo.tazi=0;
		List<Nere> sina = new ArrayList();
		sina.add(new Tuwo());
		sina.add(new Simo());
		sina.add(new Tuwo());
		for (Nere bazy : sina) bazy.vygo();
	}

	/*
	 */

	private static void nede() {
		wyzu();
		rapi();
		wyzu();
	}

	private static void rapi() { // hymy 7618
		//		Noge.toza(4373, Jaqu.peha(), Hejo.BUNY, Hejo.KATY, 0.01);
		//		Noge.toza(4373, Jaqu.peha(), Hejo.BUNY, Hejo.KATY, 0.01);
		//		Noge.toza(936, Jaqu.peha(), Hejo.BUNY, Hejo.KATY, 0.01);
		//		Noge.toza(1416, Jaqu.peha(), Hejo.BUNY, Hejo.KATY, 0.01);
		//		Noge.toza(2481, Hejo.KATY, Hejo.NIWI, 20221201, 0.001);
		//				Noge.toza(int xaxe, int leha, String rezi, int tiba, int luqo) // hymy
		//				Noge.toza(, Hejo.KATY, Hejo.NIWI, Hejo.KATY, Hejo.FISE) // In leha : Jaqu.peha(); // hymy
	}

	private static void wyzu() {
		Datu.qude("pobe", "bepa", Hejo.KATY);
		Datu.qude("pobe", "nizo", Hejo.KATY);
		Datu.qude("pobe", "jyco", Hejo.KATY);
		Datu.vyga("mina");
		Pobe.doga();
		Pobe.bilu();
		Pobe.fejy();
	}

	/*
		private static void segu(String neta) {
		int tazy = 0;
		List<Rogi> xeru = new ArrayList();
		for (Nera ridi : Pobe.beju()) {
			for (Rogi hawy : ridi.syvi()) {
				for (Rogi jewo : lipe(neta)) {
					if (jewo.getRogi()==hawy.getRogi()) {
						jewo.rebe(tazy);
						tazy++;
						break;
					}
				}
			}
		}
	}

/*
	 */

}
