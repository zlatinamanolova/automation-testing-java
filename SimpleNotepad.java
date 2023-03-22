import java.util.ArrayList;
import java.util.List;

public class SimpleNotepad implements Notepad {
    private List<Page> pages;

    public SimpleNotepad() {
        this.pages = new ArrayList<>();
    }

    @Override
    public void createPage(String title, String text) {
        Page curPage = new Page(title, text, this.pages.size()+1 );
        this.pages.add(curPage);
    }

    private Page findPage(int pageNumber) throws PageNotFoundException {
        for (Page curPage : pages) {
            if(pageNumber == curPage.getPageNumber()) {
                return curPage;
            }
        }
        throw new PageNotFoundException("There is no page with number: " + pageNumber);
    }

    @Override
    public void replaceText(int pageNumber, String text) throws PageNotFoundException {
        Page foundPage = findPage(pageNumber);
        foundPage.deleteText();
        foundPage.addText(text);
    }

    @Override
    public void deleteText(int pageNumber) throws PageNotFoundException {
        Page foundPage = findPage(pageNumber);
        foundPage.deleteText();
    }

    @Override
    public void previewAllPages() {
        for (Page curPage : pages) {
            System.out.println(curPage.previewPage());
        }
    }
}
