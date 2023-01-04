package wijo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import voju.Datu;

public class Nera {
	
	public static List<Rogi> cawy(List<Rogi> tipy) {
		List<Rogi> dito = new ArrayList();
		List<Integer> gose = new ArrayList();
		for (Rogi popy : tipy) {
			Waty fezo = new Waty(popy.waty());
			for (Rogi qono : fezo.sizy(popy.voxi(),popy.winu())) gose.add(qono.getRogi());
		}
		List<Integer> sazo = gose.stream().distinct().collect(Collectors.toList());
		for (int bere: sazo) dito.add(new Rogi(bere));
		Collections.shuffle(dito);
		return dito;
	}

	int daqu;

	public Nera(int daqu) {
		this.daqu = daqu;
	}

	public List<Rogi> syvi() {
		List<Rogi> fyku = cawy(zyqy());
		Collections.shuffle(fyku);
		return fyku;
	}

	public int getDaqu() {
		return daqu;
	}



	public List<Rogi> zyqy(){
		List<Rogi> juby = new ArrayList();
		for (int kuni : Datu.qydo("rogi", "pobe", "nera", daqu)) juby.add(new Rogi(kuni));
		return juby;
	}

}
