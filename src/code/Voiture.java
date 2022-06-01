//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package code;

import javax.swing.*;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Voiture implements Serializable {
    private int Matricule;
    private double Prix;
    private String Maker;
    private String Name;
    private String Colour;
    private String Type;
    int Capacite;
    String Model;

    public Voiture() {
        this.Matricule = 0;
        this.Prix = 0.0D;
        this.Maker = "*****";
        this.Name = "*****";
        this.Colour = "*****";
        this.Type = "*****";
        this.Capacite = 0;
        this.Model = "*****";
    }

    public Voiture(int matricule, double prix, String maker, String name, String colour, String type, int capacite, String model) {
        this.Matricule = matricule;
        this.Prix = prix;
        this.Maker = maker;
        this.Name = name;
        this.Colour = colour;
        this.Type = type;
        this.Capacite = capacite;
        this.Model = model;
    }

    public int getMatricule() {
        return this.Matricule;
    }

    public double getPrix() {
        return this.Prix;
    }

    public String getMaker() {
        return this.Maker;
    }

    public String getName() {
        return this.Name;
    }

    public String getColour() {
        return this.Colour;
    }

    public String getType() {
        return this.Type;
    }

    public int getCapacite() {
        return this.Capacite;
    }

    public String getModel() {
        return this.Model;
    }

    public void setMatricule(int matricule) {
        this.Matricule = matricule;
    }

    public void setPrix(double prix) {
        this.Prix = prix;
    }

    public void setMaker(String maker) {
        this.Maker = maker;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public void setColour(String colour) {
        this.Colour = colour;
    }

    public void setType(String type) {
        this.Type = type;
    }

    public void setCapacite(int capacite) {
        this.Capacite = capacite;
    }

    public void setModel(String model) {
        this.Model = model;
    }

    public void affiche() {
        System.out.println("Voiture => Matricule : " + this.Matricule + " / Nom : " + this.Name + " / Model : " + this.Model + " / Marque : " + this.Maker + " / Couleur : " + this.Colour + " / Type : " + this.Type + " / Capacite : " + this.Capacite + " / Prix : " + this.Prix + " .");
    }
    public Voiture getvoiture(int id) {
        try {
            Connection cnx = null;
            Statement st = null;
            Class.forName("com.mysql.jdbc.Driver");
            cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/car", "root", "");
            st = cnx.createStatement();
            ResultSet res = st.executeQuery("select * from voiture where matricule = " + id);
            res.next();
            int matricule = res.getInt("matricule");

            int capacite = res.getInt("capacite");
            double prix = res.getDouble("prix");
            String name = res.getString("name");
            String maker = res.getString("maker");
            String colour = res.getString("colour");
            String type = res.getString("type");
            String model = res.getString("model");
            code.Voiture a = new code.Voiture(matricule, prix, maker, name, colour, type, capacite, model);
                return a;
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            code.Voiture b = new Voiture();
            return b;
        }
    }
    public void add() throws Exception {
        try {
            Connection cnx = null;
            Statement st = null;
            Class.forName("com.mysql.jdbc.Driver");
            cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/car", "root", "");
            st = cnx.createStatement();
            st.executeUpdate("INSERT INTO voiture (matricule, prix, maker, name, colour, type, capacite, model) VALUES (" + this.Matricule + ", " + this.Prix + ",'" + this.Maker + "', '" + this.Name + "','" + this.Colour + "', '" + this.Type + "', " + this.Capacite + ", '" + this.Model + "');");
            JOptionPane.showMessageDialog(null,"Ajout effectué avec succées.");
            System.out.println("ajout effectué");
        } catch (ClassNotFoundException | SQLException var4) {
            JOptionPane.showMessageDialog(null,"Erreur : Veuiller vérifier à nouveau le numéro de matricule saisie");
            System.out.println("erreur" + var4);
        }

    }

    public void show() throws Exception {
        try {
            Connection cnx = null;
            Statement st = null;
            Class.forName("com.mysql.jdbc.Driver");
            cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/car", "root", "");
            st = cnx.createStatement();
            ResultSet res = st.executeQuery("select matricule,name from voiture");
            Voiture v;
            while(res.next()) {
                int matricule = res.getInt("matricule");
                int capacite = res.getInt("capacite");
                double prix = res.getDouble("prix");
                String name = res.getString("name");
                String maker = res.getString("maker");
                String colour = res.getString("colour");
                String type = res.getString("type");
                String model = res.getString("model");
                v = new Voiture(matricule,prix,maker,name,colour,type,capacite,model);
            }
        } catch (SQLException var6) {
            System.out.println("erreur" + var6);
        }

    }

    public void remove(int id) throws Exception {
        try {
            Connection cnx = null;
            Statement st = null;
            Class.forName("com.mysql.jdbc.Driver");
            cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/car", "root", "");
            st = cnx.createStatement();
            st.executeUpdate("DELETE FROM voiture where matricule = " + id);
            JOptionPane.showMessageDialog(null,"Suppression effectuée");
            System.out.println("suppression effectué");
        } catch (SQLException var5) {
            JOptionPane.showMessageDialog(null,var5.getMessage());
            System.out.println("erreur" + var5);
        }

    }
    public void update(int id, Voiture v) throws Exception {
        try {
            Connection cnx = null;
            Statement st = null;
            Class.forName("com.mysql.jdbc.Driver");
            cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/car", "root", "");
            st = cnx.createStatement();
            System.out.println("UPDATE voiture set matricule = " + v.Matricule + ",prix = " + v.Prix + ",maker ='" + v.Maker + "',name = '" + v.Name +"', colour = '"+ v.Colour+ "', type = '"+v.Type+ "', capacite = "+v.Capacite+", model='"+v.Model+"  where matricule = " + id);
            st.executeUpdate("UPDATE voiture set matricule = " + v.Matricule + ",prix = " + v.Prix + ",maker ='" + v.Maker + "',name = '" + v.Name +"', colour = '"+ v.Colour+ "', type = '"+v.Type+ "', capacite = "+v.Capacite+", model='"+v.Model+"'  where matricule = " + id);
            System.out.println("modification effectuée avec succées");
            JOptionPane.showMessageDialog(null,"modification effectuée avec succées");
        } catch (SQLException var8) {
            JOptionPane.showMessageDialog(null,var8.getMessage());
            System.out.println("erreur" + var8);
        }

    }
}
