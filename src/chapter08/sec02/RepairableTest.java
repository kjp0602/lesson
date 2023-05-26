package chapter08.sec02;

public class RepairableTest {

    public static void main(String[] args) {
        Tank t= new Tank();
        Marine m =new Marine();
        DropShip d= new DropShip();
        SCV scv = new SCV();

        scv.repair(t);
        scv.repair(d);
        scv.repair((Repairable) m);

    }

}