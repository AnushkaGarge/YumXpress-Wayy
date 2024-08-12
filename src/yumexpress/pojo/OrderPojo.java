/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yumexpress.pojo;

import java.awt.Image;

/**
 *
 * @author hp
 */
public class OrderPojo {

    @Override
    public String toString() {
        return "OrderPojo{" + "companyEmailId=" + companyEmailId + ", orderId=" + orderId + ", customerName=" + customerName + ", CustomerAddress=" + CustomerAddress + ", deliveryStaffName=" + deliveryStaffName + ", customerPhoneNo=" + customerPhoneNo + ", companyName=" + companyName + ", productName=" + productName + ", productPrice=" + productPrice + ", otp=" + otp + ", productImage=" + productImage + ", status=" + status + ", review=" + review + '}';
    }

    public OrderPojo() {
    }

    public OrderPojo(String companyEmailId, String orderId, String customerName, String CustomerAddress, String deliveryStaffName, String customerPhoneNo, String companyName, String productName, double productPrice, int otp, Image productImage, String status, String review) {
        this.companyEmailId = companyEmailId;
        this.orderId = orderId;
        this.customerName = customerName;
        this.CustomerAddress = CustomerAddress;
        this.deliveryStaffName = deliveryStaffName;
        this.customerPhoneNo = customerPhoneNo;
        this.companyName = companyName;
        this.productName = productName;
        this.productPrice = productPrice;
        this.otp = otp;
        this.productImage = productImage;
        this.status = status;
        this.review = review;
    }

    public String getCompanyEmailId() {
        return companyEmailId;
    }

    public void setCompanyEmailId(String companyEmailId) {
        this.companyEmailId = companyEmailId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return CustomerAddress;
    }

    public void setCustomerAddress(String CustomerAddress) {
        this.CustomerAddress = CustomerAddress;
    }

    public String getDeliveryStaffName() {
        return deliveryStaffName;
    }

    public void setDeliveryStaffName(String deliveryStaffName) {
        this.deliveryStaffName = deliveryStaffName;
    }

    public String getCustomerPhoneNo() {
        return customerPhoneNo;
    }

    public void setCustomerPhoneNo(String customerPhoneNo) {
        this.customerPhoneNo = customerPhoneNo;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getOtp() {
        return otp;
    }

    public void setOtp(int otp) {
        this.otp = otp;
    }

    public Image getProductImage() {
        return productImage;
    }

    public void setProductImage(Image productImage) {
        this.productImage = productImage;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    private String companyEmailId;
    private String orderId;
    private String customerName;
    private String CustomerAddress;
    private String deliveryStaffName;
    private String customerPhoneNo;
    private String companyName;
    private String productName;
    private double productPrice;
    private int otp;;
    private Image productImage;
    private String status;
    private String review;
    
}
