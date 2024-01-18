package com.ojas.imp;

import org.springframework.stereotype.Component;

import com.ojas.dao.CorePluginInterface;


import org.springframework.stereotype.Component;

@Component
public class PluginAction implements CorePluginInterface {
    @Override
    public void performCoreAction() {
        // Implement plugin-specific action
        System.out.println("Executing Plugin Action");
    }
}

