/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119056.latihan37.ratanilai;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class RataRata{
        private int banyak;
        private double jumlah=0;
        private double nilai;
        private double rata;
        
        public double jumlah(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan banyaknya Mahasiswa: ");
        banyak=input.nextInt();

            for(int i=1; i<=banyak; i++){
                System.out.print("Nilai Mahasiswa ke- "+i+":" );
                nilai=input.nextInt();
                jumlah+=nilai;
        }
            return jumlah;
        }
        
        public double rata(){
            return rata=jumlah / banyak;
        }
}