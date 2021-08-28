package pizza;

public class Pizza {
    private String pizzaType;
    private String crustSize;
    private String crustType;

    public Pizza(String pizzaType, String crustSize, String crustType) {
        this.pizzaType = pizzaType;
        this.crustSize = crustSize;
        this.crustType = crustType;
    }

    public String getPizzaType() {
        return pizzaType;
    }

    public void setPizzaType(String pizzaType) {
        this.pizzaType = pizzaType;
    }

    public String getCrustSize() {
        return crustSize;
    }

    public void setCrustSize(String crustSize) {
        this.crustSize = crustSize;
    }

    public String getCrustType() {
        return crustType;
    }

    public void setCrustType(String crustType) {
        this.crustType = crustType;
    }
}
