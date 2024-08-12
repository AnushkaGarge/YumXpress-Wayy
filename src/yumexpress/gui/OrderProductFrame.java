/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yumexpress.gui;

import java.awt.Image;
import java.sql.SQLException;
import java.util.Map;
import javax.mail.MessagingException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import yumexpress.pojo.OrderPojo;
import yumexpress.pojo.PlaceOrderPojo;
import yumexpress.pojo.ProductPojo;
import yumxpress.dao.CompanyDao;
import yumxpress.dao.OrderDao;
import yumxpress.dao.StaffDao;
import yumxpress.utility.Mailer;
import yumxpress.utility.UserProfile;

/**
 *
 * @author hp
 */
public class OrderProductFrame extends javax.swing.JFrame {

    /**
     * Creates new form OrderProductFrame
     */
    private ProductPojo product;
    private OrderProductFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.lblUserProfile.setText("Hello " + UserProfile.getUserName().trim());
       
    }
    public OrderProductFrame(ProductPojo product){
        this();
        this.product=product;
        loadProductDetails();
        
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblUserProfile = new javax.swing.JLabel();
        btnCustomerAccount = new javax.swing.JButton();
        btnOrderFood = new javax.swing.JButton();
        btnCancelOrder = new javax.swing.JButton();
        btnOrderHistory = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtFoodName = new javax.swing.JTextField();
        txtFoodPrice = new javax.swing.JTextField();
        btnOrder = new javax.swing.JButton();
        lblFoodImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yumexpress/icons/user.png"))); // NOI18N

        lblUserProfile.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        btnCustomerAccount.setBackground(new java.awt.Color(255, 255, 255));
        btnCustomerAccount.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnCustomerAccount.setText("My Account");
        btnCustomerAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerAccountActionPerformed(evt);
            }
        });

        btnOrderFood.setBackground(new java.awt.Color(255, 255, 255));
        btnOrderFood.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnOrderFood.setText("Order Food");
        btnOrderFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderFoodActionPerformed(evt);
            }
        });

        btnCancelOrder.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelOrder.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnCancelOrder.setText("Cancel Order");
        btnCancelOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelOrderActionPerformed(evt);
            }
        });

        btnOrderHistory.setBackground(new java.awt.Color(255, 255, 255));
        btnOrderHistory.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnOrderHistory.setText("Order History");
        btnOrderHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderHistoryActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnOrderHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnCustomerAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnOrderFood, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancelOrder, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(lblUserProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel1)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addComponent(lblUserProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnCustomerAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnOrderFood, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancelOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnOrderHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 204));
        jLabel3.setText("Food Name:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 204));
        jLabel4.setText("Price:");

        txtFoodName.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        txtFoodPrice.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtFoodPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFoodPriceActionPerformed(evt);
            }
        });

        btnOrder.setBackground(new java.awt.Color(0, 153, 204));
        btnOrder.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnOrder.setForeground(new java.awt.Color(255, 255, 255));
        btnOrder.setText("Order");
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(37, 37, 37)
                                .addComponent(txtFoodPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE))
                            .addComponent(txtFoodName)
                            .addComponent(lblFoodImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 223, Short.MAX_VALUE)
                        .addComponent(btnOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(174, 174, 174))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(txtFoodName, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(lblFoodImage, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtFoodPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(btnOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOrderFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderFoodActionPerformed
        OrderFoodFrame off = new OrderFoodFrame();
        off.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnOrderFoodActionPerformed

    private void btnOrderHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderHistoryActionPerformed
        OrderHistoryFrame vohf = new OrderHistoryFrame();
        vohf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnOrderHistoryActionPerformed

    private void btnCancelOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelOrderActionPerformed
        CancelOrderFrame cof = new CancelOrderFrame();
        cof.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelOrderActionPerformed

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
       
        PlaceOrderPojo placeOrder= new PlaceOrderPojo();
        placeOrder.setCompanyId(product.getCompanyId());
        placeOrder.setProductId(product.getProductId());
        placeOrder.setCustomerId(UserProfile.getUserId());
        
        try{
            String staffId= StaffDao.getRandomStaffIdFromCompany(product.getCompanyId());
            placeOrder.setDeliveryStaffId(staffId);
            String orderId = OrderDao.placeOrder(placeOrder);
            if(orderId==null){
                JOptionPane.showMessageDialog(null,"Sorry! Order cannot be placed");
                return;
            }
            OrderPojo order= OrderDao.getOrderDetailsByOrderId(orderId);
            Map<String,String>emailCredentials= CompanyDao.getEmailCredentialsByCompanyId(product.getCompanyId());
            System.out.println(emailCredentials);
            System.out.println(order);
            Mailer.sendMail(emailCredentials, order);
            JOptionPane.showMessageDialog(null,"Order placed and Email sent successfully");  
            this.dispose();
            new OrderFoodFrame().setVisible(true);
        }
        catch(SQLException ex){
         JOptionPane.showMessageDialog(null,"DB error in customer registration frame");
         ex.printStackTrace();
        }catch(MessagingException sq){
         JOptionPane.showMessageDialog(null, "Mail Error in customer registration frame");
         sq.printStackTrace();
        }
        
    }//GEN-LAST:event_btnOrderActionPerformed

    private void txtFoodPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFoodPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFoodPriceActionPerformed

    private void btnCustomerAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerAccountActionPerformed
        CustomerAccountFrame caf= new CustomerAccountFrame();
        caf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCustomerAccountActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        CustomerOptionFrame clf = new CustomerOptionFrame();
        clf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OrderProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderProductFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCancelOrder;
    private javax.swing.JButton btnCustomerAccount;
    private javax.swing.JButton btnOrder;
    private javax.swing.JButton btnOrderFood;
    private javax.swing.JButton btnOrderHistory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblFoodImage;
    private javax.swing.JLabel lblUserProfile;
    private javax.swing.JTextField txtFoodName;
    private javax.swing.JTextField txtFoodPrice;
    // End of variables declaration//GEN-END:variables
    private void loadProductDetails() {
       this.txtFoodName.setText(product.getProductName());
       this.txtFoodPrice.setText(product.getProductPrice()+"");
       Image img = product.getProductImage();
       img = img.getScaledInstance(this.lblFoodImage.getWidth(), this.lblFoodImage.getHeight(), Image.SCALE_SMOOTH);
       ImageIcon icon = new ImageIcon(img);
       this.lblFoodImage.setIcon(icon);
    }

}
