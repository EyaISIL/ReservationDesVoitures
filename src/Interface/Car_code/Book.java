/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package Interface.Car_code;
import code.Reservation;
import code.Voiture;
import code.Client;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager.LookAndFeelInfo;

public class Book extends JFrame {
    private JButton BookButton;
    private JButton CancelButton;
    private JTextField IDclientText;
    private JTextField IDdeReservationText;
    private JLabel jLabel3;
    private JLabel jLabel4;

    public Book() {
        this.initComponents();
    }

    private void initComponents() {
        this.jLabel3 = new JLabel();
        this.IDdeReservationText = new JTextField();
        this.jLabel4 = new JLabel();
        this.IDclientText = new JTextField();
        this.CancelButton = new JButton();
        this.BookButton = new JButton();
        this.setDefaultCloseOperation(3);
        this.jLabel3.setFont(new Font("Granada", 1, 18));
        this.jLabel3.setForeground(new Color(18, 16, 16));
        this.jLabel3.setText(" Entrer Voiture ID Pour Reserver:");
        this.IDdeReservationText.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Book.this.IDdeReservationTextActionPerformed(evt);
            }
        });
        this.jLabel4.setFont(new Font("Granada", 1, 18));
        this.jLabel4.setForeground(new Color(18, 16, 16));
        this.jLabel4.setText(" Entrer l'ID De reservation:");
        this.IDclientText.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Book.this.IDclientTextActionPerformed(evt);
            }
        });
        this.CancelButton.setFont(new Font("Granada", 1, 15));
        this.CancelButton.setForeground(new Color(197, 53, 53));
        this.CancelButton.setText("Cancel");
        this.CancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Book.this.CancelButtonActionPerformed(evt);
            }
        });
        this.BookButton.setFont(new Font("Granada", 1, 15));
        this.BookButton.setForeground(new Color(197, 53, 53));
        this.BookButton.setText("Book");
        this.BookButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    Book.this.BookButtonActionPerformed(evt);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(96, 96, 96).addGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.IDclientText, -2, 265, -2).addGroup(layout.createParallelGroup(Alignment.LEADING, false).addComponent(this.jLabel3, -1, -1, 32767).addComponent(this.IDdeReservationText))).addContainerGap(-1, 32767)).addGroup(Alignment.TRAILING, layout.createSequentialGroup().addGap(0, 0, 32767).addComponent(this.jLabel4, -2, 265, -2).addGap(73, 73, 73)).addGroup(Alignment.TRAILING, layout.createSequentialGroup().addContainerGap(80, 32767).addComponent(this.BookButton, -2, 85, -2).addGap(74, 74, 74).addComponent(this.CancelButton, -2, 85, -2).addGap(119, 119, 119)));
        layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(54, 54, 54).addComponent(this.jLabel3).addGap(18, 18, 18).addComponent(this.IDdeReservationText, -2, -1, -2).addGap(32, 32, 32).addComponent(this.jLabel4).addPreferredGap(ComponentPlacement.UNRELATED).addComponent(this.IDclientText, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED, 50, 32767).addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(this.CancelButton).addComponent(this.BookButton)).addGap(28, 28, 28)));
        this.pack();
    }

    private void IDdeReservationTextActionPerformed(ActionEvent evt) {//GEN-FIRST:event_IDdeReservationTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDdeReservationTextActionPerformed

    private void IDclientTextActionPerformed(ActionEvent evt) {//GEN-FIRST:event_IDclientTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDclientTextActionPerformed

    private void CancelButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        Booking B=new Booking();
        B.show();
        dispose();
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void BookButtonActionPerformed(ActionEvent evt) throws Exception {//GEN-FIRST:event_BookButtonActionPerformed
        String IDVoiture = this.IDdeReservationText.getText().trim();
        String IDClient = this.IDclientText.getText().trim();
        int IDV = Integer.parseInt(IDVoiture);
        int IDC = Integer.parseInt(IDClient);


        try {
            Connection cnx = null;
            Statement st = null;

            int count = 0;
            int count1=0;
            Class.forName("com.mysql.jdbc.Driver");
            cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/car", "root", "");
            st = cnx.createStatement();
            ResultSet res = st.executeQuery("select * from voiture where matricule=" + IDV);
            ResultSet res1 = st.executeQuery("select * from client where cin=" + IDC);

            while (res.next()) {++count;} while(res1.next()){++count1; }
            if (count == 0 || count1==0) {
                Voiture V = new Voiture();
                Client C =new Client();
                Reservation R=new Reservation(0,C,V);
                R.book();
            }
            else  {
                int id = res.getInt("matricule");
                String name = res.getString("name");
                String marque = res.getString("maker");
                String couleur = res.getString("colour");
                String type = res.getString("type");
                int capacite = res.getInt("capacite");
                String model = res.getString("model");
                double price = res.getDouble("prix");
              Voiture  V = new Voiture(id, price, marque, name, couleur, type, capacite, model);
                int cin = res.getInt("cin");
                int contact = res.getInt("contact");
                String nom = res.getString("nom");
                String prenom = res.getString("prenom");
                Client C = new Client(cin, nom, prenom, contact);
                Reservation R=new Reservation(7,C,V);
                R.book();
            }
        } catch (SQLException var6) {
            System.out.println("erreur" + var6);
        }


    }//GEN-LAST:event_BookButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            LookAndFeelInfo[] var1 = UIManager.getInstalledLookAndFeels();
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                LookAndFeelInfo info = var1[var3];
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException var5) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, (String)null, var5);
        } catch (InstantiationException var6) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, (String)null, var6);
        } catch (IllegalAccessException var7) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, (String)null, var7);
        } catch (UnsupportedLookAndFeelException var8) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, (String)null, var8);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                (new Book()).setVisible(true);
            }
        });
    }
    }



