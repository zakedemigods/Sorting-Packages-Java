/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajarsorting;

/**
 *
 * @author zakedemigod
 */
public class BubbleSort {
    
    //Prosedur BubbleSortAscending
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
    
    static void DescendingSort (int[]angka){
        //int temp = 0; versi india
        for(int i = 0; i < angka.length;  i++)  {
            //compare
            for (int j = 1; j < (angka.length-i); j++) {
                if (angka[j-1] < angka[j]){
                    //swap
                    int temp = angka[j-1]; //versi indonesia
                    angka[j-1]=angka[j];
                    angka[j]=temp;                              
                    
                }
            }
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int []angka={4,3,1,2,6,5};  //random
        //int []angka={1,2,3,4,5,6};  //best
        //int []angka={6,5,4,3,2,1};   //worst
        long startTime = System.nanoTime();
        
        //Pemanggilan data awal
        System.out.println("Angka Awal : ");
        for (int i = 0; i < angka.length; i++) {
            System.out.print(angka[i]+""+",");
        }
        System.out.println(" ");
        
        //Pemanggilan Ascending
        System.out.println("Angka Ascending : ");
        
        BubbleSort(angka);
        for (int i = 0; i < angka.length; i++) {
            System.out.print(angka[i]+""+",");
        }
        
        System.out.println("");
        
        System.out.println("Angka Descending : ");
        
        DescendingSort(angka);
        for (int i = 0; i < angka.length; i++) {
            System.out.print(angka[i]+""+",");
        }
        
        long endTime = System.nanoTime();
        long estTime = endTime-startTime;
        System.out.println(" ");
        System.out.println("waktu "+estTime);
                
                
    }
    
}
    
