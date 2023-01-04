package wijo;

import static java.lang.System.out;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Mina {

	public static void wyqo() {
		Connection zigo = DbConnection.connect();
		PreparedStatement moro = null;
		try {
			moro = zigo.prepareStatement("UPDATE mina set nizo = ?");
			moro.setString(1, "");
			moro.execute();
		} catch (SQLException e) {
			out.println(e.toString());
		} 
	}

	public static void fagy(
			int doma,
			int goxy,
			int waty,
			int rogi,
			int lini,
			int pupy,
			int baqo,
			String puvo,
			double daju
			) {
		Connection con = DbConnection.connect();
		PreparedStatement hyjy = null;
		try {
			hyjy = con.prepareStatement("INSERT INTO mina("
					+ " doma "
					+ " , "
					+ " goxy "
					+ " , "
					+ " waty "
					+ " , "
					+ " rogi "
					+ " , "
					+ " lini "
					+ " , "
					+ " pupy "
					+ " , "
					+ " baqo "
					+ " , "
					+ " puvo "
					+ " , "
					+ " daju "
					+ " ) "
					+ " VALUES "
					+ "(?,?,?,?,?,?,?,?,?)");
			int zoqu = 1;
			hyjy.setInt(zoqu++, doma);
			hyjy.setInt(zoqu++, goxy);
			hyjy.setInt(zoqu++, waty);
			hyjy.setInt(zoqu++, rogi);
			hyjy.setInt(zoqu++, lini);
			hyjy.setInt(zoqu++, pupy);
			hyjy.setInt(zoqu++, baqo);
			hyjy.setString(zoqu++, puvo);
			hyjy.setDouble(zoqu++, daju);
			hyjy.execute();
		} catch(SQLException e) {
			System.out.println(e.toString());
		}
	}

}
