/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.menuDaak.HelperUser;

import javax.swing.*;

/**
 *
 * @author 1119002 Albertus Angkuw
 */
public class JPanelTable extends JPanel{
    JTable tabelContoh;
    JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
    public JPanelTable(){
        setLayout(null);
        tabelContoh = new javax.swing.JTable();
        tabelContoh.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {1, "101", "Algo", "A", "Teori", "Wajib"},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "No", "Kode MK", "Nama MK", "Kelas", "Jenis MK", "Sifat MK"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
            @Override
            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });



        jScrollPane1.setViewportView(tabelContoh);

        if (tabelContoh.getColumnModel().getColumnCount() > 0) {
            tabelContoh.getColumnModel().getColumn(0).setPreferredWidth(30);
            tabelContoh.getColumnModel().getColumn(1).setPreferredWidth(100);
            tabelContoh.getColumnModel().getColumn(2).setPreferredWidth(200);
            tabelContoh.getColumnModel().getColumn(3).setPreferredWidth(30);
            tabelContoh.getColumnModel().getColumn(4).setPreferredWidth(60);
            tabelContoh.getColumnModel().getColumn(5).setPreferredWidth(60);
        }
        jScrollPane1.setBounds(0, 0, 400, 300);
        add(jScrollPane1);
        
        //setBackground(Color.ORANGE);
    }
    
   
}
