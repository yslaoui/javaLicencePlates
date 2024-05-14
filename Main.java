package licencePlates;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        VehicleRegistry registry = new VehicleRegistry();
        registry.add(new LicencePlate("FR", "1452"), "amelie");
        registry.add(new LicencePlate("MA", "854147"), "jack");
        registry.add(new LicencePlate("DU", "054785"), "arthur");

        System.out.println(registry.toString());

        System.out.println(registry.get(new LicencePlate("MA", "854147")));

        System.out.println("removing jack ...");
        registry.remove(new LicencePlate("MA", "854147"));

        System.out.println(registry.toString());

        registry.printLicencePlates();

        registry.printOwners();

    }
}
