
package code;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.util.Date;

    public class Reservation implements Serializable {
        private int ID;
        private Client  Custumor;
        private Voiture Car;
        String TempRes;

        public Reservation() {
        }

        public Reservation(int id, Client custumor, Voiture car) {
            this.ID = id;
            this.Custumor = custumor;
            this.Car = car;
            Date aujourdhui = new Date();
            DateFormat shortDateFormat = DateFormat.getDateTimeInstance(3, 3);
            this.TempRes = shortDateFormat.format(aujourdhui);
        }



        public int getID() {
            return this.ID;
        }

        public void setID(int ID) {
            this.ID = ID;
        }

        public Client getClient() {
            return this.Custumor;
        }

        public void setClient(Client custumor) {
            this.Custumor = custumor;
        }

        public Voiture getVoiture() {
            return this.Car;
        }

        public void setVoiture(Voiture car) {
            this.Car = car;
        }

        public String affiche() {
            int var10000 = this.ID;
            return "Reservation => ID : " + var10000 + " / CIN de client : " + this.Custumor.getCIN() + " / Matricule de voiture : " + this.Car.getMatricule() + " / Temp de reservation : " + this.TempRes + ".";
        }

        public void book() throws Exception {
            try {
                Connection cnx = null;
                Statement st = null;
                Class.forName("com.mysql.jdbc.Driver");
                cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/car", "root", "");
                st = cnx.createStatement();
                int var10001 = this.ID;
                st.executeUpdate("INSERT INTO réservation (id,date_res,client,voiture) VALUES (" + var10001 + ", '" + this.TempRes + "','" + this.Custumor.getCIN() + "', '" + this.Car.getMatricule() + "');");
            } catch (SQLException var3) {
                System.out.println("erreur" + var3);
            }

        }

        public void show() throws Exception {
            try {
                Connection cnx = null;
                Statement st = null;
                Class.forName("com.mysql.jdbc.Driver");
                cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/car", "root", "");
                st = cnx.createStatement();
                ResultSet res = st.executeQuery("select * from réservation");

                while(res.next()) {
                    int id = res.getInt("id");
                    int cin = res.getInt("client");
                    int matricule = res.getInt("voiture");
                    String date = res.getString("date_res");
                    System.out.println("réservation => id : " + id + " / client num : " + cin + " / voiture num :  " + matricule + " / date : " + date);
                }
            } catch (SQLException var8) {
                System.out.println("erreur : " + var8);
            }

        }

        public void unbook(int id) throws Exception {
            try {
                Connection cnx = null;
                Statement st = null;
                Class.forName("com.mysql.jdbc.Driver");
                cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/car", "root", "");
                st = cnx.createStatement();
                st.executeUpdate("DELETE FROM réservation where client= " + id);
            } catch (SQLException var5) {
                System.out.println("erreur" + var5);
            }

        }
    }








