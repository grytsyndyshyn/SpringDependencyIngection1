package springDependencyInjection;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class ClassicalMusic implements Music{
    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my initialization");
    }
    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing my destroy");
    }

    @Override
    public String getSong() {
        return  "Hungarian Rhapsody";
    }
}
