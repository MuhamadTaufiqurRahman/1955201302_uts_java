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
public class tugas4if {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int Mizone350ml = 3000;
        int jb;
        int tb;
        int diskon;
        JOptionPane.showMessageDialog(null, "pembelian Minuman Mizone 350 ml");
       jb = Integer.parseInt(JOptionPane.showInputDialog("jumlah barang"));
       
            tb = jb*Mizone350ml;
            if (jb>=0){
            diskon=tb*5/100;
            int hasil= tb-diskon;
            JOptionPane.showMessageDialog(null,"Anda Membeli Mizone 350 ml Sebanyak "+jb+"\nTotal Yang Harus Dibayar "+hasil);
            JOptionPane.showMessageDialog(null,"Nama Barang Yang Di Beli = MIZONE 350 ml\nTotal Harga Awal = "+tb+"\nkarena ada diskon 5%\nTotal Harga Yang Harus Anda Bayar Sebesar = Rp. "+hasil);
            }
            JOptionPane.showMessageDialog(null, ">>=======>>|TERIMA KASIH|<<=======<<");
            
            
    }
    
}
