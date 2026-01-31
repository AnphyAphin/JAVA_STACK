// public package CastingIDEAS;
class Mobile {
    // Private method: Truly hidden from everyone outside this class
    private void internalProcessorBoot() {
        System.out.println("System: Secure boot initiated...");
    }

    // Public gateway: Allows controlled access to private logic
    public void startDevice() {
        internalProcessorBoot();
        System.out.println("Mobile is now ON.");
    }
}

class Phone extends Mobile {
    // Subclass-specific feature
    public void enable5G() {
        System.out.println("Phone: 5G network enabled.");
    }
}

public class PrivilegesObjects {
    public static void main(String[] args) {
        // 1. LIMITED PRIVILEGES (Upcasted)
        // Reference is 'Mobile', so it can only see Mobile's public methods.
        Mobile limitedPhone = new Phone();
        limitedPhone.startDevice();
        // limitedPhone.internalProcessorBoot(); // COMPILE ERROR: private method not accessible
        // limitedPhone.enable5G(); // COMPILE ERROR: Mobile doesn't have 5G

        System.out.println("-------------------------");

        // 2. FULL PRIVILEGES (Direct Reference)
        // Reference is 'Phone', so it sees everything in Phone AND Mobile.
        Phone fullPhone = new Phone();
        fullPhone.startDevice(); // Inherited from Mobile
        fullPhone.enable5G(); // Specific to Phone
        // fullPhone.internalProcessorBoot(); // COMPILE ERROR: private method not accessible
    }

}