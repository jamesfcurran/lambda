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
   String town = "Alexandria";
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


  public int sge_account_num()  {
    return (account_num);
  }
  public int set_account_num(int a)  {
    account_num = a;
    return (account_num);
  }

  public String get_address() {
    return (address);
  }
  public String set_address(String a) {
    address = a;
    return (address);
  }

  public String get_town() {
    return (town);
  }
  public String set_town(String t) {
    town = t;
    return (town);
  }

  public String get_state() {
    return (state);
  }
  public String set_state(String s) {
    state = s;
    return (state);
  }

  public String get_zip() {
    return (zip);
  }
  public String set_zip(String z) {
    zip = z;
    return (zip);
  }

  public String get_circuit() {
    return (circuit);
  }
  public String set_circuit(String c) {
    circuit = c;
    return (circuit);
  }

  public String get_substation() {
    return (substation);
  }
  public String set_substation(String s) {
    substation = s;
    return (substation);
  }

  public String get_feeder() {
    return (feeder);
  }
  public String set_feeder(String f) {
    feeder = f;
    return (feeder);
  }

  public String get_critical_care() {
    return (critical_care);
  }
  public String set_critical_care(String c) {
    critical_care = c;
    return (critical_care);
  }
}
