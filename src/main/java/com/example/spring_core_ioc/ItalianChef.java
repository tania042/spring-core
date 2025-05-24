package com.example.spring_core_ioc;

import org.springframework.stereotype.Component;

@Component
public class ItalianChef implements Chef {

    @Override
    public String getDailyRecipe() {
            return "Preparare pasta";
    }
}
