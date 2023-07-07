public class OrderTester {
    public static void main(String[] args)
    {
        FoodOrder mfo = new FoodOrder();
        printmenuList prnt = new printmenuList();


        prnt.MenuPromt();
        prnt.menuList();
        mfo.order();
        mfo.getRecipt();



    }
}