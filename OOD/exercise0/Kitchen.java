package exercise0;

/**
 * Program: INFO5100
 * Description:
 * CreatedBy: Nicole_Z
 * CreatDate: 10/10/2020
 **/

public class Kitchen {
    boolean refrigerator;
    boolean blender;
    boolean riceCooker;
    int numbersOfGasStove;
    boolean hasMicrowave;
    boolean hasDishwasher;
    boolean hasWaterFilter;
    int numbersOfSink;

    Kitchen(String Object) {
        System.out.println("\nConstructor was created for: " + Object);
    }

    void openRefrigerator() {
        refrigerator = true;
    }

    void closeRefrigerator() {
        refrigerator = false;
    }

    void openBlender() {
        blender = true;
    }

    void closeBlender() {
        blender = false;
    }

    void openRiceCooker() {
        riceCooker = true;
    }

    void checkKitchenStatus() {
        if (refrigerator) {
            System.out.println("The refrigerator is opened.");
        } else System.out.println("The refrigerator is closed.");

        if (blender) {
            System.out.println("The blender is opened.");
        } else System.out.println("The blender is closed.");

        if (riceCooker) {
            System.out.println("The rice cooker is opened.");
        } else System.out.println("The refrigerator is not opened.");

    }

    void kitchenDetail() {
        numbersOfGasStove = 4;
        hasDishwasher = true;
        hasMicrowave = true;
        hasWaterFilter = true;
        numbersOfSink = 1;
    }




    public static void main(String[] args) {
        Kitchen kitchen1 = new Kitchen("kitchen1");
        kitchen1.openRefrigerator();
        kitchen1.checkKitchenStatus();

        Kitchen kitchen2 = new Kitchen("kitchen2");
        kitchen2.openBlender();
        kitchen2.openRiceCooker();
        kitchen2.checkKitchenStatus();

        Kitchen kitchen3 = new Kitchen("kitchen3");
        kitchen3.kitchenDetail();
        System.out.println("Details of the kitchen: ");
        System.out.println("Numbers of gas stove: " + kitchen3.numbersOfGasStove);
        System.out.println("Has a dishwasher: " + kitchen3.hasDishwasher);
        System.out.println("Has a microwave: " + kitchen3.hasMicrowave);
        System.out.println("Has a water filter: " + kitchen3.hasWaterFilter);
        System.out.println("Numbers of kitchen sink: " + kitchen3.numbersOfSink);
    }

}
