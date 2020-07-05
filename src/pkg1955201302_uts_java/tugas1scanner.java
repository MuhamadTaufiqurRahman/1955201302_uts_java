/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class tugas1scanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keterangansiswa = new Scanner(System.in);
        System.out.println("Nama Lengkap Anda");
        String nama = keterangansiswa.nextLine();
        System.out.println("Jenis Kelamin\n1. Laki-Laki\n2. Perempuan\n Pilih");
        String jk = keterangansiswa.nextLine();
        System.out.println("Masuk Sekolah Ini Sebagai\n1. Siswa Baru\n2. Siswa Pindahan\n Pilih");
        String ket = keterangansiswa.nextLine();
        System.out.println("Nilai Rata-Rata Ujian Nasional");
        double nrr = keterangansiswa.nextDouble();
        
        
        
        System.out.println("+>>=====>>|pendaftaran Sekolah|<<=====<<+\n");
        System.out.println("Nama Anda = "+nama);
        System.out.println("Jenis Kelamin Anda = "+jk);
        System.out.println("Nilai Rata-Rata Ujian Nasional Anda"+nrr);
        System.out.println("Anda Masuk Ke Sekolah Ini Sebagai = "+ket);
        //System.out.println("+  Tinggi Badan Anda = "+tb);
        System.out.println("\n+>>======>>|xxxxxx|*+*|xxxxxx|<<======<<+");
    }
    
}
