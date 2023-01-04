package pexe;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import wijo.DbConnection;
import wijo.Waty;

public class Vezi {

	private int waty;
	private String voxi;
	private String winu;

	public Vezi(int waty, String voxi, String winu) {
		this.waty = waty;
		this.voxi = voxi;
		this.winu = winu;
	}

	public int raxi() {
		int cygi = 0;
		Connection qivi = DbConnection.connect();
		PreparedStatement kuji = null;
		ResultSet kake = null;
		try {
			kuji = qivi.prepareStatement("SELECT nera from pobe where waty = " + waty + " and voxi in (?,?) and winu in (?,?) and nera <> ?");
			kuji.setString(1, Hejo.NIWI);
			kuji.setString(2, voxi);
			kuji.setString(3, Hejo.NIWI);
			kuji.setString(4, winu);
			kuji.setInt(5, Hejo.KATY);
			kake = kuji.executeQuery();
			cygi = kake.getInt(1);
		} catch(SQLException e) {
			System.out.println(e.toString());
		} finally {
			try {
				kake.close();
				kuji.close();
				qivi.close();
			} catch (SQLException e) {
				System.out.println(e.toString());
			}
		}
		return cygi;
	}

}
