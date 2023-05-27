package date0526;

import java.util.ArrayList;
import java.util.List;

public class CarPark {

    private List<ParkingAble> parkingArray; //주차되어있는 자동차 리스트
    private int total; // 총 가능한 주차 대수
    public CarPark(int total){ //이름, 허용가능한 자동차 수
        this.parkingArray = new ArrayList<>();
        this.total = total;
    }

    public void parkingIn(ParkingAble vec) throws CarException {
        /*
        parkingArray 크기가 total을 넘었는지 체크 -> 넘었으면 CarException
        해당 차량이 parkingArray에 있는지 확인 -> 있으면 CarException
        문제 없으면 parkingArray에 추가
         */
        //throw new CarException(CarException.OVERFLOW);
        if(parkingArray.size() < total ) {
            for(int i=0; i<parkingArray.size(); i++){
                if(parkingArray.get(i) == vec){
                    System.out.println();
                    throw new CarException(CarException.ALREADY);
                }
            }
            parkingArray.add(vec);
        } else {
            //에러
            throw new CarException(CarException.OVERFLOW);
        }
    }
    //배열이랑 비슷한점 정리
    /*
    arr.get(3) -> arr[3]
    arr.add(car) -> arr[i] = car;
    arr.add(2,car) -> arr[2] = car;
     arr.remove(2);
     */
    public void parkingOut(ParkingAble vec) {
        /*
        parkingArray에 주차된 차량인지 확인 -> 없으면 CarException
        문제없으면 parckingArray에서 제거
         */
        boolean isLive = false;
        for(int i=0; i<parkingArray.size(); i++){
            if(vec == parkingArray.get(i)) {
                parkingArray.remove(i);
                isLive = true;
                break;
            }
        }
        if(!isLive) {
            System.out.println("dkdkddkdkdkdkdk");
            new CarException(CarException.NOTHEAR);
        }
    }

    public void printParkList() {
        for (ParkingAble vec : this.parkingArray) {
            System.out.println(vec);
        }
    }
}
