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
public class OwnerProfile {

    public static void setOwnerName(String ownerName) {
        OwnerProfile.ownerName = ownerName;
    }

    public static void setCompanyName(String companyName) {
        OwnerProfile.companyName = companyName;
    }

    public static void setCompanyId(String companyId) {
        OwnerProfile.companyId = companyId;
    }

    public static String getOwnerName() {
        return ownerName;
    }

    public static String getCompanyName() {
        return companyName;
    }

    public static String getCompanyId() {
        return companyId;
    }
    private static String ownerName;
    private static String companyName;
    private static String companyId;
}
