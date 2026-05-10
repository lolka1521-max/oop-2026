package oop.labor11.lab_11_2;

public class Product implements Comparable<Product> {
    private int id;
    private String name;
    private int amount;
    private int price;

    public Product(int id, String name, int amount, int price){
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.price = price;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getAmount(){
        return amount;
    }

    public int getPrice(){
        return price;
    }

    public void setId(int id){
        this.id = id;
    }

    public void increaseAmount(int amount1){
        amount = amount + amount1;
    }

    @Override
    public int compareTo(Product o){
        return o.getId() - this.id;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                ", price=" + price + '\n';
    }
}
