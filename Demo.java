public class Demo {
    public static void main(String[] args) {
        AdminUser admin = new AdminUserImpl("Admin1234");

        // check if the user can be deleted from DB

        admin.deleteUser("User1");

        // Create users from Demo
            AdminUser admin1 = new AdminUserImpl("Admin1234");

            // check if the user can be deleted from empty DB

            admin1.deleteUser("User1");

            //Create users
            //Create AdminUser
            for (int i = 1; i <= 5; i++)
                admin.createNewUser("User" + i, false);

            for (int i = 1; i <= 5; i++)
                admin.createNewUser("Admin" + i, true);

            // create exact number of users
            admin.createNewUser("Admin11", true);
        }
    }
