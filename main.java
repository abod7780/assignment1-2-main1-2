public class main {
    public static void main(String[] args) {
        System.out.println("=== Rectangle ===");
        Rectangle r = new Rectangle(100, 100, 50, 50);
        r.display();

        System.out.println("\n=== Tally Counter ===");
        TallyCounter c = new TallyCounter();
        c.increment(); c.increment();
        System.out.println("Count = " + c.getCount());

        System.out.println("\n=== Bank Account ===");
        BankAccount acc = new BankAccount("A123", "Ali", 1000);
        acc.deposit(500); acc.withdraw(300);
        System.out.println(acc.getAccountHolder() + " Balance = " + acc.getAmount());

        System.out.println("\n=== Student ===");
        Student s = new Student(1, "Hassan", 22, "CS");
        System.out.println("Student: " + s.getName() + ", Major: " + s.getMajor());

        System.out.println("\n=== Product ===");
        Product p = new Product(1, "Laptop", 1000, 5);
        p.displayDetails();

        System.out.println("\n=== Books ===");
        Book b1 = new Book("Java", "Gosling", 50);
        Book b2 = new Book("Python", "Guido", 40);
        Book b3 = new Book("C++", "Bjarne", 60);
        b1.display(); b2.display(); b3.display();

        System.out.println("\n=== Circle ===");
        Circle circle = new Circle(5, "Blue");
        circle.displayDetails();

        System.out.println("\n=== Cash Register ===");
        CashRegister register = new CashRegister();
        register.recordPurchase(50);
        register.recordPurchase(20);
        register.enterPayment(100);
        System.out.println("Change = " + register.giveChange());

        System.out.println("\n=== Date ===");
        MyDate date = new MyDate(18, 9, 2025);
        date.displayTime();
    }
}
