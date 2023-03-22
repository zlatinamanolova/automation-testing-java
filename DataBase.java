public class DataBase {
    private User[] users;

    public DataBase(int numberOfUsers) {
        if (numberOfUsers > 0)
            this.users = new User[numberOfUsers];
    }

    public User[] getUsers() {
        return users;
    }

    public void addUser(User user, int position){
        users[position] = user;
    }

    public void removeUser(int position){
        users[position] = null;
    }
}