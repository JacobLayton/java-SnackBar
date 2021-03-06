package snackbar;

public class Customer {
  // fields
  // private static int maxId = 0;
  private int id;
  private String name;
  private double cash;

  public Customer(int id, String name, double cash) {
    // maxId++;

    this.id = id;
    this.name = name;
    this.cash = cash;
  }

  // Methods
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getCash() {
    return cash;
  }

  public void addCash(double moreCash) {
    this.cash += moreCash;
  }
}