package com.company.advanced.encapsulation.q1;

/*
    a) Add field „money”, create constructor, getter and setter.
    b) Add verification for both getter and setter. Getter should result in returning as much
    money, as the user asked for. It should return 0 if money <= 10.
    c) Setter should not accept values below 0 and greater than 3000. It may print a message
    like „I don’t have enough space in my pocket for as much money!”
 */

public class Pocket {

    private int money;

    public Pocket() {
    }

    public int getMoney(int money) {
        if (this.money >= 10 || money < this.money) {
            this.money =- money;
            return money;
        }
        return 0;
    }

    public void setMoney(int money) {
        if (money > 0 && money < 3000) {
            this.money = money;
        } else {
            System.out.println("Not enough space in my pocket.");
        }
    }

    public static void main(String[] args) {
        Pocket pocket = new Pocket();
        pocket.setMoney(4000);
        pocket.setMoney(2999);
        System.out.println(pocket.getMoney(3000));
        pocket.getMoney(500);
        pocket.getMoney(500);
        pocket.getMoney(500);
        pocket.getMoney(500);
        pocket.getMoney(500);
        System.out.println(pocket.getMoney(500));
    }
}
