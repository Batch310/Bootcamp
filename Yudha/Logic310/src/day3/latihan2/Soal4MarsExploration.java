package day3.latihan2;

import java.util.Scanner;

public class Soal4MarsExploration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String signal = input.next();
		int count =0;
        for(int i=0;i<signal.length();i =i+3){
            if(signal.charAt(i)!='S'){
                count++;
            } 
            if(signal.charAt(i+1)!='O'){
                count++;
                
            }
            
            if(signal.charAt(i+2)!='S'){
                count ++;
            }
            
        }
        
        System.out.println(count);
	}

}
