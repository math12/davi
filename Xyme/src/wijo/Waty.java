package wijo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pexe.Hejo;
import voju.Datu;

public class Waty {

	private int waty;

	public Waty(int waty) {
		this.waty = waty;
	}

	public int nisi() {
		return Datu.zibe("nisi", "pobe", "waty", waty, Hejo.KATY);
	}

	public boolean dime(String kevi) {
		return Datu.fiti("pobe", "waty", waty, kevi, "Y");
	}

	public String puvo() {
		return Datu.cogy("puvo", "pobe", "waty", waty);
	}

	public List<Rogi> sizy(String voxi, String winu) {
		List<Rogi> laku = new ArrayList();
		Connection homi = DbConnection.connect();
		PreparedStatement bowu = null;
		ResultSet mana = null;
		try {
			String come = "SELECT "
					+ "rogi "
					+ "FROM pobe "
					+ "where "
					+ "waty = " + waty
					+ " and "
					+ " luqo <> Hejo.KATY "
					+ " and "
					+ " luqo <> 0 "
					;
			if (!winu.equals(Hejo.NIWI) && !voxi.equals(Hejo.NIWI)) {
				bowu = homi.prepareStatement(come 
						+ " and winu = ? "
						+ " and voxi = ?");
				bowu.setString(1, winu);
				bowu.setString(2, voxi);
			} else if (!winu.equals(Hejo.NIWI) && voxi.equals(Hejo.NIWI)) {
				bowu = homi.prepareStatement(come + " and winu = ? ");
				bowu.setString(1, winu);
			} else if (!voxi.equals(Hejo.NIWI) && winu.equals(Hejo.NIWI)) {
				bowu = homi.prepareStatement(come + " and voxi = ? ");
				bowu.setString(1, voxi);
			} else bowu = homi.prepareStatement(come);
			mana = bowu.executeQuery();
			while(mana.next()) laku.add(new Rogi(mana.getInt(1)));
		} catch(SQLException e) {
			System.out.println(e.toString());
		} finally {
			try {
				mana.close();
				bowu.close();
				homi.close();
			} catch (SQLException e) {
				System.out.println(e.toString());
			}
		}
		return laku;
	}

	public List<Rogi> vawa(String voxi, String winu) {
		List<Rogi> laku = new ArrayList();
		Connection homi = DbConnection.connect();
		PreparedStatement bowu = null;
		ResultSet mana = null;
		try {
			String come = "SELECT "
					+ "rogi "
					+ "FROM pobe "
					+ "where "
					+ "waty = " + waty
					+ " and "
					+ " luqo <> " + Hejo.KATY
					;
			if (!winu.equals(Hejo.NIWI) && !voxi.equals(Hejo.NIWI)) {
				bowu = homi.prepareStatement(come 
						+ " and winu = ? "
						+ " and voxi = ?");
				bowu.setString(1, winu);
				bowu.setString(2, voxi);
			} else if (!winu.equals(Hejo.NIWI) && voxi.equals(Hejo.NIWI)) {
				bowu = homi.prepareStatement(come + " and winu = ? ");
				bowu.setString(1, winu);
			} else if (!voxi.equals(Hejo.NIWI) && winu.equals(Hejo.NIWI)) {
				bowu = homi.prepareStatement(come + " and voxi = ? ");
				bowu.setString(1, voxi);
			} else bowu = homi.prepareStatement(come);
			mana = bowu.executeQuery();
			while(mana.next()) laku.add(new Rogi(mana.getInt(1)));
		} catch(SQLException e) {
			System.out.println(e.toString());
		} finally {
			try {
				mana.close();
				bowu.close();
				homi.close();
			} catch (SQLException e) {
				System.out.println(e.toString());
			}
		}
		return laku;
	}

}
