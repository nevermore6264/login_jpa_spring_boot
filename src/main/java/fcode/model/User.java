package fcode.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
public class User {

    // ID MongoDB
    @Id
    private String id;

    //Tên hiển thị
    private String displayName;

    // Họ tên đầy đủ
    private String familyName;

    //Email đăng nhập
    private String emailAddress;

    // Mật khẩu
    private String password;

    //Ngày sinh
    private String birthYear;

    //Số điện thoại
    private String phoneNumber;

    // Mã tỉnh
    private int provinceId;

    // Mã huyện
    private int districtId;

    // Thông tin đường
    private String streetInformation;

    // Giới thiệu bản thân
    private String summary;

    // Ảnh đại diện
    private String avatar;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public int getDistrictId() {
        return districtId;
    }

    public void setDistrictId(int districtId) {
        this.districtId = districtId;
    }

    public String getStreetInformation() {
        return streetInformation;
    }

    public void setStreetInformation(String streetInformation) {
        this.streetInformation = streetInformation;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public User(String id, String displayName, String familyName, String emailAddress, String password, String birthYear, String phoneNumber, int provinceId, int districtId, String streetInformation, String summary, String avatar) {
        this.id = id;
        this.displayName = displayName;
        this.familyName = familyName;
        this.emailAddress = emailAddress;
        this.password = password;
        this.birthYear = birthYear;
        this.phoneNumber = phoneNumber;
        this.provinceId = provinceId;
        this.districtId = districtId;
        this.streetInformation = streetInformation;
        this.summary = summary;
        this.avatar = avatar;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", displayName='" + displayName + '\'' +
                ", familyName='" + familyName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", password='" + password + '\'' +
                ", birthYear='" + birthYear + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", provinceId=" + provinceId +
                ", districtId=" + districtId +
                ", streetInformation='" + streetInformation + '\'' +
                ", summary='" + summary + '\'' +
                ", avatar='" + avatar + '\'' +
                '}';
    }
}
