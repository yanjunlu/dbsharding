package com.example.demo.entity;

public class Order {
    private long orderId;

    private String remark;

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "(orderId: " + orderId + ", "
                + "remark: " + remark + ")";
    }
}
