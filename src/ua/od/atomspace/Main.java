package ua.od.atomspace;



import ua.od.atomspace.*;

import java.util.Random;


public class Main {
    public static void main(String[] args) {

        EnumUserRoles[] roles = EnumUserRoles.values();

        Random random = new Random();

        User[] users = new User[10];
        for (int i = 0; i < 10; i++) {
            User user = new User(
                    "User #" + (i + 1),
                    20 + i,
                    roles[random.nextInt(roles.length)]
            );
            users[i] = user;
        }

        ResourceManager resourceManager = new ResourceManager();
        for (int i = 0; i < users.length; i++) {
            System.out.print(users[i] + " - access: ");
            resourceManager.getResource(users[i]);
        }

        System.out.println(roles[0].ordinal());
    }
}
