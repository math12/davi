package xafe;
import java.util.ArrayList;
import java.util.List;

import pexe.Hejo;
import voju.Datu;

public class Remu {

	private int pyri; //waty // hymy
	private String hozu; // winu // hymy

	public Remu (int pyri, String hozu) {
		this.pyri = pyri;
		this.hozu = hozu;
	}

	public List<Integer> lipy(){
		List<Integer> mami = new ArrayList();
		return Datu.tube("rogi", "pobe", "waty", pyri, "winu", hozu, "luqo", Hejo.MUPI);
	}

}
