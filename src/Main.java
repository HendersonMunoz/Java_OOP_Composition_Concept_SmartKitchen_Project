public class Main {
    public static void main(String[] args){

        //Creating new instances of the Smart Kitchen. Testing the SmartKitchen classes & methods.
        SmartKitchen kitchen = new SmartKitchen();

        // telling the smart appliances that work needs to be done.
        kitchen.setKitchenState(true, false, true);

        // Smart appliances doing the work that needs to be done.
        kitchen.doKitchenWork();
    }
}
