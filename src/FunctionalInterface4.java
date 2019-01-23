import java.util.Scanner;
import java.util.function.Supplier;

public class FunctionalInterface4 {

        private static void m5() {
            Supplier<User> userFactory = () -> {
                Scanner in = new Scanner(System.in);
                System.out.println("Enter name");
                String name = in.nextLine();
                return new User(name);

            };
                User user1 = userFactory.get();
                User user2 = userFactory.get();
                System.out.println("user 1 name" + user1.getName());
            }

    static class User {
        private String name;

        public User(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
    }
