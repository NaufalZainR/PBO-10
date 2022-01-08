package com.naufal;

public class Member {
    String nik, nama, no;
    double saldo = 0;

    public Member(String nik, String nama, String no, double saldo){
        this.nik=nik;
        this.nama=nama;
        this.no=no;
        this.saldo=saldo;

    }

    public String getNik(){
        return nik;
    }

    public void setNik(){
        this.nik=nik;
    }

    public String getNama(){ return nama; }

    public void setNama(){
        this.nama=nama;
    }

    public String getNo(){
        return no;
    }

    public void setNomorHP(){
        this.no=no;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(){
        this.saldo=saldo;
    }
}