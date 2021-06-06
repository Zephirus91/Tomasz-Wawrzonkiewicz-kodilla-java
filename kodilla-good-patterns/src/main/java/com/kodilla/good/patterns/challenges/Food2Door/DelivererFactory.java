package com.kodilla.good.patterns.challenges.Food2Door;

public class DelivererFactory {

    public static final String EXTRA_FOOD_SHOP = "ExtraFoodShop";
    public static final String HEALTHY_SHOP = "HealthyShop";
    public static final String GLUTEN_FREE_SHOP = "GlutenFreeShop";

    public static Deliveler getDeliveler(String delivererName) {
        if (delivererName.equals(EXTRA_FOOD_SHOP))
            return new ExtraFoodShop();
        if (delivererName.equals(HEALTHY_SHOP))
            return new HealthyShop();
        if (delivererName.equals(GLUTEN_FREE_SHOP))
            return new GlutenFreeShop();
        return null;
    }
}
