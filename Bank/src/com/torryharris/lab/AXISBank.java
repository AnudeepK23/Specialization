package com.torryharris.lab;

public class AXISBank implements Bank {

    private int balance;

    AXISBank(int amount){
        this.balance = amount;

    }

    @Override
    public void withDraw(int amount) {
        if(amount < balance)
            balance = balance - amount;
        else System.out.println("From AXISBank......InSufficient Funds");
    }

    @Override
    public void deposit(int amount) {
        if(amount < 200000)
            balance = balance + amount;
        else System.out.println("From AXISBank...... Not possible to depost");
    }

    @Override
    public void showBalance() {
        System.out.println("From AXISBank...... Availiable Balance ...."+balance);
    }
//    @Override
//    public void licPolicy() {
//        System.out.println("From AXISBank.......licPolicy");
//    }

}