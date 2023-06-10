package date230610;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bill {
    private List<Menu> menuList;
    private Map<String, Integer> menuMap;

    private int totalCost;

    public Bill() {
        menuList = new ArrayList<>();
        menuMap = new HashMap<>();
        this.totalCost = 0;
    }

    public void addMenu(Menu menu){
        boolean hasMenu = false;
        for(Menu tmp : menuList) {
            if (menu.getName().equals(tmp.getName())) {
                hasMenu = true;
                break;
            }
        }
        if(!hasMenu) {
            menuList.add(menu);
        }
        if(menuMap.get(menu.getName()) == null) {
            menuMap.put(menu.getName(),1);
        } else {
            int count = menuMap.get(menu.getName()); // 현재 갯수를 가져옴
            menuMap.put(menu.getName(), count + 1);
        }

        this.totalCost += menu.getCost();
    }

    public int getTotalCost(){
        return this.totalCost;
    }

    public void printBill() {
        int i = 0;
        System.out.println("########영수증########");
        for(Menu menu : menuList) {
            int cnt = menuMap.get(menu.getName());
            System.out.println(++i + ". " + menu.getName() + "\t" + cnt + "개\t" + menu.getCost() * cnt +"원");

        }
        System.out.println("합계---------- " + this.totalCost + "원");
        System.out.println("####################");
    }
}
