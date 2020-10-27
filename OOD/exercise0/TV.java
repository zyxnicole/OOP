package exercise0;

import java.nio.channels.Channel;

/**
 * Program: INFO5100
 * Description: Exercise_0
 * CreatedBy: Nicole_Z
 * CreatDate: 10/03/2020
 **/

public class TV {
    String brand = "Samsung";
    String type = "LED";
    double screenSize = 64.5;
    double width = 57.1;
    double height = 35.6;
    int depth = 7;
    boolean TVStates;
    boolean WithSpeaker = true;
    enum  Channel {
        CHANNEL1,
        CHANNEL2,
        CHANNEL3,
    }
    Channel channel;

    public TV(String object) {
        System.out.println("\nThis is outer constructor for " + object);

    }
    public TV(Channel channel) {
        this.channel = channel;
        System.out.println("\nThis is outer constructor for tv3");
    }

    void setTVStates(boolean tvStates) {
        this.TVStates = tvStates;
    }

    void getTVStates(){
        if (TVStates) {
            System.out.println("The TV is on");
        } else System.out.println("The TV is off");
    }

    void getBrand() {
        System.out.println("Brand: " + brand);
    }

    void setChannel() {
        switch (channel) {
            case CHANNEL2:
                System.out.println("Switch to Channel 2");
                break;
            case CHANNEL3:
                System.out.println("Switch to Channel 3");
                break;
            case CHANNEL1:
                System.out.println("Switch to Channel 1");
                break;
        }

    }

    public class RemoteControl {

        RemoteControl() {
            System.out.println("This is Nested Constructor");
        }

        public void setTVOn(boolean TVState) {
            if (TVState) {
                setTVStates(true);
                System.out.println("Turns TV On");
            } else {
                setTVStates(false);
                System.out.println("Turns TV Off");
            }
        }

    }

    public static void main(String[] args) {
        TV tv1 = new TV("tv1");
        tv1.getBrand();
        System.out.println("LED Type: " + tv1.type);
        System.out.println("ScreenSize: " + tv1.screenSize);
        System.out.println("Width: " + tv1.width + " inches");
        System.out.println("Height: " + tv1.height + " inches");
        System.out.println("Depth: " + tv1.depth + " inches");
        System.out.println("With Speaker: " + tv1.WithSpeaker);

        TV tv2 = new TV("tv2");
        TV.RemoteControl remoteControl = tv2.new RemoteControl();
        remoteControl.setTVOn(true);
        tv2.getTVStates();

        String str = "CHANNEL1";
        TV tv3 = new TV(Channel.valueOf(str));
        tv3.setChannel();
    }
}
