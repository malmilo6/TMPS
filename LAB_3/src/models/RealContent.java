package models;
import domain.AccessibleImpl;

public class RealContent implements Accessible {
    @Override
    public void access() {
        System.out.println("Accessing the real content...");
    }
}
