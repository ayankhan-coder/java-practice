package java8Features;
// Default Method
interface SmartCamera{
    default void recordVideo(){                             // default method
        System.out.println("Recording video Using SmartCamera");
    }
}
interface Camera{
    void clickPhoto();
    default void recordVideo(){
        System.out.println("Recording video Using Camera");
    }
}
class Phone implements Camera,SmartCamera,Payment{
    @Override
    public void clickPhoto(){
        System.out.println("Photo Clicked in Phone");
    }

    @Override
    public void recordVideo() {
        Camera.super.recordVideo();
    }
}

// Static Method
interface CalculatorUtils{
    static boolean isPositive(int number){                       // static method
        return number > 0;
    }
    static boolean isEqual(int num1, int num2){
        return num1 == num2;
    }
}

// Private Method
interface Payment{
    private void validate(){                                 // private method
        System.out.println("Payment Validating");
    }
    default void payCash(){
        validate();
        System.out.println("Payment using Cash");
    }
}
public class DefaultStatPri_meths {
    public static void main(String[] args) {

        Camera camera = new Phone();
        camera.clickPhoto();
        camera.recordVideo();

        System.out.println(CalculatorUtils.isPositive(10));
        System.out.println(CalculatorUtils.isEqual(10,10));

        Phone phone = new Phone();
        phone.payCash();


    }
}
