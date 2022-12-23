package day4.latihan.exam;

import java.util.Iterator;

public class Run {
	public static void main(String[] args) {
//		String coba = "Ini bilangan 6";
//		
////		if (coba.contains(Integer)) {
////			
////		}
//		
//		String a = "Dewasa Perempuan=2 orang;Dewasa Laki-laki=6 orang;Balita=3 orang;";
//		
//		String[] newArray = a.split(" orang;");
//		for (int i = 0; i < newArray.length; i++) {
//			System.out.println(newArray[i]);
//		}
//		
//		
//		//System.out.println(a);
		
		
		String st = "ini adalah budi 123";  
		String st1=st.replaceAll("[^A-Za-z]", "");  
		String st2=st.replaceAll("[^0-9]", "");  
		System.out.println("String b = "+st1);  
		System.out.println("Int c = "+st2); 
	}

}
