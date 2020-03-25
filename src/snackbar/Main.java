package snackbar;

public class Main {
  public static void main(String[] args) {
    Customer c1 = new Customer(1, "Jane", 45.25);
    Customer c2 = new Customer(2, "Bob", 33.14);

    VM vm1 = new VM(1, "Food");
    VM vm2 = new VM(2, "Drink");
    VM vm3 = new VM(3, "Office");

    Snack s1 = new Snack(1, "Chips", 36, 1.75, vm1.getVmid());
    Snack s2 = new Snack(2, "Chocolate Bar", 36, 1.00, vm1.getVmid());
    Snack s3 = new Snack(3, "Pretzel", 30, 2.00, vm1.getVmid());

    Snack s4 = new Snack(1, "Soda", 24, 2.50, vm2.getVmid());
    Snack s5 = new Snack(2, "Water", 20, 2.75, vm2.getVmid());

    System.out.println("\n" + "*** Query Data ***" + "\n");
    // c1 buys 3 of snack 4. print cash
    double tot = s4.getCost() * 3;
    c1.addCash(-tot);
    System.out.println("Cash after purchase: " + c1.getCash());
    // print quantity of snack 4
    s4.addQuantity(-3);
    System.out.println("Quantity after purchase: " + s4.getQuantity() + "\n");

    // c1 buys 1 of s3. print c1 cash
    tot = s3.getCost();
    c1.addCash(-tot);
    System.out.println("Cash after purchase: " + c1.getCash());
    // print quantity of s3
    s3.addQuantity(-1);
    System.out.println("Quantity after purchase: " + s3.getQuantity() + "\n");

    // c2 buys 2 of s4. print c2 cash
    tot = s4.getCost() * 2;
    c2.addCash(-tot);
    System.out.println("Cash after purchase: " + c2.getCash());
    // print quantity of s4
    s4.addQuantity(-2);
    System.out.println("Quantity after purchase: " + s4.getQuantity() + "\n");

    // c1 finds $10. print cash
    c1.addCash(10);
    System.out.println("Cash after money found: " + c1.getCash() + "\n");

    // c1 buys 1 of s2. print cash
    tot = s2.getCost();
    c1.addCash(-tot);
    System.out.println("Cash after purchase: " + c1.getCash());
    // print quantity of s2
    s2.addQuantity(-1);
    System.out.println("Quantity after purchase: " + s2.getQuantity() + "\n");

    // add 12 more s3. print quantity
    s3.addQuantity(12);
    System.out.println("Quantity after restock: " + s3.getQuantity() + "\n");

    // c2 buys 3 of s3. print cash
    tot = s3.getCost() * 3;
    c2.addCash(-tot);
    System.out.println("Cash after purchase: " + c2.getCash());
    // print quantity of s3
    s3.addQuantity(-3);
    System.out.println("Quantity after purchase: " + s3.getQuantity() + "\n");

  }
}