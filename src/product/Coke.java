package product;

public class Coke  extends ProductForSale{


    private boolean hasSugar;
    public Coke(String type, int price, String description,boolean hasSugar) {
        super(type, price, description);
        this.hasSugar=hasSugar;
    }
    @Override
    public void showDetails() {
        String result=super.toString();
        StringBuilder builder=new StringBuilder();
        builder.append("hasSugar: "+hasSugar+"\n");
        System.out.println(result+builder.toString());
    }
}

