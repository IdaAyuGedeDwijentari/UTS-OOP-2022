package uts.oop;

import java.util.Scanner;
import java.util.ArrayList;

public class UTSOOP {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in); 
        ArrayList<String> nama = new ArrayList<String>();
        int n;
            do {
            System.out.println("##### Daftar Nama Pengunjung Kebun Binatang #####");
            System.out.println("1. Tampilkan Data Pengunjung");
            System.out.println("2. Isi data");
            System.out.println("3. Keluar");
            System.out.println("#################################################");
            System.out.print("Pilih Menu :");
            n = input.nextInt();
            
            if (n==1){ 
                if (nama.size() == 0){
                    System.out.println("");                
                    System.out.println("\n##### Daftar Pengunjung Kebun Binatang #####\n");
                    System.out.println("Belum Ada Pengunjung");
                    System.out.println("");
                    System.out.println("Silahkan pilih menu di bawah ini....");                    
                    } else {
                    System.out.println("\n##### Data Nama Pengunjung #####");
                    for (int i = 0; i < nama.size(); i++){
                    System.out.println((i+1)+". "+nama.get(i));        
                    }
                    System.out.println("");
                    System.out.println("Total Jumlah Pengunjung: "+nama.size()+" pengunjung");
                    System.out.println("");
                    System.out.println("Silahkan pilih menu di bawah ini....");                
                    }
                    }else if (n==2){
                    System.out.println("");
                    System.out.println("Isi Data Nama Pengunjung");
                    System.out.print("Nama Pengunjung :");
                    String Np = input.next();
                    nama.add(Np);
                    System.out.println("");
                    System.out.println("Data pengunjung telah di record, Silahkan pilih menu di bawah ini....");                   
                    }else if (n==3){
                    System.out.println("\n\n");                    
                    System.out.println("############## TERIMAKASI TELAH BERKUNJUNG #################");
                    System.out.println("\n\n"); 
                    }else if (n>3){
                    System.out.println("\n\n");
                    System.out.print("Opsi Pilihan tidak terdaftar, silahkan pilih 1,2 atau 3... ");
                    System.out.println("\n\n");                    
                    }
            }while (n!=3);     
        }   
    }
    
   
    

