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

public class UpdateClient1 extends JFrame {
    private JButton CancelButton;
    private JTextField ContactText;
    private JTextField NomText;
    private JTextField PrenomText;
    private JButton UpdateButton;
    private JLabel jLabel3;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel8;
    private Client clt;

    public UpdateClient1(Client c) {
        this.clt=c;
        this.initComponents(clt);
    }

    private void initComponents(Client c) {
        this.CancelButton = new JButton();
        this.UpdateButton = new JButton();
        this.jLabel3 = new JLabel();
        this.jLabel5 = new JLabel();
        this.PrenomText = new JTextField();
        this.jLabel6 = new JLabel();
        this.NomText = new JTextField();
        this.jLabel8 = new JLabel();
        this.ContactText = new JTextField();
        this.setDefaultCloseOperation(3);
        this.CancelButton.setFont(new Font("Granada", 1, 15));
        this.CancelButton.setForeground(new Color(197, 53, 53));
        this.CancelButton.setText("Cancel");
        this.CancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    UpdateClient1.this.CancelButtonActionPerformed(evt);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        this.UpdateButton.setFont(new Font("Granada", 1, 15));
        this.UpdateButton.setForeground(new Color(197, 53, 53));
        this.UpdateButton.setText("Update");
        this.UpdateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    UpdateClient1.this.UpdateButtonActionPerformed(evt);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        this.jLabel3.setFont(new Font("Granada", 1, 18));
        this.jLabel3.setForeground(new Color(18, 16, 16));
        this.jLabel3.setText("CIN :     "+c.getCIN());
        this.jLabel5.setFont(new Font("Granada", 1, 18));
        this.jLabel5.setForeground(new Color(18, 16, 16));
        this.jLabel5.setText("Prenom:");
        PrenomText.setText(c.getPrénom());
        this.PrenomText.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                UpdateClient1.this.PrenomTextActionPerformed(evt);
            }
        });
        this.jLabel6.setFont(new Font("Granada", 1, 18));
        this.jLabel6.setForeground(new Color(18, 16, 16));
        this.jLabel6.setText("Nom :");
        NomText.setText(c.getNom());
        this.NomText.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                UpdateClient1.this.NomTextActionPerformed(evt);
            }
        });
        this.jLabel8.setFont(new Font("Granada", 1, 18));
        this.jLabel8.setForeground(new Color(18, 16, 16));
        this.jLabel8.setText("Contact:");
        ContactText.setText(Integer.toString((c.getContact())));
        this.ContactText.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                UpdateClient1.this.ContactTextActionPerformed(evt);
            }
        });
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(52, 52, 52).addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(6, 6, 6).addComponent(this.jLabel8)).addComponent(this.jLabel6).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jLabel5, -2, 84, -2).addGap(31, 31, 31)).addGroup(Alignment.TRAILING, layout.createSequentialGroup().addComponent(this.jLabel3).addGap(67, 67, 67))).addGroup(layout.createParallelGroup(Alignment.TRAILING).addComponent(this.PrenomText, -2, 265, -2).addComponent(this.NomText, -2, 265, -2).addComponent(this.ContactText, -2, 265, -2))))).addGroup(layout.createSequentialGroup().addGap(149, 149, 149).addComponent(this.UpdateButton, -2, 85, -2).addGap(74, 74, 74).addComponent(this.CancelButton, -2, 85, -2))).addGap(0, 85, 32767)));
        layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(47, 47, 47).addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel3, -2, -1, -2)).addGap(18, 18, 18).addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel6).addComponent(this.NomText, -2, -1, -2)).addPreferredGap(ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel5).addComponent(this.PrenomText, -2, -1, -2)).addPreferredGap(ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel8).addComponent(this.ContactText, -2, -1, -2)).addPreferredGap(ComponentPlacement.RELATED, 58, 32767).addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(this.CancelButton).addComponent(this.UpdateButton)).addGap(44, 44, 44)));
        this.pack();
    }

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) throws Exception{//GEN-FIRST:event_CancelButtonActionPerformed
        dispose();
        Interface.Car_code.Client menu = new Interface.Car_code.Client();
        menu.show();
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) throws  Exception{//GEN-FIRST:event_UpdateButtonActionPerformed
        String con=this.ContactText.getText().trim();
        String Nom=this.NomText.getText().trim();
        String Prenom=this.PrenomText.getText().trim();
        int CIN = clt.getCIN();
        int contact = Integer.parseInt(con);
        code.Client C = new code.Client(CIN,Nom,Prenom,contact);
        C.update(CIN,C);
        dispose();
        Interface.Car_code.Client menu = new Interface.Car_code.Client();
        menu.show();
    }//GEN-LAST:event_UpdateButtonActionPerformed



    private void PrenomTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrenomTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrenomTextActionPerformed

    private void NomTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomTextActionPerformed

    private void ContactTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContactTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContactTextActionPerformed

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
            Logger.getLogger(UpdateClient1.class.getName()).log(Level.SEVERE, (String)null, var5);
        } catch (InstantiationException var6) {
            Logger.getLogger(UpdateClient1.class.getName()).log(Level.SEVERE, (String)null, var6);
        } catch (IllegalAccessException var7) {
            Logger.getLogger(UpdateClient1.class.getName()).log(Level.SEVERE, (String)null, var7);
        } catch (UnsupportedLookAndFeelException var8) {
            Logger.getLogger(UpdateClient1.class.getName()).log(Level.SEVERE, (String)null, var8);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                Client c = new Client();
                (new UpdateClient1(c)).setVisible(true);
            }
        });
    }
    }



