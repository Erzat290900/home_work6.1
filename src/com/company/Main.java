package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setWeaponAll("Boss взял оружию");
        boss.setHealth(500);
        boss.setDamage(50);
        System.out.println(boss.info());


        Weapon weapon = new Weapon();
        weapon.setTypeWeapon("штурмовой");
        weapon.setNameWeapon("AUG");

        System.out.println(boss.getWeaponAll()+" "+weapon.getNameWeapon()+" "+weapon.getTypeWeapon());
    }
}

