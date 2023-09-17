public class Historic {
    private Active active;
    private int amount;
    private float value;
    private int type; // Pode ser Compra = 0 ou Venda = 1;

    public Historic() {
    }

    public Historic(Active active, int amount, float value, int type) {
        this.active = active;
        this.amount = amount;
        this.value = value;
        this.type = type;
    }

    public Active getActive() {
        return active;
    }
    public void setActive(Active active) {
        this.active = active;
    }
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public float getValue() {
        return value;
    }
    public void setValue(float value) {
        this.value = value;
    }
    public int getType() {
        return type;
    }
    public void setType(int type) {
        this.type = type;
    }



}
