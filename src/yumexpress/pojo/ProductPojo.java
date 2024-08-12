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
public class ProductPojo {

    public ProductPojo() {
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public Image getProductImage() {
        return productImage;
    }

    public void setProductImage(Image productImage) {
        this.productImage = productImage;
    }

    public String getProductImageType() {
        return productImageType;
    }

    public void setProductImageType(String productImageType) {
        this.productImageType = productImageType;
    }

    @Override
    public String toString() {
        return "ProductPojo{" + "productId=" + productId + ", companyId=" + companyId + ", productName=" + productName + ", productPrice=" + productPrice + ", productImage=" + productImage + ", productImageType=" + productImageType + '}';
    }

    public ProductPojo(String productId, String companyId, String productName, Double productPrice, Image productImage, String productImageType) {
        this.productId = productId;
        this.companyId = companyId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productImage = productImage;
        this.productImageType = productImageType;
    }
    private String productId;
    private String companyId;
    private String productName;
    private Double productPrice;
    private Image productImage;
    private String productImageType;
    
    
}

