package service;

import model.Food;

public class ShoppingCart {
    private Food[] foodItems;

    public ShoppingCart(Food[] foodItems) {
        this.foodItems = foodItems;
    }

    public double getTotalPriceWithoutDiscount() {
        double sum = 0;
        for (Food item : foodItems) {
            sum += item.getPrice() * item.getAmount();
        }
        return sum;
    }

    public double getTotalPriceWithDiscount() {
        double sum = 0;
        for (Food item : foodItems) {
            double itemTotal = item.getPrice() * item.getAmount();
            double discount = item.getDiscount();
            sum += itemTotal - (itemTotal * discount / 100);
        }
        return sum;
    }

    public double getVegetarianTotalPriceWithoutDiscount() {
        double sum = 0;
        for (Food item : foodItems) {
            if (item.isVegetarian()) {
                sum += item.getPrice() * item.getAmount();
            }
        }
        return sum;
    }
}