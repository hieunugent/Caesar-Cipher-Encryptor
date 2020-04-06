import org.junit.Test;
import org.junit.Assert.assertTrue;
public class TestCCE{
  @Test
  public void Testcase1(){
    assertTrue(CCE.caesarCypherEncryptor("abc",0).equals("abc"));
  }
  @Test
  public void Testcase2(){
    assertTrue(CCE.caesarCypherEncryptor("abc",3).equals("def"));
  }
}
