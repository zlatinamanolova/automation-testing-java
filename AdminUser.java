interface AdminUser extends User {
    void deleteUser(String username);
    void createNewUser(String username, Boolean isAdmin);
    void printInfoAllUsers();
}