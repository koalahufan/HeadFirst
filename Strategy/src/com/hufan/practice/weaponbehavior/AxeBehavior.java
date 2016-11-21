package com.hufan.practice.weaponbehavior;

/**
 * Created by huzhaohu on 2016/11/15.
 */
public class AxeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("使用斧子进行劈砍");
    }
}
