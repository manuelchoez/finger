package com.example.fingerv2.utilities;

public class utilities {

    //Constantes campos table user
    public static final String TABLE_USER="user";
    public static final String FIELD_ID="id";
    public static final String FIELD_NIU="niu";
    public static final String FIELD_FINGER="finger";

    public static final String CREATE_TABLE_USER="CREATE TABLE "+TABLE_USER+" ("+FIELD_ID+" INTEGER, "+FIELD_NIU+" TEXT, "+FIELD_FINGER+" BLOB)";
}
