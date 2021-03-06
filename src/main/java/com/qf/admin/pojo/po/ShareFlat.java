package com.qf.admin.pojo.po;

public class ShareFlat {
    private String tid;
    private String tname;
    private double price;
    private String type;
    private String floor;
    private String address;
    private String subway;
    private int single_bathrooom;
    private int shower;
    private int balcony;

    @Override
    public String toString() {
        return "ShareFlat{" +
                "tid='" + tid + '\'' +
                ", tname='" + tname + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", floor='" + floor + '\'' +
                ", address='" + address + '\'' +
                ", subway='" + subway + '\'' +
                ", single_bathrooom=" + single_bathrooom +
                ", shower=" + shower +
                ", balcony=" + balcony +
                '}';
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSubway() {
        return subway;
    }

    public void setSubway(String subway) {
        this.subway = subway;
    }

    public int getSingle_bathrooom() {
        return single_bathrooom;
    }

    public void setSingle_bathrooom(int single_bathrooom) {
        this.single_bathrooom = single_bathrooom;
    }

    public int getShower() {
        return shower;
    }

    public void setShower(int shower) {
        this.shower = shower;
    }

    public int getBalcony() {
        return balcony;
    }

    public void setBalcony(int balcony) {
        this.balcony = balcony;
    }
}
