package voju;

import static java.lang.System.out;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import pexe.Hejo;
import wijo.DbConnection;

public class Datu {

	public static void vyga(String pupa) {
		Connection con = DbConnection.connect();
		PreparedStatement ps = null;
		try {
			String sql = "delete from " + pupa;
			ps = con.prepareStatement(sql);
			ps.execute();
		} catch (Exception e) {			
			System.out.println(e.toString());
		} finally {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void qude(
			String tyde,
			String reke, 
			int siqo
			) {
		Connection zigo = DbConnection.connect();
		PreparedStatement moro = null;
		try {
			moro = zigo.prepareStatement("UPDATE " + tyde + " set " + reke + " = ?");
			moro.setInt(1, siqo);
			moro.execute();
		} catch (SQLException e) {
			out.println(e.toString());
		} 
	}

	public static void pove(
			String geqo,
			String bota,
			int qala,
			String kyba,
			int tyfi
			) {
		Connection jybe = DbConnection.connect();
		PreparedStatement vafe = null;
		try {
			vafe = jybe.prepareStatement(
					"UPDATE "
							+ geqo
							+ " set "
							+ bota
							+ " = "
							+ qala
							+ " where "
							+ kyba
							+ " = " 
							+ tyfi
					);
			vafe.execute();
		} catch (SQLException e) {
			out.println(e.toString());
		} 
	}


	public static void boro(
			String geqo,
			String bota,
			double qala,
			String kyba,
			int tyfi
			) {
		Connection jybe = DbConnection.connect();
		PreparedStatement vafe = null;
		try {
			vafe = jybe.prepareStatement(
					"UPDATE "
							+ geqo
							+ " set "
							+ bota
							+ " = "
							+ qala
							+ " where "
							+ kyba
							+ " = " 
							+ tyfi
					);
			vafe.execute();
		} catch (SQLException e) {
			out.println(e.toString());
		} 
	}


	public static void pove(
			String geqo,
			String bota,
			String qala,
			String kyba,
			int tyfi
			) {
		Connection jybe = DbConnection.connect();
		PreparedStatement vafe = null;
		try {
			vafe = jybe.prepareStatement(
					"UPDATE "
							+ geqo
							+ " set "
							+ bota
							+ " = ? "
							+ "where "
							+ kyba
							+ " = " 
							+ tyfi
					);
			vafe.setString(1, qala);
			vafe.execute();
		} catch (SQLException e) {
			out.println(e.toString());
		} 
	}

	public static boolean fiti(
			String dixa, 
			String laqo, 
			int jede, 
			String becy, 
			String doqe
			) {
		boolean zosi = false;
		Connection con = DbConnection.connect();
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			String sql = "select count (*) from " 
					+ dixa 
					+ " where " 
					+ laqo 
					+ " = " 
					+ jede 
					+ " and " 
					+ becy 
					+ " = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, doqe);
			rs = ps.executeQuery();
			if (rs.getInt(1)>0) zosi = true;
		} catch(SQLException e) {
			System.out.println(e.toString());
		} finally {
			try {
				rs.close();
				ps.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return zosi;
	}

	public static int huni(
			String huva,
			String simy,
			String licy,
			int wuji
			) {
		int cygi = 0;
		Connection qivi = DbConnection.connect();
		PreparedStatement kuji = null;
		ResultSet kake = null;
		try {
			kuji = qivi.prepareStatement("SELECT " + huva + " FROM "+ simy + " where " + licy + " = ?");
			kuji.setInt(1, wuji);
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


	public static int zibe(
			String huva,
			String simy,
			String licy,
			int wuji,
			int pypu
			) {
		int cygi = 0;
		Connection qivi = DbConnection.connect();
		PreparedStatement kuji = null;
		ResultSet kake = null;
		try {
			kuji = qivi.prepareStatement("SELECT " 
					+ huva 
					+ " FROM "
					+ simy 
					+ " where " 
					+ licy 
					+ " = "
					+ wuji
					+ " and "
					+ huva
					+ " <> "
					+ pypu);
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




	public static double sucu(
			String huva,
			String simy,
			String licy,
			int wuji
			) {
		double cygi = 0;
		Connection qivi = DbConnection.connect();
		PreparedStatement kuji = null;
		ResultSet kake = null;
		try {
			kuji = qivi.prepareStatement("SELECT " + huva + " FROM "+ simy + " where " + licy + " = ?");
			kuji.setInt(1, wuji);
			kake = kuji.executeQuery();
			cygi = kake.getDouble(1);
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


	public static double seby(
			String huva,
			String simy,
			String licy,
			int wuji,
			String cudu,
			int defo,
			String wevu,
			int moqi,
			String guva,
			int kaza,
			String gobo,
			int homu
			) {
		double povi = 0;
		Connection qivi = DbConnection.connect();
		PreparedStatement kuji = null;
		ResultSet kake = null;
		try {
			kuji = qivi.prepareStatement("SELECT SUM(" 
					+ huva 
					+ ") "
					+ " FROM "
					+ simy 
					+ " where " 
					+ licy 
					+ " = "
					+ wuji
					+ " and "
					+ cudu 
					+ " = "
					+ defo
					+ " and "
					+ wevu 
					+ " = "
					+ moqi
					+ " and "
					+ guva 
					+ " = "
					+ kaza
					+ " and "
					+ gobo 
					+ " = "
					+ homu
					);
			kake = kuji.executeQuery();
			povi = kake.getDouble(1);
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
		return povi;
	}



	public static String cogy(
			String huva,
			String simy,
			String licy,
			int wuji
			) {
		String cygi = "";
		Connection qivi = DbConnection.connect();
		PreparedStatement kuji = null;
		ResultSet kake = null;
		try {
			kuji = qivi.prepareStatement("SELECT " + huva + " FROM "+ simy + " where " + licy + " = ?");
			kuji.setInt(1, wuji);
			kake = kuji.executeQuery();
			cygi = kake.getString(1);
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

	public static List<Integer> ryle(
			String qute,
			String lyco
			){
		List<Integer> zuny = new ArrayList();
		Connection cece = DbConnection.connect();
		PreparedStatement live = null;
		ResultSet fyqi = null;
		try {
			live = cece.prepareStatement("SELECT "
					+ qute
					+ " FROM "
					+ lyco
					);
			fyqi = live.executeQuery();
			while(fyqi.next()) {
				zuny.add(fyqi.getInt(1));
			}
		} catch(SQLException e) {
			System.out.println(e.toString());
		} finally {
			try {
				fyqi.close();
				live.close();
				cece.close();
			} catch (SQLException e) {
				System.out.println(e.toString());
			}
		}
		return zuny;
	}


	public static List<Integer> wygu(
			String qute,
			String lyco,
			int myfu
			){
		List<Integer> zuny = new ArrayList();
		Connection cece = DbConnection.connect();
		PreparedStatement live = null;
		ResultSet fyqi = null;
		try {
			live = cece.prepareStatement("SELECT "
					+ qute
					+ " FROM "
					+ lyco
					+ " where "
					+ qute
					+ " <> "
					+ myfu
					);
			fyqi = live.executeQuery();
			while(fyqi.next()) {
				zuny.add(fyqi.getInt(1));
			}
		} catch(SQLException e) {
			System.out.println(e.toString());
		} finally {
			try {
				fyqi.close();
				live.close();
				cece.close();
			} catch (SQLException e) {
				System.out.println(e.toString());
			}
		}
		return zuny;
	}

	public static List<Integer> tyqy(
			String qute,
			String lyco,
			String quhy,
			double myfu
			){
		List<Integer> zuny = new ArrayList();
		Connection cece = DbConnection.connect();
		PreparedStatement live = null;
		ResultSet fyqi = null;
		try {
			live = cece.prepareStatement("SELECT "
					+ qute
					+ " FROM "
					+ lyco
					+ " where "
					+ quhy
					+ " <> "
					+ myfu
					);
			fyqi = live.executeQuery();
			while(fyqi.next()) {
				zuny.add(fyqi.getInt(1));
			}
		} catch(SQLException e) {
			System.out.println(e.toString());
		} finally {
			try {
				fyqi.close();
				live.close();
				cece.close();
			} catch (SQLException e) {
				System.out.println(e.toString());
			}
		}
		return zuny;
	}

	public static List<Integer> qydo(
			String qute,
			String lyco,
			String zopi,
			int myfu
			){
		List<Integer> zuny = new ArrayList();
		Connection cece = DbConnection.connect();
		PreparedStatement live = null;
		ResultSet fyqi = null;
		try {
			live = cece.prepareStatement("SELECT "
					+ qute
					+ " FROM "
					+ lyco
					+ " where "
					+ zopi
					+ " = "
					+ myfu
					);
			fyqi = live.executeQuery();
			while(fyqi.next()) {
				zuny.add(fyqi.getInt(1));
			}
		} catch(SQLException e) {
			System.out.println(e.toString());
		} finally {
			try {
				fyqi.close();
				live.close();
				cece.close();
			} catch (SQLException e) {
				System.out.println(e.toString());
			}
		}
		return zuny;
	}

	public static List<Integer> vesa(
			String qute,
			String lyco,
			String zopi,
			String myfu
			){
		List<Integer> zuny = new ArrayList();
		Connection cece = DbConnection.connect();
		PreparedStatement live = null;
		ResultSet fyqi = null;
		try {
			live = cece.prepareStatement("SELECT "
					+ qute
					+ " FROM "
					+ lyco
					+ " where "
					+ zopi
					+ " <> ? "
					);
			live.setString(1, myfu);
			fyqi = live.executeQuery();
			while(fyqi.next()) {
				zuny.add(fyqi.getInt(1));
			}
		} catch(SQLException e) {
			System.out.println(e.toString());
		} finally {
			try {
				fyqi.close();
				live.close();
				cece.close();
			} catch (SQLException e) {
				System.out.println(e.toString());
			}
		}
		return zuny;
	}

	public static List<Integer> qydo(
			String qute,
			String lyco,
			String zopi,
			int myfu,
			String mequ,
			int zyke
			){
		List<Integer> zuny = new ArrayList();
		Connection cece = DbConnection.connect();
		PreparedStatement live = null;
		ResultSet fyqi = null;
		try {
			live = cece.prepareStatement("SELECT "
					+ qute
					+ " FROM "
					+ lyco
					+ " where "
					+ zopi
					+ " = "
					+ myfu
					+ " and "
					+ mequ
					+ " = "
					+ zyke
					);
			fyqi = live.executeQuery();
			while(fyqi.next()) {
				zuny.add(fyqi.getInt(1));
			}
		} catch(SQLException e) {
			System.out.println(e.toString());
		} finally {
			try {
				fyqi.close();
				live.close();
				cece.close();
			} catch (SQLException e) {
				System.out.println(e.toString());
			}
		}
		return zuny;
	}

	public static List<Integer> sofu(
			String qute,
			String lyco,
			String zopi,
			int myfu,
			String xave,
			int giqo,
			String mequ,
			int zyke,
			String mofi,
			int qata
			){
		List<Integer> zuny = new ArrayList();
		Connection cece = DbConnection.connect();
		PreparedStatement live = null;
		ResultSet fyqi = null;
		try {
			live = cece.prepareStatement("SELECT "
					+ qute
					+ " FROM "
					+ lyco
					+ " where "
					+ zopi
					+ " = "
					+ myfu
					+ " and "
					+ xave
					+ " = "
					+ giqo
					+ " and "
					+ mequ
					+ " = "
					+ zyke
					+ " and "
					+ mofi
					+ " = "
					+ qata
					);
			fyqi = live.executeQuery();
			while(fyqi.next()) {
				zuny.add(fyqi.getInt(1));
			}
		} catch(SQLException e) {
			System.out.println(e.toString());
		} finally {
			try {
				fyqi.close();
				live.close();
				cece.close();
			} catch (SQLException e) {
				System.out.println(e.toString());
			}
		}
		return zuny;
	}

	public static List<Integer> faca(
			String qute,
			String lyco,
			String zopi,
			int myfu,
			String xave,
			String giqo
			){
		List<Integer> zuny = new ArrayList();
		Connection cece = DbConnection.connect();
		PreparedStatement live = null;
		ResultSet fyqi = null;
		try {
			live = cece.prepareStatement("SELECT "
					+ qute
					+ " FROM "
					+ lyco
					+ " where "
					+ zopi
					+ " = "
					+ myfu
					+ " and "
					+ xave
					+ " = ? "
					);
			live.setString(1, giqo);
			fyqi = live.executeQuery();
			while(fyqi.next()) {
				zuny.add(fyqi.getInt(1));
			}
		} catch(SQLException e) {
			System.out.println(e.toString());
		} finally {
			try {
				fyqi.close();
				live.close();
				cece.close();
			} catch (SQLException e) {
				System.out.println(e.toString());
			}
		}
		return zuny;
	}

	public static List<Integer> zuhy(
			String rava,
			String leme,
			String vole,
			String tuti
			) {
		Connection cece = DbConnection.connect();
		PreparedStatement live = null;
		ResultSet fyqi = null;
		List<Integer> mile = new ArrayList();
		try {
			live = cece.prepareStatement("SELECT "
					+ rava
					+ " FROM "
					+ leme
					+ " where "
					+ vole
					+ " = ? "
					);
			live.setString(1, tuti);
			fyqi = live.executeQuery();
			while(fyqi.next()) mile.add(fyqi.getInt(1));
		} catch(SQLException e) {
			System.out.println(e.toString());
		} finally {
			try {
				fyqi.close();
				live.close();
				cece.close();
			} catch (SQLException e) {
				System.out.println(e.toString());
			}
		}
		return mile;
	}

	public static List<Integer> tube(
			String rava,
			String leme,
			String vole,
			int here,
			String tuti,
			String deji,
			String waso,
			double dune
			) {
		Connection cece = DbConnection.connect();
		PreparedStatement live = null;
		ResultSet fyqi = null;
		List<Integer> mile = new ArrayList();
		try {
			live = cece.prepareStatement("SELECT "
					+ rava
					+ " FROM "
					+ leme
					+ " where "
					+ vole
					+ " = "
					+ here
					+ " and "
					+ tuti
					+ " = ? "
					+ " and "
					+ waso
					+ " <> "
					+ dune
					);
			live.setString(1, deji);
			fyqi = live.executeQuery();
			while(fyqi.next()) mile.add(fyqi.getInt(1));
		} catch(SQLException e) {
			System.out.println(e.toString());
		} finally {
			try {
				fyqi.close();
				live.close();
				cece.close();
			} catch (SQLException e) {
				System.out.println(e.toString());
			}
		}
		return mile;
	}


}
