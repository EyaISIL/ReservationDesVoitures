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


import static java.lang.Integer.parseInt;

public class AddClient extends JFrame {
    private JButton AddButton;
    private JLabel CIN;
    private JTextField CINText;
    private JButton CancelButton;
    private JLabel Contact;
    private JTextField ContactText;
    private JLabel Nom;
    private JTextField NomText;
    private JLabel Prenom;
    private JTextField PrenomText;


    public AddClient() {
        this.initComponents();
    }

    private void initComponents() {
        this.CancelButton = new JButton();
        this.AddButton = new JButton();
        this.CIN = new JLabel();
        this.CINText = new JTextField();
        this.Prenom = new JLabel();
        this.PrenomText = new JTextField();
        this.Nom = new JLabel();
        this.NomText = new JTextField();
        this.Contact = new JLabel();
        this.ContactText = new JTextField();
        this.setDefaultCloseOperation(3);
        this.CancelButton.setFont(new Font("Granada", 1, 15));
        this.CancelButton.setForeground(new Color(197, 53, 53));
        this.CancelButton.setText("Cancel");
        this.CancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    AddClient.this.CancelButtonActionPerformed(evt);
                }
                catch (Exception var3) {
                    var3.printStackTrace();
                }
            }
        });
        this.AddButton.setFont(new Font("Granada", 1, 15));
        this.AddButton.setForeground(new Color(197, 53, 53));
        this.AddButton.setText("Add");
        this.AddButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
               try{
                AddClient.this.AddButtonActionPerformed(evt);
            }catch (Exception var3) {
                    var3.printStackTrace();
                }
            }
        });
        this.CIN.setFont(new Font("Granada", 1, 18));
        this.CIN.setForeground(new Color(18, 16, 16));
        this.CIN.setText("CIN :");
        this.CINText.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                AddClient.this.CINTextActionPerformed(evt);
            }
        });
        this.Prenom.setFont(new Font("Granada", 1, 18));
        this.Prenom.setForeground(new Color(18, 16, 16));
        this.Prenom.setText("Prenom:");
        this.PrenomText.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                AddClient.this.PrenomTextActionPerformed(evt);
            }
        });
        this.Nom.setFont(new Font("Granada", 1, 18));
        this.Nom.setForeground(new Color(18, 16, 16));
        this.Nom.setText("Nom :");
        this.NomText.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                AddClient.this.NomTextActionPerformed(evt);
            }
        });
        this.Contact.setFont(new Font("Granada", 1, 18));
        this.Contact.setForeground(new Color(18, 16, 16));
        this.Contact.setText("Contact:");
        this.ContactText.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                AddClient.this.ContactTextActionPerformed(evt);
            }
        });
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(52, 52, 52).addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(6, 6, 6).addComponent(this.Contact)).addComponent(this.Nom).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.Prenom, -2, 84, -2).addGap(31, 31, 31)).addGroup(Alignment.TRAILING, layout.createSequentialGroup().addComponent(this.CIN).addGap(67, 67, 67))).addGroup(layout.createParallelGroup(Alignment.TRAILING).addComponent(this.PrenomText, -2, 265, -2).addComponent(this.NomText, -2, 265, -2).addComponent(this.CINText, -2, 265, -2).addComponent(this.ContactText, -2, 265, -2))))).addGroup(layout.createSequentialGroup().addGap(149, 149, 149).addComponent(this.AddButton, -2, 85, -2).addGap(74, 74, 74).addComponent(this.CancelButton, -2, 85, -2))).addGap(0, 85, 32767)));
        layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(47, 47, 47).addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(this.CIN).addComponent(this.CINText, -2, -1, -2)).addGap(18, 18, 18).addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(this.Nom).addComponent(this.NomText, -2, -1, -2)).addPreferredGap(ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(this.Prenom).addComponent(this.PrenomText, -2, -1, -2)).addPreferredGap(ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(this.Contact).addComponent(this.ContactText, -2, -1, -2)).addPreferredGap(ComponentPlacement.RELATED, 58, 32767).addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(this.CancelButton).addComponent(this.AddButton)).addGap(44, 44, 44)));
        this.pack();
    }

    private void CancelButtonActionPerformed(ActionEvent evt) throws Exception {
        dispose();
        Interface.Car_code.Client menu = new Interface.Car_code.Client();
        menu.show();
    }

    private void AddButtonActionPerformed(ActionEvent evt) throws Exception {
        String cin=this.CINText.getText().trim();
        String con=this.ContactText.getText().trim();
        String Nom=this.NomText.getText().trim();
        String Prenom=this.PrenomText.getText().trim();
        int CIN = Integer.parseInt(cin);
        int contact = Integer.parseInt(con);
        code.Client C = new code.Client(CIN,Nom,Prenom,contact);
        C.add();
        dispose();
        Interface.Car_code.Client menu = new Interface.Car_code.Client();
        menu.show();
    }

    private void CINTextActionPerformed(ActionEvent evt) {
    }

    private void PrenomTextActionPerformed(ActionEvent evt) {
    }

    private void NomTextActionPerformed(ActionEvent evt) {
    }

    private void ContactTextActionPerformed(ActionEvent evt) {
    }

    public static void main(String[] args) {
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
            Logger.getLogger(AddClient.class.getName()).log(Level.SEVERE, (String)null, var5);
        } catch (InstantiationException var6) {
            Logger.getLogger(AddClient.class.getName()).log(Level.SEVERE, (String)null, var6);
        } catch (IllegalAccessException var7) {
            Logger.getLogger(AddClient.class.getName()).log(Level.SEVERE, (String)null, var7);
        } catch (UnsupportedLookAndFeelException var8) {
            Logger.getLogger(AddClient.class.getName()).log(Level.SEVERE, (String)null, var8);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                (new Interface.Car_code.AddClient()).setVisible(true);
            }
        });
    }
}