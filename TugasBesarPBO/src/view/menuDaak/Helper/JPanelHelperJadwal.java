/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.menuDaak.Helper;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerListModel;
import model.matakuliah.Roster;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;
import view.ViewConfig;
import static view.ViewConfig.BGCOLOR_DEFAULT;
import static view.ViewConfig.COLOR_WHITE;
import static view.ViewConfig.FONT_DEFAULT_PLAIN;

/**
 *
 * @author S W I F T 3
 */
public class JPanelHelperJadwal extends JPanel implements ActionListener, ViewConfig  {
    private  JLabel labelTanggal;
    private  JLabel labelJamMulai;
    private  JLabel labelJamSelesai;
    private  JLabel labelRuangan;
    
       
    private UtilDateModel modelTglLahir;
    private JDatePanelImpl datePanelTglLahir;
    private Properties  propertiesTglLahir;   
        
    private JDatePickerImpl fieldTanggal;
    private JSpinner fieldJamMulai;
    private String listJam[] = {"01:00:00","01:30:00","02:00:00","02:30:00","03:00:00","03:30:00","04:00:00","04:30:00","05:00:00","05:30:00","06:00:00","06:30:00","07:00:00","07:30:00","08:00:00","08:30:00","09:00:00","09:30:00","10:00:00" ,"10:30:00" ,"11:00:00" ,"11:30:00" ,"12:00:00" ,"12:30:00" ,"13:00:00" ,"13:30:00" ,"14:00:00" ,"14:30:00" ,"15:00:00" ,"15:30:00" ,"16:00:00" ,"16:30:00" ,"17:00:00" ,"17:30:00" ,"18:00:00" ,"18:30:00" ,"19:00:00" ,"19:30:00" ,"20:00:00" ,"20:30:00" ,"21:00:00" ,"21:30:00" ,"22:00:00" ,"22:30:00" ,"23:00:00" ,"23:30:00" ,"24:00:00" ,"24:30:00"};
    //private String listJam[] = {"","1.00", "1.30", "2.00", "2.30", "3.00", "3.30", "4.00", "4.30", "5.00", "5.30", "6.00", "6.30", "7.00", "7.30", "8.00", "8.30", "9.00", "9.30", "10.00", "10.30", "11.00", "11.30", "12.00", "12.30", "13.00", "13.30", "14.00", "14.30", "15.00", "15.30", "16.00", "16.30", "17.00", "17.30", "18.00", "18.30", "19.00", "19.30", "20.00", "20.30", "21.00", "21.30", "22.00", "22.30", "23.00", "23.30", "24.00", "24.30"};
    private JSpinner fieldJamSelesai;
    private JTextField fieldRuangan;
    
    private JButton Save;
    private JButton Delete;
    
    private String ID_Roster;
    public JPanelHelperJadwal(String type,String ID_Roster){
        this(type);
        this.ID_Roster = ID_Roster;
    }
    public JPanelHelperJadwal(String type){
        setLayout(null);
       
        Save = new JButton("Simpan");
        Save.setBounds(370,445, 100, 30);
        Save.setContentAreaFilled(true);
        Save.setBackground(BGCOLOR_DEFAULT);
        Save.setForeground(COLOR_WHITE);
        Save.setBorder(javax.swing.BorderFactory.createLineBorder(BGCOLOR_DEFAULT));
        Save.setFocusPainted(false);
        Save.setFont(FONT_DEFAULT_PLAIN);
        Save.addActionListener(this);
        Save.setVisible(false);
        add(Save);
        
        Delete = new JButton("Hapus");
        Delete.setBounds(370,445, 100, 30);
        Delete.setContentAreaFilled(true);
        Delete.setBackground(BGCOLOR_DEFAULT);
        Delete.setForeground(COLOR_WHITE);
        Delete.setBorder(javax.swing.BorderFactory.createLineBorder(BGCOLOR_DEFAULT));
        Delete.setFocusPainted(false);
        Delete.setFont(FONT_DEFAULT_PLAIN);
        Delete.addActionListener(this);
        Delete.setVisible(false);
        add(Delete);
        
        if(type.equals("Input")){
            generateInputForm();
            Delete.setVisible(false);
            Save.setVisible(true);
        }else if(type.equals("Delete")){
            generateShowForm();
            Delete.setVisible(true);
            Save.setVisible(false);
        }else if(type.equals("Edit")){
            generateEditForm();
            Delete.setVisible(false);
            Save.setVisible(true);
        }
    }
    
    private void generateLabel(){
        
        
        labelTanggal = new JLabel("Tanggal :");
        labelTanggal.setBounds(0,5, 120, 30);
        labelTanggal.setFont(FONT_DEFAULT_PLAIN );
        add(labelTanggal);
        
        labelJamMulai = new JLabel("Jam Mulai :");
        labelJamMulai.setBounds(0,45, 120, 30);
        labelJamMulai.setFont(FONT_DEFAULT_PLAIN );
        add(labelJamMulai);
        
        labelJamSelesai = new JLabel("Jam Selesai :");
        labelJamSelesai.setBounds(0,85, 120, 30);
        labelJamSelesai.setFont(FONT_DEFAULT_PLAIN);
        add(labelJamSelesai);
        
        labelRuangan = new JLabel("Ruangan :");
        labelRuangan.setBounds(0,125, 120, 30);
        labelRuangan.setFont(FONT_DEFAULT_PLAIN);
        add(labelRuangan);
        
    }
    
    private void generateInputForm(){
        
        generateLabel();
        
        propertiesTglLahir = new Properties();
        propertiesTglLahir.put("text.today", "Today");
        propertiesTglLahir.put("text.month", "Month");
        propertiesTglLahir.put("text.year", "Year");
        modelTglLahir = new UtilDateModel();
        datePanelTglLahir = new JDatePanelImpl(modelTglLahir, propertiesTglLahir);
        fieldTanggal = new JDatePickerImpl(datePanelTglLahir, new DateLabelFormatter());
        fieldTanggal.setBounds(140,5, 200, 30);
        fieldTanggal.setFont(FONT_DEFAULT_PLAIN);
        add(fieldTanggal);
        
        fieldJamMulai = new JSpinner(new SpinnerListModel(listJam));
        fieldJamMulai.setBounds(140,45, 200, 30);
        fieldJamMulai.setFont(FONT_DEFAULT_PLAIN);
        add(fieldJamMulai);
        
        fieldJamSelesai = new JSpinner(new SpinnerListModel(listJam));
        fieldJamSelesai.setBounds(140,85, 200, 30);
        fieldJamSelesai.setFont(FONT_DEFAULT_PLAIN);
        add(fieldJamSelesai);
        
        fieldRuangan = new JTextField();
        fieldRuangan.setBounds(140,125, 200, 30);
        fieldRuangan.setFont(FONT_DEFAULT_PLAIN);
        add(fieldRuangan);
        
    }
    
    private void generateEditForm(){
    
        generateInputForm();
        modelTglLahir.setSelected(true);
        modelTglLahir.setDate(2020, 9, 17);
        fieldJamMulai.setValue(listJam[9]);
        fieldJamSelesai.setValue(listJam[12]);
        fieldRuangan.setText("ABC");
    }
    
    private void generateShowForm(){
        
        generateEditForm();
        fieldTanggal.setEnabled(false);
        fieldTanggal.getComponent(1).setEnabled(false);
        fieldJamMulai.setEnabled(false); 
        fieldJamSelesai.setEnabled(false);
        fieldRuangan.setEditable(false);
            
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        System.out.println("Action Panel Helper Matakuliah : " + action);
        if(action.equals("Simpan")){
            System.out.println("Hasil : ");
            String tanggal = fieldTanggal.getModel().getValue().toString();
            String jamMulai = (String) fieldJamMulai.getValue();
            String jamSelesai = (String) fieldJamSelesai.getValue();
            String ruangan = fieldRuangan.getText();
            
            Roster roster = new Roster(tanggal,jamMulai,jamSelesai,ruangan,false);
            System.out.println(roster.toString());
            //Tambahakn ke controller database
        }else if(action.equals("Hapus")){
            System.out.println("Masuk Hapus ke database");
            //Hapus ke controller database
        }
        
        
    }
       
}
