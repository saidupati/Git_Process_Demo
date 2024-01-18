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
        for (Plugin plugin : plugins) {
            plugin.execute();
        }
    }
}

