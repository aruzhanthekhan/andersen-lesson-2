public abstract class User {

    void getTicket() {
        throw new UnsupportedOperationException("This method is not available for this role");
    }

    void checkTicket() {
        throw new UnsupportedOperationException("This method is not available for this role");
    }

    void printRole() {
        System.out.println("Printing the role");
    }
}
