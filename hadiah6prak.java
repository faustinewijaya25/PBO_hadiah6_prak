import java.util.Scanner;
class pin{
	public String nama;
	public String alamat;
	public int tipe;
	public int blok;
	public int bloka;
	public int bayar;
	
	public String getNama() {
		return nama;
	}
	public void setNama(String nama)
	{
		this.nama=nama;
	}
	public String getAlamat() {
		return alamat;
	}
	public void setAlamat(String alamat)
	{ 
	 	this.alamat=alamat;
	}
	public int getTipe() {
		return tipe;
	}
	public void setTipe(int tipe)
	{
		this.tipe=tipe;
	}
	public int getBlok() {
		return blok;
	}
	public void setBlok(int blok)
	{
		this.blok=blok;
	}
	public int getBloka(){
		return bloka;
	}
	public void setBloka(int bloka)
	{
		this.bloka=bloka;
	}
	public int getBayar(){
		return bayar;
	}
	public void setBayar(int bayar)
	{
		this.bayar=bayar;
	}
	
}
	
	public class hadiah6prak{
	public static void main (String[] args) {
			Scanner masukan = new Scanner(System.in);
			pin p = new pin();
			int kembalian;
			boolean loop = true;
			System.out.print("Masukkan Nama = ");
			p.nama= masukan.nextLine();
			System.out.print("Masukkan Alamat = ");
			p.alamat = masukan.nextLine();
			System.out.println("Tipe");
			System.out.println("1. Tipe 36");
			System.out.println("2. Tipe 37");
			System.out.print("Pilihan Tipe =" );
			p.tipe=masukan.nextInt();
			
			
			while(loop) {
				switch(p.tipe) {
					case 1 : System.out.println("Blok: ");
							 System.out.println("1. A : Rp.500.000");
							 System.out.println("2. B : Rp.300.000");
							 System.out.print("Blok yang dipilih = ");
							 p.blok=masukan.nextInt();
							 switch(p.blok) {
							 	case 1 : System.out.print("Bayaran Anda = ");
							 			 p.bayar=masukan.nextInt();
							 			 kembalian= p.bayar - 500000;
							 			 System.out.println();
							 			 System.out.println("Nama= "+p.getNama());
							 			 System.out.println("Alamat= "+p.getAlamat());
							 			 System.out.println("Harga Bayar= 500000");
							 			 System.out.println("Bayar = "+p.getBayar());
							 			 System.out.println("Kembali = "+ kembalian);
							 			 loop=false; break;
							 	case 2 : System.out.print("Bayaran Anda = ");
							 			 p.bayar=masukan.nextInt();
							 			 kembalian= p.bayar - 300000;
							 			 System.out.println();
							 			 System.out.println("Nama= "+p.getNama());
							 			 System.out.println("Alamat= "+p.getAlamat());
							 			 System.out.println("Harga Bayar= 300000");
							 			 System.out.println("Bayar = "+p.getBayar());
							 			 System.out.println("Kembali = "+ kembalian);
							 			 loop=false; break;
							 	default : System.out.println("Tipe yang anda masukkan salah Silahkan pilih blok 1-2");
							 	}
							 	loop = false; break;
					case 2 : System.out.println("Blok: ");
							 System.out.println("1. A : Rp.800.000");
							 System.out.println("2. B : Rp.600.000");
							 System.out.print("Blok yang dipilih = ");
							 p.blok=masukan.nextInt();
							 switch(p.blok) {
							 	case 1 : System.out.print("Bayaran Anda = ");
							 			 p.bayar=masukan.nextInt();
							 			 kembalian= p.bayar - 800000;
							 			 System.out.println();
							 			 System.out.println("Nama= "+p.getNama());
							 			 System.out.println("Alamat= "+p.getAlamat());
							 			 System.out.println("Harga Bayar= 800000");
							 			 System.out.println("Bayar = "+p.getBayar());
							 			 System.out.println("Kembali = "+ kembalian);
							 			 loop=false; break;
							 	case 2 : System.out.print("Bayaran Anda = ");
							 			 p.bayar=masukan.nextInt();
							 			 kembalian= p.bayar - 600000;
							 			 System.out.println();
							 			 System.out.println("Nama= "+p.getNama());
							 			 System.out.println("Alamat= "+p.getAlamat());
							 			 System.out.println("Harga Bayar= 600000");
							 			 System.out.println("Bayar = "+p.getBayar());
							 			 System.out.println("Kembali = "+ kembalian);
							 			 loop=false; break;
							 	default : System.out.println("Tipe yang anda masukkan salah Silahkan pilih blok 1-2");
							 	}
							 	loop = false; break;
							 	
				default : System.out.println("Merek yang anda masukkan salah , Masukkan merek yang benar");	
				}
				break;
				}
			}
}


