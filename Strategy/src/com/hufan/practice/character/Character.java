package com.hufan.practice.character;

import com.hufan.practice.weaponbehavior.WeaponBehavior;

/**
 * Created by huzhaohu on 2016/11/15.
 */
public abstract class Character {
    WeaponBehavior WEAPON_BEHAVIOR;
    public abstract void fight();


    public void setWeapon(WeaponBehavior w)
    {
        this.WEAPON_BEHAVIOR = w;
    }
}
