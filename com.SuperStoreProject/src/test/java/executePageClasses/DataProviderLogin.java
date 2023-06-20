package executePageClasses;


import org.testng.annotations.DataProvider;

public class DataProviderLogin {
 

  @DataProvider(name="DataProvider1")
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "carol", "1q2w3ep45" },
      new Object[] { "carola", "1q2w3e4r" },
      new Object[] { "carolsdf", "1qr568" }
    };
  }
  
  @DataProvider(name="DataProvider2")
  public Object[][] dp1() {
    return new Object[][] {
      new Object[] { "carol", "1q2w3e4r" },
      
    };
  }
}
