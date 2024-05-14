package licencePlates;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
// the following is the same sample program shown in ex 8.13 description

        LicencePlate li1 = new LicencePlate("FI", "ABC-123");
        LicencePlate li2 = new LicencePlate("FI", "UXE-465");
        LicencePlate li3 = new LicencePlate("D", "B WQ-431");

        ArrayList<LicencePlate> finnishPlates = new ArrayList<>();
        finnishPlates.add(li1);
        finnishPlates.add(li2);

        LicencePlate newLi = new LicencePlate("FI", "ABC-123");
        if (!finnishPlates.contains(newLi)) {
            finnishPlates.add(newLi);
        }
        System.out.println("finnish: " + finnishPlates);
        // if the equals-method hasn't been overwritten, the same license number will be added to the list againg

        HashMap<LicencePlate, String> owners = new HashMap<>();
        owners.put(li1, "Arto");
        owners.put(li3, "Jürgen");

        System.out.println("omistajat:");
        System.out.println(owners.get(new LicencePlate("FI", "ABC-123")));
        System.out.println(owners.get(new LicencePlate("D", "B WQ-431")));
        // if the hasCode-method hasn't been overwritten, the owners won't be found
    }
}
