package models;
import domain.AccessibleImpl;

public class ProxyContent implements AccessibleImpl {
    RealContent realContent;

    @Override
    public void access() {
        if (realContent == null) {
            realContent = new RealContent();
        }
        checkAccess();
        realContent.access();
    }

    private void checkAccess() {
        System.out.println("Checking if user has access...");
    }
}
