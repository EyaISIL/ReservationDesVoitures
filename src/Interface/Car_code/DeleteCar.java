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

public class DeleteCar extends JFrame {
    private JButton CncelButton;
    private JButton DeleteButton;
    private JTextField IDvoitureText;
    private JLabel jLabel4;

    public DeleteCar() {
        this.initComponents();
    }

    private void initComponents() {
        this.jLabel4 = new JLabel();
        this.IDvoitureText = new JTextField();
        this.CncelButton = new JButton();
        this.DeleteButton = new JButton();
        this.setDefaultCloseOperation(3);
        this.jLabel4.setFont(new Font("Granada", 1, 18));
        this.jLabel4.setForeground(new Color(18, 16, 16));
        this.jLabel4.setText(" Entrer l'ID De Voiture:");
        this.IDvoitureText.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                DeleteCar.this.IDvoitureTextActionPerformed(evt);
            }
        });
        this.CncelButton.setFont(new Font("Granada", 1, 15));
        this.CncelButton.setForeground(new Color(197, 53, 53));
        this.CncelButton.setText("Cancel");
        this.CncelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    DeleteCar.this.CncelButtonActionPerformed(evt);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        this.DeleteButton.setFont(new Font("Granada", 1, 15));
        this.DeleteButton.setForeground(new Color(197, 53, 53));
        this.DeleteButton.setText("Delete");
        this.DeleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    DeleteCar.this.DeleteButtonActionPerformed(evt);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(96, 96, 96).addComponent(this.jLabel4, -2, 265, -2).addContainerGap(-1, 32767)).addGroup(Alignment.TRAILING, layout.createSequentialGroup().addContainerGap(80, 32767).addGroup(layout.createParallelGroup(Alignment.LEADING, false).addGroup(Alignment.TRAILING, layout.createSequentialGroup().addComponent(this.IDvoitureText, -2, 265, -2).addGap(98, 98, 98)).addGroup(Alignment.TRAILING, layout.createSequentialGroup().addComponent(this.DeleteButton, -2, 85, -2).addPreferredGap(ComponentPlacement.RELATED, -1, 32767).addComponent(this.CncelButton, -2, 85, -2).addGap(111, 111, 111)))));
        layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(77, 77, 77).addComponent(this.jLabel4).addGap(28, 28, 28).addComponent(this.IDvoitureText, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED, 55, 32767).addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(this.CncelButton).addComponent(this.DeleteButton)).addGap(98, 98, 98)));
        this.pack();
    }

    private void IDvoitureTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDvoitureTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDvoitureTextActionPerformed

    private void CncelButtonActionPerformed(java.awt.event.ActionEvent evt) throws Exception {//GEN-FIRST:event_CncelButtonActionPerformed
        dispose();
        Interface.Car_code.Voiture menu = new Interface.Car_code.Voiture();
        menu.show();
    }//GEN-LAST:event_CncelButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt)throws Exception {//GEN-FIRST:event_DeleteButtonActionPerformed
       String id=this.IDvoitureText.getText().trim();
       int ID=Integer.parseInt(id);
       Voiture V=new Voiture();
       V.remove(ID);
        dispose();
        Interface.Car_code.Voiture menu = new Interface.Car_code.Voiture();
        menu.show();
    }//GEN-LAST:event_DeleteButtonActionPerformed

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
            Logger.getLogger(DeleteCar.class.getName()).log(Level.SEVERE, (String)null, var5);
        } catch (InstantiationException var6) {
            Logger.getLogger(DeleteCar.class.getName()).log(Level.SEVERE, (String)null, var6);
        } catch (IllegalAccessException var7) {
            Logger.getLogger(DeleteCar.class.getName()).log(Level.SEVERE, (String)null, var7);
        } catch (UnsupportedLookAndFeelException var8) {
            Logger.getLogger(DeleteCar.class.getName()).log(Level.SEVERE, (String)null, var8);
        }
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                (new DeleteCar()).setVisible(true);
            }
        });

    }


}
