package com.ojas.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ojas.dao.Plugin;

@Service
public class PluginManager {
    private final List<Plugin> plugins;

    public PluginManager(List<Plugin> plugins) {
        this.plugins = plugins;
    }

    public void executePlugins() {
        // Added a comment in your master
    	//for conflicts i changed
        // Added a comment in your saiprasanna
    	//sai
    	//prasanna
        // This is a conflicting change in your branch
        System.out.println("Executing plugins in your branch");

        for (Plugin plugin : plugins) {
        	//sai
            plugin.execute();
        }
    }
}
