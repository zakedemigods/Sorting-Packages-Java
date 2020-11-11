/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajarsorting;

/**
 *
 * @author asus
 */
public class SelectionSort {
    public static void cetak(int[] data) {
		for(int x=0;x<data.length;x++) {
			System.out.print(data[x]);
		}
	}
	
	public static void main(String[] A) {
		//auto gen random data
		int[] data = new int[100];
		int panjang=data.length;
				
		for(int i=0; i<panjang; i++){ 
			int random = (int)(Math.random()*panjang);
			data[i]=random;
		}
                
                //Manual
                //int[] data= {2,1,5,3,4,7,6,9,8,10};
		int min, pos;
                //int jData=data.length;
		//boolean cek=true;
		
		System.out.print("data acak : ");
		cetak(data);
		
                
                
                
                
                long awals=System.nanoTime();
                ///Proses Selection Sort Start
		for(int ulang=0;ulang<data.length;ulang++) {
			min=data[ulang];
			pos=ulang;
			///System.out.print("\n\nulang ke  : "+ulang);
			///System.out.println("\nmin awal : "+min+" pos awal : "+pos);
			for(int index=ulang;index<data.length;index++) {
				///System.out.println("");
                                //cetak(data);
				///System.out.print(" bandingkan "+min+" dengan "+data[index]);
				if(data[index]<min) {
					min=data[index];
					pos=index;
					///System.out.print("-> min = "+min+", pos = "+pos);
				}
			}
                         
			if (ulang!=pos) {
				///System.out.println("\ntukar "+data[pos]+" dengan "+data[ulang]);
				int temp = data[ulang];
				data[ulang]=data[pos];
				data[pos]=temp;
				///System.out.print("data sekarang : ");
				cetak(data);
                
			}
                        
                        
		}
                long akhirs=System.nanoTime();              
		System.out.print("\ndata urut selection sort : ");
		cetak(data);
                System.out.println("");
                long alls=(akhirs-awals);
                System.out.println("waktu selection : "+alls );
	}
        
	
}
