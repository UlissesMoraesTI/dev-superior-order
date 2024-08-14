package br.com.mstechnology.order.entities;

import java.util.Objects;

public class Order {

    private Integer Order;
    private Double basic;
    private Double discount;

    public Order() {
    }

    public Order(Integer order, Double basic, Double discount) {
        Order = order;
        this.basic = basic;
        this.discount = discount;
    }

    public Integer getOrder() {
        return Order;
    }

    public void setOrder(Integer order) {
        Order = order;
    }

    public Double getBasic() {
        return basic;
    }

    public void setBasic(Double basic) {
        this.basic = basic;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "Order=" + Order +
                ", basic=" + basic +
                ", discount=" + discount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(Order, order.Order) && Objects.equals(basic, order.basic) && Objects.equals(discount, order.discount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Order, basic, discount);
    }
}
