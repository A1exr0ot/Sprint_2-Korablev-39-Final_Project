package model;

import model.constants.Discount;

public interface Discountable {
    default double getDiscount() {
        return Discount.DEFAULT_DISCOUNT;
    }
}