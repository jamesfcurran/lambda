package HVCA;
// get these system libs to support the mapper function
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

// pick up Amazon libraries
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

// JSON manipulation stuff (Jackson)
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;

// Apache logging stuff
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HVCAHandlers {
  public static void main(String[] args) {
    Customer cust = new Customer();
    String jsonInString = "not set";

    // Create a JSON string from the Cutomer object...
    ObjectMapper mapper = new ObjectMapper();
    try {
      jsonInString = mapper.writeValueAsString(cust);
      System.out.println(jsonInString);
    }

    catch (JsonGenerationException e) {
      e.printStackTrace();
    }

    catch (JsonMappingException e) {
      e.printStackTrace();
    }

    catch (IOException e) {
      e.printStackTrace();
    }
    System.out.println("at end of main\n");
}


    // Look up account by phone number
    public String phone_lookup(String phone, Context context) {
      Customer cust = new Customer();
      String jsonInString = "not set";

      // log to stdout and stderr
      System.out.println("log data from stdout sent by System.out.println");
      System.err.println("log data from stderr sent by System.err.println");

      // Create a JSON string from the Cutomer object...
      ObjectMapper mapper = new ObjectMapper();
      try {
        jsonInString = mapper.writeValueAsString(cust);
        System.out.println(jsonInString);
      }

      catch (JsonGenerationException e) {
        e.printStackTrace();
      }

      catch (JsonMappingException e) {
        e.printStackTrace();
      }

      catch (IOException e) {
        e.printStackTrace();
      }
    return (jsonInString);
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
