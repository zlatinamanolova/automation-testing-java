public class ElectronicSecuredNotepad extends SecuredNotepad implements IElectronicDevice {
    private boolean isStarted;

    public ElectronicSecuredNotepad(String password) {
        super(password);
    }

    @Override
    public void createPage(String title, String text) {
        if (isStarted()) {
            super.createPage(title, text);
        }
    }

    @Override
    public void replaceText(int pageNumber, String text) throws PageNotFoundException {
        if (isStarted()) {
            super.replaceText(pageNumber, text);
        }
    }

    @Override
    public void deleteText(int pageNumber) throws PageNotFoundException {
        if (isStarted()) {
            super.deleteText(pageNumber);
        }
    }

    @Override
    public void previewAllPages() {
        if (isStarted()) {
            super.previewAllPages();
        }
    }

    @Override
    public void start() {
        this.isStarted = true;
    }

    @Override
    public void stop() {
        this.isStarted = false;
    }

    @Override
    public boolean isStarted() {
        return isStarted;
    }
}