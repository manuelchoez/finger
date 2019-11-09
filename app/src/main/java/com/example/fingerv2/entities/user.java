package com.example.fingerv2.entities;

public class user {
    private Integer  id;
    private String niu;
    private byte[] finger;

    public user(Integer id, String niu, byte[] finger) {
        this.id = id;
        this.niu = niu;
        this.finger = finger;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNiu() {
        return niu;
    }

    public void setNiu(String niu) {
        this.niu = niu;
    }

    public byte[] getFinger() {
        return finger;
    }

    public void setFinger(byte[] finger) {
        this.finger = finger;
    }
}
