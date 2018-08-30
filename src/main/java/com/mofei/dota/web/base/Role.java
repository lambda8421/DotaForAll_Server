package com.mofei.dota.web.base;

public enum  Role {
    Carry("Carry"),
    Escape("Escape"),
    Nuker("Nuker");

    String value;

    Role() {
    }

    Role(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
