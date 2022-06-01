/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface.Car_code;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.table.DefaultTableModel;

public class Booking extends JFrame {
    private JButton BookButton;
    private JButton ClientButton;
    private JTextField IDclientText;
    private JTextField MatriculeText;
    private JButton ReservationButton;
    private JTable TableDeReservation;
    private JButton UnbookButton;
    private JButton VoitureButton;
    private JLabel jLabel1;
    private JButton RechercheCButton;
    private JButton RechercheMButton;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JPanel jPanel1;
    private JScrollPane jScrollPane1;
    private JButton LogoutButton;

    public Booking() {
        initComponents();
    }

    private void initComponents() {

        this.jLabel1 = new JLabel();
        this.RechercheCButton = new JButton();
        this.RechercheMButton = new JButton();
        this.MatriculeText = new JTextField();
        this.IDclientText = new JTextField();
        this.BookButton = new JButton();
        this.UnbookButton = new JButton();
        this.jLabel7 = new JLabel();
        this.jScrollPane1 = new JScrollPane();
        this.TableDeReservation = new JTable();
        this.jLabel8 = new JLabel();
        this.jPanel1 = new JPanel();
        this.ClientButton = new JButton();
        this.ReservationButton = new JButton();
        this.LogoutButton = new JButton();
        this.VoitureButton = new JButton();

        this.setDefaultCloseOperation(3);
        this.jPanel1.setBackground(new Color(203, 28, 28));
        this.ClientButton.setFont(new Font("Granada", 1, 15)); // NOI18N
        this.ClientButton.setForeground(new Color(197, 53, 53));
        this.ClientButton.setText("Client");
        this.ClientButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    Booking.this.ClientButtonActionPerformed(evt);
                } catch (Exception var3) {
                    var3.printStackTrace();
                }
            }
        });
        this.LogoutButton.setFont(new Font("Granada", 1, 15)); // NOI18N
        this.LogoutButton.setForeground(new Color(197, 53, 53));
        this.LogoutButton.setText("Logout");
        this.LogoutButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Booking.this.LogoutButtonActionPerformed(evt);
            }
        });
        this.VoitureButton.setFont(new Font("Granada", 1, 15)); // NOI18N
        this.VoitureButton.setForeground(new Color(197, 53, 53));
        this.VoitureButton.setText("Voiture");
        this.VoitureButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Booking.this.VoitureButtonActionPerformed(evt);
            }
        });
        this.ReservationButton.setFont(new Font("Granada", 1, 15)); // NOI18N
        this.ReservationButton.setForeground(new Color(197, 53, 53));
        this.ReservationButton.setText("Reservation");
        this.ReservationButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Booking.this.ReservationButtonActionPerformed(evt);
            }
        });
        GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addGap(0, 0, 32767).addComponent(this.LogoutButton, -2, 270, -2)).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addComponent(this.VoitureButton, -2, 270, -2).addComponent(this.ReservationButton, -2, 270, -2)).addGap(0, 0, 32767)).addComponent(this.ClientButton, -1, -1, 32767)))).addContainerGap()));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(176, 176, 176).addComponent(this.ClientButton, -2, 52, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.VoitureButton, -2, 50, -2).addGap(35, 35, 35).addComponent(this.ReservationButton, -2, 50, -2).addPreferredGap(ComponentPlacement.RELATED, -1, 32767).addComponent(this.LogoutButton, -2, 50, -2)));
        this.ClientButton.getAccessibleContext().setAccessibleName("");
        this.jLabel1.setFont(new Font("DejaVu Serif Condensed", 1, 20));
        this.jLabel1.setForeground(new Color(203, 28, 28));
        this.jLabel1.setHorizontalAlignment(0);
        this.jLabel1.setText("Listes De Voitures Reserver:");

        this.RechercheCButton.setFont(new Font("Granada", 1, 15));
        this.RechercheCButton.setForeground(new Color(197, 53, 53));
        this.RechercheCButton.setText("Recherche Par Client");
        this.RechercheCButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Booking.this.RechercheCButtonActionPerformed(evt);
            }
        });

        this.RechercheMButton.setFont(new Font("Granada", 1, 15));
        this.RechercheMButton.setForeground(new Color(197, 53, 53));
        this.RechercheMButton.setText("Recherche Par Client");
        this.RechercheMButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Booking.this.RechercheMButtonActionPerformed(evt);
            }
        });

        this.MatriculeText.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Booking.this.MatriculeTextActionPerformed(evt);
            }
        });
        this.IDclientText.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Booking.this.IDclientTextActionPerformed(evt);
            }
        });
        this.BookButton.setFont(new Font("Granada", 1, 15));
        this.BookButton.setForeground(new Color(197, 53, 53));
        this.BookButton.setText("Book");
        this.BookButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Booking.this.BookButtonActionPerformed(evt);
            }
        });
        this.UnbookButton.setFont(new Font("Granada", 1, 15));
        this.UnbookButton.setForeground(new Color(197, 53, 53));
        this.UnbookButton.setText("Unbook");
        this.UnbookButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Booking.this.UnbookButtonActionPerformed(evt);
            }
        });
        this.jLabel7.setFont(new Font("DejaVu Serif Condensed", 1, 20));
        this.jLabel7.setForeground(new Color(203, 28, 28));
        this.jLabel7.setHorizontalAlignment(0);
        this.jLabel7.setText("Gerer Les Reservation");
        this.TableDeReservation.setModel(new DefaultTableModel(new Object[][]{{null, null, null, null, null}}, new String[]{"ID", "Client ID+Nom", "Nom Voiture", "Matricule", "Temp De Reservation"}));
        this.TableDeReservation.setRowHeight(25);
        this.TableDeReservation.addComponentListener(new ComponentAdapter() {
            public void componentShown(ComponentEvent evt) {
                Booking.this.TableDeReservationComponentShown(evt);
            }
        });
        this.jScrollPane1.setViewportView(this.TableDeReservation);
        this.jLabel8.setFont(new Font("AlHor", 1, 18));
        this.jLabel8.setForeground(new Color(225, 62, 62));
        this.jLabel8.setHorizontalAlignment(0);
        this.jLabel8.setText("X");
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jPanel1, -2, 283, -2).addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(253, 253, 253).addComponent(this.jLabel7, -2, 255, -2).addPreferredGap(ComponentPlacement.RELATED, -1, 32767).addComponent(this.jLabel8, -2, 31, -2)).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(3, 3, 3).addComponent(this.RechercheMButton).addGap(18, 18, 18).addComponent(this.MatriculeText, -2, 156, -2).addGap(18, 18, 18).addComponent(this.RechercheCButton, -2, 207, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.IDclientText, -2, 127, -2)).addGroup(layout.createSequentialGroup().addGap(101, 101, 101).addComponent(this.BookButton, -2, 85, -2).addGap(78, 78, 78).addComponent(this.UnbookButton, -2, 85, -2)).addGroup(layout.createSequentialGroup().addGap(238, 238, 238).addComponent(this.jLabel1, -2, 357, -2))).addContainerGap()).addGroup(layout.createSequentialGroup().addGap(56, 56, 56).addComponent(this.jScrollPane1, -2, 725, -2).addGap(0, 66, 32767)))));
        layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel1, -1, -1, 32767).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jLabel8, -2, 26, -2).addGroup(layout.createSequentialGroup().addGap(20, 20, 20).addComponent(this.jLabel7, -2, 32, -2))).addGap(51, 51, 51).addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(this.RechercheMButton).addComponent(this.MatriculeText, -2, -1, -2).addComponent(this.RechercheCButton).addComponent(this.IDclientText, -2, -1, -2)).addPreferredGap(ComponentPlacement.RELATED, 44, 32767).addComponent(this.jLabel1, -2, 32, -2).addGap(18, 18, 18).addComponent(this.jScrollPane1, -2, 319, -2).addGap(46, 46, 46).addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(this.BookButton).addComponent(this.UnbookButton)).addGap(76, 76, 76)));
        this.pack();
    }

    private void MatriculeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MatriculeTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MatriculeTextActionPerformed

    private void BookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookButtonActionPerformed
        Book Bo = new Book();
        Bo.show();
        // dispose();
    }//GEN-LAST:event_BookButtonActionPerformed

    private void RechercheCButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RechercheCButtonActionPerformed
    }//GEN-LAST:RechercheCButtonActionPerformed

    private void RechercheMButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RechercheCButtonActionPerformed
    }//GEN-LAST:RechercheCButtonActionPerformed

    private void UnbookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnbookButtonActionPerformed
        Unbook UnBo = new Unbook();
        UnBo.show();
        //dispose();
    }//GEN-LAST:event_UnbookButtonActionPerformed

    private void TableDeReservationComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_TableDeReservationComponentShown

    }//GEN-LAST:event_TableDeReservationComponentShown

    private void IDclientTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDclientTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDclientTextActionPerformed

    private void ClientButtonActionPerformed(ActionEvent evt) throws Exception {//GEN-FIRST:event_ClientButtonActionPerformed
        Interface.Car_code.Client Cl=new Interface.Car_code.Client();
        Cl.show();
        dispose();
    }//GEN-LAST:event_ClientButtonActionPerformed

    private void ReservationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REservationButtonActionPerformed
        Booking Bo = new Booking();
        Bo.show();
        dispose();
    }//GEN-LAST:event_REservationButtonActionPerformed

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        login lo = new login();
        lo.show();
        dispose();
    }//GEN-LAST:event_LogoutButtonActionPerformed

    private void VoitureButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoitureButtonActionPerformed
        Voiture Vo = new Voiture();
        Vo.show();
        dispose();
    }//GEN-LAST:event_VoitureButtonActionPerformed

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
            Logger.getLogger(Booking.class.getName()).log(Level.SEVERE, (String)null, var5);
        } catch (InstantiationException var6) {
            Logger.getLogger(Booking.class.getName()).log(Level.SEVERE, (String)null, var6);
        } catch (IllegalAccessException var7) {
            Logger.getLogger(Booking.class.getName()).log(Level.SEVERE, (String)null, var7);
        } catch (UnsupportedLookAndFeelException var8) {
            Logger.getLogger(Booking.class.getName()).log(Level.SEVERE, (String)null, var8);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                (new Booking()).setVisible(true);
            }
        });
    }
}


