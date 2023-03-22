public class Page {
    private String title;
    private String text;
    private int pageNumber;

    public Page(String title, String text) {
        this.title = title;
        this.text = text;
    }

    public Page(String title, String text, int pageNumber) {
        this(title, text);
        this.pageNumber = pageNumber;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    void addText(String text) {
        this.text = this.text + text;
    }

    void deleteText() {
        this.text = "";
    }

    String previewPage() {
        return this.title + "\n" + this.text;
    }

}
