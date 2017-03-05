package benas.myprojct.testdiennea;

import com.sun.javafx.util.Utils;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Finestra extends javax.swing.JFrame {
        
    public Finestra() throws IOException {

        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Lx = new javax.swing.JLabel();
        x = new javax.swing.JSpinner();
        Btest = new javax.swing.JButton();
        LImin = new javax.swing.JLabel();
        LImedio = new javax.swing.JLabel();
        LImax = new javax.swing.JLabel();
        TImin = new javax.swing.JTextField();
        TImedio = new javax.swing.JTextField();
        TImax = new javax.swing.JTextField();
        LInsert = new javax.swing.JLabel();
        LSelect = new javax.swing.JLabel();
        LSmin = new javax.swing.JLabel();
        TSmin = new javax.swing.JTextField();
        TSmedio = new javax.swing.JTextField();
        LSmedio = new javax.swing.JLabel();
        LSmax = new javax.swing.JLabel();
        TSmax = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Lx.setText("Numero di operazioni prima \"pre-commits\" :");
        Lx.setName("Loperazioni"); // NOI18N

        x.setModel(new javax.swing.SpinnerNumberModel(5, 0, 100, 1));
        x.setToolTipText("");
        x.setFocusable(false);
        x.setRequestFocusEnabled(false);

        Btest.setText("Testa");
        Btest.setFocusPainted(false);
        Btest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtestActionPerformed(evt);
            }
        });

        LImin.setText("Tempo Minimo (ms)");

        LImedio.setText("Tempo Medio (ms)");

        LImax.setText("Tempo Massimo (ms)");

        TImin.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TImin.setText("0");
        TImin.setFocusable(false);

        TImedio.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TImedio.setText("0");
        TImedio.setFocusable(false);

        TImax.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TImax.setText("0");
        TImax.setFocusable(false);

        LInsert.setText("Insert:");

        LSelect.setText("Select:");

        LSmin.setText("Tempo Minimo (ms)");

        TSmin.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TSmin.setText("0");
        TSmin.setFocusable(false);

        TSmedio.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TSmedio.setText("0");
        TSmedio.setFocusable(false);

        LSmedio.setText("Tempo Medio (ms)");

        LSmax.setText("Tempo Massimo (ms)");

        TSmax.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TSmax.setText("0");
        TSmax.setFocusable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LInsert)
                            .addComponent(LSelect))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LSmin)
                                .addGap(18, 18, 18)
                                .addComponent(TSmin))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LSmax)
                                    .addComponent(LSmedio))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TSmax)
                                    .addComponent(TSmedio)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(Lx)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(Btest))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LImin)
                                .addGap(18, 18, 18)
                                .addComponent(TImin))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LImax)
                                    .addComponent(LImedio))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TImax)
                                    .addComponent(TImedio))))
                        .addGap(77, 77, 77)))
                .addGap(94, 94, 94))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lx)
                    .addComponent(x, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btest))
                .addGap(3, 3, 3)
                .addComponent(LInsert)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LImin)
                    .addComponent(TImin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LImedio)
                    .addComponent(TImedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LImax)
                    .addComponent(TImax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(LSelect)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LSmin)
                    .addComponent(TSmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LSmedio)
                    .addComponent(TSmedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LSmax)
                    .addComponent(TSmax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private static Connection getDBconn(){
        //crea la connessione con il db (ritorna null se non è riuscito a connettersi)
        
        String driver,username,password,help,db_scon,ip,portn;
        BufferedReader b;
        Connection dbconn = null;
        
        //estraggo i dati per la conenssione al db dal file di configurazione
        try {
            b=new BufferedReader(new FileReader("./src/main/resources/config.txt"));
            help=b.readLine();
            
            String[] split = Utils.split(help, ";");
            
            driver = split[0];
            ip = split[1];
            portn = split[2];
            username = split[3];
            password = split[4];
            db_scon= "jdbc:sqlserver://"+ip+":"+portn+";user="+username+";password="+password+";";

            try{

                Class.forName(driver);

            }catch(ClassNotFoundException e){

                System.out.println(e.getMessage());
            }

            try{

                dbconn = DriverManager.getConnection(db_scon);
                return dbconn;

            } catch(SQLException e ){

                System.out.println(e.getMessage());
            }


        } catch (FileNotFoundException ex) {
            
            JOptionPane.showMessageDialog(null, "File di configurazione non trovato.");
            
        } catch (IOException ex) {
            
            System.out.println(ex.getMessage());
        }
        
        return dbconn;
    }
    
    public static String randomString (int length) {
        //genera una stringa random
        Random rnd = new Random ();
        char[] arr = new char[length];

        for (int i=0; i<length; i++) {
            int n = rnd.nextInt (36);
            arr[i] = (char) (n < 10 ? '0'+n : 'a'+n-10);
        }

        return new String (arr);
    }
    
    private void TestInsert() {
        int operazioni = 0;
        double min,max,avg;
        double[] tempi = new double[100];
        
        Connection dbconnection = null;
        PreparedStatement ps = null;
        String sql = "INSERT INTO Tpersona"
                    + "(nome, cognome, sesso, indirizzo, citta) VALUES "
                    + "(?,?,?,?,?)";
        try{
            
            dbconnection = getDBconn();
            dbconnection.setAutoCommit(false);
            
            for (int i = 0; i < 99; i++){
                
                ps = dbconnection.prepareStatement(sql);
                
                ps.setString(1, randomString(25));
                ps.setString(2, randomString(25));
                ps.setString(3, randomString(1));
                ps.setString(4, randomString(40));
                ps.setString(5, randomString(25));
                
                long start = System.nanoTime();
                ps.executeUpdate();
                tempi[i] = (System.nanoTime() - start)/1e6;
                operazioni++;
               
                ps.close();
                
                if(operazioni == (Integer) x.getValue()){
                    
                    dbconnection.commit();
                    operazioni = 0;
                    
                }
            } 
            
            if(operazioni != 0){
                try {
                        
                    dbconnection.commit();
                    
                } catch (SQLException e) {
                    
                    System.out.println(e.getMessage());
                    
                    try {
                
                        dbconnection.rollback();
                        
                    } catch (SQLException ex) {
                        
                        System.out.println(e.getMessage());
                        
                    }
                }
            }
            
            dbconnection.close();
            
            //calcola min avg max
            min = tempi[0];
            max = tempi[0];
            avg = 0;
            
            for (int i = 1; i < 99; i++){
                
                if(tempi[i] < min){
                    //nuovo minimo
                    min = tempi[i];
                    
                }
                if(tempi[i] > max){
                    //nuovo massimo
                    max = tempi[i];
                    
                }
                
                avg += tempi[i];
            }
            
            avg = avg/100;
            
            TImin.setText(Double.toString(min));
            TImax.setText(Double.toString(max));
            TImedio.setText(Double.toString(avg));
        
        }catch(SQLException e){
            
            System.out.println(e.getMessage());
            
            try {
                
                dbconnection.rollback();
                dbconnection.close();
                
            } catch (SQLException ex) {
                
                System.out.println(e.getMessage());
                
            }
        }
        
    }
    
    private void TestSelect(){
        int operazioni = 0;
        ResultSet rs;
        double min,max,avg;
        double[] tempi = new double[100];
        
        Connection dbconnection = null;
        PreparedStatement ps;
        String sql = "SELECT id FROM Tpersona WHERE id =?";
        
        try{
            
            dbconnection = getDBconn();
            dbconnection.setAutoCommit(false);
            
            for (int i = 0; i < 99; i++){
                
                ps = dbconnection.prepareStatement(sql);
                
                ps.setInt(1, new Random().nextInt(36));
                
                long start = System.nanoTime();
                rs = ps.executeQuery();
                tempi[i] = (System.nanoTime() - start)/1e6;
                operazioni++;
                
                rs.close();
                ps.close();
                
                if(operazioni == (Integer) x.getValue()){
                    
                    dbconnection.commit();
                    operazioni = 0;
                    
                }
            } 
            
            if(operazioni != 0){
                
                try {  
                    
                        dbconnection.commit();
                    
                } catch (SQLException e) {
                    
                    System.out.println(e.getMessage());
                    
                    try {
                
                        dbconnection.rollback();
                        
                    } catch (SQLException ex) {
                        
                        System.out.println(e.getMessage());
                        
                    }
                }
            }
            
            dbconnection.close();
            
            //calcola min avg max
            min = tempi[0];
            max = tempi[0];
            avg = 0;
            for (int i = 1; i < 99; i++){
                if(tempi[i] < min){
                    //nuovo minimo
                    min = tempi[i];
                    
                }
                if(tempi[i] > max){
                    //nuovo massimo
                    max = tempi[i];
                    
                }
                
                avg += tempi[i];
            }
            
            avg = avg/100;
            
            TSmin.setText(Double.toString(min));
            TSmax.setText(Double.toString(max));
            TSmedio.setText(Double.toString(avg));
        
        }catch(SQLException e){
            
            System.out.println(e.getMessage());
            
            try {
                
                dbconnection.rollback();
                dbconnection.close();
                
            } catch (SQLException ex) {
                
                System.out.println(e.getMessage());
                
            }
        }
        
    }
    
    private void BtestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtestActionPerformed
        // TODO add your handling code here:
        String db_driver,db_username,db_password;
        BufferedReader b;
        String help;
        Connection dbconnection = null;
        
        TestInsert();
        TestSelect();  
        
    }//GEN-LAST:event_BtestActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Finestra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Finestra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Finestra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Finestra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                try {
                    
                    new Finestra().setVisible(true);
                    
                } catch (IOException ex) {
                    
                    JOptionPane.showMessageDialog(null, "Errore apertura finestra.");
                    
                }
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btest;
    private javax.swing.JLabel LImax;
    private javax.swing.JLabel LImedio;
    private javax.swing.JLabel LImin;
    private javax.swing.JLabel LInsert;
    private javax.swing.JLabel LSelect;
    private javax.swing.JLabel LSmax;
    private javax.swing.JLabel LSmedio;
    private javax.swing.JLabel LSmin;
    private javax.swing.JLabel Lx;
    private javax.swing.JTextField TImax;
    private javax.swing.JTextField TImedio;
    private javax.swing.JTextField TImin;
    private javax.swing.JTextField TSmax;
    private javax.swing.JTextField TSmedio;
    private javax.swing.JTextField TSmin;
    private javax.swing.JSpinner x;
    // End of variables declaration//GEN-END:variables
    
}
