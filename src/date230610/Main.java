package date230610;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    static List <Category> categories;
    static List <Menu> list;

    public static void main(String[] args) {

        MenuDAO dao = new MenuDAO();

        Category foodCategory = new Category("음식");

        Category drinkCategory = new Category("음료");

        categories = new ArrayList<>();
        list = new ArrayList<>();


        list.add(new Menu(foodCategory, "햄버거", 7500));
        list.add(new Menu(foodCategory, "샌드위치", 4500));
        list.add(new Menu(foodCategory, "핫도그", 6000));
        list.add(new Menu(drinkCategory, "아메리카노", 2500));
        list.add(new Menu(drinkCategory, "콜드브루", 4000));
        list.add(new Menu(drinkCategory, "카페라떼", 4500));
        list.add(new Menu(drinkCategory, "콜라", 2000));
        list.add(new Menu(drinkCategory, "사이다", 2000));
        list.add(new Menu(drinkCategory, "홍차", 3500));

        List<Menu> foodlist =  dao.getMenuListForCategory(foodCategory, list);
        foodCategory.setMenuList(foodlist);

        List<Menu> drinklist = dao.getMenuListForCategory(drinkCategory, list);
        drinkCategory.setMenuList(drinklist);


        categories.add(foodCategory);
        categories.add(drinkCategory);

        Scanner scanner = new Scanner(System.in);

        Object obj = new Object();

        Bill bill = new Bill();
        while(true) {
            try {
                System.out.println("카테고리를 선택하세요.");
                printNumbering(categories);
                int choice = scanner.nextInt();
                Category choiceCategory = categories.get(choice);
                List<Menu> choiceCategoryMenuList = choiceCategory.getMenuList();
                printNumbering(choiceCategoryMenuList);
                System.out.println("그만 사고 싶으면 아무키나 누르시오.");
                choice = scanner.nextInt();
                bill.addMenu(choiceCategoryMenuList.get(choice));
            } catch (Exception e) {
                break;
            } finally {
                bill.printBill();
            }
        }



    }

    public static <T> void printNumbering(List<T> list) {
        for(int i = 0; i < list.size(); i++) {
            System.out.println(i + " : " + list.get(i).toString());
        }
    }

}

