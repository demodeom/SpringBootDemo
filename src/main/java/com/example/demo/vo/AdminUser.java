package com.example.demo.vo;

public class AdminUser {
    private int id;

    private String adminUserName;

    private String adminUserPassword;

    private int adminUserStatus;

    public AdminUser() {
    }

    public AdminUser(int id, String adminUserName, String adminUserPassword, int adminUserStatus) {
        this.id = id;
        this.adminUserName = adminUserName;
        this.adminUserPassword = adminUserPassword;
        this.adminUserStatus = adminUserStatus;
    }

    public AdminUser(String adminUserName, String adminUserPassword, int adminUserStatus) {

        this.adminUserName = adminUserName;
        this.adminUserPassword = adminUserPassword;
        this.adminUserStatus = adminUserStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdminUserName() {
        return adminUserName;
    }

    public void setAdminUserName(String adminUserName) {
        this.adminUserName = adminUserName;
    }

    public String getAdminUserPassword() {
        return adminUserPassword;
    }

    public void setAdminUserPassword(String adminUserPassword) {
        this.adminUserPassword = adminUserPassword;
    }

    public int getAdminUserStatus() {
        return adminUserStatus;
    }

    public void setAdminUserStatus(int adminUserStatus) {
        this.adminUserStatus = adminUserStatus;
    }

    @Override
    public String toString() {
        return "AdminUser{" +
                "id=" + id +
                ", adminUserName='" + adminUserName + '\'' +
                ", adminUserPassword='" + adminUserPassword + '\'' +
                ", adminUserStatus=" + adminUserStatus +
                '}';
    }
}
