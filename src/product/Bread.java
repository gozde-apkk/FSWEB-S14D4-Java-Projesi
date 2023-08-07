package product;

public class Bread extends ProductForSale{

    private String flourType;

    public Bread(String type, int price, String description,String flourType) {
        super(type, price, description);
        this.flourType=flourType;
    }

    @Override
    public void showDetails() {
        String result=super.toString();
        StringBuilder builder=new StringBuilder();
        builder.append("Flour: "+flourType+"\n");
        System.out.println(result+builder.toString());

    }
}
