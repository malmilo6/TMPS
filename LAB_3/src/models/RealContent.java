package models;
import domain.AccessibleImpl;

public class RealContent implements AccessibleImpl {
    @Override
    public void access() {
        System.out.println("Accessing the real content...");
    }
}
