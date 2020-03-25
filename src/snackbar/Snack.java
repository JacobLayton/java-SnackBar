package snackbar;

public class Snack {
  // fields
  // private static int maxId = 0;
  private int id;
  private String name;
  private int quantity;
  private double cost;
  private int vmid;

  // constructor with intial state
  public Snack(int id, String name, int quantity, double cost, int vmid) {
    // maxId++;

    this.id = id;
    this.name = name;
    this.quantity = quantity;
    this.cost = cost;
    this.vmid = vmid;
  }

  // Methods
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getCost() {
    return cost;
  }

  public void setCost(double cost) {
    this.cost = cost;
  }

  public int getVmid() {
    return vmid;
  }

  public void setVmid(int vmid) {
    this.vmid = vmid;
  }

  public int getQuantity() {
    return quantity;
  }

  public void addQuantity(int restock) {
    this.quantity += restock;
  }

  public void buySnack(int bought) {
    this.quantity -= bought;
  }
  // public void totCost(int howmany)
  // {
  // public double howMuch = this.cost * howmany;
  // }
}