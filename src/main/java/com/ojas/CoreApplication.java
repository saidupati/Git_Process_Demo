package com.ojas;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.ojas.service.PluginManager;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.plugins", "com.ojas"})
public class CoreApplication implements CommandLineRunner {

    private final PluginManager pluginManager;
    
    public CoreApplication(PluginManager pluginManager) {
        this.pluginManager = pluginManager;
    }

    public static void main(String[] args) {
        SpringApplication.run(CoreApplication.class, args);
    }

    @Override
    public void run(String... args) {
        pluginManager.executePlugins();
    }
}
