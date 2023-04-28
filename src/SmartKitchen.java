public class SmartKitchen {
    // Working with the Composition concept (multiple classes in one file),
    // instead of Inheritance (One class per file).

    // smart kitchen class fields.
    private CoffeeMaker brewMaster;
    private Refrigerator iceBox;
    private DishWasher dishWasher;

    public SmartKitchen() {
        // Attributes
        brewMaster = new CoffeeMaker();
        iceBox = new Refrigerator();
        dishWasher = new DishWasher();
    }

    // Getters
    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    // method - telling the smart appliances that work needs to be done.
    public void setKitchenState(boolean cofferFlag, boolean fridgeFlag, boolean dishWasherFlag){
        brewMaster.setHasWorkToDo(cofferFlag);
        iceBox.setHasWorkToDo(fridgeFlag);
        dishWasher.setHasWorkToDo(dishWasherFlag);
    }

    // method - Smart appliances doing the work that needs to be done.
    public void doKitchenWork(){
        brewMaster.brewCoffee();
        iceBox.orderFood();
        dishWasher.doDishes();
    }
}

    //Coffee Maker class.
    class CoffeeMaker{
        private boolean hasWorkToDo;

        //Setter
        public void setHasWorkToDo(boolean hasWorkToDo) {
            this.hasWorkToDo = hasWorkToDo;
        }
        // brew coffee method
        public void brewCoffee(){
            if (hasWorkToDo){
                System.out.println("Good morning! Brewing coffee now!");
                hasWorkToDo = false;
            }
        }
    }

    //Refrigerator class
    class Refrigerator{
        private boolean hasWorkToDo;

        //Setter
        public void setHasWorkToDo(boolean hasWorkToDo) {
            this.hasWorkToDo = hasWorkToDo;
        }
        // order food method
        public void orderFood(){
            if (hasWorkToDo){
                System.out.println("Got it! Ordering food now!");
                hasWorkToDo = false;
            }
        }
    }

    //Dishwasher class
    class DishWasher{
        private boolean hasWorkToDo;

        //Setter
        public void setHasWorkToDo(boolean hasWorkToDo) {
            this.hasWorkToDo = hasWorkToDo;
        }
        // Do the dishes method
        public void doDishes(){
            if (hasWorkToDo){
                System.out.println("Understood! Doing the dishes as we speak!");
                hasWorkToDo = false;
            }
        }
    }

