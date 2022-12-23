package day5.latihan;

import java.util.Scanner;

public class Soal05 {

	public static void main(String[] args) {

//		// L 1 orang dewasa laki = 2 piring nasgor
//		// P 1 orang dewasa perempuan = 1 mie goreng
//		// R 2 orang remaja =  2 mie ayam
//        // A 1 anak = 1/2 nasgor
//		// B 1 balita = 1 mangkok kecil bubur
		
//		jika jumlah orang ganjil P += piring nasgor
		
		Scanner scanner = new Scanner(System.in);
		
	   int porsi = 0;
	   int jumlahPorsi;
       int orang = 0;
				
			System.out.print("Laki-laki dewasa = ");
             int l =scanner.nextInt();
                orang+=l;
//				porsi=l*2;
			
			System.out.print("Perempuan dewasa = ");
			int p=scanner.nextInt();
			  orang+=p;
//			porsi+=p;
			
			System.out.print("Remaja = ");
			int r=scanner.nextInt();
			  orang+=r;
//			porsi+=r;
			
			System.out.print("anak = ");
			double a = scanner.nextDouble();
			  orang+=a;
//			if(a==0) {
//				porsi+=a;
//			}else {
//			    porsi+=a/2 ;
//			}
			
			System.out.print("Balita = ");
			int b = scanner.nextInt();
			  orang+=b;
//			porsi+=b;
			
		System.out.print("Jumlah orang ="+orang);
		System.exit(0);
		
		
		if(orang >= 5 && orang % 2!=0) {
			 porsi+=1;
		System.out.print("Jumlah porsi = " + porsi);	     
		}
		else {
			System.out.print("Jumlah porsi = "+ porsi );		
		} 
		
		System.exit(b);
		
		
		 
//		if(l>=0) {
//			jumlahPorsi=l*2;
//		}
//		else if(p>=0) {
//			jumlahPorsi=p;
//		}else if(r>=0) {
//			jumlahPorsi=r;
//		}else if(a>=0) {
//			jumlahPorsi=a;
//		}else if(b>=0) {
//			jumlahPorsi=b/2;
//		}
		
	}

}
