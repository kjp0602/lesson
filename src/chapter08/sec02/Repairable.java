package chapter08.sec02;

public interface Repairable {

}
//-------------------------------------------------------------

class Unit{

    int hitpoint;         // 사용하고 남은 잔량
    final int MAX_HP;

    Unit(int hp){
        MAX_HP=hp;
    }
}
//-------------------------------------------------------------

class GroundUnit extends Unit{         // Tank, Marine, SCV

    GroundUnit(int hp){
        super(hp);
    }
}
//-------------------------------------------------------------

class AirUnit extends Unit{            // DropShip

    AirUnit(int hp){
        super(hp);
    }
}
//-------------------------------------------------------------

class Tank extends GroundUnit implements Repairable{

    Tank(){
        super(150);
    }

    @Override
    public String toString() {
        return "TANK";
    }
}
//-------------------------------------------------------------

class SCV extends GroundUnit implements Repairable{            // SCV -> 수리공장

    SCV(){
        super(50);
    }

    @Override
    public String toString() {
        return "SCV";
    }

    public void repair(Repairable r) {
        if(r instanceof Unit) {
            Unit u=(Unit)r;
            while(u.hitpoint != u.MAX_HP) {
                u.hitpoint++;
            }
            System.out.println(u.toString()+"의 수리가 끝났습니다.");
        }
    }
}
//-------------------------------------------------------------
class Marine extends GroundUnit{

    Marine(){
        super(100);
    }

    @Override
    public String toString() {
        return "MARINE";
    }
}
//-------------------------------------------------------------

class DropShip extends AirUnit implements Repairable{

    DropShip(){
        super(200);
    }

    @Override
    public String toString() {
        return "DROPSHIP";
    }
}