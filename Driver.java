package Renting_a_car;

class Driver {
    String[] driverNames;
    String[] carModels;
    double[] ratings;
    double[] distancesFromCustomer;

    public Driver() {
        driverNames = new String[]{"A", "B", "C", "D", "E"};
        carModels = new String[]{"Sedan", "Hatchback", "5-Seater", "Sedan", "Hatchback"};
        ratings = new double[]{4.0, 4.3, 4.8, 4.1, 4.7};
        distancesFromCustomer = new double[]{500, 1000, 200, 700, 430};
    }

    public void print() {
        System.out.println("List of Drivers with Details:\n");
        System.out.println("Driver\tCar Model\tRating\tDistance From Customer\n");
        for (int i = 0; i < 5; i++) {
            System.out.println(driverNames[i] + "\t" + carModels[i] + "\t\t" + ratings[i] + "\t" + distancesFromCustomer[i]);
            System.out.println("----------------------------------------------------------");
        }
        System.out.println();
    }
}