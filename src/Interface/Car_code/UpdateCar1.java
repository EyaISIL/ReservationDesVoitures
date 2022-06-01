/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package Interface.Car_code;

//import code.Voiture;
import code.*;
import Interface.Car_code.UpdateCar;
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

public class UpdateCar1 extends JFrame {
    private JButton CancelButton;
    private JTextField CapaciteText;
    private JTextField ColourText;
    private JTextField MakerText;
    private JTextField ModelText;
    private JTextField NomText;
    private JTextField PrixText;
    private JTextField TypeText;
    private JButton UpdateButton;
    private JLabel jLabel10;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private  Voiture voit;

    public UpdateCar1(Voiture v) {
        this.voit = v;
        this.initComponents(voit);


        
    }

    private void initComponents(Voiture v) {
        this.jLabel4 = new JLabel();
        this.MakerText = new JTextField();
        this.CancelButton = new JButton();
        this.UpdateButton = new JButton();
        this.jLabel3 = new JLabel();
        this.jLabel5 = new JLabel();
        this.ColourText = new JTextField();
        this.jLabel6 = new JLabel();
        this.NomText = new JTextField();
        this.jLabel7 = new JLabel();
        this.ModelText = new JTextField();
        this.jLabel8 = new JLabel();
        this.TypeText = new JTextField();
        this.jLabel9 = new JLabel();
        this.PrixText = new JTextField();
        this.jLabel10 = new JLabel();
        this.CapaciteText = new JTextField();
        this.setDefaultCloseOperation(3);
        this.jLabel4.setFont(new Font("Granada", 1, 18));
        this.jLabel4.setForeground(new Color(18, 16, 16));
        this.jLabel4.setText(" Maker :");
        MakerText.setText(v.getMaker());
        this.MakerText.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                UpdateCar1.this.MakerTextActionPerformed(evt);
            }
        });
        this.CancelButton.setFont(new Font("Granada", 1, 15));
        this.CancelButton.setForeground(new Color(197, 53, 53));
        this.CancelButton.setText("Cancel");
        this.CancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                UpdateCar1.this.CancelButtonActionPerformed(evt);
            }
        });
        this.UpdateButton.setFont(new Font("Granada", 1, 15));
        this.UpdateButton.setForeground(new Color(197, 53, 53));
        this.UpdateButton.setText("Update");
        this.UpdateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    UpdateCar1.this.UpdateButtonActionPerformed(evt);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        this.jLabel3.setFont(new Font("Granada", 1, 18));
        this.jLabel3.setForeground(new Color(18, 16, 16));
        this.jLabel3.setText("Matricule :      " + v.getMatricule());
        //MatriculeText.setText(Integer.toString(v.getMatricule()));
        this.jLabel5.setFont(new Font("Granada", 1, 18));
        this.jLabel5.setForeground(new Color(18, 16, 16));
        this.jLabel5.setText(" Colour  :");
        ColourText.setText(v.getColour());
        this.ColourText.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                UpdateCar1.this.ColourTextActionPerformed(evt);
            }
        });
        this.jLabel6.setFont(new Font("Granada", 1, 18));
        this.jLabel6.setForeground(new Color(18, 16, 16));
        this.jLabel6.setText("Nom :");
        NomText.setText(v.getName());
        this.NomText.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                UpdateCar1.this.NomTextActionPerformed(evt);
            }
        });
        this.jLabel7.setFont(new Font("Granada", 1, 18));
        this.jLabel7.setForeground(new Color(18, 16, 16));
        this.jLabel7.setText(" Model :");
        ModelText.setText(v.getModel());
        this.ModelText.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                UpdateCar1.this.ModelTextActionPerformed(evt);
            }
        });
        this.jLabel8.setFont(new Font("Granada", 1, 18));
        this.jLabel8.setForeground(new Color(18, 16, 16));
        this.jLabel8.setText("Type :");
        TypeText.setText(v.getType());
        this.TypeText.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                UpdateCar1.this.TypeTextActionPerformed(evt);
            }
        });
        this.jLabel9.setFont(new Font("Granada", 1, 18));
        this.jLabel9.setForeground(new Color(18, 16, 16));
        this.jLabel9.setText(" Prix :");
        PrixText.setText(Double.toString(v.getPrix()));
        this.PrixText.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                UpdateCar1.this.PrixTextActionPerformed(evt);
            }
        });
        this.jLabel10.setFont(new Font("Granada", 1, 18));
        this.jLabel10.setForeground(new Color(18, 16, 16));
        this.jLabel10.setText("Capacite:");
        CapaciteText.setText(Integer.toString(v.getCapacite()));
        this.CapaciteText.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                UpdateCar1.this.CapaciteTextActionPerformed(evt);
            }
        });
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(94, 94, 94).addComponent(this.UpdateButton, -2, 85, -2).addGap(74, 74, 74).addComponent(this.CancelButton, -2, 85, -2).addGap(0, 0, 32767)).addGroup(layout.createSequentialGroup().addGap(19, 19, 19).addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jLabel3).addComponent(this.jLabel4, -1, -1, 32767)).addGap(471, 471, 471)).addGroup(layout.createSequentialGroup().addGap(6, 6, 6).addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING, layout.createSequentialGroup().addComponent(this.jLabel9, -2, 91, -2).addGap(18, 18, 18)).addGroup(layout.createSequentialGroup().addComponent(this.jLabel10).addGap(33, 33, 33))).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jLabel7, -2, 78, -2).addComponent(this.jLabel8)).addGap(31, 31, 31))).addGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.TypeText, -2, 265, -2).addComponent(this.ModelText, -2, 265, -2).addGroup(layout.createParallelGroup(Alignment.LEADING, false).addComponent(this.PrixText).addComponent(this.CapaciteText, -2, 265, -2))).addContainerGap(-1, 32767)).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jLabel6).addGroup(layout.createSequentialGroup().addComponent(this.jLabel5, -2, 84, -2).addGap(31, 31, 31).addGroup(layout.createParallelGroup(Alignment.TRAILING).addComponent(this.ColourText, -2, 265, -2).addComponent(this.NomText, -2, 265, -2).addGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.MakerText, -2, 265, -2))))).addGap(0, 0, 32767)))));
        layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(58, 58, 58).addComponent(this.jLabel3).addPreferredGap(ComponentPlacement.UNRELATED).addComponent(this.jLabel4).addGap(16, 16, 16)).addGroup(Alignment.TRAILING, layout.createSequentialGroup().addContainerGap().addComponent(this.MakerText, -2, -1, -2).addPreferredGap(ComponentPlacement.UNRELATED))).addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel6).addComponent(this.NomText, -2, -1, -2)).addPreferredGap(ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel5).addComponent(this.ColourText, -2, -1, -2)).addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addPreferredGap(ComponentPlacement.UNRELATED).addComponent(this.jLabel8).addPreferredGap(ComponentPlacement.UNRELATED).addComponent(this.jLabel7).addPreferredGap(ComponentPlacement.RELATED, 12, 32767)).addGroup(Alignment.TRAILING, layout.createSequentialGroup().addPreferredGap(ComponentPlacement.RELATED, -1, 32767).addComponent(this.TypeText, -2, -1, -2).addPreferredGap(ComponentPlacement.UNRELATED).addComponent(this.ModelText, -2, -1, -2).addGap(18, 18, 18))).addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel10).addComponent(this.CapaciteText, -2, -1, -2)).addPreferredGap(ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel9).addComponent(this.PrixText, -2, -1, -2)).addPreferredGap(ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(this.CancelButton).addComponent(this.UpdateButton)).addGap(59, 59, 59)));
        this.pack();
    }

    private void MakerTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MakerTextActionPerformed
        Voiture v = new Voiture();
        v = v.getvoiture(voit.getMatricule());
        v.affiche();
        MakerText.setText(v.getMaker());
    }//GEN-LAST:event_MakerTextActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        Interface.Car_code.Voiture v =  new Interface.Car_code.Voiture();
        v.show();
        dispose();
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt)throws Exception {//GEN-FIRST:event_UpdateButtonActionPerformed
        String maker = this.MakerText.getText().trim();
        String name = this.NomText.getText().trim();
        String colour = this.ColourText.getText().trim();
        String type = this.TypeText.getText().trim();
        String model = this.ModelText.getText().trim();
        String p = this.PrixText.getText().trim();
        String cap = this.CapaciteText.getText().trim();
        int matricule = voit.getMatricule();
        int capacite = Integer.parseInt(cap);
        double prix = Double.parseDouble(p);

       // int x= UpdateCar.UpdateButtonActionPerformed(evt);
        code.Voiture V=new code.Voiture(matricule, prix, maker, name, colour, type, capacite, model);
        V.update( matricule,V );
        dispose();
        Interface.Car_code.Voiture menu = new Interface.Car_code.Voiture();
        menu.show();
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void MatriculeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MatriculeTextActionPerformed
    }//GEN-LAST:event_MatriculeTextActionPerformed

    private void ColourTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColourTextActionPerformed
        Voiture v = new Voiture();
        v = v.getvoiture(voit.getMatricule());
        v.affiche();
        ColourText.setText(v.getColour());

    }//GEN-LAST:event_ColourTextActionPerformed

    private void NomTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomTextActionPerformed
        Voiture v = new Voiture();
        v = v.getvoiture(voit.getMatricule());
        v.affiche();
        NomText.setText(v.getName());
    }//GEN-LAST:event_NomTextActionPerformed

    private void ModelTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModelTextActionPerformed
        Voiture v = new Voiture();
        v = v.getvoiture(voit.getMatricule());
        v.affiche();
        ModelText.setText(v.getModel());
    }//GEN-LAST:event_ModelTextActionPerformed

    private void TypeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TypeTextActionPerformed
        Voiture v = new Voiture();
        v = v.getvoiture(voit.getMatricule());
        v.affiche();

        TypeText.setText(v.getType());

    }//GEN-LAST:event_TypeTextActionPerformed

    private void PrixTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrixTextActionPerformed
        Voiture v = new Voiture();
        v = v.getvoiture(voit.getMatricule());
        v.affiche();
        PrixText.setText(Double.toString(v.getPrix()));
    }//GEN-LAST:event_PrixTextActionPerformed

    private void CapaciteTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CapaciteTextActionPerformed
        Voiture v = new Voiture();
        v = v.getvoiture(voit.getMatricule());
        v.affiche();
        CapaciteText.setText(Integer.toString(v.getCapacite()));
    }//GEN-LAST:event_CapaciteTextActionPerformed

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
            Logger.getLogger(UpdateCar1.class.getName()).log(Level.SEVERE, (String)null, var5);
        } catch (InstantiationException var6) {
            Logger.getLogger(UpdateCar1.class.getName()).log(Level.SEVERE, (String)null, var6);
        } catch (IllegalAccessException var7) {
            Logger.getLogger(UpdateCar1.class.getName()).log(Level.SEVERE, (String)null, var7);
        } catch (UnsupportedLookAndFeelException var8) {
            Logger.getLogger(UpdateCar1.class.getName()).log(Level.SEVERE, (String)null, var8);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                Voiture v = new Voiture();
                (new UpdateCar1(v)).setVisible(true);
            }
        });
    }


}
