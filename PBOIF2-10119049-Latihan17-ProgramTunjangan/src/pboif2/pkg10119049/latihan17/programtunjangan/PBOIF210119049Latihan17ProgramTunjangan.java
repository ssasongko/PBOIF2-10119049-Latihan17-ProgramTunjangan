/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119049.latihan17.programtunjangan;

import java.util.Scanner;
/**
 * @author 
 * Nama  : Nur Sasongko
 * Kelas : PBOIF2
 * NIM   : 10119049
 * Deskripsi Program : Program untuk menampilkan Program Tunjangan
 */
public class PBOIF210119049Latihan17ProgramTunjangan {
    public static double getTunjangan(String statusMenikah,double gajiPokok){
        
        if(statusMenikah.equals("MENIKAH")){
            return gajiPokok * 0.35;
        }
        return 0;
    }
       
    public static void tampilHasil(double gajiPokok,double tunjangan){
        double totalGaji = gajiPokok + tunjangan;
        
        System.out.println("Gaji Pokok        : " + gajiPokok);
        System.out.println("Tunjangan         : " + tunjangan);
        System.out.println("Total Gaji        : " + totalGaji);
    }
    
    public static void main(String[] args) {
//        Inisialisasi obj scan
        Scanner scan = new Scanner(System.in);
        double gajiPokok, tunjangan = 0;
        
        
//        Print to Console
        System.out.println("================PROGRAM TUNJANGAN ===============");
        
//        Input Gaji Pokok
        System.out.print("Berapa gaji pokok anda perbulan ? : ");
        gajiPokok = scan.nextInt();
        
//        Input Kawin ?
        System.out.print("Status Menikah ? (Menikah/Belum) : ");
        String statusMenikah = scan.next();
        statusMenikah = statusMenikah.toUpperCase();
        
        tunjangan = getTunjangan(statusMenikah,gajiPokok);
        
        tampilHasil(gajiPokok, tunjangan);
    }
    
}
