
package sesi5;

import java.util.ArrayList;
import java.util.Scanner;

public class Sesi5 {
    public static void main(String[] args) {
        ArrayList<String>dataKota = new ArrayList();
        dataKota.add("Sukabumi");
        dataKota.add("Cianjur");
        dataKota.add("Bandung");
        dataKota.add("Garut");
        dataKota.add("Tasik");
        dataKota.add("Ciamis");
        dataKota.add("Banjar");
        
        ArrayList<Integer>tarif = new ArrayList();
        tarif.add(10_000);
        tarif.add(15_000);
        tarif.add(7_500);
        tarif.add(5_000);
        tarif.add(7_500);
        tarif.add(6_000);
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan kota keberangkatan:");
        
        String berangkat = input.nextLine();
        
        while(!dataKota.contains(berangkat)){
            System.out.println("Kota berangkat yang anda masukan salah,mohon masukkan kembali: ");
            berangkat = input.nextLine();
        }   
        
        System.out.print("Masukkan Kota Tujuan Anda:");
        String tujuan = input.nextLine();
        
        while(!dataKota.contains(tujuan)){
            System.out.println("Kota tujuan yang anda masukan salah,mohon masukkan kembali: ");
            tujuan = input.nextLine();   
        }
        double total =0;
        
        int berangkatlndex= dataKota.indexOf(berangkat);
        int tujuanlndex= dataKota.indexOf(tujuan);
        
        if(berangkatlndex <tujuanlndex){
            for(int i = berangkatlndex; i <tujuanlndex;i++){
                total += tarif.get(i);
            }
        }   else{
            for(int i = berangkatlndex -1; i >= tujuanlndex;i--){
                total += tarif.get(i);
                
            }
        }
        System.out.println("Apakah anda seorang anggota TNI/POLRI? (YES/NO");
        String tentara = input.nextLine();
        
        while(!tentara.equalsIgnoreCase("YA") && !tentara.equalsIgnoreCase("NO")){
            System.out.println("Masukkan YA atau NO:");
            tentara = input.nextLine();
  
        }
          if(berangkat.equalsIgnoreCase("Sukabumi") && tujuan.equalsIgnoreCase("Banjar") || berangkat.equalsIgnoreCase("Banjar") && tujuan.equalsIgnoreCase("Sukabumi")){
            total *=0.95;
        }
          if(tentara.equalsIgnoreCase("YA")){
            total *=0.9;
        }
        System.out.println("Total tarif anda:Rp"+total);

    }   }   
        
        
        
        
        
        