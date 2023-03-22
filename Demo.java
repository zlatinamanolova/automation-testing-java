public class Demo {

    public static void main(String[] args) {
//        Notepad secured = new SecuredNotepad("123");
//
//        secured.createPage("title1", "text1");
//        secured.createPage("title2", "text2");
//        secured.createPage("title3", "text3");
//        secured.createPage("title4", "text4");
//
//        secured.previewAllPages();
//        System.out.println("-----------------------------------------------------");
//        try {
//            secured.replaceText(33, "nov text");
//        } catch (PageNotFoundException e) {
//            e.printStackTrace();
//            System.out.println("please try again to find your page.");
//        }
//
//        secured.previewAllPages();
//
//        System.out.println("-----------------------------------------------------");
//        try {
//            secured.deleteText(2);
//        } catch (PageNotFoundException e) {
//            e.printStackTrace();
//            System.out.println("please try again to find your page.");
//        }
//        secured.previewAllPages();

//        Notepad simple = new SimpleNotepad();
//
//        simple.createPage("title1", "text1");
//        simple.createPage("title2", "text2");
//        simple.createPage("title3", "text3");
//        simple.createPage("title4", "text4");
//
//        simple.previewAllPages();
//        System.out.println("-----------------------------------------------------");
//        try {
//            simple.replaceText(33, "nov text");
//        } catch (PageNotFoundException e) {
//            e.printStackTrace();
//            System.out.println("please try again to find your page.");
//        }
//
//        simple.previewAllPages();
//
//        System.out.println("-----------------------------------------------------");
//        try {
//            simple.deleteText(2);
//        } catch (PageNotFoundException e) {
//            e.printStackTrace();
//            System.out.println("please try again to find your page.");
//        }
//        simple.previewAllPages();

        ElectronicSecuredNotepad notepad = new ElectronicSecuredNotepad("123456");
        notepad.start();
        notepad.createPage("Page 1", "Text 1");
        notepad.previewAllPages();
        notepad.stop();
    }

}
