package com.kpi.javaLabs.Model;

public class Patient {

    private int MedCardNum;
    private int Id;
    private String Surname;
    private String Name;
    private String Patronymic;
    private String Address;
    private String Phone;
    private String Diagnosis;

    private static DataSource data = new DataSource();
    private static String[] DiagnosisList = data.getDiagnosis();

    public Patient(int counter){
        this.MedCardNum = counter+1;
        this.Id = data.getRandId();
        this.Surname = data.getRandSurname();
        this.Name = data.getRandName();
        this.Patronymic = data.getRandPatronymic();
        this.Address = data.getRandAddress();
        this.Phone = data.getRandPhone();
        this.Diagnosis = data.getRandDiagnosis();
    }

    @Override
    public String toString() {
        return String.format( "| MedCard Number: %-3d | Patient ID: %-3d | Surname: %-8s | Name: %-7s | Patronymic: %-15s |" +
                " Address: %-15s | Phone: %-13s | Diagnosis: %-14s |",
                MedCardNum, Id, Surname, Name, Patronymic, Address, Phone, Diagnosis);
    }

    public static String[] getDiagnosisList(){
        return DiagnosisList;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setPatronymic(String patronymic) {
        Patronymic = patronymic;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public void setMedCardNum(int medCardNum) {
        MedCardNum = medCardNum;
    }

    public void setDiagnosis(String diagnosis) {
        Diagnosis = diagnosis;
    }

    public int getId() {
        return Id;
    }

    public String getSurname() {
        return Surname;
    }

    public String getName() {
        return Name;
    }

    public String getPatronymic() {
        return Patronymic;
    }

    public String getAddress() {
        return Address;
    }

    public String getPhone() {
        return Phone;
    }

    public String getDiagnosis() {
        return Diagnosis;
    }

    public int getMedCardNum() {
        return MedCardNum;
    }
}
