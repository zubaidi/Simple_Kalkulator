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
public class kalkulatorSederhana2 extends JFrame implements ActionListener {
       
    //deklarasi objek konstruktor
    private JPanel panelNama, panelNama2;
    private JButton satu, dua, tiga, empat, lima, 
            enam, tujuh, delapan, sembilan, nol, 
            kali, bagi, tambah, kurang, clear, hitung, titik;
    private JLabel keterangan, nama;
    private JTextField hasil;
    
    String s1,s2,s3,s4,s5;
    double nilai, hasilPerhitungan;
    double hasilPerhitunganKoma;
    
    public kalkulatorSederhana2() {
        
        setTitle("kalkulator Sederhana");
        setSize(280,445);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);     
        setResizable(false);
        
        panelNama = new JPanel();
        panelNama.setBackground(Color.red);
        panelNama.setBounds(0, 0, 280, 30);
        keterangan = new JLabel("Kalkulator Sederhana");
        keterangan.setFont(new Font("Comic Sans MS",Font.BOLD,12));
        panelNama.add(keterangan);
        add(panelNama);
        panelNama2 = new JPanel();
        panelNama2.setBackground(Color.red);
        panelNama2.setBounds(0, 390, 280, 30);
        nama = new JLabel("Kalkulator Sederhana 2");
        nama.setFont(new Font("Comic Sans MS",Font.BOLD,12));
        panelNama2.add(nama);
        add(panelNama2);
        
        hasil = new JTextField(10);
        hasil.setBackground(Color.YELLOW);
        hasil.setBounds(20, 40, 230, 40);
        hasil.setHorizontalAlignment(JTextField.RIGHT);
        hasil.setEditable(false);
        add(hasil);
        
        //pengaturan button
        tujuh = new JButton("7");
        tujuh.setBounds(20,90, 50, 50);
        tujuh.addActionListener(this);
        add(tujuh);
        
        delapan = new JButton("8");
        delapan.setBounds(80, 90, 50, 50);
        delapan.addActionListener(this);
        add(delapan);
        
        sembilan = new JButton("9");
        sembilan.setBounds(140, 90, 50, 50);
        sembilan.addActionListener(this);
        add(sembilan);
        
        bagi = new JButton("/");
        bagi.setBounds(200, 90, 50, 50);
        bagi.addActionListener(this);
        add(bagi);
        
        empat = new JButton("4");
        empat.setBounds(20,150, 50, 50);
        empat.addActionListener(this);
        add(empat);
        
        lima = new JButton("5");
        lima.setBounds(80, 150, 50, 50);
        lima.addActionListener(this);
        add(lima);
        
        enam = new JButton("6");
        enam.setBounds(140, 150, 50, 50);
        enam.addActionListener(this);
        add(enam);
        
        kali = new JButton("*");
        kali.setBounds(200, 150, 50, 50);
        kali.addActionListener(this);
        add(kali);
        
        satu = new JButton("1");
        satu.setBounds(20, 210, 50, 50);
        satu.addActionListener(this);
        add(satu);
        
        dua = new JButton("2");
        dua.setBounds(80, 210, 50, 50);
        dua.addActionListener(this);
        add(dua);
        
        tiga = new JButton("3");
        tiga.setBounds(140, 210, 50, 50);
        tiga.addActionListener(this);
        add(tiga);
        
        kurang = new JButton("-");
        kurang.setBounds(200, 210, 50, 50);
        kurang.addActionListener(this);
        add(kurang);
        
        titik = new JButton(".");
        titik.setBounds(20, 270, 50, 50);
        titik.addActionListener(this);
        add(titik);
        
        nol = new JButton("0");
        nol.setBounds(80, 270, 50, 50);
        nol.addActionListener(this);
        add(nol);
        
        clear = new JButton("C");
        clear.setBounds(140, 270, 50, 50);
        clear.addActionListener(this);
        add(clear);
        
        tambah = new JButton("+");
        tambah.setBounds(200, 270, 50, 50);
        tambah.addActionListener(this);
        add(tambah);
        
        hitung = new JButton("=");
        hitung.setBounds(20, 330, 230, 50);
        hitung.addActionListener(this);
        add(hitung);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == nol){
            s3 = hasil.getText();
            s4 = "0";
            s5 = s3+s4;
            hasil.setText(s5);
        }
        if(e.getSource() == satu){
            s3 = hasil.getText();
            s4 = "1";
            s5 = s3+s4;
            hasil.setText(s5);
        }
        if(e.getSource() == dua){
            s3 = hasil.getText();
            s4 = "2";
            s5 = s3+s4;
            hasil.setText(s5);
        }
        if(e.getSource() == tiga){
            s3 = hasil.getText();
            s4 = "3";
            s5 = s3+s4;
            hasil.setText(s5);
        }
        if(e.getSource() == empat){
            s3 = hasil.getText();
            s4 = "4";
            s5 = s3+s4;
            hasil.setText(s5);
        }
        if(e.getSource() == lima){
            s3 = hasil.getText();
            s4 = "5";
            s5 = s3+s4;
            hasil.setText(s5);
        }
        if(e.getSource() == enam){
            s3 = hasil.getText();
            s4 = "6";
            s5 = s3+s4;
            hasil.setText(s5);
        }
        if(e.getSource() == tujuh){
            s3 = hasil.getText();
            s4 = "7";
            s5 = s3+s4;
            hasil.setText(s5);
        }
        if(e.getSource() == delapan){
            s3 = hasil.getText();
            s4 = "8";
            s5 = s3+s4;
            hasil.setText(s5);
        }
        if(e.getSource() == sembilan){
            s3 = hasil.getText();
            s4 = "9";
            s5 = s3+s4;
            hasil.setText(s5);
        }
        if(e.getSource() == titik){
            s3 = hasil.getText();
            s4 = ".";
            s5 = s3+s4;
            hasil.setText(s5);
        }
        if(e.getSource() == tambah){
            s1 = hasil.getText();
            hasil.setText("");
            nilai = 1;
        }
        if(e.getSource() == kurang){
            s1 = hasil.getText();
            hasil.setText("");
            nilai = 2;
        }
        if(e.getSource() == kali){
            s1 = hasil.getText();
            hasil.setText("");
            nilai = 3;
        }
        if(e.getSource() == bagi){
            s1 = hasil.getText();
            hasil.setText("");
            nilai = 4;
        }
        if(e.getSource() == hitung){
            s2 = hasil.getText();
            if(nilai == 1){
                hasilPerhitungan = Double.parseDouble(s1) + Double.parseDouble(s2);
                hasil.setText(String.valueOf(hasilPerhitungan));
            }else if(nilai == 2){
                hasilPerhitungan = Double.parseDouble(s1) - Double.parseDouble(s2);
                hasil.setText(String.valueOf(hasilPerhitungan));
            }else if(nilai == 3){
                hasilPerhitungan = Double.parseDouble(s1) * Double.parseDouble(s2);
                hasil.setText(String.valueOf(hasilPerhitungan));
            }else {
                hasilPerhitunganKoma = Double.parseDouble(s1) / Double.parseDouble(s2);
                hasil.setText(String.valueOf(hasilPerhitunganKoma));
            }
        }
        if(e.getSource() == clear){
            hasil.setText(null);
        }
        
    }
    
    public static void main(String[] args) {
        kalkulatorSederhana2 kalkulator = new kalkulatorSederhana2();
        kalkulator.setVisible(true);
    }
    
}
