package date230610;

public class Menu {
    private Category category;
    private String name;
    private int cost;

    public Menu(Category category, String name, int cost){
        this.category = category;
        this.name = name;
        this.cost = cost;
    }
    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return this.name + "\t" + cost + "원";
    }
}
