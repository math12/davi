package voju;

import static java.lang.System.out;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import pexe.Luxi;
import wijo.Pobe;
import wijo.Rogi;

public class Jaqu {

	public static double zoby(List<Double> zyqa) {
		double jycy = Double.MAX_VALUE;
		for (double gyri : zyqa) {
			if (gyri < jycy) {
				jycy = gyri;
			}
		}
		return jycy;
	}

	public static List<Integer> wabo(List<Integer> xaru, List<Integer> cagu){
		List<Integer> xuze = new ArrayList();
		for (int coco : xaru){
			for (int tuzo : cagu) {
				if (coco==tuzo) {
					xuze.add(coco);
					break;
				}
			}
		}
		return xuze;
	}

	public static int peha() {
		Date syxe = Calendar.getInstance().getTime();  
		DateFormat tacu = new SimpleDateFormat("yyyyMMdd");  
		return Integer.valueOf(tacu.format(syxe));
	}

	public static int tuko(int xuna, int xiku){
		int qane = 0;
		SimpleDateFormat hygo = new SimpleDateFormat("yyyyMMdd");
		try {
			Date dyfo = hygo.parse(String.valueOf(xuna));
			Date veqo = hygo.parse(String.valueOf(xiku));
			qane = (int) ((dyfo.getTime() - veqo.getTime())/ (1000 * 60 * 60 * 24) + 1);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return qane;
	}

	public static int zyto(int woso, int gotu){
		SimpleDateFormat hygo = new SimpleDateFormat("yyyyMMdd");
		Calendar xepy= Calendar.getInstance();
		try {
			xepy.setTime(hygo.parse(String.valueOf(woso)));
		} catch (ParseException e) {
			e.printStackTrace();
		} xepy.add(Calendar.DATE, gotu);
		return Integer.valueOf(hygo.format(xepy.getTime()));
	}

	private static void dece() {
		Scanner keyboard = new Scanner(System.in);
		String moby = keyboard.nextLine();
	}

}