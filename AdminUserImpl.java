
    public class AdminUserImpl extends AbstractUser implements AdminUser {

        private final DataBase dataBase;
        private int addedUsers;

    public AdminUserImpl(String username) {
            super(username);
            this.dataBase = new DataBase(10);
            this.addedUsers = 0;
        }

        @Override
        public void deleteUser(String username) {
            if (addedUsers == 0) {
                System.out.println("No users exist!");
                return;
            }

            for (int i = 0; i < addedUsers; i++) {
                User user = dataBase.getUsers()[i];
                if (user.getUsername().equalsIgnoreCase(username)) {
                    dataBase.removeUser(i);
                    addedUsers = addedUsers - 1;
                    System.out.println("User deleted!");
                }
            }
        }

        @Override
        public void createNewUser(String username, Boolean isAdmin) {
            for (int i = 0; i < addedUsers; i++) {
                User user = dataBase.getUsers()[i];
                if (user.getUsername().equalsIgnoreCase(username)) {
                    System.out.println("User with this username already exists!");
                    break;
                }
            }

            if (addedUsers == 10) {
                System.out.println("No more slots left for new users!");
                return;
            }

            User user = null;
            if (isAdmin)
                user = new AdminUserImpl(username);
            else
                user = new UserImpl(username);

            dataBase.addUser(user, addedUsers);
            addedUsers = addedUsers + 1;
            System.out.println("User added!");
        }

        @Override
        public void printInfoAllUsers() {

        }
    }
