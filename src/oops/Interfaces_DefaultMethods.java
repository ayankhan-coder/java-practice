package practice;

import java.util.Scanner;
/*JAVA INTERFACES AND DEFAULT METHODS*/
interface Camera{                         // L1------Interfaces-default-private
    void takeSnap();
    void recordVideo();
    private void greet(){//Private Method
        System.out.println("Good Morning");
    }
    default void record4KVideo(){//Default Method
        greet();
        System.out.println("Recording in 4K");
    }
}
interface Wifi{
    String []getNetworks();
    void connectToNetwork();
}
class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+phoneNumber);
    }
    void pickCall(int phoneNumber){
        System.out.println("Connecting");
    }
}
class MySmartPhone extends MyCellPhone implements Camera,Wifi{
    @Override
    public void takeSnap(){
        System.out.println("Taking Snap");
    }
    @Override
    public void recordVideo(){
        System.out.println("Recording Video");
    }
//    @Override
//    public void record4KVideo(){//OverWrite defaultMethod
//        System.out.println("Video Recording 4K   ");
//    }

    @Override
    public String []getNetworks(){
        System.out.println("List of Networks");
        String[] networkList = {"OppoA-31","Vivo-Y12","Harry"};
        return networkList;
    }
    @Override
    public void connectToNetwork(){
        System.out.println("connected To Network");
    }
}


/*interface Calling {                     // L2------Inheritance in Interfaces
    void call();
}

interface Camera1 {
    void camera();
}
interface Music {
    void music();
}
interface SmartDevice extends Calling, Camera1, Music {}
class IPhone implements SmartDevice {
    @Override
    public void camera() {
        System.out.println("Clicking Photos");
    }
    @Override
    public void call() {
        System.out.println("Calling");
    }
    @Override
    public void music() {
        System.out.println("Playing Music");
    }
}*/

abstract class User{                  // L3 -------------Important
    String name;
    public User(String name) {
        this.name = name;
    }
}
interface PlayVideo{
    void playVideo();
}
interface StopVideo{
    void stopVideo();
}interface DownloadVideo{
    void downloadVideo();
}
interface DownloadAtHighQuality{
    void downloadAtHighQuality();
}
interface YoutubeFunctions extends PlayVideo,StopVideo,DownloadVideo{
}
interface YoutubePremiumFunctions extends DownloadAtHighQuality,YoutubeFunctions{}
class Youtube extends User implements YoutubeFunctions{
    public Youtube(String name) {
        super(name);
    }
    @Override
    public void playVideo() {
        System.out.println("Video is Playing");
    }
    @Override
    public void stopVideo() {
        System.out.println("video stopped");
    }
    @Override
    public void downloadVideo() {
        System.out.println("video downloaded at low quality");
    }
}
class YoutubePremium extends Youtube implements YoutubePremiumFunctions {
    public YoutubePremium(String name) {
        super(name);
    }
    @Override
    public void downloadAtHighQuality() {
    }
}

//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
public class Interfaces_DefaultMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MySmartPhone ms = new MySmartPhone();          // L1------Interfaces-default-private
        ms.record4KVideo();
        String[] arr = ms.getNetworks();
        for (String element:arr){
            System.out.println(element);
        }
        ms.connectToNetwork();

       /* IPhone iPhone = new IPhone();                // L2------Inheritance in Interfaces
        iPhone.music();
        iPhone.camera();*/

        YoutubeFunctions user;                         // L3- -----------Important
        System.out.println("Enter 1:practice.Youtube    2:practice.YoutubePremium");
        int choice = sc.nextInt();
        if (choice == 1){
            user = new Youtube("ayan");
        }else {
            user = new YoutubePremium("ahmed");
        }

    }
}
