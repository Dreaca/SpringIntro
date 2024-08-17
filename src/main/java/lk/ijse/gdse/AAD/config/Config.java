package lk.ijse.gdse.AAD.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // Declaring as the agent
@ComponentScan(basePackages = "lk.ijse.gdse.AAD") // Gives a range of classes that act as components
public class Config {
}
