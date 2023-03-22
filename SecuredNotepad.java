import java.util.Scanner;

public class SecuredNotepad extends SimpleNotepad {
    private String password;

    public SecuredNotepad(String password) {
        this.password = password;
    }

    private boolean checkPassword() {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter pass: ");
            String enteredPassword = scan.nextLine();
            if(enteredPassword != null && enteredPassword.equals(this.password)) {
                System.out.println("correct!");
                return true;
            } else {
                System.out.println("Wrong password! Try again!");
            }
        }
        return false;
    }

    @Override
    public void createPage(String title, String text) {
        if (checkPassword()) {
            super.createPage(title, text);
        }
    }

    @Override
    public void replaceText(int pageNumber, String text) throws PageNotFoundException {
        if (checkPassword()) {
            super.replaceText(pageNumber, text);
        }
    }

    @Override
    public void deleteText(int pageNumber) throws PageNotFoundException {
        if (checkPassword()) {
            super.deleteText(pageNumber);
        }
    }

    @Override
    public void previewAllPages() {
        if (checkPassword()) {
            super.previewAllPages();
        }
    }
}
