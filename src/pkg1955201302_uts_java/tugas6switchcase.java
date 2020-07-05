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
public class tugas6switchcase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
            String minuman;   //pilihan dalam string
            int pilihh;      // pilihan dalam int
            minuman = JOptionPane.showInputDialog(
        "*================================*|pembelian |*================================*\n"
        + "\nDaftar Produk Minuman yang Dijual\n"
        + "  1. Mizone 350 ml = Rp.3.000,00\n"
        + "  2. Floridina orange 350 ml = Rp.3.000,00\n"
        + "  3. Teh Javana 350 ml = Rp.3.000,00\n"
        + "  4. ISOPLUS 350 ml = Rp.3.000,00\n\n"
        + "*================================*|<---MTR-MARKET--->|*================================*\n","Pilih : ");
            pilihh = Integer.parseInt(minuman);
            switch (pilihh){
                case 1:JOptionPane.showMessageDialog(null, "anda memilih Mizone 350 ml");
                   break;
                case 2 :JOptionPane.showMessageDialog(null, "anda memilih Floridina orange 350 ml");
                   break;
                case 3 :JOptionPane.showMessageDialog(null, "anda memilih Teh Javana 350 ml");
                   break;
                case 4 :JOptionPane.showMessageDialog(null, "anda memilih ISOPLUS 350 ml");
                default:
                JOptionPane.showMessageDialog(null, "keyword yang anda masukkan salah");
                   break;
            }
        }
       
        
    
}
