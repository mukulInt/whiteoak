package com.whiteoakindia.whiteoak.Branch.enums;

public enum Region {


    EAST(1),
    WEST(2),
    NORTH(3),
    SOUTH(4);

    private Integer value;


    private Region(Integer value){
        this.value=value;
    }

    public Integer getValue(){
        return this.value;
    }

}
