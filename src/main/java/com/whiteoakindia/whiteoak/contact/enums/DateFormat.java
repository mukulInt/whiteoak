package com.whiteoakindia.whiteoak.contact.enums;

public enum DateFormat {

    FRONT_END("d'TH' MMMM yyyy");
    private String value;

    private DateFormat(String value){
        this.value=value;
    }

    public String getValue(){
        return this.value;
    }
}
