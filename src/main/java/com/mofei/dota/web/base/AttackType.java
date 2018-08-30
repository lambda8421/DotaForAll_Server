package com.mofei.dota.web.base;

public enum AttackType {
    Melee(0,"Melee"),
    Ranged(1,"Ranged");

    int value;
    String string;

    AttackType() {
    }

    AttackType(int value) {
        this.value = value;
    }

    AttackType(String string) {
        this.string = string;
    }

    AttackType(int value, String string) {
        this.value = value;
        this.string = string;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
