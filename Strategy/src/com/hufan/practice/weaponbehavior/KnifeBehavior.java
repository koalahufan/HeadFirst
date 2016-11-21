package com.hufan.practice.weaponbehavior;

/**
 * Created by huzhaohu on 2016/11/15.
 */
public class KnifeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("使用匕首进行刺杀");
    }
}
