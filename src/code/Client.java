
package code;

import javax.swing.*;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Client implements Serializable {
    private int CIN;
    private int Contact;
    private String Prénom;
    private String Nom;

    public Client() {
        this.CIN = 0;
        this.Prénom = "*****";
        this.Nom = "*****";
        this.Contact = 0;
    }

    public Client(int cin, String nom, String prénom , int contact) {
        this.CIN = cin;
        this.Nom = nom;
        this.Prénom = prénom;
        this.Contact=contact;
    }

    public int getCIN() {
        return this.CIN;
    }

    public void setCIN(int CIN) {
        this.CIN = CIN;
    }

    public int getContact() {
        return this.Contact;
    }

    public void setContact(int contact) {
        this.Contact = contact;
    }

    public String getNom() {
        return this.Nom;
    }

    public void setNom(String nom) {
        this.Nom = nom;
    }

    public String getPrénom() {
        return this.Prénom;
    }

    public void setPrénom(String prénom) {
        this.Prénom = prénom;
    }

    public Client getClient(int id) {
        try {
            Connection cnx = null;
            Statement st = null;
            Class.forName("com.mysql.jdbc.Driver");
            cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/car", "root", "");
            st = cnx.createStatement();
            ResultSet res = st.executeQuery("select * from client where cin = " + id);
            res.next();
            int cin = res.getInt("cin");
            int contact = res.getInt("contact");
            String nom = res.getString("nom");
            String prenom = res.getString("prenom");
            code.Client a = new code.Client(cin,nom,prenom,contact);
            return a;
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            code.Client b = new Client();
            return b;
        }
    }

    public void show() throws Exception {
        try {
            Connection cnx = null;
            Statement st = null;
            Class.forName("com.mysql.jdbc.Driver");
            cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/car", "root", "");
            st = cnx.createStatement();
            ResultSet res = st.executeQuery("select * from client");

            while(res.next()) {
                int cin = res.getInt("cin");
                int contact = res.getInt("contact");
                String nom = res.getString("nom");
                String prenom = res.getString("prenom");
                System.out.println("client => CIN : " + cin + " /Nom & Prénom  :  " + nom + " " + prenom + " / Contact : " + contact);
            }
        } catch (SQLException | ClassNotFoundException var8) {
            System.out.println("erreur" + var8);
        }

    }

    public void add() throws Exception {
        try {
            Connection cnx = null;
            Statement st = null;
            Class.forName("com.mysql.jdbc.Driver");
            cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/car", "root", "");
            st = cnx.createStatement();
            st.executeUpdate("INSERT INTO client (cin, nom, prenom, contact) VALUES (" + this.CIN + ", '" + this.Nom + "','" + this.Prénom + "', " + this.Contact + ");");
            JOptionPane.showMessageDialog(null,"Ajout effectué avec succées.");
            System.out.println("ajout avec succées");
        } catch (SQLException var4) {
            JOptionPane.showMessageDialog(null,"Erreur : Veuiller vérifier à nouveau le numéro de CIN saisie");
            System.out.println("erreur" + var4);
        }

    }

    public void remove(int id) throws Exception {
        try {
            Connection cnx = null;
            Statement st = null;
            Class.forName("com.mysql.jdbc.Driver");
            cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/car", "root", "");
            st = cnx.createStatement();
            int res = st.executeUpdate("DELETE FROM client where cin = " + id + ";");
            if (res != 0) {
                JOptionPane.showMessageDialog(null,"Suppression effectué avec succées.");
                System.out.println("suppression effectuée");
            } else {
                JOptionPane.showMessageDialog(null,"Erreur : Client indisponible. Veuillez vérifier le numéro de CIN saisi.");
                System.out.println("client indisponible veuillez vérifier le num de CIN saisi.");
            }
        } catch (SQLException var5) {
            JOptionPane.showMessageDialog(null,"Erreur lié à la base de données.");
            System.out.println("erreur" + var5);
        }

    }

    public void update(int cin, Client c) throws Exception {
        try {
            Connection cnx = null;
            Statement st = null;
            Class.forName("com.mysql.jdbc.Driver");
            cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/car", "root", "");
            st = cnx.createStatement();
            ResultSet res = st.executeQuery("select * from client where cin = " + cin);

            int count;
            for(count = 0; res.next(); ++count) {
            }

            if (count == 0) {
                JOptionPane.showMessageDialog(null,"Erreur : Client indisponible. Veuillez vérifier le numéro de CIN saisi.");
                System.out.println("client introvable");
            } else {
                st.executeUpdate("UPDATE client set cin = " + c.CIN + ",nom = '" + c.Nom + "',prenom = '" + c.Prénom + "',contact = " + c.Contact + "  where cin = " + cin);
                JOptionPane.showMessageDialog(null,"Modification effectué avec succées.");
                System.out.println("modification effectuéer avec succées");
            }
        } catch (SQLException var8) {
            JOptionPane.showMessageDialog(null,"Erreur lié à la base de données.");
            System.out.println("erreur" + var8);
        }

    }
}
