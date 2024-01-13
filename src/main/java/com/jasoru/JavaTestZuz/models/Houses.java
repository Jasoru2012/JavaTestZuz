package com.jasoru.JavaTestZuz.models;

public class Houses {
    private int house_id;
    private String house_address;
    private int owner_id;

    public Houses(int house_id, String house_address, int owner_id) {
        this.house_id = house_id;
        this.house_address = house_address;
        this.owner_id = owner_id;
    }

    public int getHouse_id() {
        return house_id;
    }

    public void setHouse_id(int house_id) {
        this.house_id = house_id;
    }

    public String getHouse_address() {
        return house_address;
    }

    public void setHouse_address(String house_address) {
        this.house_address = house_address;
    }

    public int getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(int owner_id) {
        this.owner_id = owner_id;
    }

}
