/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yumxpress.utility;

/**
 *
 * @author hp
 */
public class StaffProfile {

    public static String getStaffName() {
        return staffName;
    }

    public static void setStaffName(String staffName) {
        StaffProfile.staffName = staffName;
    }

    public static String getStaffId() {
        return staffId;
    }

    public static void setStaffId(String staffId) {
        StaffProfile.staffId = staffId;
    }

    public static String getCompanyId() {
        return companyId;
    }

    public static void setCompanyId(String companyId) {
        StaffProfile.companyId = companyId;
    }

    public static String getEmailId() {
        return emailId;
    }

    public static void setEmailId(String emailId) {
        StaffProfile.emailId = emailId;
    }
    private static String staffName;
    private static String staffId;
    private static String companyId;
    private static String emailId;
}
