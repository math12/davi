package pexe;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.ServiceUnavailableException;

import voju.Datu;
import wijo.DbConnection;
import wijo.Pobe;
import wijo.Rogi;
import xafe.Waga;

public class Luxi {

		/*
	// hymy
	public static final List<Waga> WIXI() {
		List<Waga> sune = new ArrayList();
		sune.add(new Waga("fyju", 184));
		sune.add(new Waga("dofi", 216));
		sune.add(new Waga("nigi", 93));
		sune.add(new Waga("dofi", 233));
		return sune;
	}
	/*
	 */

	//	/*
	// hymy
	public static final List<Waga> WIXI() {
		List<Waga> sune = new ArrayList();
		sune.add(new Waga("fyju", 0));
		sune.add(new Waga("dofi", 0));
		sune.add(new Waga("nigi", 0));
		sune.add(new Waga("dofi", 0));
		return sune;
	}
	/*
	 */

	public static List<Rogi> hexe() {
		return Pobe.zoge(Datu.zuhy("rogi", "pobe", WIXI().get(Hejo.pupy).getBevi(), "y"));
	}

	public static List<Integer> faze(){
		List<Integer> geko = new ArrayList();
		for (Rogi suja : hexe()) geko.add(suja.getRogi());
		return geko;
	}

}