package cn.edu.zjut.ejb;

import javax.ejb.Stateful;
import java.util.ArrayList;

@Stateful(name = "ProductCartBean")
public class ProductCartBean implements ProductCartRemote {
    private ArrayList<String> cartList = new ArrayList<String>();
    private int totalPrice = 0;

    public ProductCartBean() {
    }

    @Override
    public void addProduct(String productName, int price) {
        this.cartList.add(productName);
        totalPrice+=price;
    }

    @Override
    public ArrayList<String> listProducts() {
        return this.cartList;
    }

    @Override
    public int totalPrice() {
        return totalPrice;
    }
}
