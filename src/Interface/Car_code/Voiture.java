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

public class Voiture extends JFrame {
    private JButton AddButton;
    private JButton ClientButton;
    private JButton DeleteButton;
    private JButton LogoutButton;
    private JTextField MatriculeText;
    private JTextField NomText;
    private JButton ReservationButton;
    private JTable TableVoiture;
    private JButton UpdateButton;
    private JButton VoitureButton;
    private JLabel jLabel1;
    private JButton RechercheNButton;
    private JButton RechercheMButton;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JPanel jPanel1;
    private JScrollPane jScrollPane1;

    public Voiture() {
        this.initComponents();
      // show_voiture(voiture_list());
    }

    public ArrayList<code.Voiture> voiture_list() {
        ArrayList<code.Voiture> voiture_list = new ArrayList<>();
        try {
            Connection cnx = null;
            Statement st = null;
            Class.forName("com.mysql.jdbc.Driver");
            cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/car", "root", "");
            st = cnx.createStatement();
            ResultSet res = st.executeQuery("select * from voiture");
            code.Voiture v;
            while (res.next()) {
                int matricule = res.getInt("matricule");
                int capacite = res.getInt("capacite");
                double prix = res.getDouble("prix");
                String name = res.getString("name");
                String maker = res.getString("maker");
                String colour = res.getString("colour");
                String type = res.getString("type");
                String model = res.getString("model");
                v = new code.Voiture(matricule, prix, maker, name, colour, type, capacite, model);
                voiture_list.add(v);
            }
        } catch (SQLException | ClassNotFoundException var6) {
            System.out.println("erreur" + var6);
        }
        return voiture_list;
    }
    public void show_voiture(ArrayList<code.Voiture> L_R){
        ArrayList<code.Voiture> liste = L_R;
        DefaultTableModel model = (DefaultTableModel) TableVoiture.getModel();
        Object[] row = new Object[8];
        for (int i=0;i<liste.size();i++){
            row[0]=liste.get(i).getMatricule();
            row[1]=liste.get(i).getMaker();
            row[2]=liste.get(i).getName();
            row[3]=liste.get(i).getColour();
            row[4]=liste.get(i).getType();
            row[5]=liste.get(i).getModel();
            row[6]=liste.get(i).getCapacite();
            row[7]=liste.get(i).getPrix();
            model.addRow(row);
        }
    }
    public ArrayList<code.Voiture> voiture_list(int x) {
        ArrayList<code.Voiture> voiture_list = new ArrayList<>();
        try {
            Connection cnx = null;
            Statement st = null;
            Class.forName("com.mysql.jdbc.Driver");
            cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/car", "root", "");
            st = cnx.createStatement();
            ResultSet res = st.executeQuery("select * from voiture where  matricule=" +x);

            code.Voiture R;
            while (res.next()) {
                int matricule = res.getInt("matricule");
                int capacite = res.getInt("capacite");
                double prix = res.getDouble("prix");
                String name = res.getString("name");
                String maker = res.getString("maker");
                String colour = res.getString("colour");
                String type = res.getString("type");
                String model = res.getString("model");
                R = new code.Voiture(matricule, prix, maker, name, colour, type, capacite, model);
                voiture_list.add(R);
            }
        } catch (SQLException | ClassNotFoundException var6) {
            System.out.println("erreur" + var6);
        }
        return voiture_list;
    }
    public ArrayList<code.Voiture> Nvoiture_list(String x) {
        ArrayList<code.Voiture> voiture_list = new ArrayList<>();
        try {
            Connection cnx = null;
            Statement st = null;
            Class.forName("com.mysql.jdbc.Driver");
            cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/car", "root", "");
            st = cnx.createStatement();
            ResultSet res = st.executeQuery("select * from voiture where  name =" +x);

            code.Voiture R;
            while (res.next()) {
                int matricule = res.getInt("matricule");
                int capacite = res.getInt("capacite");
                double prix = res.getDouble("prix");
                String name = res.getString("name");
                String maker = res.getString("maker");
                String colour = res.getString("colour");
                String type = res.getString("type");
                String model = res.getString("model");
                R = new code.Voiture(matricule, prix, maker, name, colour, type, capacite, model);
                voiture_list.add(R);
            }
        } catch (SQLException | ClassNotFoundException var6) {
            System.out.println("erreur" + var6);
        }
        return voiture_list;
    }



    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.ClientButton = new JButton();
        this.LogoutButton = new JButton();
        this.VoitureButton = new JButton();
        this.ReservationButton = new JButton();
        this.jLabel1 = new JLabel();
        this.RechercheNButton = new JButton();
        this.RechercheMButton = new JButton();
        this.MatriculeText = new JTextField();
        this.NomText = new JTextField();
        this.AddButton = new JButton();
        this.DeleteButton = new JButton();
        this.jLabel7 = new JLabel();
        this.jScrollPane1 = new JScrollPane();
        this.TableVoiture = new JTable();
        this.jLabel8 = new JLabel();
        this.UpdateButton = new JButton();
        this.setDefaultCloseOperation(3);
        this.jPanel1.setBackground(new Color(203, 28, 28));
        this.ClientButton.setFont(new Font("Granada", 1, 15)); // NOI18N
        this.ClientButton.setForeground(new Color(197, 53, 53));
        this.ClientButton.setText("Client");
        this.ClientButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    Voiture.this.ClientButtonActionPerformed(evt);
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
                Voiture.this.LogoutButtonActionPerformed(evt);
            }
        });
        this.VoitureButton.setFont(new Font("Granada", 1, 15)); // NOI18N
        this.VoitureButton.setForeground(new Color(197, 53, 53));
        this.VoitureButton.setText("Voiture");
        this.VoitureButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Voiture.this.VoitureButtonActionPerformed(evt);
            }
        });
        this.ReservationButton.setFont(new Font("Granada", 1, 15)); // NOI18N
        this.ReservationButton.setForeground(new Color(197, 53, 53));
        this.ReservationButton.setText("Reservation");
        this.ReservationButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Voiture.this.ReservationButtonActionPerformed(evt);
            }
        });
        this.RechercheMButton.setFont(new Font("Granada", 1, 15)); // NOI18N
        this.RechercheMButton.setForeground(new Color(197, 53, 53));
        this.RechercheMButton.setText("Recherche Par Matricule: ");
        this.RechercheMButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Voiture.this.RechercheMButtonActionPerformed(evt);
            }
        });
        this.RechercheNButton.setFont(new Font("Granada", 1, 15)); // NOI18N
        this.RechercheNButton.setForeground(new Color(197, 53, 53));
        this.RechercheNButton.setText("Recherche Par Nom: ");
        this.RechercheNButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Voiture.this.RechercheNButtonActionPerformed(evt);
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
        this.jLabel1.setText("Listes De Voitures :");


        this.MatriculeText.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Voiture.this.MatriculeTextActionPerformed(evt);
            }
        });
        this.NomText.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Voiture.this.NomTextActionPerformed(evt);
            }
        });
        this.AddButton.setFont(new Font("Granada", 1, 15));
        this.AddButton.setForeground(new Color(197, 53, 53));
        this.AddButton.setText("Add");
        this.AddButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Voiture.this.AddButtonActionPerformed(evt);
            }
        });
        this.DeleteButton.setFont(new Font("Granada", 1, 15));
        this.DeleteButton.setForeground(new Color(197, 53, 53));
        this.DeleteButton.setText("Supprimer");
        this.DeleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Voiture.this.DeleteButtonActionPerformed(evt);
            }
        });
        this.jLabel7.setFont(new Font("DejaVu Serif Condensed", 1, 20));
        this.jLabel7.setForeground(new Color(203, 28, 28));
        this.jLabel7.setHorizontalAlignment(0);
        this.jLabel7.setText("Gerer Les Voitures");

        this.TableVoiture.setModel(new DefaultTableModel(null ,new String[]{"Matricule", "Maker", " Nom", "Colour", " Type", " Model", "Capacite", "Prix"}));
        this.TableVoiture.setRowHeight(25);
        this.TableVoiture.addComponentListener(new ComponentAdapter() {
            public void componentShown(ComponentEvent evt) {
                Voiture.this.TableVoitureComponentShown(evt);
            }
        });
        this.jScrollPane1.setViewportView(this.TableVoiture);
        this.jLabel8.setFont(new Font("AlHor", 1, 18));
        this.jLabel8.setForeground(new Color(225, 62, 62));
        this.jLabel8.setHorizontalAlignment(0);
        this.jLabel8.setText("X");
        this.UpdateButton.setFont(new Font("Granada", 1, 15));
        this.UpdateButton.setForeground(new Color(197, 53, 53));
        this.UpdateButton.setText("Update");
        this.UpdateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Voiture.this.UpdateButtonActionPerformed(evt);
            }
        });
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jPanel1, -2, 283, -2).addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(253, 253, 253).addComponent(this.jLabel7, -2, 217, -2).addPreferredGap(ComponentPlacement.RELATED, -1, 32767).addComponent(this.jLabel8, -2, 31, -2)).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(3, 3, 3).addComponent(this.RechercheMButton, -2, 207, -2).addGap(10, 10, 10).addComponent(this.MatriculeText, -2, 156, -2).addGap(18, 18, 18).addComponent(this.RechercheNButton, -2, 207, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.NomText, -2, 127, -2)).addGroup(layout.createSequentialGroup().addGap(101, 101, 101).addComponent(this.AddButton, -2, 85, -2).addGap(78, 78, 78).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.DeleteButton, -2, 85, -2).addGap(58, 58, 58).addComponent(this.UpdateButton, -2, 85, -2)).addGroup(layout.createSequentialGroup().addGap(238, 238, 238).addComponent(this.jLabel1, -2, 357, -2))).addContainerGap()).addGroup(layout.createSequentialGroup().addGap(56, 56, 56).addComponent(this.jScrollPane1, -2, 725, -2).addGap(0, 66, 32767)))));
        layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel1, -1, -1, 32767).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jLabel8, -2, 26, -2).addGroup(layout.createSequentialGroup().addGap(20, 20, 20).addComponent(this.jLabel7, -2, 32, -2))).addGap(51, 51, 51).addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(this.MatriculeText, -2, -1, -2).addComponent(this.RechercheMButton).addComponent(this.RechercheNButton).addComponent(this.NomText, -2, -1, -2)).addPreferredGap(ComponentPlacement.RELATED, 44, 32767).addComponent(this.jLabel1, -2, 32, -2).addGap(18, 18, 18).addComponent(this.jScrollPane1, -2, 319, -2).addGap(46, 46, 46).addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(this.AddButton).addComponent(this.DeleteButton).addComponent(this.UpdateButton)).addGap(76, 76, 76)));
        this.pack();
    }

    private void MatriculeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MatriculeTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MatriculeTextActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        dispose();
        AddCar A=new AddCar();
        A.show();

    }//GEN-LAST:event_AddButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        dispose();
        DeleteCar D=new DeleteCar();
        D.show();
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        dispose();
        UpdateCar Upca = new UpdateCar();
        Upca.show();
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void TableVoitureComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_TableVoitureComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_TableVoitureComponentShown

    private void NomTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomTextActionPerformed

    private void ClientButtonActionPerformed(java.awt.event.ActionEvent evt)throws Exception {//GEN-FIRST:event_ClientButtonActionPerformed
        Interface.Car_code.Client Cl=new Interface.Car_code.Client();
        Cl.show();
        dispose();
    }//GEN-LAST:event_ClientButtonActionPerformed

    private void ReservationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReservationButtonActionPerformed
        Booking Bo=new Booking();
        Bo.show();
        dispose();
    }//GEN-LAST:event_ReservationButtonActionPerformed
    private void RechercheMButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReservationButtonActionPerformed
        String Mat = this.MatriculeText.getText().trim();
        int mat=Integer.parseInt(Mat);
        show_voiture(voiture_list(mat));
    }//GEN-LAST:event_RechercheMButtonActionPerformed
    private void RechercheNButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReservationButtonActionPerformed
      String nom = this.NomText.getText().trim();

      show_voiture(Nvoiture_list(nom));
    }//GEN-LAST:event_RechercheNButtonActionPerformed


    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        login lo=new login();
        lo.show();
        dispose();
    }//GEN-LAST:event_LogoutButtonActionPerformed

    private void VoitureButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoitureButtonActionPerformed
        Voiture Vo=new Voiture();
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
            Logger.getLogger(Voiture.class.getName()).log(Level.SEVERE, (String)null, var5);
        } catch (InstantiationException var6) {
            Logger.getLogger(Voiture.class.getName()).log(Level.SEVERE, (String)null, var6);
        } catch (IllegalAccessException var7) {
            Logger.getLogger(Voiture.class.getName()).log(Level.SEVERE, (String)null, var7);
        } catch (UnsupportedLookAndFeelException var8) {
            Logger.getLogger(Voiture.class.getName()).log(Level.SEVERE, (String)null, var8);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Voiture().setVisible(true);
            }
        });
    }


}
