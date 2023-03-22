public class Computer {

    int year;
    double price;
    boolean isNoteBook = false;
    double hardDiskMemory;
    double freeMemory;
    String operationSystem;


    Computer() {
        this.isNoteBook = false;
        this.operationSystem = "Win XP";

    }

    // Here I add a constructor, where the user can decide what are the values for notebook and OS
    Computer(boolean isNotebook, String operationSystem) {
        this.isNoteBook = isNotebook;
        this.operationSystem = operationSystem;
    }

    Computer(int year, double price, double hardDiskMemory, double freeMemory) {
        this();
        this.year = year;
        this.price = price;
        this.hardDiskMemory = hardDiskMemory;
        this.freeMemory = freeMemory;
    }

    void ChangeOperationSystem(String newOperationSystem) {
        operationSystem = newOperationSystem;
        System.out.println("New operation system is " + newOperationSystem);

    }

    void useMemory(double memory) {

        if (freeMemory < memory) {
            System.out.println("Not enough free memory " + freeMemory);
        } else {
            freeMemory = freeMemory - memory;
            System.out.println("New value of free memory is " + freeMemory);
        }
    }


        public int comparePrice(Computer otherComp) {
            if (this.price > otherComp.price) {
                return -1;
            } else if (this.price < otherComp.price) {
                return 1;
            } else {
                return 0;
            }
        }
    }

