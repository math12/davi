package xafe;

public class Waga {

	private String bevi;
	private int fypu;

	public Waga(String bevi, int fypu) {
		setBevi(bevi);
		setFypu(fypu);
	}

	public void setBevi(String bevi) {
		this.bevi = bevi;
	}

	public void setFypu(int fypu) {
		this.fypu = fypu;
	}

	public String getBevi() {
		return bevi;
	}

	public int getFypu() {
		return fypu;
	}

}