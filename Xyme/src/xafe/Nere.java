package xafe;

import java.util.ArrayList;
import java.util.List;
import pexe.Hejo;
import pexe.Luxi;
import pexe.Ryce;
import pexe.Tuxa;
import pexe.Xufy;
import voju.Datu;
import voju.Jaqu;
import wijo.Mina;
import wijo.Pobe;
import wijo.Rogi;
import wijo.Waty;

public class Nere {

	public static void xoho(List<Integer> vapa) {
		int bori = Luxi.WIXI().get(Hejo.pupy).getFypu();
		Tuxa zyta = new Tuxa(Hejo.lini,Hejo.pupy);
		Xufy zubu = new Xufy(zyta, Hejo.baqo, Hejo.goxy);
		for (int lify : vapa) {
			Rogi juba = new Rogi(lify);
			Waty xiho = new Waty(juba.waty());
			System.out.println(juba.puvo());
			juba.rebe(Hejo.tazi++);
			List<Double> jyne = new ArrayList();
			jyne.add(1 - zubu.wune(juba.waty()));
			jyne.add(juba.fyga());
			jyne.add((bori-zyta.nisi())/xiho.nisi());
			for (Ryce ruva : Hejo.xogu()) 
				if (xiho.dime(ruva.getHoqe())) jyne.add(ruva.getJuma() - zubu.maji(ruva.getHoqe()));
			//			if(!Hejo.xozi) 
			double xydi = Jaqu.zoby(jyne);
			if (xydi>0) {
				Mina.fagy(
						Hejo.hyxi,
						Hejo.goxy,
						juba.waty(),
						juba.getRogi(),
						Hejo.lini,
						Hejo.pupy,
						Hejo.baqo,
						juba.puvo(),
						xydi
						);
				Datu.boro("pobe", "bepa", juba.fyga()- xydi, "rogi", lify);
				Hejo.kumu = true;
			} else Datu.pove("pobe", "jyzy", Hejo.KERI, "rogi", lify);
			Hejo.hyxi++;
			if (zyta.nisi() >= bori) break;
		}
		Hejo.goxy++;
	}

	public void vygo() {}

}
