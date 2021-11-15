package ua.od.atomspace;

public class ResourceManager {
    public void getResource(User user) {
        switch (user.getRole()) {
            case ADMIN:
                System.out.println("All");
                break;
            case READER:
                System.out.println("can read");
                break;
            case WRITER:
                System.out.println("can write");
                break;
            default:
                System.out.println("Access denied");
                break;
        }
    }
}
