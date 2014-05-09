/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Dj_Ubet
 */
public class kalkulatorSederhana extends JFrame implements ActionListener{
    
    //deklarasi variabel
    private JLabel labelNilai1, labalNilai2, perhitungan, hasilAkhir, nama;
    private JTextField nilai1, nilai2, hasil;
    private JComboBox comboPerhitungan;
    private JButton hitung, clear;
    private JPanel panelNama;

    public kalkulatorSederhana(){
        
        setDesign();
        
        //pengaturan frame
        setTitle("kalkulator Sederhana");
        setSize(320,345);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);     
        setResizable(false);
        
        nilai1 = new JTextField(null);
        labelNilai1 = new JLabel("Masukkan Angka Pertama");
        labelNilai1.setBounds(10, 10, 150, 30);
        nilai1.setBounds(10, 40, 200, 30);
        nilai1.setHorizontalAlignment(JTextField.RIGHT);
        add(nilai1);
        add(labelNilai1);
        
        nilai2 = new JTextField(null);
        labalNilai2 = new JLabel("Masukkan Angka Kedua");
        labalNilai2.setBounds(10, 80, 150, 30);
        nilai2.setBounds(10, 110, 200, 30);
        nilai2.setHorizontalAlignment(JTextField.RIGHT);
        add(nilai2);
        add(labalNilai2);
        
        perhitungan = new JLabel("Pilih Perhitungan");
        comboPerhitungan = new JComboBox();
        comboPerhitungan.addItem("Pilih Perhitungan");
        comboPerhitungan.addItem(" * (Perkalian)");
        comboPerhitungan.addItem(" : (Pembagian)");
        comboPerhitungan.addItem(" + (Penjumlahan)");
        comboPerhitungan.addItem(" - (Pengurangan)");
        comboPerhitungan.addItem(" ^ (Perpangkat)");
        perhitungan.setBounds(10, 150, 150, 30);
        comboPerhitungan.setBounds(10, 180, 200, 30);
        add(perhitungan);
        add(comboPerhitungan);
        
        //hasil perhitungan
        hasilAkhir = new JLabel("Hasil:");
        hasilAkhir.setBounds(10, 230, 50, 30);
        add(hasilAkhir);
        hasil = new JTextField();
        hasil.setBounds(50, 230, 160, 30);
        hasil.setEnabled(false);
        hasil.setHorizontalAlignment(JTextField.RIGHT);
        hasil.setFont(new Font("Times New Roman", Font.BOLD, 12));
        add(hasil);      
        
        hitung = new JButton("Hitung");
        hitung.setBounds(220, 180, 80, 30);
        hitung.addActionListener(this);
        add(hitung);
        
        clear = new JButton("C");
        clear.setBounds(220, 230, 80, 30);
        clear.addActionListener(this);
        add(clear);
        
        //pengaturan panel nama
        panelNama = new JPanel();
        panelNama.setBackground(Color.red);
        panelNama.setBounds(0, 280, 320, 40);
        nama = new JLabel("Kalkulator Sederhana", JLabel.CENTER);
        nama.setFont(new Font("Comic Sans MS",Font.BOLD,12));
        panelNama.add(nama);
        add(panelNama);
    }
        
    public static void main(String[] args) {
        kalkulatorSederhana s = new kalkulatorSederhana();
        s.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double nilaiHitung1 = Double.parseDouble(nilai1.getText());
        double nilaiHitung2 = Double.parseDouble(nilai2.getText());
        double hasilHitung = 0;
        if(e.getSource() == hitung){
            if(comboPerhitungan.getSelectedIndex() == 1){
                hasilHitung = nilaiHitung1 * nilaiHitung2;
            }else if(comboPerhitungan.getSelectedIndex() == 2){
                hasilHitung = nilaiHitung1 / nilaiHitung2;
            }else if(comboPerhitungan.getSelectedIndex() == 3){
                hasilHitung = nilaiHitung1 + nilaiHitung2;
            }else if(comboPerhitungan.getSelectedIndex() == 4){
                hasilHitung = nilaiHitung1 - nilaiHitung2;
            }else if(comboPerhitungan.getSelectedIndex() == 5){
               hasilHitung = Math.pow(nilaiHitung1, nilaiHitung2);
            }else{
                hasilHitung = Math.sqrt(nilaiHitung1);
            }
            hasil.setText(Double.toString(hasilHitung));
        }else{
            nilai1.setText(null);
            nilai2.setText(null);
            comboPerhitungan.setSelectedIndex(0);
            hasil.setText(null);
        }     
    }
    
    public final void setDesign(){
        try{
            UIManager.setLookAndFeel(
                    "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        }catch(Exception e){}
    }
    
}
