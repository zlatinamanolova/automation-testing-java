public class ComputerDemo {



    public static void main(String[] args) {
        Computer lenovo = new Computer();
        Computer mac = new Computer();
        Computer WinXP = new Computer(true,"WindowsXP");
        Computer test = new Computer(2002, 20.00, 20.000,26.00 );

        lenovo.year = 2015;
        lenovo.price = 1500;
        lenovo.hardDiskMemory = 16000;
        lenovo.freeMemory = 800;
        lenovo.operationSystem = "Windows";
        lenovo.isNoteBook = true;

        mac.year = 2020;
        mac.price = 2000;
        mac.hardDiskMemory = 16000;
        mac.operationSystem = "Mac OS";
        mac.freeMemory = 1000;
        mac.isNoteBook = false;

        mac.useMemory(2000);
        lenovo.ChangeOperationSystem("Linux");

        System.out.println("The first computer is with the following parameters: " + lenovo.year);
        System.out.println(lenovo.price);
        System.out.println(lenovo.hardDiskMemory);
        System.out.println(lenovo.freeMemory);
        System.out.println(lenovo.operationSystem);
        System.out.println(lenovo.isNoteBook);

        System.out.println("The second computer is with the following parameters" + mac.year);
        System.out.println(mac.price);
        System.out.println(mac.hardDiskMemory);
        System.out.println(mac.freeMemory);
        System.out.println(mac.operationSystem);
        System.out.println(mac.isNoteBook);

        System.out.println("The test computer values " + test.year);
        System.out.println(  test.price +  " " +  test.hardDiskMemory +  " " +  test. freeMemory + " " + test.isNoteBook  + " " + test.operationSystem );


        int result = mac.comparePrice(test);
        System.out.println("If price of the inserted computer is less than the other print -1. If it's greater print 1, if they are equals print 0. " + result);
        int result2 = lenovo.comparePrice(mac);
        System.out.println("If price of the inserted computer is less than the other print -1. If it's greater print 1, if they are equals print 0. " + result2);
        int result3 = test.comparePrice(lenovo);
        System.out.println("If price of the inserted computer is less than the other print -1. If it's greater print 1, if they are equals print 0. " + result3);
    }
}
