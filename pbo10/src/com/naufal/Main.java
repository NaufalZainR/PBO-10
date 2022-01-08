package com.naufal;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner user = new Scanner(System.in);
    static ArrayList<Driver> drivers = new ArrayList<>();
    static ArrayList<Customer> customers = new ArrayList<>();

    public static void main(String[] args) {
        int pilih;
        do {
            System.out.println("PAL-JOL");
            System.out.println();
            System.out.println("1. Input Driver");
            System.out.println("2. Input Customer");
            System.out.println("3. Info Drivers");
            System.out.println("4. Info Customer");
            System.out.println("5. Topup Saldo Customer");
            System.out.println("6. Jasa Pengantaran");
            System.out.println("Pilih :");
            pilih = user.nextInt();

            switch (pilih){
                case 1 :
                    inputDrvr();
                    break;
                case 2:
                    inputCstmr();
                    break;
                case 3:
                    infoMemberDrvr();
                    break;
                case 4:
                    infoMemberCstmr();
                    break;
                case 5:
                    topUpSaldoCstmr();
                    break;
                case 6:
                    pembayaranDrvr();
                    break;
                case 7:
                default:

            }
        }while (pilih != 7);
    }

    static void inputDrvr(){
        String nik, nama, no, platMotor, jenisMotor;
        double saldo;

        System.out.println("NIK :");
        nik = user.next();
        System.out.println("Nama :");
        nama = user.next();
        System.out.println("Nomor.Telp:");
        no = user.next();
        System.out.println("Plat :");
        platMotor = user.next();
        System.out.println("Jenis Motor :");
        jenisMotor = user.next();
        System.out.println("Saldo :");
        saldo = user.nextDouble();

        drivers.add(new Driver(nik, nama, no, platMotor,jenisMotor, saldo));

        System.out.println();

    }

    static void inputCstmr(){
        String nik, nama, no;
        double saldo;

        System.out.println("NIK :");
        nik = user.next();
        System.out.println("Nama :");
        nama = user.next();
        System.out.println("Nomor.Telp:");
        no = user.next();
        System.out.println("Saldo :");
        saldo = user.nextDouble();

        customers.add(new Customer(nik, nama, no,saldo));

        System.out.println();
    }


    static void infoMemberDrvr(){
        for (Driver driver : drivers){
            System.out.println("NiK : "+ driver.getNik());
            System.out.println("Nama : "+ driver.getNama());
            System.out.println("No.Telp : "+ driver.getNo());
            System.out.println("Plat : "+ driver.getPlatMotor());
            System.out.println("Jenis : "+ driver.getJenisMotor());
            System.out.println("Saldo : "+ driver.getSaldo());
        }
        System.out.println();
    }

    static void infoMemberCstmr(){
        for (Customer customer : customers){
            System.out.println("NiK : "+ customer.getNik());
            System.out.println("Nama : "+ customer.getNama());
            System.out.println("No.Telp : "+ customer.getNo());
            System.out.println("Saldo : "+ customer.getSaldo());
        }

        System.out.println();
    }

    static void topUpSaldoCstmr(){
        int idCustomer, idDriver;
        double topUp;

        System.out.println("Masukan id customers : ");
        idCustomer = user.nextInt();
        System.out.println("Masukan id drivers : ");
        idDriver = user.nextInt();
        System.out.println("Jumlah topup saldo : ");
        topUp = user.nextDouble();

        drivers.get(idDriver).saldo -= topUp;
        customers.get(idCustomer).saldo += topUp;

        System.out.println("Selamat Transaksi Berhasil");
    }

    static void pembayaranDrvr(){
        int noDriver, noCustomer;
        double bayar;

        System.out.println("Masukan id driver : ");
        noDriver = user.nextInt();
        System.out.println("Masukan id customer : ");
        noCustomer = user.nextInt();
        System.out.println("Tarif bayar driver : ");
        bayar = user.nextDouble();

        customers.get(noCustomer).saldo -= bayar;
        drivers.get(noDriver).saldo += bayar;
        System.out.println("Selamat Transaksi Berhasil");
    }

}