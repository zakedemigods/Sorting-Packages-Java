/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajarsorting;

/**
 * MODIFIKASI BUBBLESORT
 * @author asus
 */
public class ModifikasiBubble {
    
    
    
    public static void cetak(int [] x) {
		int i;

		for(i=0;i<x.length;i++) {
			System.out.print(x[i]);
		}
	}
	
	public static void main(String[] args) {
		//auto gen random data
		int[] data = new int[100];
		int panjang=data.length;
				
		for(int i=0; i<panjang; i++){ 
			int random = (int)(Math.random()*panjang);
			data[i]=random;
		}
		
		//manual data
		//int [] data = {4,3,1,2,6,5};
		//int [] data = {1,2,3,4,5,6};
		//int [] data = {6,5,4,3,2,1};
		int jData=data.length;
		boolean cek=true;
	
		//cetak data
		System.out.print("data acak : ");
		cetak(data);
		System.out.println("");
		
		long awal=System.nanoTime();
		//algoritma bubble sort
		for(int ulang=0;ulang<(jData-1)&&cek;ulang++) {
			System.out.println("");
			//System.out.println("Ulang ke : "+(ulang+1));
			//cek=false;
			//System.out.println(cek);
			for(int index=1;index<jData-ulang;index++) {
				cetak(data);
				System.out.print(" -> cek "+data[index-1]+" dengan "+data[index]);
				if(data[index-1]>data[index]) {
					System.out.print(", swap "+data[index]+" <-> "+data[index-1]);
					int tmp = data[index-1];
					data[index-1] = data[index];
					data[index]=tmp;
					cek=true;
					//System.out.print(cek);
				}
				//System.out.println("");
			}
		}
		long akhir=System.nanoTime();
		System.out.println("");
		System.out.print("data setelah diurutkan : ");
		cetak(data);
		System.out.println("");
		long all=(akhir-awal);//1000000;
		System.out.println("waktu : "+all );
	}
}
