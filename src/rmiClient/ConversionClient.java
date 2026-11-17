package rmiClient;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import rmiService.IConversion;

public class ConversionClient {

    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);

            IConversion conversion = (IConversion) registry.lookup("ConversionService");

            double resultat = conversion.convertirMontant(500);

            System.out.println("500 euros = " + resultat + " dinars");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
