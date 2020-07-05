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
public class tugas3joption {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String tanya1 = JOptionPane.showInputDialog("SilahKan Setting Nama Bluetooth Anda");
        
        double tanya2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Setting Frekuensi jangkauan Bluetooth \n - 5.5 Mhz \n - 15.5 Mhz \n Isikan dengan format Angka saja "));
        
        String tanya3 = JOptionPane.showInputDialog("Type Berkas Yang Ingin Di Kirimkan Berupa");
        
        String tanya4 = JOptionPane.showInputDialog("jumlah file yang akan anda kirim");
        
        String tanya5 = JOptionPane.showInputDialog("Nama Bluetooth Target Anda");
        
        JOptionPane.showMessageDialog(null,
                "+>>======>>|xxxxxx|*+*|xxxxxx|<<======<<+\n\n"
                +"Nama Bluetooth Anda " + tanya1
                +"\nDengan jangkauan " +tanya2+" Mhz"
                +"\nType Berkas File Yang Akan Di Kirim Berupa "+tanya3
                +"\nJumlah File Yang Akan Di Kirim Sebanyak "+tanya4 +" Berkas"
                +"\nBerkas Akan Di Kirim Ke "+tanya5 +
                "\n\n+>>======>>|xxxxxx|*+*|xxxxxx|<<======<<+"
                );
        
    }
    
}
