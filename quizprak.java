import java.util.Scanner;
public class quizprak {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		String nama;
		char merek, tipe;
		int unit, bayar, total, kembali, harga;
		
		System.out.print("Nama : "); nama = input.nextLine();
		System.out.print("Merek : "); merek = input.next().charAt(0);
		System.out.print("Tipe : "); tipe = input.next().charAt(0);
		System.out.print("Jumlah Unit : "); unit = input.nextInt();
		System.out.print("Bayar : Rp "); bayar = input.nextInt();
		harga = 0;
		if (merek == 'G') {	
			if (tipe == 'M') {
				harga = 95000;
			}
			else if (tipe == 'K') {
				harga = 125000;
			}
			else if (tipe == 'L') {
				harga = 450000;
			}
			else {
				System.out.println("Salah Masukkan Tipe!!!");
			}
		} else 	if (merek == 'O') {	
			if (tipe == 'M') {
				harga = 115000;
			}
			else if (tipe == 'K') {
				harga = 135000;
			}
			else if (tipe == 'L') {
				harga = 505000;
			}
			else {
				System.out.println("Salah Masukkan Tipe!!!");
			}
		} else {
			System.out.println("Salah Masukkan Merek!!!");
		}
		
		total = unit * harga;
		kembali = bayar - total;
		
		System.out.println("Nama : " +nama);
		System.out.println("Total Harga : Rp " +total);
		System.out.println("Bayar : Rp " +bayar);
		System.out.println("Kembalian : Rp " +kembali);
	}
}