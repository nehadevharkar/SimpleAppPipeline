package Bank.Bank;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CalculatorAppTest {
@Test
@Parameters({"a","b"})
public void testAdd(String sa,String sb) {
	CalculatorApp app=new CalculatorApp();
	int a= Integer.parseInt(sa);
	int b= Integer.parseInt(sb);
	int actual=app.addMethod(a, b);
	int expected=a+b;
	Assert.assertEquals(actual,expected);
}
@Test
public void testSub() {
	CalculatorApp app=new CalculatorApp();
	int actual=app.subMethod(19, 7);
	int expected=12;
	Assert.assertEquals(actual,expected);
}
}
