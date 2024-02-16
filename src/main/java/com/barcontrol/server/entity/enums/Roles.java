package com.barcontrol.server.entity.enums;

public enum Roles {

    User(1), Admin(2);

    private int value;
    private Roles( int value ) {
        this.value = value;
    }


    public int getValue() {
        return value;
    }
}
