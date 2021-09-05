package TestScript;

import org.testng.annotations.Test;
import TestSonar.SonarDemo;

public class Script {
@Test
	  public void testngexamplee() {
	  SonarDemo t= new SonarDemo();
		  t.main("demo");
		  System.out.println("test is called");
	  }
}
