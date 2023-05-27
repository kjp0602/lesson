package date0526;

public class CarMain {
    public static void main(String[] args) {
        CarPark park = new CarPark(5);

        Car wonicar = new Car("쏘나타", "202301", "12허3931", "김원희");
        Car jpcar = new Car("크루즈", "201506", "382노6743", "김종표");
        Bike mingubike = new Bike("삼천리", "이민규");
        Airplane ssAirp = new Airplane();

        try {
            park.parkingIn(wonicar);
            park.parkingIn(jpcar);
            park.parkingIn(jpcar);
            park.parkingIn(mingubike);
            //park.parkingIn(ssAirp); 주차할 수 없음
            park.parkingOut(jpcar);
            park.parkingOut(jpcar);
        } catch (CarException e) {
            e.printStackTrace();
        }
        park.printParkList();

    }
}
