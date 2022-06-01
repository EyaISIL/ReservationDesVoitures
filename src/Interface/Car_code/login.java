

package Interface.Car_code;

import java.awt.Button;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager.LookAndFeelInfo;

import static javax.swing.JOptionPane.showConfirmDialog;

public class login extends JFrame {
    private Button Loginbutton;
    private JTextField PasswordText;
    private Button ResetButton;
    private JTextField UsernameText;
    private JLabel XLabel;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JPanel jPanel1;
    private Label label1;
    private Label label2;
    private Label label3;

    public login() {
        this.initComponents();
    }

    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.label1 = new Label();
        this.label2 = new Label();
        this.label3 = new Label();
        this.jLabel2 = new JLabel();
        this.jLabel1 = new JLabel();
        this.UsernameText = new JTextField();
        this.PasswordText = new JTextField();
        this.jLabel3 = new JLabel();
        this.Loginbutton = new Button();
        this.XLabel = new JLabel();
        this.ResetButton = new Button();
        this.setDefaultCloseOperation(3);
        this.jPanel1.setBackground(new Color(203, 28, 28));
        this.label1.setAlignment(1);
        this.label1.setCursor(new Cursor(0));
        this.label1.setFont(new Font("Dialog", 1, 18));
        this.label1.setForeground(new Color(255, 255, 255));
        this.label1.setText("The Best Services  ");
        this.label2.setAlignment(1);
        this.label2.setCursor(new Cursor(0));
        this.label2.setFont(new Font("Dialog", 1, 18));
        this.label2.setForeground(new Color(255, 255, 255));
        this.label2.setText("For Car Renting");
        this.label3.setAlignment(1);
        this.label3.setCursor(new Cursor(0));
        this.label3.setFont(new Font("Dialog", 1, 18));
        this.label3.setForeground(new Color(255, 255, 255));
        this.label3.setText(" Around The World");
        GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(this.label3, -2, 270, -2)).addGroup(jPanel1Layout.createSequentialGroup().addGap(26, 26, 26).addComponent(this.label1, -2, 240, -2)).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(this.label2, -2, 270, -2))).addContainerGap(-1, 32767)));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(130, 130, 130).addComponent(this.label1, -2, 52, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.label3, -2, 50, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.label2, -2, 50, -2).addContainerGap(193, 32767)));
        this.jLabel2.setFont(new Font("DejaVu Sans", 1, 26));
        this.jLabel2.setForeground(new Color(225, 62, 62));
        this.jLabel2.setText("Car Rental Software ");
        this.jLabel1.setBackground(new Color(0, 0, 0));
        this.jLabel1.setFont(new Font("DejaVu Sans", 1, 16));
        this.jLabel1.setForeground(new Color(11, 7, 7));
        this.jLabel1.setText("Username: ");
        this.UsernameText.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                login.this.UsernameTextActionPerformed(evt);
            }
        });
        this.PasswordText.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                login.this.PasswordTextActionPerformed(evt);
            }
        });
        this.jLabel3.setBackground(new Color(0, 0, 0));
        this.jLabel3.setFont(new Font("DejaVu Sans", 1, 16));
        this.jLabel3.setForeground(new Color(11, 7, 7));
        this.jLabel3.setText("Password : ");
        this.Loginbutton.setBackground(new Color(155, 153, 153));
        this.Loginbutton.setFont(new Font("DialogInput", 1, 14));
        this.Loginbutton.setForeground(new Color(40, 23, 23));
        this.Loginbutton.setLabel("Login");
        this.Loginbutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                login.this.LoginbuttonActionPerformed(evt);
            }
        });
        this.XLabel.setFont(new Font("AlHor", 1, 18));
        this.XLabel.setForeground(new Color(225, 62, 62));
        this.XLabel.setHorizontalAlignment(0);
        this.XLabel.setText("X");
        this.ResetButton.setBackground(new java.awt.Color(155, 153, 153));
        this.ResetButton.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        this.ResetButton.setForeground(new java.awt.Color(40, 23, 23));
        this.ResetButton.setLabel("Reset");
        this.ResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login.this.ResetButtonActionPerformed(evt);
            }
            
        });

        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jPanel1, -2, 283, -2).addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(88, 88, 88).addComponent(this.jLabel2, -2, 308, -2).addGap(0, 0, 32767)).addGroup(Alignment.TRAILING, layout.createSequentialGroup().addPreferredGap(ComponentPlacement.RELATED, 42, 32767).addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING, layout.createSequentialGroup().addGroup(layout.createParallelGroup(Alignment.TRAILING).addGroup(layout.createSequentialGroup().addComponent(this.jLabel3).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.PasswordText, -2, 218, -2)).addGroup(layout.createSequentialGroup().addComponent(this.jLabel1).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.UsernameText, -2, 218, -2))).addGap(128, 128, 128)).addComponent(this.XLabel, Alignment.TRAILING, -2, 31, -2).addGroup(Alignment.TRAILING, layout.createSequentialGroup().addGroup(layout.createParallelGroup(Alignment.TRAILING, false).addComponent(this.Loginbutton, -1, 97, 32767).addComponent(this.ResetButton, -1, -1, 32767)).addGap(189, 189, 189)))))));
        layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel1, -1, -1, 32767).addGroup(layout.createSequentialGroup().addComponent(this.XLabel, -2, 26, -2).addGap(23, 23, 23).addComponent(this.jLabel2, -2, 56, -2).addGap(74, 74, 74).addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(this.UsernameText, -2, -1, -2).addComponent(this.jLabel1, -2, 56, -2)).addGap(22, 22, 22).addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(this.PasswordText, -2, -1, -2).addComponent(this.jLabel3, -2, 56, -2)).addGap(37, 37, 37).addComponent(this.Loginbutton, -2, 39, -2).addPreferredGap(ComponentPlacement.RELATED, -1, 32767).addComponent(this.ResetButton).addGap(43, 43, 43)));
        this.pack();
    }

    private void ResetButtonActionPerformed(ActionEvent evt) {
        UsernameText.setText("");
        PasswordText.setText("");
    }

    private void UsernameTextActionPerformed(ActionEvent evt) {//GEN-FIRST:event_UsernameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameTextActionPerformed

    private void PasswordTextActionPerformed(ActionEvent evt) {//GEN-FIRST:event_PasswordTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordTextActionPerformed

    private void LoginbuttonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_LoginbuttonActionPerformed
      //  JPasswordField Password_Field = null;
        if ((UsernameText.getText().trim().equalsIgnoreCase("admin") )&& PasswordText.getText().trim().equalsIgnoreCase("123"))
        {
            UsernameText.setText("");
            PasswordText.setText("");
            Client c = new Client();
            c.show();
            dispose();
        }else{
            showConfirmDialog(null,"Invalid UserName/Password",JOptionPane.ERROR_MESSAGE);
            UsernameText.setText("");
        }
    }//GEN-LAST:event_LoginbuttonActionPerformed

    private void showConfirmDialog(Object o, String s, int errorMessage) {
    }

    private void ResetbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetbuttonActionPerformed
        UsernameText.setText("");
        PasswordText.setText("");
    }//GEN-LAST:event_ResetbuttonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            LookAndFeelInfo[] var1 = UIManager.getInstalledLookAndFeels();
            int var2 = var1.length;

            for (int var3 = 0; var3 < var2; ++var3) {
                LookAndFeelInfo info = var1[var3];
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException var5) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, (String) null, var5);
        } catch (InstantiationException var6) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, (String) null, var6);
        } catch (IllegalAccessException var7) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, (String) null, var7);
        } catch (UnsupportedLookAndFeelException var8) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, (String) null, var8);
        }
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                (new login()).setVisible(true);
            }
        });

    }

    
}
