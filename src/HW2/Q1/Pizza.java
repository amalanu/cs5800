package HW2.Q1;

public class Pizza{
    //required
    private String chain;
    private String size;
    private int toppingNum;

    //optional
    private boolean hasPepperoni;
    private boolean hasSausage;
    private boolean hasMushrooms;
    private boolean hasBacon;
    private boolean hasOnions;
    private boolean hasExtraCheese;
    private boolean hasPeppers;
    private boolean hasChicken;
    private boolean hasOlives;
    private boolean hasSpinach;
    private boolean hasTomatoAndBasil;
    private boolean hasBeef;
    private boolean hasHam;
    private boolean hasPesto;
    private boolean hasSpicyPork;
    private boolean hasHamAndPineapple;

    //this is very ugly
    //but I chose this implementation because of how many options there are
    //and the fact that one pizza can have all 16 options
    //so either I do this here or in the eat() function
    //hopefully there isn't a much cleaner implementation that I missed
    private String[] getToppings() {
        String[] toppings = new String[this.toppingNum];
        int counter = 0;
        if (hasPepperoni) {
            toppings[counter] = "pepperoni";
            counter++;
        }
        if (hasSausage) {
            toppings[counter] = "sausage";
            counter++;
        }
        if (hasMushrooms) {
            toppings[counter] = "mushrooms";
            counter++;
        }
        if (hasBacon) {
            toppings[counter] = "bacon";
            counter++;
        }
        if (hasOnions) {
            toppings[counter] = "onions";
            counter++;
        }
        if (hasExtraCheese) {
            toppings[counter] = "extra cheese";
            counter++;
        }
        if (hasPeppers) {
            toppings[counter] = "peppers";
            counter++;
        }
        if (hasChicken) {
            toppings[counter] = "chicken";
            counter++;
        }
        if (hasOlives) {
            toppings[counter] = "olives";
            counter++;
        }
        if (hasSpinach) {
            toppings[counter] = "spinach";
            counter++;
        }
        if (hasTomatoAndBasil) {
            toppings[counter] = "tomato and basil";
            counter++;
        }
        if (hasBeef) {
            toppings[counter] = "beef";
            counter++;
        }
        if (hasPepperoni) {
            toppings[counter] = "pepperoni";
            counter++;
        }
        if (hasPepperoni) {
            toppings[counter] = "pepperoni";
            counter++;
        }
        if (hasPepperoni) {
            toppings[counter] = "pepperoni";
            counter++;
        }
        if (hasPepperoni) {
            toppings[counter] = "pepperoni";
            counter++;
        }
        if (hasPepperoni) {
            toppings[counter] = "pepperoni";
            counter++;
        }

        return toppings;
    }

}