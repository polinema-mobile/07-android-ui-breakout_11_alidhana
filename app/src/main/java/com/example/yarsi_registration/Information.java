package com.example.yarsi_registration;

import android.os.Parcel;
import android.os.Parcelable;

public class Information implements Parcelable {

    String name, birthday, address, jurusan, prodi;
    String fathername, fatherjob, fatheraddress, mothername, motherjob, motheraddress;

    public Information(String name, String birthday, String address, String jurusan, String prodi) {
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.jurusan = jurusan;
        this.prodi = prodi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public String getFathername() {
        return fathername;
    }

    public void setFathername(String fathername) {
        this.fathername = fathername;
    }

    public String getFatherjob() {
        return fatherjob;
    }

    public void setFatherjob(String fatherjob) {
        this.fatherjob = fatherjob;
    }

    public String getFatheraddress() {
        return fatheraddress;
    }

    public void setFatheraddress(String fatheraddress) {
        this.fatheraddress = fatheraddress;
    }

    public String getMothername() {
        return mothername;
    }

    public void setMothername(String mothername) {
        this.mothername = mothername;
    }

    public String getMotherjob() {
        return motherjob;
    }

    public void setMotherjob(String motherjob) {
        this.motherjob = motherjob;
    }

    public String getMotheraddress() {
        return motheraddress;
    }

    public void setMotheraddress(String motheraddress) {
        this.motheraddress = motheraddress;
    }

    public Information(String fathername, String fatherjob, String fatheraddress, String mothername, String motherjob, String motheraddress) {
        this.fathername = fathername;
        this.fatherjob = fatherjob;
        this.fatheraddress = fatheraddress;
        this.mothername = mothername;
        this.motherjob = motherjob;
        this.motheraddress = motheraddress;
    }

    protected Information(Parcel in) {
        name = in.readString();
        birthday = in.readString();
        address = in.readString();
        jurusan = in.readString();
        prodi = in.readString();
        fathername = in.readString();
        fatherjob = in.readString();
        fatheraddress = in.readString();
        mothername = in.readString();
        motherjob = in.readString();
        motheraddress = in.readString();
    }

    public static final Creator<Information> CREATOR = new Creator<Information>() {
        @Override
        public Information createFromParcel(Parcel in) {
            return new Information(in);
        }

        @Override
        public Information[] newArray(int size) {
            return new Information[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(address);
        parcel.writeString(birthday);
        parcel.writeString(jurusan);
        parcel.writeString(prodi);
        parcel.writeString(fathername);
        parcel.writeString(fatherjob);
        parcel.writeString(fatheraddress);
        parcel.writeString(mothername);
        parcel.writeString(motherjob);
        parcel.writeString(motheraddress);

    }
}
