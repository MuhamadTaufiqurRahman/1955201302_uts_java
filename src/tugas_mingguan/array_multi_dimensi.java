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
public class array_multi_dimensi {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        
        System.out.println("Array 1 Dimensi");
        int Angka[]= {0, 1, 2, 3, 4, 5, 6, 7, 8};
        
        for (int i = 0; i<Angka.length; i++) {
            
        System.out.println(Angka[i]);
        }
        
        System.out.println("Array 2 Dimensi");
        int Matriks[][]={{1,4},
                        {5,7}};
        
        for (int i = 0; i<Matriks.length; i++) {
            for (int j =0; j<Matriks[0].length; j++){
                System.out.print(Matriks[i][j]+" ");
                }
            System.out.println(" ");
        }
       
        System.out.println("Array 2 dimensi untuk String");
        String mahasiswa[][] = {{"01","Taufiqur"}, {"02","Rahman"}, {"03","Bila"}};
        
        for (int i = 0; i<mahasiswa.length; i++) {
            for (int j = 0; j<mahasiswa[0].length; j++) {
                System.out.print(mahasiswa[i][j]+ " ");
            }
            System.out.println(" ");
        }
        
        
        String cari = JOptionPane.showInputDialog(null, " Cari Mahasiswa berdasarkan NIM");
        for (int i = 0; i<mahasiswa.length; i++) {
            for (int j = 0; j<mahasiswa[0].length; j++) {
                if (mahasiswa[i][j].equals(cari)) {
                    JOptionPane.showMessageDialog(null, " Mahasiswa dengan NIM " + cari +"Ditemukan bernama " + mahasiswa[i][j+1]);
                }
                System.out.print(mahasiswa[i][j]+ " ");
            }
            System.out.println(" ");
        }
    
    }
    
}
