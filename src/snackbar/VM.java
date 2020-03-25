package snackbar;

public class VM {
  // fields
  // private static int maxVmid = 0;
  private int vmid;
  private String name;

  // constructor
  public VM(int vmid, String name) {
    // maxVmid++;

    this.vmid = vmid;
    this.name = name;
  }

  // Methods
  public int getVmid() {
    return vmid;
  }

  public void setVmid(int vmid) {
    this.vmid = vmid;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}