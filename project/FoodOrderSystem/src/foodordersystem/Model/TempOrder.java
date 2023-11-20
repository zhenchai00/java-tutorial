package foodordersystem.Model;

public class TempOrder {
    private int itemId;
    private int quantity;

    public TempOrder (int itemId, int quantity) {
        this.itemId = itemId;
        this.quantity = quantity;
    }

    public int getItemId () {
        return itemId;
    }

    public int getQuantity () {
        return quantity;
    }
}
