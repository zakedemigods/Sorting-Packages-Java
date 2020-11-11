/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajarsorting;
import java.util.Scanner;

/**
 *
 * @author asus
 */
public class BinarySearchingCP {   
    public static void main(String[] args)
    {
        //  Objek Scanner
        Scanner scan = new Scanner(System.in);
         
        //  Input jumlah Data
        System.out.print("Masukkan jumlah Data : ");    int jlh_data = scan.nextInt();
         
        //  Input nilai tiap Data
        int[] data = new int[jlh_data];
        System.out.println();
        for(int a = 0; a < jlh_data; a++)
        {
            System.out.print("Nilai Data ke-"+(a+1)+" : ");     data[a] = scan.nextInt();
        }
         
        //  Urutkan Data secara Ascending
        setSortAsc(data);   //  Panggil procedure
         
        //  Tampilkan hasil Sorting
        System.out.println("\nData Setelah di Urutkan");
        System.out.print("Data  : ");
        for(int a = 0; a < jlh_data; a++)
            System.out.print(data[a]+"\t");
         
        System.out.println();
        System.out.print("Index : ");
        for(int a = 0; a < jlh_data; a++)
            System.out.print(a+"\t");
         
        //  Input nilai yang dicari
        System.out.print("\n\nMasukkan nilai yang dicari : ");  int cari = scan.nextInt();
         
        //  Proses Binnary Searching
        int index_awal = 0, index_akhir = data.length - 1, index_tengah = (index_awal + index_akhir) / 2;
        int nilai_data = data[index_tengah];
        int temp_data = 0;
        int iterasi = 0, sama = 0;
        boolean temu = false;
        System.out.println("\n\nProses Binnary Searching");
        System.out.println("\nIterasi\tIndex_Awal\tIndex_Akhir\tIndex_Tengah\tNilai_Data");
        while(temu == false)
        {
            iterasi++;
            index_tengah = (index_awal + index_akhir) / 2;
            System.out.print(iterasi+"\t\t"+index_awal+"\t\t"+index_akhir+"\t\t"+index_tengah+"\t\t"+data[index_tengah]);
            if(data[index_tengah] == cari)
            {
                temu = true;
                System.out.println("   --> Data ditemukan");
            }
            else if(data[index_tengah] > cari)
            {
                index_akhir = index_tengah - 1;
                System.out.println("   --> "+data[index_tengah]+" > "+cari+" maka, index_akhir = index_tengah - 1");
            }
            else if(data[index_tengah] < cari)
            {
                index_awal = index_tengah + 1;
                System.out.println("   --> "+data[index_tengah]+" < "+cari+" maka, index_awal = index_tengah + 1");
            }
             
            //  Kondisi jika ternyata Data yang dicari tidak ditemukan, maka pasti
            //  akan kejadian nilai Data yang sama secara terus menerus
            if(temp_data != data[index_tengah])
                temp_data = data[index_tengah];
             
            else
                sama++;
             
            //  Jika sudah sama sebanyak 3 kali maka, proses pencarian berhenti.
            if(sama >= 3)
                break;
        }
         
        if(temu == true)
            System.out.println("\nData ditemukan pada iterasi ke-"+iterasi);
         
        else
            System.out.println("\nData tidak ditemukan");
    }
     
    //  Procedure untuk mengurutkan Data secara Ascending
    static void setSortAsc(int[] data)
    {
        for(int x = 0; x < data.length; x++)
        {
            for(int y = 0; y < data.length - 1; y++)
            {
                if(data[y] > data[y+1])
                {
                    //  Proses Pertukaran data
                    int temp = data[y];
                    data[y] = data[y+1];
                    data[y+1] = temp;
                }
            }
        }
    }
}