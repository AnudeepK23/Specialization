package com.torryharris.lab;

public class MainBank {

    public static void main(String[] args) {

    SBIBank sbiBank = new SBIBank(15000);
    AXISBank aXISBank = new AXISBank(35000);

    sbiBank.showBalance();
    aXISBank.showBalance();

    sbiBank.deposit(25000);
    sbiBank.withDraw(15000);
    sbiBank.showBalance();
    //sbiBank.licPolicy();

    sbiBank.withDraw(55000);


//        //Bank bank;
//
//        SBIBank bank = new SBIBank(15000);
//
//        bank.licPolicy();
//
//        bank.showBalance();
//
//        //bank = new AXISBank(35000);
//
//        //bank.showBalance();



    }

}