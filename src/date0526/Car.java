package date0526;

public class Car implements ParkingAble {
    /*
    자동차 이름, 생산년도, 차대번호, 사용자이름 입력하는 클래스 작성
     */
    String carName;
    String birth;
    String carNum;
    String name;

    Car(String carName, String birth, String carNum, String name){
        this.carName = carName;
        this.birth = birth;
        this.carNum = carNum;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                ", birth='" + birth + '\'' +
                ", carNum='" + carNum + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

