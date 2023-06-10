package date230610;

import java.util.ArrayList;
import java.util.List;

public class MenuDAO {
    public List<Menu> getMenuListForCategory(Category category, List<Menu> menuList) {
        List<Menu> m = new ArrayList<>();
        for(int i = 0 ; i < menuList.size() ; i++) {
            if(category == menuList.get(i).getCategory()) {
                m.add(menuList.get(i));
            }
        }
        return m;
    }
}
