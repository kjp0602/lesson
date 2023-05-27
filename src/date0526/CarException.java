package date0526;

public class CarException extends Exception{
    public static final int OVERFLOW = 1;
    public static final int NOTALLOW = 2;
    public static final int RENEWAL = 3;
    public static final int NOTHEAR = 4;
    public static final int ALREADY = 5;
    public static final int ETC = -1;

    public CarException(String message){
        super(message);
    }
    public CarException(int errorCode){
        this(getErrorMessage(errorCode));
    }
    private static String getErrorMessage(int errorCode) {
        String message = "";
        switch (errorCode){
            case OVERFLOW :
                message = "주차장이 가득 찼습니다.";
                break;
            case NOTALLOW :
                message = "허용되지 않은 차량입니다.";
                break;
            case RENEWAL :
                message = "현재 공사중입니다.";
                break;
            case NOTHEAR :
                message = "해당 번호에 자동차가 없습니다.";
                break;
            case ALREADY :
                message = "이미 주차중입니다.";
                break;
            case ETC :
                message = "기타 사유";
                break;
            default :
                message =" 알려지지 않은 이유입니다.";
                break;
        }
        return message;
    }
}
