package com.qf.admin.pojo.po;

public class Order {
//    订单实体类
//    订单实体类
//    订单实体类
//    订单实体类
    private int orderId;
    private String orderNo;
    private String tenementname;
    private String tenementserial;
    private String phone;

    @Override
    public String toString() {
        return "Orderservice{" +
                "orderId=" + orderId +
                ", orderNo='" + orderNo + '\'' +
                ", tenementname='" + tenementname + '\'' +
                ", tenementserial='" + tenementserial + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public Order() {
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getTenementname() {
        return tenementname;
    }

    public void setTenementname(String tenementname) {
        this.tenementname = tenementname;
    }

    public String getTenementserial() {
        return tenementserial;
    }

    public void setTenementserial(String tenementserial) {
        this.tenementserial = tenementserial;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
