/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author HP
 */
public class tugas2buffer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String sekolah,pelajaran,hobi;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader (isr);
        
        System.out.println("Siapa Nama Anda? ");
        String nama = br.readLine();
        
        System.out.println("Anda Anak ke Berapa ? ");
        String anakke = br.readLine();
        
        
        System.out.println("Anda Sekolah Di Mana ? ");
        sekolah = br.readLine(); 
       
        
        System.out.println("Pelajaran Favorit Anda Apa ?");
        pelajaran = br.readLine();
        
        
        System.out.println("Hobi Anda Apa ? ");
        hobi = br.readLine();
        
        System.out.println("Nilai Ujian Nasional Anda Berapa ? ");
        double nilai = Double.parseDouble(br.readLine());

        System.out.println("+>>======>>|xxxxxx|*+*|xxxxxx|<<======<<+\n\n");
        System.out.println("Nama Anda "+nama);
        System.out.println("Anda Anak Ke "+anakke);
        System.out.println("Anda Sekolah Di "+sekolah);
        System.out.println("Nila Ujian Nasional Anda "+ nilai);
        System.out.println("Pelajaran Favorite Anda "+ pelajaran);
        System.out.println("Hobi Anda "+ hobi);
        System.out.println("\n\n+>>======>>|xxxxxx|*+*|xxxxxx|<<======<<+");
    }
    
}
