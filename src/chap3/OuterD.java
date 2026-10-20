package chap3;

class Printer {

    void print() {
        System.out.println("Printer : print()");
    }
}//end Printer

public class OuterD {

    static void printReport(Printer pnt) {
        pnt.print();
    }

    public static void main(String[] args) {
        //Anonymous class
        printReport(new Printer() {
            void print() {
                System.out.println("Printer : Anonymous");
            }
        });
        printReport(new Printer() {
            void print() {
                System.out.println("Printer : Anonymous2");
            }
        });
        printReport(new Printer() {
            void print() {
                System.out.println("Printer : Anonymous3");
            }
        });
        printReport(new Printer() {
            void print() {
                System.out.println("Printer : Anonymous4");
            }
        });
        
    }//end main
}//end OuterD
