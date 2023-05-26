package date0526;

import java.util.ArrayList;
import java.util.List;

public class CarPark {

    private List<ParkingAble> parkingArray; //주차되어있는 자동차 리스트
    private int total; // 총 가능한 주차 대수
    private CarPark(String name, int total){ //이름, 허용가능한 자동차 수
        this.parkingArray = new ArrayList<>();
        this.total = total;
    }

    public void parkingIn(ParkingAble car) throws CarException {
        /*
        parkingArray 크기가 total을 넘었는지 체크 -> 넘었으면 CarException
        해당 차량이 parkingArray에 있는지 확인 -> 없으면 CarException
        문제 없으면 parkingArray에 추가
         */
    }


    public void parkingOut(ParkingAble car) throws CarException {
        /*
        parkingArray에 주차된 차량인지 확인 -> 없으면 CarException
        문제없으면 parckingArray에서 제거
         */
    }
}
