
package code;

import java.text.DateFormat;
import java.util.Date;

public class Main {
    public Main() {
    }

    public static void main(String[] args) throws Exception {
        Voiture v = new Voiture();
        Voiture a = v.getvoiture(1234587);
        a.show();

       // Voiture v = new Voiture(1284628, 223.056D, "kia", "rio", "blanc", "normal", 5, "bombé");
       // Client c = new Client(18014756, 22190159, "eya", "souid");
      //  new Date();
      //  DateFormat shortDateFormat = DateFormat.getDateTimeInstance(3, 3);
      /*  Reservation r = new Reservation(1, c, v);
        r.book();
        r.show();
        r.unbook(18014756);
        System.out.println("aprés suppression\n");
        r.show();*/
    }
}
