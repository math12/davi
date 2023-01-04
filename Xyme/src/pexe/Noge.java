package pexe;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;

import voju.Jaqu;
import wijo.DbConnection;
import wijo.Rogi;
import wijo.Waty;

public class Noge {

	public static void toza(
			int xaxe
			,
			int leha
			,
			String rezi
			,
			int tiba
			,
			double luqo
			) {
		Rogi peny = new Rogi(xaxe);
		Waty kydy = new Waty (peny.waty());
		Voxi somy = new Voxi(peny.waty(), peny.voxi());
		Random maka = new Random();
		int reju = maka.nextInt(9998)+1;
		Connection con = DbConnection.connect();
		PreparedStatement hyjy = null;
		try {
			hyjy = con.prepareStatement("INSERT INTO pobe("
					+ " waty "
					+ " , "
					+ " leha "
					+ " , "
					+ " rezi "
					+ " , "
					+ " tiba "
					+ " , "
					+ " puvo "
					+ " , "
					+ " winu "
					+ " , "
					+ " voxi "
					+ " , "
					+ " luqo "
					+ " , "
					+ " rogi "
					+ " , "
					+ " dypo "
					+ " , "
					+ " caso "
					+ " ) "
					+ " VALUES "
					+ "(?,?,?,?,?,?,?,?,?,?,?)");
			int zoqu = 1;
			hyjy.setInt(zoqu++, peny.waty());
			hyjy.setInt(zoqu++, leha);
			hyjy.setString(zoqu++, rezi);
			if (leha!=Hejo.KATY) hyjy.setInt(zoqu++, Jaqu.zyto(leha, somy.fory()));
			else hyjy.setInt(zoqu++, tiba);
			hyjy.setString(zoqu++, kydy.puvo());
			hyjy.setString(zoqu++, peny.winu());
			hyjy.setString(zoqu++, peny.voxi());
			hyjy.setDouble(zoqu++, luqo);
			hyjy.setInt(zoqu++, reju);
			hyjy.setString(zoqu++, Hejo.NOZA);
			hyjy.setInt(zoqu++, Jaqu.peha());
			hyjy.execute();
		} catch(SQLException e) {
			System.out.println(e.toString());
		}
		Rogi bemi = new Rogi(reju);
		bemi.becu();
	}

}
