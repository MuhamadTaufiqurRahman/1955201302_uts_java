/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class tugas8while {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean running = true;
        int counter = 0;

        while( running ) {
           JOptionPane.showMessageDialog(null,"Bluetooth Anda Belum Nyala");
           String tanya1 = JOptionPane.showInputDialog("| ==================*|<==II==>|*================== |\n\n   Apakah Anda Ingin Menyalakan Bluetooth Anda ?            \n   Jawab = ya/tidak                                                                        \n\n| ==================*|<==II==>|*================== |");

            // cek jawabnnya, kalau ya maka berhenti mengulang
            if( !tanya1.equalsIgnoreCase("ya") ){
            } else {
                running = false;
            }

            counter++;
            
        }
        JOptionPane.showMessageDialog(null,"Konfirmasi [ Bluetooth Anda Sudah Nyala ]");
    }
    
}
