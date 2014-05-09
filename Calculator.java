/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author Dj_Ubet
 */
public class Calculator extends JFrame implements ActionListener{
    
    JPanel[] row = new JPanel[5];
    JButton[] tombol = new JButton[19];
    String[] nilaiTombol = {"7","8","9","+",
                            "4","5","6","-",
                            "1","2","3","*",
                            ".","/","C","√",
                            "+/-","=","0"};
    int[] dimW = {300,45,100,90};
    int[] dimH = {35,40};
    
    Dimension displayDimension = new Dimension(dimW[0],dimH[0]);
    Dimension regulerDimension = new Dimension(dimW[1],dimH[1]);
    Dimension rColumnDimension = new Dimension(dimW[2], dimH[1]);
    Dimension zeroButDimension = new Dimension(dimW[3],dimH[1]);
    boolean[] funtion = new boolean[4];
    double[] temp = {0,0};
    JTextArea display = new JTextArea(1,20);
    Font font = new Font("Times New Roman", Font.BOLD, 14);
    
    Calculator(){
        super("Kalkulator Sederhana");
        setDesign();
        setSize(380, 250);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        GridLayout gridLayout = new GridLayout(5, 5);
        setLayout(gridLayout);
        
        for(int i = 0; i<4; i++)
            funtion[i] = false;
            
        FlowLayout f1 = new FlowLayout(FlowLayout.CENTER);
        FlowLayout f2 = new FlowLayout(FlowLayout.CENTER, 1, 1);
        for(int i = 0; i<5; i++)
            row[i] = new JPanel();
        row[0].setLayout(f1);
        for(int i = 0; i<5; i++)
            row[i].setLayout(f2);
        
        for(int i=0;i<19;i++){
            tombol[i] = new JButton();
            tombol[i].setText(nilaiTombol[i]);
            tombol[i].setFont(font);
            tombol[i].addActionListener(this);
        }
        
        display.setFont(font);
        display.setEditable(false);
        display.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        display.setPreferredSize(displayDimension);
        for(int i=0; i<14; i++)
            tombol[i].setPreferredSize(regulerDimension);
        for(int i=14; i<18; i++)
            tombol[i].setPreferredSize(rColumnDimension);
        tombol[18].setPreferredSize(zeroButDimension);
        
        row[0].add(display);
        add(row[0]);
        
        for(int i=0; i<4; i++)
            row[1].add(tombol[i]);
        row[1].add(tombol[14]);
        add(row[1]);
        
        for(int i=4; i<8; i++)
            row[2].add(tombol[i]);
        row[2].add(tombol[15]);
        add(row[2]);
        
        for(int i=8; i<12; i++)
            row[3].add(tombol[i]);
        row[3].add(tombol[16]);
        add(row[3]);
        
        row[4].add(tombol[18]);
        for(int i=12; i<14; i++)
            row[4].add(tombol[i]);
        row[4].add(tombol[17]);
        add(row[4]);
        
        //setVisible(true);
        
    }
    
    public void clear(){
        try{
            display.setText("");
            for(int i = 0; i<4; i++)
                funtion[i] = false;
            for(int i = 0; i<2; i++)
                temp[i] = 0;
        }catch(NullPointerException e){
        }
    }
    
    public void getAkar(){
        try{
            double nilai = Math.sqrt(Double.parseDouble(display.getText()));
            display.setText(Double.toString(nilai));
        }catch(NumberFormatException e){
            System.out.println(e);
        }
    }
    
    public void getPosNeg(){
        try{
            double nilai = Double.parseDouble(display.getText());
            if(nilai != 0){
                nilai = nilai *(-1);
                display.setText(Double.toString(nilai));
            }else{}
        }catch(NumberFormatException e){
            System.out.println(e);
        }
    }
    
    public void getHasil(){
        double hasil = 0;
        temp[1] = Double.parseDouble(display.getText());
        String temp0 = Double.toString(temp[0]);
        String temp1 = Double.toString(temp[1]);
        try{
            if(temp0.contains("-")){
                String[] temp00 = temp0.split("-",2);
                temp[0] = (Double.parseDouble(temp00[1]));
            }
            if(temp1.contains("-")){
                String[] temp11 = temp0.split("-",2);
                temp[0] = (Double.parseDouble(temp11[1]));
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        try{
            if (funtion[2] == true) {
                hasil = temp[0] * temp[1];
            }else if(funtion[3] == true){
                hasil = temp[0] / temp[1];
            }else if(funtion[0] == true){
                hasil = temp[0] + temp[1];
            }else if(funtion[1] == true){
                hasil = temp[0] - temp[1];
            }
            display.setText(Double.toString(hasil));
            for(int i = 0; i<4; i++)
                funtion[i] = false;
        }catch(NumberFormatException e){
            System.out.println(e);
        }
    }

    public final void setDesign(){
        try{
            UIManager.setLookAndFeel(
                    "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        }catch(Exception e){}
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculator c = new Calculator();
        c.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == tombol[0]){
            display.append("7");
        }
        if(e.getSource() == tombol[1]){
            display.append("8");
        }
        if(e.getSource() == tombol[2]){
            display.append("9");
        }
        if(e.getSource() == tombol[3]){
            temp[0] = Double.parseDouble(display.getText());
            funtion[0] = true;
            display.setText("");
        }
        if(e.getSource() == tombol[4]){
            display.append("4");
        }
        if(e.getSource() == tombol[5]){
            display.append("5");
        }
        if(e.getSource() == tombol[6]){
            display.append("6");
        }
        if(e.getSource() == tombol[7]){
            temp[0] = Double.parseDouble(display.getText());
            funtion[1] = true;
            display.setText("");
        }
        if(e.getSource() == tombol[8]){
            display.append("1");
        }
        if(e.getSource() == tombol[9]){
            display.append("2");
        }
        if(e.getSource() == tombol[10]){
            display.append("3");
        }
        if(e.getSource() == tombol[11]){
            temp[0] = Double.parseDouble(display.getText());
            funtion[2] = true;
            display.setText("");
        }
        if(e.getSource() == tombol[12]){
            display.append(".");
        }
        if(e.getSource() == tombol[13]){
            temp[0] = Double.parseDouble(display.getText());
            funtion[3] = true;
            display.setText("");
        }
        if(e.getSource() == tombol[14]){
            clear();
        }
        if(e.getSource() == tombol[15]){
            getAkar();
        }
        if(e.getSource() == tombol[16]){
            getPosNeg();
        }
        if(e.getSource() == tombol[17]){
            getHasil();
        }
        if(e.getSource() == tombol[18]){
            display.append("0");
        }
    }
    
}
