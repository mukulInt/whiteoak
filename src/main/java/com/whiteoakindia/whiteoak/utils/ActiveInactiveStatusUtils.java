package com.whiteoakindia.whiteoak.utils;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ActiveInactiveStatusUtils {


    private Integer active;


    private Integer inactive;

    public ActiveInactiveStatusUtils(@Value("${status.active}") Integer active,@Value("${status.inactive}") Integer inactive) {
        this.active = active;
        this.inactive = inactive;
    }

    public Integer getActiveStatus(){
        return this.active;
    }

    public Integer getInactiveStatus(){
        return this.inactive;
    }


}
