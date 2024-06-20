package com.automationsession.Jun19;

public class AbstractionDemoUse extends AbstractionDemo {

    private int houseNo;
    private String address1;
    private String city;

    @Override
    public void showYourAddress() {
        System.out.println("House No : "+houseNo);
        System.out.println("Address 1 : "+address1);
        System.out.println("City : "+city);
    }

    @Override
    public void setYourAddress(String address1, String city, int houseNo) {
        this.houseNo = houseNo;
        this.city = city;
        this.address1 = address1;

    }

    public static void main(String[] args) {

        AbstractionDemoUse demoUse = new AbstractionDemoUse();
        demoUse.setYourAddress("Nottigham", "St.Louis", 800);
        demoUse.showYourAddress();
    }
}
