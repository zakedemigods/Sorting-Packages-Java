/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajarsorting;


/**
 *COMPARE ALL SORTING
 * @author asus
 */
public class CompareSort {
    
    //Method Print
    public static void cetak(int[] data) {
		for(int x=0;x<data.length;x++) {
			System.out.print(data[x]);
		}
	}
    
    //Method Bagi Merge
     public static void bagi(int[] data) {
		if(data.length > 1) {
			int[] kiri = new int[data.length/2];
			System.arraycopy(data, 0, kiri, 0, data.length/2);
			bagi(kiri);

			int pKanan = data.length-(data.length/2);
			int[] kanan = new int[pKanan];
			System.arraycopy(data, data.length/2, kanan, 0, pKanan);			
			bagi(kanan);
			int[] tmp = gabung(kiri,kanan);
			System.arraycopy(tmp,0,data,0,tmp.length);
		}
	}
	
     //Method Gabung MergeSort
	public static int[] gabung(int[] kiri, int[] kanan) {
		int[] tmp = new int[kiri.length+kanan.length];
		int indexKiri=0;
		int indexKanan=0;
		int indexTmp=0;
		
		while(indexKiri < kiri.length && indexKanan < kanan.length) {
			if(kiri[indexKiri] < kanan[indexKanan]) {
				tmp[indexTmp++] = kiri[indexKiri++];
			} else {
				tmp[indexTmp++] = kanan[indexKanan++];
			}
		}
		
		while(indexKiri < kiri.length) {
			tmp[indexTmp++] = kiri[indexKiri++];
		}
		while(indexKanan < kanan.length) {
			tmp[indexTmp++] = kanan[indexKanan++];
		}
		return tmp;
	}
        
        //Method BubbleSort
   static void BubbleSort(int[]angka){
        for(int i = 0; i < angka.length; i++)  {
            for (int j = 0; j < angka.length-1; j++) {
                if (angka[j]>angka[j+1]){
                    int temp = angka[j];
                    angka[j]=angka[j+1];
                    angka[j+1]=temp;
                }
            }
        }
    }
   
   
	
	public static void main(String[] A) {
		//auto gen random data
		//int[] data = new int[200];
		//int panjang=data.length;
				
		//for(int i=0; i<panjang; i++){ 
		//	int random = (int)(Math.random()*panjang);
		//	data[i]=random;
		//}
                
                
                //Manual
                int[] data= {2,1,5,3,4,7,6,9,8,10};
		int min, pos;
                //int jData=data.length;
		//boolean cek=true;
		
		System.out.print("Data Acak : ");
		cetak(data);
                System.out.println(" ");
		
                 //===========================================================================================================================================
                //Proses BubbleSort Start
                long awal=System.nanoTime();
		 BubbleSort(data);
		long akhir=System.nanoTime();
		System.out.println("");
		System.out.print("data urut buibble sort : ");
		cetak(data);
		System.out.println("");
		long all=(akhir-awal);//1000000;
		System.out.println("Waktu BubbleSort: "+all );
                //Proses BubbleSort End
                
                
                //===========================================================================================================================================
                
                
                long awals=System.nanoTime();
                //Proses Selection Sort Start
		 for(int ulang=0;ulang<data.length;ulang++) {
			min=data[ulang];
			pos=ulang;
			
			for(int index=ulang;index<data.length;index++) {
				if(data[index]<min) {
					min=data[index];
					pos=index;
				}
			}
                         
			if (ulang!=pos) {
				int temp = data[ulang];
				data[ulang]=data[pos];
				data[pos]=temp;
				cetak(data);
                
			}
                        
                        
		}
                long akhirs=System.nanoTime();              
		System.out.print("\ndata urut selection sort : ");
		cetak(data);
                System.out.println("");
                long alls=(akhirs-awals);
                System.out.println("Waktu SelectionSort : "+alls );
                System.out.println(" ");

         //===========================================================================================================================================
                //Proses MergeSort Start
                long awalz=System.nanoTime(); 
		bagi(data);
                long akhirz=System.nanoTime();  
		System.out.print("data urut mergesort : "); cetak(data);
                 System.out.println("");
                long allz=(akhirz-awalz);
                System.out.println("Waktu MergeSort : "+allz );
                //Proses MergeSort End
        }
}



	
