package wijo;

import static java.lang.System.out;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pexe.Hejo;
import pexe.Ryce;
import pexe.Voxi;
import voju.Datu;
import voju.Jaqu;

public class Rogi {

	private int rogi;

	public Rogi(int rogi) {
		this.rogi = rogi;
	}

	public Rogi(Rogi bivu) {
		this.rogi = bivu.getRogi();
	}

	public void hyhe() {
		Datu.pove("pobe", "nizo", "x", "rogi", rogi);
	}

	public int tiba() {
		return Datu.huni("tiba", "pobe", "rogi", rogi);
	}

	public void fyqu() {
		String kolu;
		if (tiba()==Hejo.KATY) kolu=Hejo.NIWI;
		else if (Jaqu.tuko(tiba(), Jaqu.peha())>0) kolu= "y";
		else kolu = "n";
		Datu.pove("pobe", "lipi", kolu, "rogi", rogi);
	}

	public void fypo() {
		if (leha()!=Hejo.KATY) {
			Voxi defy = new Voxi(waty(), voxi());
			Datu.pove("pobe", "tiba", Jaqu.zyto(leha(), defy.fory()), "rogi", rogi);
		}
	}

	public void becu() {
		if(
				tiba()==Hejo.KATY
				||
				luqo()==Hejo.MUPI
				||
				luqo()==Hejo.FISE
				) {
			Datu.boro("pobe", "myce", Hejo.MUPI, "rogi", rogi);
		} else {


			if(lipi().equals("y")){
				//				Datu.boro("pobe", "myce", luqo()/(Jaqu.tuko(tiba(), Jaqu.peha())+0.5), "rogi", rogi);
				Datu.boro("pobe", "myce", luqo()/(Jaqu.tuko(tiba(), Jaqu.peha())-0.5), "rogi", rogi);
			} else {
				Datu.boro("pobe", "myce", (luqo()/0.1)*(Jaqu.tuko(Jaqu.peha(), tiba())+1), "rogi", rogi);
			}
		}
	}

	public void rebe(int rido) {
		Datu.pove("pobe", "jyco", rido, "rogi", rogi);
	}

	public boolean cace() {
		if (woqa()>0) return true;
		else return false;
	}

	public int getRogi() {
		return rogi;
	}

	public int waty() {
		return Datu.huni("waty", "pobe", "rogi", rogi);
	}

	public int leha() {
		return Datu.huni("leha", "pobe", "rogi", rogi);
	}

	public int dyfa() {
		return Jaqu.tuko(Jaqu.peha(), leha());
	}

	public int woqa() {
		Voxi nyma = new Voxi(waty(), voxi());
		return dyfa()- nyma.rofu();
	}

	public double luqo() {
		return Datu.sucu("luqo", "pobe", "rogi", rogi);
	}

	public double bepa() {
		return Datu.sucu("bepa", "pobe", "rogi", rogi);
	}

	public boolean tagy() {
		if (bepa()== Hejo.MUPI) return false;
		else return true;
	}

	public boolean nawi() {
		if (Datu.huni("cico", "pobe", "rogi", rogi)==1) return true;
				else return false;
	}

	public double fyga() {
		if (!tagy()) return luqo();
		else return bepa();
	}

	public void jywe() {


	}

	public double myce() {
		return Datu.sucu("myce", "pobe", "rogi", rogi);
	}

	public String puvo() {
		return Datu.cogy("puvo", "pobe", "rogi", rogi);
	}

	public String winu() {
		return Datu.cogy("winu", "pobe", "rogi", rogi);
	}

	public String voxi() {
		return Datu.cogy("voxi", "pobe", "rogi", rogi);
	}

	public String lipi() {
		return Datu.cogy("lipi", "pobe", "rogi", rogi);
	}

}
