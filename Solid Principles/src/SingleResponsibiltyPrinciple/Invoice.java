package SingleResponsibiltyPrinciple;

public class Invoice {
    private Marker marker;
    private int quantity;

    public int calculatePrice() {
        return marker.price * quantity;
    }
}
