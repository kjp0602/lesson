package date230610;

import java.util.List;

public class Category {
    private String category;
    private List<Menu> menuList;
    public Category(String category) {
        this.category = category;
    }
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<Menu> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<Menu> menuList) {
        this.menuList = menuList;
    }

    @Override
    public String toString() {
        return this.category;
    }
}
