/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package Interface.Car_code;

import code.Voiture;
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

public class AddCar extends JFrame {
    private JButton AddButton;
    private JButton CancelButton;
    private JLabel Capacite;
    private JTextField CapaciteText;
    private JLabel Colour;
    private JTextField ColourText;
    private JLabel Maker;
    private JTextField MakerText;
    private JLabel Matricule;
    private JTextField MatriculeText;
    private JLabel Model;
    private JTextField ModelText;
    private JLabel Nom;
    private JTextField NomText;
    private JLabel Prix;
    private JTextField PrixText;
    private JLabel Type;
    private JTextField TypeText;

    public AddCar() {
        this.initComponents();
    }

    private void initComponents() {
        this.Maker = new JLabel();
        this.MakerText = new JTextField();
        this.CancelButton = new JButton();
        this.AddButton = new JButton();
        this.Matricule = new JLabel();
        this.MatriculeText = new JTextField();
        this.Colour = new JLabel();
        this.ColourText = new JTextField();
        this.Nom = new JLabel();
        this.NomText = new JTextField();
        this.Model = new JLabel();
        this.ModelText = new JTextField();
        this.Type = new JLabel();
        this.TypeText = new JTextField();
        this.Prix = new JLabel();
        this.PrixText = new JTextField();
        this.Capacite = new JLabel();
        this.CapaciteText = new JTextField();
        this.setDefaultCloseOperation(3);
        this.Maker.setFont(new Font("Granada", 1, 18));
        this.Maker.setForeground(new Color(18, 16, 16));
        this.Maker.setText(" Maker :");
        this.MakerText.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                AddCar.this.MakerTextActionPerformed(evt);
            }
        });
        this.CancelButton.setFont(new Font("Granada", 1, 15));
        this.CancelButton.setForeground(new Color(197, 53, 53));
        this.CancelButton.setText("Cancel");
        this.CancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                AddCar.this.CancelButtonActionPerformed(evt);
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
                try {
                    AddCar.this.AddButtonActionPerformed(evt);
                } catch (Exception var3) {
                    var3.printStackTrace();
                }

            }
        });
        this.Matricule.setFont(new Font("Granada", 1, 18));
        this.Matricule.setForeground(new Color(18, 16, 16));
        this.Matricule.setText("Matricule :");
        this.MatriculeText.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                AddCar.this.MatriculeTextActionPerformed(evt);
            }
        });
        this.Colour.setFont(new Font("Granada", 1, 18));
        this.Colour.setForeground(new Color(18, 16, 16));
        this.Colour.setText(" Colour  :");
        this.ColourText.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                AddCar.this.ColourTextActionPerformed(evt);
            }
        });
        this.Nom.setFont(new Font("Granada", 1, 18));
        this.Nom.setForeground(new Color(18, 16, 16));
        this.Nom.setText("Nom :");
        this.NomText.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                AddCar.this.NomTextActionPerformed(evt);
            }
        });
        this.Model.setFont(new Font("Granada", 1, 18));
        this.Model.setForeground(new Color(18, 16, 16));
        this.Model.setText(" Model :");
        this.ModelText.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                AddCar.this.ModelTextActionPerformed(evt);
            }
        });
        this.Type.setFont(new Font("Granada", 1, 18));
        this.Type.setForeground(new Color(18, 16, 16));
        this.Type.setText("Type :");
        this.TypeText.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                AddCar.this.TypeTextActionPerformed(evt);
            }
        });
        this.Prix.setFont(new Font("Granada", 1, 18));
        this.Prix.setForeground(new Color(18, 16, 16));
        this.Prix.setText(" Prix :");
        this.PrixText.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                AddCar.this.PrixTextActionPerformed(evt);
            }
        });
        this.Capacite.setFont(new Font("Granada", 1, 18));
        this.Capacite.setForeground(new Color(18, 16, 16));
        this.Capacite.setText("Capacite:");
        this.CapaciteText.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                AddCar.this.CapaciteTextActionPerformed(evt);
            }
        });
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(94, 94, 94).addComponent(this.AddButton, -2, 85, -2).addGap(74, 74, 74).addComponent(this.CancelButton, -2, 85, -2).addGap(0, 0, 32767)).addGroup(layout.createSequentialGroup().addGap(19, 19, 19).addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.Matricule).addComponent(this.Maker, -1, -1, 32767)).addGap(471, 471, 471)).addGroup(layout.createSequentialGroup().addGap(6, 6, 6).addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING, layout.createSequentialGroup().addComponent(this.Prix, -2, 91, -2).addGap(18, 18, 18)).addGroup(layout.createSequentialGroup().addComponent(this.Capacite).addGap(33, 33, 33))).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.Model, -2, 78, -2).addComponent(this.Type)).addGap(31, 31, 31))).addGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.TypeText, -2, 265, -2).addComponent(this.ModelText, -2, 265, -2).addGroup(layout.createParallelGroup(Alignment.LEADING, false).addComponent(this.PrixText).addComponent(this.CapaciteText, -2, 265, -2))).addContainerGap(-1, 32767)).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.Nom).addGroup(layout.createSequentialGroup().addComponent(this.Colour, -2, 84, -2).addGap(31, 31, 31).addGroup(layout.createParallelGroup(Alignment.TRAILING).addComponent(this.ColourText, -2, 265, -2).addComponent(this.NomText, -2, 265, -2).addGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.MakerText, -2, 265, -2).addComponent(this.MatriculeText, -2, 265, -2))))).addGap(0, 0, 32767)))));
        layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(58, 58, 58).addComponent(this.Matricule).addPreferredGap(ComponentPlacement.UNRELATED).addComponent(this.Maker).addGap(16, 16, 16)).addGroup(Alignment.TRAILING, layout.createSequentialGroup().addContainerGap().addComponent(this.MatriculeText, -2, -1, -2).addPreferredGap(ComponentPlacement.UNRELATED).addComponent(this.MakerText, -2, -1, -2).addPreferredGap(ComponentPlacement.UNRELATED))).addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(this.Nom).addComponent(this.NomText, -2, -1, -2)).addPreferredGap(ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(this.Colour).addComponent(this.ColourText, -2, -1, -2)).addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addPreferredGap(ComponentPlacement.UNRELATED).addComponent(this.Type).addPreferredGap(ComponentPlacement.UNRELATED).addComponent(this.Model).addPreferredGap(ComponentPlacement.RELATED, -1, 32767)).addGroup(Alignment.TRAILING, layout.createSequentialGroup().addPreferredGap(ComponentPlacement.RELATED, -1, 32767).addComponent(this.TypeText, -2, -1, -2).addPreferredGap(ComponentPlacement.UNRELATED).addComponent(this.ModelText, -2, -1, -2).addGap(18, 18, 18))).addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(this.Capacite).addComponent(this.CapaciteText, -2, -1, -2)).addPreferredGap(ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(this.Prix).addComponent(this.PrixText, -2, -1, -2)).addPreferredGap(ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(this.CancelButton).addComponent(this.AddButton)).addGap(59, 59, 59)));
        this.pack();
    }
    private void MakerTextActionPerformed(ActionEvent evt) {//GEN-FIRST:event_MakerTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MakerTextActionPerformed

    private void CancelButtonActionPerformed(ActionEvent evt) throws Exception {//GEN-FIRST:event_CancelButtonActionPerformed
        dispose();
        Interface.Car_code.Voiture menu = new Interface.Car_code.Voiture();
        menu.show();
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void AddButtonActionPerformed(ActionEvent evt)  throws Exception {
        String maker = this.MakerText.getText().trim();
        String name = this.NomText.getText().trim();
        String colour = this.ColourText.getText().trim();
        String type = this.TypeText.getText().trim();
        String model = this.ModelText.getText().trim();
        String mat = this.MatriculeText.getText().trim();
        String p = this.PrixText.getText().trim();
        String cap = this.CapaciteText.getText().trim();
        int matricule = Integer.parseInt(mat);
        int capacite = Integer.parseInt(cap);
        double prix = Double.parseDouble(p);
        code.Voiture a = new code.Voiture(matricule, prix, maker, name, colour, type, capacite, model);
        a.add();
        dispose();
        Interface.Car_code.Voiture menu = new Interface.Car_code.Voiture();
        menu.show();
    }//GEN-LAST:event_AddButtonActionPerformed

    private void MatriculeTextActionPerformed(ActionEvent evt) {//GEN-FIRST:event_MatriculeTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MatriculeTextActionPerformed

    private void ColourTextActionPerformed(ActionEvent evt) {//GEN-FIRST:event_ColourTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ColourTextActionPerformed

    private void NomTextActionPerformed(ActionEvent evt) {//GEN-FIRST:event_NomTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomTextActionPerformed

    private void ModelTextActionPerformed(ActionEvent evt) {//GEN-FIRST:event_ModelTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ModelTextActionPerformed

    private void TypeTextActionPerformed(ActionEvent evt) {//GEN-FIRST:event_TypeTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TypeTextActionPerformed

    private void PrixTextActionPerformed(ActionEvent evt) {//GEN-FIRST:event_PrixTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrixTextActionPerformed

    private void CapaciteTextActionPerformed(ActionEvent evt) {//GEN-FIRST:event_CapaciteTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CapaciteTextActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            Logger.getLogger(AddCar.class.getName()).log(Level.SEVERE, (String)null, var5);
        } catch (InstantiationException var6) {
            Logger.getLogger(AddCar.class.getName()).log(Level.SEVERE, (String)null, var6);
        } catch (IllegalAccessException var7) {
            Logger.getLogger(AddCar.class.getName()).log(Level.SEVERE, (String)null, var7);
        } catch (UnsupportedLookAndFeelException var8) {
            Logger.getLogger(AddCar.class.getName()).log(Level.SEVERE, (String)null, var8);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                (new AddCar()).setVisible(true);
            }
        });
    }

}
