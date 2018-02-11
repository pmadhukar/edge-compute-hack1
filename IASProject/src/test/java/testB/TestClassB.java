package testB;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import taskB.ClassB;

public class TestClassB {
	@Test public void testFuncKush() {
        ClassB obj = new ClassB(); 
        assertTrue("someLibraryMethod should return 'true'", obj.funcKush());
    }
}
