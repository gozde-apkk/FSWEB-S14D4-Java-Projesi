package product;

public abstract class ProductForSale {
    private  String type;
    private int price;
    private String description;

    public ProductForSale(String type, int price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public int getSalesPrice(int quantity){
        return  price*quantity;
    }

    public abstract void showDetails();

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Type:"+ getType());
        builder.append("Price:"+ getPrice());
        builder.append("Description"+ getDescription());
        builder.append("Class"+ getClass().getSimpleName());
        return builder.toString();
    }
}
