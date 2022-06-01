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
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;

public class Client extends JFrame {
    private JButton AddButton;
    private JTextField CINText;
    private JButton ClientButton;
    private JButton DeleteButton;
    private JButton LogoutButton;
    private JTextField NomclientText;
    private JButton ReservationButton;
    private JTable TableClient;
    private JButton UpdateButton;
    private JButton VoitureButton;
    private JButton CLButton;
    private JButton RechercheNButton;
    private JButton RechercheCButton;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JPanel jPanel1;
    private JScrollPane jScrollPane1;

    public Client() {
        this.initComponents();

    }
    public ArrayList<code.Client> client_list() {
        ArrayList<code.Client> client_list = new ArrayList<>();
        try {
            Connection cnx = null;
            Statement st = null;
            Class.forName("com.mysql.jdbc.Driver");
            cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/car", "root", "");
            st = cnx.createStatement();
            ResultSet res = st.executeQuery("select * from client ");
            code.Client c;
            while (res.next()) {
                int cin = res.getInt("cin");
                int contact = res.getInt("contact");
                String nom = res.getString("nom");
                String prenom = res.getString("prenom");

                c = new code.Client(cin,nom,prenom,contact);
                client_list.add(c);
            }
        } catch (SQLException | ClassNotFoundException var6) {
            System.out.println("erreur" + var6);
        }
        return client_list;
    }
    public ArrayList<code.Client> Cclient_list(int mat) {
        ArrayList<code.Client> client_list = new ArrayList<>();
        try {
            Connection cnx = null;
            Statement st = null;
            Class.forName("com.mysql.jdbc.Driver");
            cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/car", "root", "");
            st = cnx.createStatement();
            ResultSet res = st.executeQuery("select * from client Where cin ="+mat);
            code.Client c;
            while (res.next()) {
                int cin = res.getInt("cin");
                int contact = res.getInt("contact");
                String nom = res.getString("nom");
                String prenom = res.getString("prenom");

                c = new code.Client(cin,nom,prenom,contact);
                client_list.add(c);
            }
        } catch (SQLException | ClassNotFoundException var6) {
            System.out.println("erreur" + var6);
        }
        return client_list;
    }
    public ArrayList<code.Client> Nclient_list(String mat) {
        ArrayList<code.Client> client_list = new ArrayList<>();
        try {
            Connection cnx = null;
            Statement st = null;
            Class.forName("com.mysql.jdbc.Driver");
            cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/car", "root", "");
            st = cnx.createStatement();
            ResultSet res = st.executeQuery("select * from client Where nom="+mat);
            code.Client c;
            while (res.next()) {
                int cin = res.getInt("cin");
                int contact = res.getInt("contact");
                String nom = res.getString("nom");
                String prenom = res.getString("prenom");

                c = new code.Client(cin,nom,prenom,contact);
                client_list.add(c);
            }
        } catch (SQLException | ClassNotFoundException var6) {
            System.out.println("erreur" + var6);
        }
        return client_list;
    }
    public void show_client(ArrayList<code.Client> L_c){
        ArrayList<code.Client> liste = L_c;
        DefaultTableModel model = (DefaultTableModel) TableClient.getModel();
        Object[] row = new Object[4];
        for (int i=0;i<liste.size();i++){
            row[0]=liste.get(i).getCIN();
            row[1]=liste.get(i).getNom();
            row[2]=liste.get(i).getPrénom();
            row[3]=liste.get(i).getContact();
            model.addRow(row);
        }
    }



    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.ClientButton = new JButton();
        this.LogoutButton = new JButton();
        this.VoitureButton = new JButton();
        this.ReservationButton = new JButton();
        this.CLButton = new JButton();
        this.RechercheNButton = new JButton();
        this.RechercheCButton = new JButton();
        this.CINText = new JTextField();
        this.NomclientText = new JTextField();
        this.jLabel7 = new JLabel();
        this.jScrollPane1 = new JScrollPane();
        this.TableClient = new JTable();
        this.jLabel8 = new JLabel();
        this.UpdateButton = new JButton();
        this.AddButton = new JButton();
        this.DeleteButton = new JButton();
        this.setDefaultCloseOperation(3);
        this.jPanel1.setBackground(new Color(203, 28, 28));

        this.ClientButton.setFont(new Font("Granada", 1, 15)); // NOI18N
        this.ClientButton.setForeground(new Color(197, 53, 53));
        this.ClientButton.setText("Client");
        this.ClientButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    Interface.Car_code.Client.this.ClientButtonActionPerformed(evt);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        });

        this.LogoutButton.setFont(new Font("Granada", 1, 15)); // NOI18N
        this.LogoutButton.setForeground(new Color(197, 53, 53));
        this.LogoutButton.setText("Logout");
        this.LogoutButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt) {
                Interface.Car_code.Client.this.LogoutButtonActionPerformed(evt);
            }
        });
        this.RechercheCButton.setFont(new Font("Granada", 1, 15)); // NOI18N
        this.RechercheCButton.setForeground(new Color(197, 53, 53));
        this.RechercheCButton.setText("Recherche Par Cin");
        this.RechercheCButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt) {
                Interface.Car_code.Client.this.RechercheCButtonActionPerformed(evt);
            }
        });
        this.VoitureButton.setFont(new Font("Granada", 1, 15)); // NOI18N
        this.VoitureButton.setForeground(new Color(197, 53, 53));
        this.VoitureButton.setText("Voiture");
        this.VoitureButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Interface.Car_code.Client.this.VoitureButtonActionPerformed(evt);
            }
        });
        this.ReservationButton.setFont(new Font("Granada", 1, 15)); // NOI18N
        this.ReservationButton.setForeground(new Color(197, 53, 53));
        this.ReservationButton.setText("Reservation");
        this.ReservationButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Interface.Car_code.Client.this.ReservationButtonActionPerformed(evt);
            }
        });
        GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addGap(0, 0, 32767).addComponent(this.LogoutButton, -2, 270, -2)).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.VoitureButton, -2, 270, -2).addComponent(this.ReservationButton, -2, 270, -2)).addGap(0, 0, 32767)).addComponent(this.ClientButton, -1, -1, 32767)))).addContainerGap()));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(176, 176, 176).addComponent(this.ClientButton, -2, 52, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.VoitureButton, -2, 50, -2).addGap(35, 35, 35).addComponent(this.ReservationButton, -2, 50, -2).addPreferredGap(ComponentPlacement.RELATED, -1, 32767).addComponent(this.LogoutButton, -2, 50, -2)));
        this.CLButton.getAccessibleContext().setAccessibleName("");
        this.CLButton.setFont(new Font("Granada", 1, 15)); // NOI18N
        this.CLButton.setForeground(new Color(197, 53, 53));
        this.CLButton.setText("Listes De Client:");
        this.CLButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Interface.Car_code.Client.this.CLButtonActionPerformed(evt);
            }
        });

        this.NomclientText.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Interface.Car_code.Client.this.NomclientTextActionPerformed(evt);
            }
        });

        this.CINText.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Interface.Car_code.Client.this.CINTextActionPerformed(evt);
            }
        });
        this.jLabel7.setFont(new Font("DejaVu Serif Condensed", 1, 20));
        this.jLabel7.setForeground(new Color(203, 28, 28));
        this.jLabel7.setHorizontalAlignment(0);
        this.jLabel7.setText("Gerer Les Client");
        this.TableClient.setModel(new DefaultTableModel(null, new String[]{"CIN", "Nom", "Prenom", "Contact "}));
        this.TableClient.setRowHeight(25);
        this.TableClient.addComponentListener(new ComponentAdapter() {
            public void componentShown(ComponentEvent evt) {
                Interface.Car_code.Client.this.TableClientComponentShown(evt);
            }
        });
        this.jScrollPane1.setViewportView(this.TableClient);
        this.jLabel8.setFont(new Font("AlHor", 1, 18));
        this.jLabel8.setForeground(new Color(225, 62, 62));
        this.jLabel8.setHorizontalAlignment(0);
        this.jLabel8.setText("X");
        this.UpdateButton.setFont(new Font("Granada", 1, 15));
        this.UpdateButton.setForeground(new Color(197, 53, 53));
        this.UpdateButton.setText("Update");
        this.UpdateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Interface.Car_code.Client.this.UpdateButtonActionPerformed(evt);
            }
        });
        this.RechercheNButton.setFont(new Font("Granada", 1, 15));
        this.RechercheNButton.setForeground(new Color(197, 53, 53));
        this.RechercheNButton.setText("Recherche par nom");
        this.RechercheNButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Interface.Car_code.Client.this.RechercheNButtonActionPerformed(evt);
            }
        });
        this.AddButton.setFont(new Font("Granada", 1, 15));
        this.AddButton.setForeground(new Color(197, 53, 53));
        this.AddButton.setText("Add");
        this.AddButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Interface.Car_code.Client.this.AddButtonActionPerformed(evt);
            }
        });
        this.DeleteButton.setFont(new Font("Granada", 1, 15));
        this.DeleteButton.setForeground(new Color(197, 53, 53));
        this.DeleteButton.setText("Delete");
        this.DeleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Interface.Car_code.Client.this.DeleteButtonActionPerformed(evt);
            }
        });
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jPanel1, -2, 283, -2).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(253, 253, 253).addComponent(this.jLabel7, -2, 255, -2).addPreferredGap(ComponentPlacement.RELATED, -1, 32767).addComponent(this.jLabel8, -2, 31, -2)).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(3, 3, 3).addGap(18, 18, 18).addComponent(this.RechercheCButton).addComponent(this.CINText, -2, 156, -2).addGap(18, 18, 18).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.RechercheNButton).addComponent(this.NomclientText, -2, 158, -2)).addGroup(layout.createSequentialGroup().addGap(238, 238, 238).addComponent(this.CLButton, -2, 357, -2))).addContainerGap(64, 32767)).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(56, 56, 56).addComponent(this.jScrollPane1, -2, 725, -2)).addGroup(layout.createSequentialGroup().addGap(115, 115, 115).addComponent(this.AddButton, -2, 85, -2).addGap(78, 78, 78).addComponent(this.DeleteButton, -2, 85, -2).addGap(58, 58, 58).addComponent(this.UpdateButton, -2, 85, -2))).addGap(0, 0, 32767)))));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel1, -1, -1, 32767).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel8, -2, 26, -2).addGroup(layout.createSequentialGroup().addGap(20, 20, 20).addComponent(this.jLabel7, -2, 32, -2))).addGap(51, 51, 51).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.CINText, -2, -1, -2).addComponent(this.RechercheCButton).addComponent(this.RechercheNButton).addComponent(this.NomclientText, -2, -1, -2)).addPreferredGap(ComponentPlacement.RELATED, 44, 32767).addComponent(this.CLButton, -2, 32, -2).addGap(18, 18, 18).addComponent(this.jScrollPane1, -2, 319, -2).addGap(62, 62, 62).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.AddButton).addComponent(this.DeleteButton).addComponent(this.UpdateButton)).addGap(60, 60, 60)));
        this.pack();
    }

    private void CINTextActionPerformed(ActionEvent evt) {//GEN-FIRST:event_CINTextActionPerformed

    }//GEN-LAST:event_CINTextActionPerformed

    private void NomclientTextActionPerformed(ActionEvent evt) {//GEN-FIRST:event_NomclientTextActionPerformed

    }//GEN-LAST:event_NomclientTextActionPerformed

    private void  CLButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_CLButtonActionPerformed
        show_client(client_list());



    }//GEN-LAST:event_CLButtonActionPerformed

    private void UpdateButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        dispose();
        UpdateClient Upc=  new UpdateClient();
        Upc.show();
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void AddButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        dispose();
        AddClient Cl_ajout=new AddClient();
        Cl_ajout.show();
    }//GEN-LAST:event_AddButtonActionPerformed

    private void RechercheNButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_RechercheNButtonActionPerformed
        String mat = this.NomclientText.getText().trim();
        show_client(Nclient_list(mat));
    }//GEN-LAST:event_RechercheNButtonActionPerformed

    private void RechercheCButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_RechercheCButtonActionPerformed

        String Cin = this.CINText.getText().trim();
         int cin=Integer.parseInt(Cin);;
        show_client(Cclient_list(cin));

    }//GEN-LAST:event_RechercheCButtonActionPerformed

    private void DeleteButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        dispose();
        DeleteClient Cl_delete=new DeleteClient();
        Cl_delete.show();
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void TableClientComponentShown(ComponentEvent evt) {//GEN-FIRST:event_TableClientComponentShown
    }//GEN-LAST:event_TableClientComponentShown

    private void ClientButtonActionPerformed(ActionEvent evt){//GEN-FIRST:event_ClientButtonActionPerformed
        Interface.Car_code.Client Cl=new Interface.Car_code.Client();
        Cl.show();
        dispose();
    }//GEN-LAST:event_ClientButtonActionPerformed

    private void ReservationButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_ReservationButtonActionPerformed
        Booking Bo=new Booking();
        Bo.show();
        dispose();
    }//GEN-LAST:event_ReservationButtonActionPerformed

    private void VoitureButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_VoitureButtonActionPerformed
        Voiture Vo=new Voiture();
        Vo.show();
        dispose();
    }//GEN-LAST:event_VoitureButtonActionPerformed

    private void LogoutButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        login lo=new login();
        lo.show();
        dispose();
    }//GEN-LAST:event_LogoutButtonActionPerformed

    public static void main(String[] args) {
        try {
            UIManager.LookAndFeelInfo[] var1 = UIManager.getInstalledLookAndFeels();
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                UIManager.LookAndFeelInfo info = var1[var3];
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException var5) {
            Logger.getLogger(Interface.Car_code.Client.class.getName()).log(Level.SEVERE, (String)null, var5);
        } catch (InstantiationException var6) {
            Logger.getLogger(Interface.Car_code.Client.class.getName()).log(Level.SEVERE, (String)null, var6);
        } catch (IllegalAccessException var7) {
            Logger.getLogger(Interface.Car_code.Client.class.getName()).log(Level.SEVERE, (String)null, var7);
        } catch (UnsupportedLookAndFeelException var8) {
            Logger.getLogger(Interface.Car_code.Client.class.getName()).log(Level.SEVERE, (String)null, var8);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                (new Interface.Car_code.Client()).setVisible(true);
            }
        });
    }


}



