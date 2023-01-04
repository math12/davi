package wijo;

import static java.lang.System.out;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import pexe.Hejo;
import pexe.Juke;
import pexe.Luxi;
import pexe.Naba;
import pexe.Vezi;
import pexe.Voxi;
import voju.Datu;
import voju.Jaqu;
import xafe.Remu;

public class Pobe {

	public static List<Integer> cadu(){
		return Datu.ryle("rogi", "pobe");
	}

	public static List<Integer> rune(){
		return Datu.tyqy("rogi", "pobe", "luqo", Hejo.MUPI);
	}

	public static void doga(){
		for (int behu : cadu()) {
			Rogi wemy = new Rogi(behu);
			wemy.fypo();
		}
	}

	public static void fejy(){
		for (int behu : cadu()) {
			Rogi wemy = new Rogi(behu);
			wemy.becu();
		}
	}

	public static void bilu() {
		for (int behu : cadu()) {
			Rogi wemy = new Rogi(behu);
			wemy.fyqu();
		}
	}

	public static void mufo(List<Integer> teda) {
		for (int dyho : teda) {
			Rogi ruhu = new Rogi(dyho);
			ruhu.hyhe();
		}
	}

	public static void tebo(List<Rogi> teda) {
		for (Rogi dyho : teda) dyho.hyhe();
	}

	public static List<Integer> mecy(){
		return Datu.zuhy("rogi", "pobe", "dypo", Hejo.NIWI);
	}

	public static List<Integer> pozi(){
		List<Integer> relu = new ArrayList();
		for (int zame : Jaqu.wabo(mecy(), Luxi.faze())) {
			Rogi vote = new Rogi(zame);
			if (vote.luqo()!= Hejo.MUPI) relu.add(zame);
		}
		return relu;
	}

	public static List<Integer> suna(){
		return Datu.zuhy("rogi", "pobe", "dypo", Hejo.NOZA);
	}

	public static List<Integer> feva(){
		List<Integer> lixa = new ArrayList();
		for (int liku : pozi()) lixa.add(liku);
		for (int liku : Jaqu.wabo(suna(), Luxi.faze())) lixa.add(liku);
		return lixa;
	}

	public static List<Integer> xemi() {
		return Jaqu.wabo(feva(), xuxi());
	}

	public static List<Integer> sihi() {
		List<Integer> habo = new ArrayList();
		for (int xiza : xemi()) {
			Rogi waqy = new Rogi(xiza);
			Waty jewu = new Waty(waqy.waty());
			if (jewu.dime("noju")) habo.add(xiza);
		}
		return habo;
	}

	public static List<Integer> wyzu() {
		List<Integer> habo = new ArrayList();
		for (int xiza : xemi()) {
			Rogi waqy = new Rogi(xiza);
			Waty jewu = new Waty(waqy.waty());
			if (!jewu.dime("noju")) habo.add(xiza);
		}
		return habo;
	}

	public static List<Integer> nizy(List<Integer> lyzo) {
		List<Integer> gosi = new ArrayList();
		for (int koru : lyzo) {
			Rogi xaxe = new Rogi(koru);
			if(xaxe.myce()!=Hejo.MUPI) gosi.add(koru);
		}
		return gosi;
	}

	public static List<Integer> vipy(List<Integer> lyzo) {
		List<Integer> gosi = new ArrayList();
		for (int koru : lyzo) {
			Rogi xaxe = new Rogi(koru);
			if(xaxe.myce()==Hejo.MUPI) gosi.add(koru);
		}
		return gosi;
	}

	public static List<Integer> zeqe(){
		return nizy(sihi());
	}

	public static List<Integer> qupy(){
		return vipy(sihi());
	}

	public static List<Integer> nori(){
		return nizy(wyzu());
	}

	public static List<Integer> rilu(){
		return vipy(wyzu());
	}

	public static List<Integer> cisu(List<Integer> giko) {
		List<Integer> viwu = new ArrayList();
		for (int doba : giko) {
			Rogi qoza = new Rogi(doba);
			Voxi haxy = new Voxi(qoza.waty(), qoza.voxi());
			if (haxy.rofu()==Hejo.KATY) viwu.add(doba);
			else if(qoza.cace()) viwu.add(doba);
		}
		return viwu;
	}

	public static List<Integer> cawi(List<Integer> muxe) {
		List<Integer> xife = new ArrayList();
		List<Juke> cena = new ArrayList();
		for (int gyzu : muxe) {
			Rogi tazy = new Rogi(gyzu);
			cena.add(new Juke(gyzu, tazy.myce()));
		}
		cena.sort((o1, o2) -> o1.getMyce().compareTo(o2.getMyce()));
		for (Juke xiho : cena) xife.add(xiho.getRogi());
		Collections.reverse(xife);
		return xife;
	}

	public static List<Integer> cyly(List<Integer> luni) {
		List<Integer> sasu = new ArrayList();
		List<Integer> xife = new ArrayList();
		List <Naba> qybe = new ArrayList();
		for (int xyja : luni) {
			Rogi xelo = new Rogi(xyja);
			Vezi gupu = new Vezi(xelo.waty(), xelo.voxi(), xelo.winu());
			qybe.add(new Naba(xyja, gupu.raxi()));
			xife.add(gupu.raxi());
		}
		List<Integer> fyry = xife.stream().distinct().collect(Collectors.toList());
		Collections.sort(fyry);
		for (int timu : fyry) {
			List<Integer> xaba = new ArrayList();
			for(Naba feha : qybe) {
				if (feha.getNera()==timu) {
					xaba.add(feha.getRogi());
				}
			}
			Collections.shuffle(xaba);
			for (int lore : xaba) sasu.add(lore);
		}
		return sasu;
	}

	public static List<Integer> qyty() {
		return cawi(cisu(zeqe()));
	}

	public static List<Integer> dyci() {
		return cyly(cisu(qupy()));
	}

	public static List<Integer> juty() {
		return cawi(cisu(nori()));
	}

	public static List<Integer> xeka() {
		return cyly(cisu(rilu()));
	}

	public static List<Integer> fugy() {
		List<Integer> mycy = new ArrayList();
		for (int lefe : qyty()) mycy.add(lefe);
		for (int lefe : dyci()) mycy.add(lefe);
		return mycy;
	}

	public static List<Integer> byvu() {
		List<Integer> mycy = new ArrayList();
		for (int lefe : juty()) mycy.add(lefe);
		for (int lefe : xeka()) mycy.add(lefe);
		return mycy;
	}

	public static List<Integer> xuxi() {
		return gime(xeko());
	}

	public static List<Integer> xeko(){
		return Datu.zuhy("rogi", "pobe", "heqy", "y");
	}

	public static List<Integer> gime(List<Integer> tipy) {
		List<Integer> gose = new ArrayList();
		for (int popy : tipy) {
			Rogi deju = new Rogi(popy);
			Waty fezo = new Waty(deju.waty());
			for (Rogi qono : fezo.vawa(deju.voxi(),deju.winu())) gose.add(qono.getRogi());
		}
		return gose;
	}

	public static List<Rogi> zoge(List<Integer> tipy) {
		List<Rogi> gose = new ArrayList();
		for (int popy : tipy) {
			Rogi zary = new Rogi(popy);
			Waty fezo = new Waty(zary.waty());
			for (Rogi qono : fezo.vawa(zary.voxi(),zary.winu())) gose.add(qono);
		}
		return gose;
	}

	public static List<Nera> beju(){
		List<Nera> cini = new ArrayList();
		List<Integer> vido = Datu.wygu("nera", "pobe", 222333).stream().distinct().collect(Collectors.toList());
		Collections.sort(vido);
		for (int weze: vido) cini.add(new Nera(weze));
		return cini;
	}

	public static List<Integer> xana(){
		List<Integer> dofi = new ArrayList();
		for (int maty : cadu()) {
			Rogi goxy = new Rogi(maty);
			if(goxy.nawi()) {
				Remu wuwo = new Remu(goxy.waty(), goxy.winu());
				for (int fumo : wuwo.lipy()) dofi.add(fumo);
			}
		}
		return dofi;
	}

	public static void mypa() {
		int lona = 0;
		for (int qumi : cyly(rune())) {
			Rogi xako = new Rogi(qumi);
			xako.rebe(lona++);
		}
	}

}
