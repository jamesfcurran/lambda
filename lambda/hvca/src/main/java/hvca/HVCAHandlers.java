package HVCA;

// pick up Amazon libraries
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

// Apache logging stuff
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HVCAHandlers implements RequestHandler<MyLambdaRequest, MyLambdaResponse> {




    public static void main(String[] args) {

      Customer cust = new Customer();

      // log to stdout and stderr
      System.out.println(cust.json());
      System.out.println(cust.name);
    }



    // Look up account by phone number
    @Override
    public MyLambdaResponse handleRequest(MyLambdaRequest input, Context context) {

      // here we would do the customer lookup based on the phone parameter
      Customer cust = new Customer();

      // log the input
      context.getLogger().log("Input: " + input);

      // log to stdout and stderr
      System.out.println("log data from stdout sent by System.out.println");
      System.err.println("log data from stderr sent by System.err.println");

      // Create a JSON string from the Cutomer object...
      MyLambdaResponse lambdaResponse = new MyLambdaResponse();
      try {
        lambdaResponse.setResponseMessage("Hello " + input.getName() + " Response Time : " + "10 seconds");
        lambdaResponse.setTransactionID("xyz123");
      } catch (Exception e) {
        e.printStackTrace();
        lambdaResponse.setResponseMessage(e.getMessage());
      }
      context.getLogger().log("Response : " + lambdaResponse);
      return lambdaResponse;
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



