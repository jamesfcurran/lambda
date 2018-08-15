package HVCA;
// pick up Amazon libraries
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

// Apache logging stuff
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HVCAHandlers {
    // Initialize the Log4j logger.
//    static final Logger logger = LogManager.getLogger(HVCAHandlers.class);

    // Look up account by phone number
    public String phone_lookup(String phone, Context context) {
      Customer cust = new Customer();
      // log to stdout and stderr
      System.out.println("log data from stdout sent by System.out.println");
      System.err.println("log data from stderr sent by System.err.println");

      // log via log4j error facility
//      logger.error("log data from log4j err");

      return (cust.name);
  }

  // Look up account by account number
  public String account_lookup(String acct, Context context) {
    return "via_account:112233|Jim Curran|4501 Corner Rd|Alexandria|OH|43001";
  }

  // Obtain the ERT via account number
  public String get_ERT(String acct, Context context) {
    return acct+":112233|Jim Curran|4501 Corner Rd|Alexandria|OH|43001";
  }
}
