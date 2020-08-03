/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_mingguan;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class array_satu_dimensi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String NoAbsen[] = new String [6];
        for (int i = 1; i<NoAbsen.length; i++){
            NoAbsen[i] = JOptionPane.showInputDialog(null,"Masukkan Nama Siswa " + i );
            System.out.println(NoAbsen[i]);
            }
        
        String CariNo = JOptionPane.showInputDialog(null, "Cari Nama Siswa Berdasarkan Nomor Absen");
        
        for (int i = 1; i<NoAbsen.length; i++){
             if (NoAbsen[i].equals(CariNo)){
                 JOptionPane.showMessageDialog(null,"Nama yang anda cari adalah " + CariNo + " Dari Nomor Absen ke " + i);
             }
            }
    }
    
}
