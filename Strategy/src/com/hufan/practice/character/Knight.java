package com.hufan.practice.character;

/**
 * Created by huzhaohu on 2016/11/15.
 */
public class Knight extends Character {
    @Override
    public void fight() {
        WEAPON_BEHAVIOR.useWeapon();
    }
}
