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
public class MergeSort {
    
    public static void cetak(int[] data) {
		for(int i=0;i<data.length;i++) {
			System.out.print(data[i]+""+",");
		}
	}
	
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
        
	
	public static void main(String[] a) {
		int[] data = {5,6,3,4,2,1}; //Average
                int[] datas = {1,2,3,4,5,6}; //Best
                int[] dataz = {6,5,4,3,2,1}; //Worse
                //int total data.
                int total = 0;
                for( int array : data) {
                        total = total+array;
            }
                //int total data best
                int totals = 0;
                for( int array : datas) {
                        totals = totals+array;
            }
                //int total data worse
                int totalz = 0;
                for( int array : dataz) {
                        totalz = totalz+array;
            }
                
                //BstStart==========================================================================
                System.out.println("Best Case");
                System.out.print("Data Acak : "); cetak(datas);
                System.out.println("");
                System.out.println("Jumlah Data : "+datas.length); 
                System.out.println("Total : "+totals);
                System.out.println("Rata-rata : "+totals/datas.length);
		
                long awal=System.nanoTime();
                bagi(datas);
		System.out.print("Data urut : "); cetak(datas);
                long akhir=System.nanoTime();
                long all=(akhir-awal);
                System.out.println("");
                System.out.print("Waktu proses : "+all+" dalam nano detik");
                System.out.println("");
                System.out.println(""); //BstEnd=====================================================
                
                //WrstStart==========================================================================
                System.out.println("Worse Case");
                System.out.print("Data Acak : "); cetak(dataz);
                System.out.println("");
                System.out.println("Jumlah Data : "+dataz.length); 
                System.out.println("Total : "+totalz); 
                System.out.println("Rata-rata : "+totalz/dataz.length);
		
                long awals=System.nanoTime();
                bagi(dataz);
		System.out.print("Data urut : "); cetak(dataz);
                long akhirs=System.nanoTime();
                long alls=(akhirs-awals);
                System.out.println("");
                System.out.print("Waktu proses : "+alls+" dalam nano detik");
                System.out.println("");
                System.out.println(""); //WrstEnd=====================================================
                
                //AvgStart============================================================================
                System.out.println("Average Case");
		System.out.print("Data Acak : "); cetak(data);
                System.out.println("");
                System.out.println("Jumlah Data : "+data.length); 
                System.out.println("Total : "+total);
                System.out.println("Rata-rata : "+total/data.length);
		
                long awalz=System.nanoTime();
                bagi(data);
		System.out.print("Data urut : "); cetak(data);
                long akhirz=System.nanoTime();
                long allz=(akhirz-awalz);
                System.out.println("");
                System.out.print("Waktu proses : "+allz+" dalam nano detik");
                System.out.println("");
                System.out.println(""); //AvgEnd=====================================================
	}
}
