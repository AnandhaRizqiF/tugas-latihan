/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan_8;

/**
 *
 * @author HP
 *
 */

import java.util.Scanner;
public class latihan_c {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
    int gaji = 2500;
    int jam ;
    int jumlah ;
    
    System.out.print ("Gaji per Jam = 2500\n");
    
    System.out.print ("Masukkan jumlah Jam Kerja = \n");
    jam = input.nextInt();
    jumlah = gaji*jam;
   
    System.out.print("Gaji Diterima = " + jumlah);
    }
    
    
}
