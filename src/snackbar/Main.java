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

    System.out.println("*** Query Data ***");
    System.out.println(c1);
    System.out.println();
    System.out.println(c1.getCash());
    // System.out.println();
    // System.out.println();
    // System.out.println();
  }
}