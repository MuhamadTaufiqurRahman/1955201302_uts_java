/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1955201302_uts_java;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class progam_pembelian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, 
                      "|==========================>|x<===>x|<==========================|"
                  + "\n          >oooo>>||  Selamat Datang Di Toko kami ( MTR-MARKET )  ||<oooo<"
                  + "\n|==========================>|x<===>x|<==========================|");
        String pilih;    // pilihan dalam String
        int pilihan;        // pilihan dalam int
         
        boolean running = true;
        int counter = 1;
        while( running ) {
        
        String nb;
        String nb1;
        String konfirmasi;
        
        
        
        pilih = JOptionPane.showInputDialog(
                "*=======*>    pembelian ke "+counter+"    <*=======*\n"
                + "\n1. Minuman\n2. Cemilan\n\n"
                + "*=======*|<---MTR-MARKET--->|**=======*");
        pilihan = Integer.parseInt(pilih);
        switch (pilihan)
        {
            case 1 :
        int diskon;
        int hasil;
        int ISOPLUS350ml = 3000;
        int FloridinaOrange350ml = 3000;
        int Tehjavana350ml = 3000;
        int Mizone350ml = 3000;
                int minuman = Integer.parseInt(JOptionPane.showInputDialog
        ("*================================*|selamat membeli|*================================*\n"
        + "\nDaftar Produk Minuman yang Dijual\n"
        + "  1. Mizone 350 ml = Rp.3.000,00\n"
        + "  2. Floridina orange 350 ml = Rp.3.000,00\n"
        + "  3. Teh Javana 350 ml = Rp.3.000,00\n"
        + "  4. ISOPLUS 350 ml = Rp.3.000,00\n\n"
        + "*================================*|<---MTR-MARKET--->|*================================*\n","Pilih : "));
         int jb = Integer.parseInt(JOptionPane.showInputDialog("jumlah barang"));
        if (minuman == 1){
            if (jb>=5){
            int tb = jb*Mizone350ml;
            diskon = tb*10/100;
            hasil = tb-diskon;
            nb = "Mizone 350 ml";
            JOptionPane.showMessageDialog(null,"Selamat Anda Mendapat diskon 10% setiap pembelian lebih dari 5 barang ");
            JOptionPane.showMessageDialog(null, "Anda mendapat Potongan Harga Sebesar Rp. "+ diskon);
            JOptionPane.showMessageDialog(null, "Jadi Total Harga yang Harus Anda Bayar Sebersar Rp. " + (tb-diskon));
            int ju = Integer.parseInt(JOptionPane.showInputDialog("jumlah uang"));
            int kembalian = ju-hasil;
            JOptionPane.showMessageDialog(null,
             "========>'+'<======== Detail pembelian ========>'+'<========\n"
            +"\nNama Barang Yang Ingin Di Beli    = "+nb
            +"\nHarga Barang                                     = Rp "+Mizone350ml
            +"\nJumlah Barang                                  = " +jb
            +"\nTotal Harga Awal Yang Harus Di Bayar Sebesar = Rp " + tb
            +"\n\n=============================================================\n"
            +"\nTotal Akhir Harga yang Harus Anda Bayar Sebesar = Rp. " +hasil
            +"\n\n=============================================================\n"
            +"\nJumlah Uang Untuk Pembayaran = Rp " + ju
            +"\nKembalian                                           = Rp "+ kembalian
            +"\n\n========>+'*'+<======== Thanks YOU ========>+'*'+<========");
        }
            else{
             int tb=jb*Mizone350ml;
             nb = "Mizone 350 ml";
             JOptionPane.showMessageDialog(null, "Jadi Total Harga yang Harus Anda Bayar Sebersar Rp. " + tb);
             int ju = Integer.parseInt(JOptionPane.showInputDialog("jumlah uang"));
             int kembalian = ju-tb;
             JOptionPane.showMessageDialog(null,
             "========>'+'<======== Detail pembelian ========>'+'<========\n"
            +"\nNama Barang Yang Ingin Di Beli    = "+nb
            +"\nHarga Barang                                     = Rp "+Mizone350ml
            +"\nJumlah Barang                                  = " +jb
            +"\n\n=============================================================\n"
            +"\nTotal Harga Awal Yang Harus Di Bayar Sebesar = Rp " + tb
            +"\n\n=============================================================\n"
            +"\nJumlah Uang Untuk Pembayaran = Rp " + ju
            +"\nKembalian                                           = Rp "+ kembalian
            +"\n\n========>+'*'+<======== Thanks YOU ========>+'*'+<========");
            }
        }
        if (minuman == 2){
            if (jb>=5){
            int tb = jb*FloridinaOrange350ml;
            diskon = tb*10/100;
            hasil = tb-diskon;
            nb = "Floridina orange 350 ml";
            JOptionPane.showMessageDialog(null,"Selamat Anda Mendapat diskon 10% setiap pembelian lebih dari 5 barang ");
            JOptionPane.showMessageDialog(null, "Anda mendapat Potongan Harga Sebesar Rp. "+ diskon);
            JOptionPane.showMessageDialog(null, "Jadi Total Harga yang Harus Anda Bayar Sebersar Rp. " + (tb-diskon));
            int ju = Integer.parseInt(JOptionPane.showInputDialog("jumlah uang"));
            int kembalian = ju-hasil;
            JOptionPane.showMessageDialog(null,
             "========>'+'<======== Detail pembelian ========>'+'<========\n"
            +"\nNama Barang Yang Ingin Di Beli    = "+nb
            +"\nHarga Barang                                     = Rp "+FloridinaOrange350ml
            +"\nJumlah Barang                                  = " +jb
            +"\nTotal Harga Awal Yang Harus Di Bayar Sebesar = Rp " + tb
            +"\n\n=============================================================\n"
            +"\nTotal Akhir Harga yang Harus Anda Bayar Sebesar = Rp. " +hasil
            +"\n\n=============================================================\n"
            +"\nJumlah Uang Untuk Pembayaran = Rp " + ju
            +"\nKembalian                                           = Rp "+ kembalian
            +"\n\n========>+'*'+<======== Thanks YOU ========>+'*'+<========");
        }
            else{
             int tb=jb*FloridinaOrange350ml;
             nb = "Floridina orange 350 ml";
             JOptionPane.showMessageDialog(null, "Jadi Total Harga yang Harus Anda Bayar Sebersar Rp. " + tb);
             int ju = Integer.parseInt(JOptionPane.showInputDialog("jumlah uang"));
             int kembalian = ju-tb;
             JOptionPane.showMessageDialog(null,
             "========>'+'<======== Detail pembelian ========>'+'<========\n"
            +"\nNama Barang Yang Ingin Di Beli    = "+nb
            +"\nHarga Barang                                     = Rp "+FloridinaOrange350ml
            +"\nJumlah Barang                                  = " +jb
            +"\n\n=============================================================\n"
            +"\nTotal Harga Awal Yang Harus Di Bayar Sebesar = Rp " + tb
            +"\n\n=============================================================\n"
            +"\nJumlah Uang Untuk Pembayaran = Rp " + ju
            +"\nKembalian                                           = Rp "+ kembalian
            +"\n\n========>+'*'+<======== Thanks YOU ========>+'*'+<========");
            }
        }
        if (minuman == 3){
            if (jb>=5){
            int tb = jb*Tehjavana350ml;
            diskon = tb*10/100;
            hasil = tb-diskon;
            nb = "Teh Javana 350 ml";
            JOptionPane.showMessageDialog(null,"Selamat Anda Mendapat diskon 10% setiap pembelian lebih dari 5 barang ");
            JOptionPane.showMessageDialog(null, "Anda mendapat Potongan Harga Sebesar Rp. "+ diskon);
            JOptionPane.showMessageDialog(null, "Jadi Total Harga yang Harus Anda Bayar Sebersar Rp. " + (tb-diskon));
            int ju = Integer.parseInt(JOptionPane.showInputDialog("jumlah uang"));
            int kembalian = ju-hasil;
            JOptionPane.showMessageDialog(null,
             "========>'+'<======== Detail pembelian ========>'+'<========\n"
            +"\nNama Barang Yang Ingin Di Beli    = "+nb
            +"\nHarga Barang                                     = Rp "+Tehjavana350ml
            +"\nJumlah Barang                                  = " +jb
            +"\nTotal Harga Awal Yang Harus Di Bayar Sebesar = Rp " + tb
            +"\n\n=============================================================\n"
            +"\nTotal Akhir Harga yang Harus Anda Bayar Sebesar = Rp. " +hasil
            +"\n\n=============================================================\n"
            +"\nJumlah Uang Untuk Pembayaran = Rp " + ju
            +"\nKembalian                                           = Rp "+ kembalian
            +"\n\n========>+'*'+<======== Thanks YOU ========>+'*'+<========");
        }
            else{
             int tb=jb*Tehjavana350ml;
             nb = "Teh Javana 350 ml";
             JOptionPane.showMessageDialog(null, "Jadi Total Harga yang Harus Anda Bayar Sebersar Rp. " + tb);
             int ju = Integer.parseInt(JOptionPane.showInputDialog("jumlah uang"));
             int kembalian = ju-tb;
             JOptionPane.showMessageDialog(null,
             "========>'+'<======== Detail pembelian ========>'+'<========\n"
            +"\nNama Barang Yang Ingin Di Beli    = "+nb
            +"\nHarga Barang                                     = Rp "+Tehjavana350ml
            +"\nJumlah Barang                                  = " +jb
            +"\n\n=============================================================\n"
            +"\nTotal Harga Awal Yang Harus Di Bayar Sebesar = Rp " + tb
            +"\n\n=============================================================\n"
            +"\nJumlah Uang Untuk Pembayaran = Rp " + ju
            +"\nKembalian                                           = Rp "+ kembalian
            +"\n\n========>+'*'+<======== Thanks YOU ========>+'*'+<========");
            }
        }
        if (minuman == 4){
            if (jb>=5){
            int tb = jb*ISOPLUS350ml;
            diskon = tb*10/100;
            hasil = tb-diskon;
            nb = "ISOPLUS 350 ml";
            JOptionPane.showMessageDialog(null,"Selamat Anda Mendapat diskon 10% setiap pembelian lebih dari 5 barang ");
            JOptionPane.showMessageDialog(null, "Anda mendapat Potongan Harga Sebesar Rp. "+ diskon);
            JOptionPane.showMessageDialog(null, "Jadi Total Harga yang Harus Anda Bayar Sebersar Rp. " + (tb-diskon));
            int ju = Integer.parseInt(JOptionPane.showInputDialog("jumlah uang"));
            int kembalian = ju-hasil;
            JOptionPane.showMessageDialog(null,
             "========>'+'<======== Detail pembelian ========>'+'<========\n"
            +"\nNama Barang Yang Ingin Di Beli    = "+nb
            +"\nHarga Barang                                     = Rp "+ISOPLUS350ml
            +"\nJumlah Barang                                  = " +jb
            +"\nTotal Harga Awal Yang Harus Di Bayar Sebesar = Rp " + tb
            +"\n\n=============================================================\n"
            +"\nTotal Akhir Harga yang Harus Anda Bayar Sebesar = Rp. " +hasil
            +"\n\n=============================================================\n"
            +"\nJumlah Uang Untuk Pembayaran = Rp " + ju
            +"\nKembalian                                           = Rp "+ kembalian
            +"\n\n========>+'*'+<======== Thanks YOU ========>+'*'+<========");
        }
            else{
             int tb=jb*ISOPLUS350ml;
             nb = "ISOPLUS 350 ml";
             JOptionPane.showMessageDialog(null, "Jadi Total Harga yang Harus Anda Bayar Sebersar Rp. " + tb);
             int ju = Integer.parseInt(JOptionPane.showInputDialog("jumlah uang"));
             int kembalian = ju-tb;
             JOptionPane.showMessageDialog(null,
             "========>'+'<======== Detail pembelian ========>'+'<========\n"
            +"\nNama Barang Yang Ingin Di Beli    = "+nb
            +"\nHarga Barang                                     = Rp "+ISOPLUS350ml
            +"\nJumlah Barang                                  = " +jb
            +"\n\n=============================================================\n"
            +"\nTotal Harga Awal Yang Harus Di Bayar Sebesar = Rp " + tb
            +"\n\n=============================================================\n"
            +"\nJumlah Uang Untuk Pembayaran = Rp " + ju
            +"\nKembalian                                           = Rp "+ kembalian
            +"\n\n========>+'*'+<======== Thanks YOU ========>+'*'+<========");
            }
        }
            break;
            case 2 :
        int duakelinci200gr=19000;
        int tanggo130gr=7000;
        int fullo80gr=6500;
        int romamalkistabon=6000;
        
        int cemilan = Integer.parseInt(JOptionPane.showInputDialog
        ("*================================*|selamat membeli|*================================*\n"
        + "Daftar Produk Minuman yang Dijual\n"
        + "  1. Kacang garing Dua Kelinci 200 gr = Rp.19.000,00\n"
        + "  2. Long Wafer Tanggo Chocolate 130 gr = Rp.7.000,00\n"
        + "  3. FULLO Unicorn Sweet lemon 80 gr = Rp.6.500,00\n"
        + "  4. ROMA Malkist Abon 135g = Rp.6.000,00\n\n"
        + "*================================*|<---MTR-MARKET--->|*================================*\n","Pilih : "));
         int jb1 = Integer.parseInt(JOptionPane.showInputDialog("jumlah barang"));
        if (cemilan == 1){
            if (jb1>=5){
            int tb = jb1*duakelinci200gr;
            diskon = tb*10/100;
            hasil = tb-diskon;
            nb = "Kacang garing Dua Kelinci 200 gr";
            JOptionPane.showMessageDialog(null,"Selamat Anda Mendapat diskon 10% setiap pembelian lebih dari 5 barang ");
            JOptionPane.showMessageDialog(null, "Anda mendapat Potongan Harga Sebesar Rp. "+ diskon);
            JOptionPane.showMessageDialog(null, "Jadi Total Harga yang Harus Anda Bayar Sebersar Rp. " + (tb-diskon));
            int ju = Integer.parseInt(JOptionPane.showInputDialog("jumlah uang"));
            int kembalian = ju-hasil;
            JOptionPane.showMessageDialog(null,
             "========>'+'<======== Detail pembelian ========>'+'<========\n"
            +"\nNama Barang Yang Ingin Di Beli    = "+nb
            +"\nHarga Barang                                     = Rp "+duakelinci200gr
            +"\nJumlah Barang                                  = " +jb1
            +"\nTotal Harga Awal Yang Harus Di Bayar Sebesar = Rp " + tb
            +"\n\n=============================================================\n"
            +"\nTotal Akhir Harga yang Harus Anda Bayar Sebesar = Rp. " +hasil
            +"\n\n=============================================================\n"
            +"\nJumlah Uang Untuk Pembayaran = Rp " + ju
            +"\nKembalian                                           = Rp "+ kembalian
            +"\n\n========>+'*'+<======== Thanks YOU ========>+'*'+<========");
        }
            else{
             int tb=jb1*duakelinci200gr;
             nb = "Kacang garing Dua Kelinci 200 gr";
             JOptionPane.showMessageDialog(null, "Jadi Total Harga yang Harus Anda Bayar Sebersar Rp. " + tb);
             int ju = Integer.parseInt(JOptionPane.showInputDialog("jumlah uang"));
             int kembalian = ju-tb;
             JOptionPane.showMessageDialog(null,
             "========>'+'<======== Detail pembelian ========>'+'<========\n"
            +"\nNama Barang Yang Ingin Di Beli    = "+nb
            +"\nHarga Barang                                     = Rp "+duakelinci200gr
            +"\nJumlah Barang                                  = " +jb1
            +"\n\n=============================================================\n"
            +"\nTotal Harga Awal Yang Harus Di Bayar Sebesar = Rp " + tb
            +"\n\n=============================================================\n"
            +"\nJumlah Uang Untuk Pembayaran = Rp " + ju
            +"\nKembalian                                           = Rp "+ kembalian
            +"\n\n========>+'*'+<======== Thanks YOU ========>+'*'+<========");
            }
        }
        if (cemilan == 2){
            if (jb1>=5){
            int tb = jb1*tanggo130gr;
            diskon = tb*10/100;
            hasil = tb-diskon;
            nb = "Long Wafer Tanggo Chocolate 130 gr";
            JOptionPane.showMessageDialog(null,"Selamat Anda Mendapat diskon 10% setiap pembelian lebih dari 5 barang ");
            JOptionPane.showMessageDialog(null, "Anda mendapat Potongan Harga Sebesar Rp. "+ diskon);
            JOptionPane.showMessageDialog(null, "Jadi Total Harga yang Harus Anda Bayar Sebersar Rp. " + (tb-diskon));
            int ju = Integer.parseInt(JOptionPane.showInputDialog("jumlah uang"));
            int kembalian = ju-hasil;
            JOptionPane.showMessageDialog(null,
             "========>'+'<======== Detail pembelian ========>'+'<========\n"
            +"\nNama Barang Yang Ingin Di Beli    = "+nb
            +"\nHarga Barang                                     = Rp "+tanggo130gr
            +"\nJumlah Barang                                  = " +jb1
            +"\nTotal Harga Awal Yang Harus Di Bayar Sebesar = Rp " + tb
            +"\n\n=============================================================\n"
            +"\nTotal Akhir Harga yang Harus Anda Bayar Sebesar = Rp. " +hasil
            +"\n\n=============================================================\n"
            +"\nJumlah Uang Untuk Pembayaran = Rp " + ju
            +"\nKembalian                                           = Rp "+ kembalian
            +"\n\n========>+'*'+<======== Thanks YOU ========>+'*'+<========");
        }
            else{
             int tb=jb1*tanggo130gr;
             nb = "Long Wafer Tanggo Chocolate 130 gr";
             JOptionPane.showMessageDialog(null, "Jadi Total Harga yang Harus Anda Bayar Sebersar Rp. " + tb);
             int ju = Integer.parseInt(JOptionPane.showInputDialog("jumlah uang"));
             int kembalian = ju-tb;
             JOptionPane.showMessageDialog(null,
             "========>'+'<======== Detail pembelian ========>'+'<========\n"
            +"\nNama Barang Yang Ingin Di Beli    = "+nb
            +"\nHarga Barang                                     = Rp "+tanggo130gr
            +"\nJumlah Barang                                  = " +jb1
            +"\n\n=============================================================\n"
            +"\nTotal Harga Awal Yang Harus Di Bayar Sebesar = Rp " + tb
            +"\n\n=============================================================\n"
            +"\nJumlah Uang Untuk Pembayaran = Rp " + ju
            +"\nKembalian                                           = Rp "+ kembalian
            +"\n\n========>+'*'+<======== Thanks YOU ========>+'*'+<========");
            }
        }
        if (cemilan == 3){
            if (jb1>=5){
            int tb = jb1*fullo80gr;
            diskon = tb*10/100;
            hasil = tb-diskon;
            nb = "FULLO Unicorn Sweet lemon 80 gr";
            JOptionPane.showMessageDialog(null,"Selamat Anda Mendapat diskon 10% setiap pembelian lebih dari 5 barang ");
            JOptionPane.showMessageDialog(null, "Anda mendapat Potongan Harga Sebesar Rp. "+ diskon);
            JOptionPane.showMessageDialog(null, "Jadi Total Harga yang Harus Anda Bayar Sebersar Rp. " + (tb-diskon));
            int ju = Integer.parseInt(JOptionPane.showInputDialog("jumlah uang"));
            int kembalian = ju-hasil;
            JOptionPane.showMessageDialog(null,
             "========>'+'<======== Detail pembelian ========>'+'<========\n"
            +"\nNama Barang Yang Ingin Di Beli    = "+nb
            +"\nHarga Barang                                     = Rp "+fullo80gr
            +"\nJumlah Barang                                  = " +jb1
            +"\nTotal Harga Awal Yang Harus Di Bayar Sebesar = Rp " + tb
            +"\n\n=============================================================\n"
            +"\nTotal Akhir Harga yang Harus Anda Bayar Sebesar = Rp. " +hasil
            +"\n\n=============================================================\n"
            +"\nJumlah Uang Untuk Pembayaran = Rp " + ju
            +"\nKembalian                                           = Rp "+ kembalian
            +"\n\n========>+'*'+<======== Thanks YOU ========>+'*'+<========");
        }
            else{
             int tb=jb1*fullo80gr;
             nb = "FULLO Unicorn Sweet lemon 80 gr";
             JOptionPane.showMessageDialog(null, "Jadi Total Harga yang Harus Anda Bayar Sebersar Rp. " + tb);
             int ju = Integer.parseInt(JOptionPane.showInputDialog("jumlah uang"));
             int kembalian = ju-tb;
             JOptionPane.showMessageDialog(null,
             "========>'+'<======== Detail pembelian ========>'+'<========\n"
            +"\nNama Barang Yang Ingin Di Beli    = "+nb
            +"\nHarga Barang                                     = Rp "+fullo80gr
            +"\nJumlah Barang                                  = " +jb1
            +"\n\n=============================================================\n"
            +"\nTotal Harga Awal Yang Harus Di Bayar Sebesar = Rp " + tb
            +"\n\n=============================================================\n"
            +"\nJumlah Uang Untuk Pembayaran = Rp " + ju
            +"\nKembalian                                           = Rp "+ kembalian
            +"\n\n========>+'*'+<======== Thanks YOU ========>+'*'+<========");
            }
        }
        if (cemilan == 4){
            if (jb1>=5){
            int tb = jb1*romamalkistabon;
            diskon = tb*10/100;
            hasil = tb-diskon;
            nb = "ROMA Malkist Abon 135g";
            JOptionPane.showMessageDialog(null,"Selamat Anda Mendapat diskon 10% setiap pembelian lebih dari 5 barang ");
            JOptionPane.showMessageDialog(null, "Anda mendapat Potongan Harga Sebesar Rp. "+ diskon);
            JOptionPane.showMessageDialog(null, "Jadi Total Harga yang Harus Anda Bayar Sebersar Rp. " + (tb-diskon));
            int ju = Integer.parseInt(JOptionPane.showInputDialog("jumlah uang"));
            int kembalian = ju-hasil;
            JOptionPane.showMessageDialog(null,
             "========>'+'<======== Detail pembelian ========>'+'<========\n"
            +"\nNama Barang Yang Ingin Di Beli    = "+nb
            +"\nHarga Barang                                     = Rp "+romamalkistabon
            +"\nJumlah Barang                                  = " +jb1
            +"\nTotal Harga Awal Yang Harus Di Bayar Sebesar = Rp " + tb
            +"\n\n=============================================================\n"
            +"\nTotal Akhir Harga yang Harus Anda Bayar Sebesar = Rp. " +hasil
            +"\n\n=============================================================\n"
            +"\nJumlah Uang Untuk Pembayaran = Rp " + ju
            +"\nKembalian                                           = Rp "+ kembalian
            +"\n\n========>+'*'+<======== Thanks YOU ========>+'*'+<========");
        }
            else{
             int tb=jb1*romamalkistabon;
             nb = "ROMA Malkist Abon 135g";
             JOptionPane.showMessageDialog(null, "Jadi Total Harga yang Harus Anda Bayar Sebersar Rp. " + tb);
             int ju = Integer.parseInt(JOptionPane.showInputDialog("jumlah uang"));
             int kembalian = ju-tb;
             JOptionPane.showMessageDialog(null,
             "========>'+'<======== Detail pembelian ========>'+'<========\n"
            +"\nNama Barang Yang Ingin Di Beli    = "+nb
            +"\nHarga Barang                                     = Rp "+romamalkistabon
            +"\nJumlah Barang                                  = " +jb1
            +"\n\n=============================================================\n"
            +"\nTotal Harga Awal Yang Harus Di Bayar Sebesar = Rp " + tb
            +"\n\n=============================================================\n"
            +"\nJumlah Uang Untuk Pembayaran = Rp " + ju
            +"\nKembalian                                           = Rp "+ kembalian
            +"\n\n========>+'*'+<======== Thanks YOU ========>+'*'+<========");
            }
        }
        

        }
      
         
            konfirmasi = JOptionPane.showInputDialog("\n|====+*+====*====+*+====|KONFIRMASI|====+*+====*====+*+====|\n"
                    + "\nApakah Anda ingin keluar ?\nJawab = ya ( untuk untuk keluar dari pembelian ini)"
                    + "\nJawab = tidak (untuk membeli lagi)\n"
                    + "\n|====+*+====*====+*+====|MTR MARKET|====+*+====*====+*+====|\n");
          
            if( konfirmasi.equalsIgnoreCase("ya") ){
                running = false;
            }
            counter++;
           
        }
        JOptionPane.showMessageDialog(null, 
                      "|==========================>|x<===>x|<==========================|"
                  + "\n        >oooo>>||  Terima kasih atas Kunjungan Anda Di Toko kami  ||<oooo<"
                  + "\n|==========================>|x<===>x|<==========================|");
    }
    
}
