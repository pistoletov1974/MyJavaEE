package edu.mycourse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Artem on 27.12.2017.
 */
public class Main {

    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        int i =6;
        String s = "empty";
        System.out.println("Say Hello");
       log.info("say {} and {}",i,s);
    }

}
