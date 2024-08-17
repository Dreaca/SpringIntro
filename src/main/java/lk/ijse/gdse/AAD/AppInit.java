package lk.ijse.gdse.AAD;

import lk.ijse.gdse.AAD.config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInit {
    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext(); // Creates a spring annotation context or a bucket that can hold spring objects known as beans
        ctx.register(Config.class); //The agent that detects components classes
        ctx.refresh(); // Refresh the class to find the necessary classes
        // ctx.close();  Close the class
        ctx.registerShutdownHook(); // gracefully shutdown the application


    }
}
