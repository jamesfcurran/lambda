package HVCA;
public class Customer
{

  public String name;
  public int account_num;
  public String address;
  public String town;
  public String state;
  public String zip;
  public String circuit;
  public String substation;
  public String feeder;
  public String critical_care;


  public Customer() {
   name = "Jim Curran";
   account_num = 123456789;
   address = "4501 Corner Rd";
   town = "Alexandria";
   state = "Ohio";
   zip = "43001";
   circuit = "4HKAC";
   substation = "MAPLE";
   feeder = "7M425";
   critical_care = "N";
  }

  public String getName()  {
    return (name);
  }
  public String setName(String n)  {
    name = n;
    return (name);
  }


  public int getAccount_num()  {
    return (account_num);
  }
  public int setAccount_num(int a)  {
    account_num = a;
    return (account_num);
  }

  public String getAddress() {
    return (address);
  }
  public String setAddress(String a) {
    address = a;
    return (address);
  }

  public String getTown() {
    return (town);
  }
  public String setTown(String t) {
    town = t;
    return (town);
  }

  public String getState() {
    return (state);
  }
  public String setState(String s) {
    state = s;
    return (state);
  }

  public String getZip() {
    return (zip);
  }
  public String setZip(String z) {
    zip = z;
    return (zip);
  }

  public String getCircuit() {
    return (circuit);
  }
  public String setCircuit(String c) {
    circuit = c;
    return (circuit);
  }

  public String getSubstation() {
    return (substation);
  }
  public String setSubstation(String s) {
    substation = s;
    return (substation);
  }

  public String getFeeder() {
    return (feeder);
  }
  public String setFeeder(String f) {
    feeder = f;
    return (feeder);
  }

  public String getCritical_care() {
    return (critical_care);
  }
  public String setCritical_care(String c) {
    critical_care = c;
    return (critical_care);
  }
}
