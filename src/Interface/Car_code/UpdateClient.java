/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package Interface.Car_code;

import code.Client;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager.LookAndFeelInfo;

public class UpdateClient extends JFrame {
    private JButton CancelButton;
    private JTextField IDclientText;
    private JButton UpdateButton;
    private JLabel jLabel4;

    public UpdateClient() {
        this.initComponents();
    }

    private void initComponents() {
        this.jLabel4 = new JLabel();
        this.IDclientText = new JTextField();
        this.CancelButton = new JButton();
        this.UpdateButton = new JButton();
        this.setDefaultCloseOperation(3);
        this.jLabel4.setFont(new Font("Granada", 1, 18));
        this.jLabel4.setForeground(new Color(18, 16, 16));
        this.jLabel4.setText(" Entrer l'ID De Client:");
        this.IDclientText.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                UpdateClient.this.IDclientTextActionPerformed(evt);
            }
        });
        this.CancelButton.setFont(new Font("Granada", 1, 15));
        this.CancelButton.setForeground(new Color(197, 53, 53));
        this.CancelButton.setText("Cancel");
        this.CancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    UpdateClient.this.CancelButtonActionPerformed(evt);
                }
                catch (Exception var3) {
                    var3.printStackTrace();
                } }
        });
        this.UpdateButton.setFont(new Font("Granada", 1, 15));
        this.UpdateButton.setForeground(new Color(197, 53, 53));
        this.UpdateButton.setText("Update ");
        this.UpdateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    UpdateClient.this.UpdateButtonActionPerformed(evt);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(96, 96, 96).addComponent(this.jLabel4, -2, 265, -2).addContainerGap(-1, 32767)).addGroup(Alignment.TRAILING, layout.createSequentialGroup().addContainerGap(80, 32767).addGroup(layout.createParallelGroup(Alignment.LEADING, false).addGroup(Alignment.TRAILING, layout.createSequentialGroup().addComponent(this.IDclientText, -2, 265, -2).addGap(98, 98, 98)).addGroup(Alignment.TRAILING, layout.createSequentialGroup().addComponent(this.UpdateButton, -2, 85, -2).addPreferredGap(ComponentPlacement.RELATED, -1, 32767).addComponent(this.CancelButton, -2, 85, -2).addGap(111, 111, 111)))));
        layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(77, 77, 77).addComponent(this.jLabel4).addGap(28, 28, 28).addComponent(this.IDclientText, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED, 55, 32767).addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(this.CancelButton).addComponent(this.UpdateButton)).addGap(98, 98, 98)));
        this.pack();
    }
    private void IDclientTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDclientTextActionPerformed

    }//GEN-LAST:event_IDclientTextActionPerformed

    private void CancelButtonActionPerformed(ActionEvent evt) throws Exception{//GEN-FIRST:event_CancelButtonActionPerformed
        dispose();
        Interface.Car_code.Client menu = new Interface.Car_code.Client();
        menu.show();
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) throws Exception{//GEN-FIRST:event_UpdateButtonActionPerformed
        String idc=this.IDclientText.getText().trim();
        int IDc=Integer.parseInt(idc);
        try {
            Connection cnx = null;
            Statement st = null;
            int count = 0;
            Class.forName("com.mysql.jdbc.Driver");
            cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/car", "root", "");
            st = cnx.createStatement();
            ResultSet res = st.executeQuery("select * from client where CIN="+IDc);

            while(res.next()) {
                ++count;
            }
            if (count==0){
                System.out.println("Impossible d'Update");
            }else {
                code.Client c = new code.Client();
                c = c.getClient(IDc);
                UpdateClient1 U=new UpdateClient1(c);
                U.show();
                dispose();
            }
        } catch (SQLException var8) {
            System.out.println("erreur" + var8);
        }

    }//GEN-LAST:event_UpdateButtonActionPerformed

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
            Logger.getLogger(UpdateClient.class.getName()).log(Level.SEVERE, (String)null, var5);
        } catch (InstantiationException var6) {
            Logger.getLogger(UpdateClient.class.getName()).log(Level.SEVERE, (String)null, var6);
        } catch (IllegalAccessException var7) {
            Logger.getLogger(UpdateClient.class.getName()).log(Level.SEVERE, (String)null, var7);
        } catch (UnsupportedLookAndFeelException var8) {
            Logger.getLogger(UpdateClient.class.getName()).log(Level.SEVERE, (String)null, var8);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                (new UpdateClient()).setVisible(true);
            }
        });
    }
    }
