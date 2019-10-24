class Shinobi {
	private int noreg;
	private String nama;
	private String rank;
	public Shinobi() { }
	
	public Shinobi(int a) {
		noreg = a;
	}
	
	public Shinobi(int a, String b, String c) {
		noreg = a;
		nama = b;
		rank = c;
	}
	
	public void setNoreg(int a) {
		noreg = a;
	}
	
	public int getNoreg() {
		return noreg;
	}
	
	public void setNama(String a) {
		nama = a;
	}
	
	public String getNama() {
		return nama;
	}
	
	public void setRank(String a) {
		rank = a;
	}
	
	public String getRank() {
		return rank;
	}
}

public class DemoShinobi {
	public static void main(String[] args) {
		Shinobi arrMns[] = new Shinobi[3];
		
		Shinobi objMns1 = new Shinobi(12606, "Uchiha Sasuke", "Genin");
		Shinobi objMns2 = new Shinobi(12607, "Uzumaki Naruto", "Genin");
		Shinobi objMns3 = new Shinobi(12601, "Haruno Sakura", "Chunin");
		
		arrMns[0] = objMns1;
		arrMns[1] = objMns2;
		arrMns[2] = objMns3;
		
		for(int i = 0; i < 3; i++) {
			String padded = String.format("%06d", arrMns[i].getNoreg());
			System.out.println("No. Registrasi\t: " + padded);
			System.out.println("Nama\t\t: " + arrMns[i].getNama());
			System.out.println("Peringkat\t: " + arrMns[i].getRank());
			System.out.println();
		}
	}
}