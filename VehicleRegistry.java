package licencePlates;

import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {

    HashMap<LicencePlate, String> owners;

    public VehicleRegistry() {
        this.owners = new HashMap<>();
    }

    public boolean add(LicencePlate licencePlate, String owner) {
        if (this.owners.containsKey(licencePlate)) {
            return false;
        }
        this.owners.put(licencePlate, owner);
        return true;
    }

    public String get(LicencePlate licencePlate) {
        return this.owners.getOrDefault(licencePlate, null);
    }

    public boolean remove(LicencePlate licencePlate) {
        if (this.owners.containsKey(licencePlate)) {
            this.owners.remove(licencePlate);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String printout = "";
        for (LicencePlate licencePlate: this.owners.keySet()) {
            printout = printout + this.owners.get(licencePlate) + " " +  licencePlate.toString() + "\n";
        }
        return printout;
    }

    public void printLicencePlates() {
        System.out.println("printing licence plates ...");
        for (LicencePlate licencePlate: this.owners.keySet()) {
            System.out.println(licencePlate);
        }
     }

     public void printOwners() {
         ArrayList<String> ownersList = new ArrayList<>();
         for (String owner: this.owners.values()) {
             if (!(ownersList.contains(owner))) {
                 ownersList.add(owner);
                 System.out.println(owner);
             }
         }
     }
}
