package com.naufal;

public class Driver extends Member{
    String platMotor, jenisMotor;
    public Driver(String nik, String nama, String no, String platMotor, String jenisMotor, double saldo){
        super(nik, nama, no, saldo);
        this.platMotor = platMotor;
        this.jenisMotor= jenisMotor;

    }

    public String getPlatMotor(){
        return platMotor;
    }
    public void setPlatMotor(String platMotor){
        this.platMotor=platMotor;
    }

    public String getJenisMotor(){
        return jenisMotor;
    }
    public void setJenisMotor(String jenisMotor){
        this.jenisMotor=jenisMotor;
    }
}