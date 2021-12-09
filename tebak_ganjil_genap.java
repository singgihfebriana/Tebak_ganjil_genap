/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package proyek_latihan;
import java.util.Scanner;

/**
 *
 * @author singg
 */
public class Jumlah_Bilangan_Genap {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        double a,b,c,d;
        Scanner keyboard= new Scanner(System.in);
        System.out.println("Masukan angka anda : ");
        a=keyboard.nextDouble();
        b=(a%2);
        if (b==0){
            System.out.println(a+" adalah angka genap");
        }
        else {
            System.out.println(a+" adalah angka ganjil");
        }
        
    }
}
