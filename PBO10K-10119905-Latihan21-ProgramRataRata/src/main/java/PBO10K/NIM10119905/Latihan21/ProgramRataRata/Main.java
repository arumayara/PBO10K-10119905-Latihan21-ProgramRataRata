/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO10K.NIM10119905.Latihan21.ProgramRataRata;
import java.util.Scanner;

/**
 *
 * @author
 * NAMA    : Abraham Rumayara
 * KELAS   : PBO10K
 * NIM     : 10119905
 * Deskripsi Program : Program Target Saldo Tabungan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int mahasiswa, nilai, i;
        float ratarata, jumlah;
        var scanner = new Scanner(System.in);
        
                
        System.out.println("Masukan banyaknya mahasiswa : ");
        mahasiswa=scanner.nextInt();
        jumlah = 0;
        i=1;
              
        
        while(i<=mahasiswa){
            System.out.println("Mahasiswa ke -"+i+" : ");
            nilai= scanner.nextInt();
            jumlah +=nilai;
            i++;    
        }
        
        ratarata=jumlah/mahasiswa;
        System.out.println();
        System.out.println("Maka, Rata-rata nilainya adalah "+ ratarata);
        System.out.println("Developed by : Abraham Rumayara");
        }
        
    }
   
