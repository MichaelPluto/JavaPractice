package com.yzf.dao.domain;

public class Goods {

    private  Integer id;
    private  String goods_name;
    private  double price;

    public Goods() {
    }

    public Goods(Integer id, String goods_name, double price) {
        this.id = id;
        this.goods_name = goods_name;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGood_name() {
        return goods_name;
    }

    public void setGood_name(String good_name) {
        this.goods_name = good_name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "\nGoods{" +
                "id=" + id +
                ", good_name='" + goods_name + '\'' +
                ", price=" + price +
                '}';
    }
}
