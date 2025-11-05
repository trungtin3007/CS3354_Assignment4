import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        Stack stack1 = new Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        int int8 = stack1.size();
        boolean boolean9 = stack1.isFull();
        stack1.push((int) (byte) 10);
        boolean boolean12 = stack1.isFull();
        java.lang.Class<?> wildcardClass13 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        Stack stack1 = new Stack((int) 'a');
        stack1.push((int) (short) 0);
        int int4 = stack1.peek();
        stack1.push((-1));
        stack1.push((int) '#');
        stack1.push((int) '#');
        stack1.push((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        Stack stack1 = new Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        boolean boolean5 = stack1.isEmpty();
        int int6 = stack1.peek();
        stack1.push((int) (short) 0);
        int int9 = stack1.pop();
        int int10 = stack1.pop();
        int int11 = stack1.size();
        boolean boolean12 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        Stack stack1 = new Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        boolean boolean6 = stack1.isEmpty();
        boolean boolean7 = stack1.isFull();
        stack1.push(0);
        boolean boolean10 = stack1.isEmpty();
        stack1.push((int) (short) 1);
        int int13 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        Stack stack1 = new Stack(10);
        int int2 = stack1.size();
        boolean boolean3 = stack1.isEmpty();
        boolean boolean4 = stack1.isEmpty();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isEmpty();
        boolean boolean7 = stack1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        Stack stack1 = new Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        boolean boolean9 = stack1.isFull();
        boolean boolean10 = stack1.isEmpty();
        int int11 = stack1.pop();
        stack1.push((int) (byte) -1);
        int int14 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        Stack stack1 = new Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        boolean boolean6 = stack1.isEmpty();
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        Stack stack1 = new Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        int int8 = stack1.size();
        int int9 = stack1.pop();
        int int10 = stack1.pop();
        stack1.push(32);
        int int13 = stack1.peek();
        boolean boolean14 = stack1.isEmpty();
        java.lang.Class<?> wildcardClass15 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        Stack stack1 = new Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        boolean boolean6 = stack1.isEmpty();
        stack1.push(10);
        stack1.push(100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        Stack stack1 = new Stack((int) 'a');
        stack1.push((int) (short) 0);
        int int4 = stack1.peek();
        stack1.push((-1));
        stack1.push((int) '#');
        stack1.push((int) '#');
        boolean boolean11 = stack1.isFull();
        stack1.push((-1));
        boolean boolean14 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        Stack stack1 = new Stack((int) (byte) 10);
        stack1.push(10);
        boolean boolean4 = stack1.isEmpty();
        stack1.push((int) '4');
        stack1.push(0);
        boolean boolean9 = stack1.isEmpty();
        java.lang.Class<?> wildcardClass10 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        Stack stack1 = new Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isEmpty();
        int int7 = stack1.peek();
        int int8 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        Stack stack1 = new Stack((int) (short) 100);
        stack1.push((int) '4');
        boolean boolean4 = stack1.isEmpty();
        int int5 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        Stack stack1 = new Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.peek();
        stack1.push(100);
        int int12 = stack1.pop();
        int int13 = stack1.pop();
        int int14 = stack1.size();
        int int15 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        Stack stack1 = new Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isFull();
        int int7 = stack1.size();
        int int8 = stack1.peek();
        int int9 = stack1.pop();
        boolean boolean10 = stack1.isEmpty();
        int int11 = stack1.size();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = stack1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        Stack stack1 = new Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        int int8 = stack1.size();
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.peek();
        int int11 = stack1.peek();
        int int12 = stack1.size();
        int int13 = stack1.size();
        int int14 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        Stack stack1 = new Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        boolean boolean6 = stack1.isEmpty();
        boolean boolean7 = stack1.isFull();
        int int8 = stack1.peek();
        boolean boolean9 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        Stack stack1 = new Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isFull();
        int int7 = stack1.size();
        stack1.push((int) (short) 1);
        int int10 = stack1.pop();
        int int11 = stack1.peek();
        int int12 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        Stack stack1 = new Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        int int6 = stack1.size();
        boolean boolean7 = stack1.isEmpty();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.peek();
        int int10 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        Stack stack1 = new Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isEmpty();
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.size();
        int int10 = stack1.pop();
        stack1.push((int) '#');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        Stack stack1 = new Stack(10);
        stack1.push((int) 'a');
        stack1.push(100);
        boolean boolean6 = stack1.isFull();
        stack1.push(2);
        int int9 = stack1.peek();
        int int10 = stack1.peek();
        java.lang.Class<?> wildcardClass11 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        Stack stack1 = new Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.size();
        int int10 = stack1.pop();
        boolean boolean11 = stack1.isEmpty();
        int int12 = stack1.size();
        int int13 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        Stack stack1 = new Stack((int) 'a');
        stack1.push((int) (short) 0);
        int int4 = stack1.peek();
        stack1.push((-1));
        stack1.push((int) '#');
        stack1.push((int) '#');
        int int11 = stack1.size();
        int int12 = stack1.pop();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        Stack stack1 = new Stack((int) 'a');
        stack1.push((int) (short) 0);
        int int4 = stack1.peek();
        stack1.push((-1));
        stack1.push((int) '#');
        stack1.push((int) '#');
        boolean boolean11 = stack1.isFull();
        stack1.push((-1));
        java.lang.Class<?> wildcardClass14 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        Stack stack1 = new Stack(1);
        // The following exception was thrown during execution in test generation
        try {
            int int2 = stack1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        Stack stack1 = new Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isEmpty();
        stack1.push(1);
        boolean boolean9 = stack1.isFull();
        stack1.push((int) (short) 100);
        int int12 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        Stack stack1 = new Stack(4);
        stack1.push(0);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        Stack stack1 = new Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        int int8 = stack1.size();
        int int9 = stack1.size();
        java.lang.Class<?> wildcardClass10 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        Stack stack1 = new Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        int int6 = stack1.size();
        boolean boolean7 = stack1.isEmpty();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.peek();
        int int10 = stack1.pop();
        int int11 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        Stack stack1 = new Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        int int6 = stack1.pop();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        stack1.push((int) (short) -1);
        java.lang.Class<?> wildcardClass11 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        Stack stack1 = new Stack(10);
        stack1.push((int) 'a');
        stack1.push(100);
        int int6 = stack1.peek();
        int int7 = stack1.pop();
        int int8 = stack1.pop();
        int int9 = stack1.size();
        int int10 = stack1.size();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        Stack stack1 = new Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.peek();
        stack1.push(100);
        boolean boolean12 = stack1.isFull();
        boolean boolean13 = stack1.isFull();
        int int14 = stack1.peek();
        stack1.push((int) (byte) 10);
        boolean boolean17 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        Stack stack1 = new Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isEmpty();
        stack1.push(10);
        int int7 = stack1.pop();
        boolean boolean8 = stack1.isFull();
        boolean boolean9 = stack1.isEmpty();
        int int10 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        Stack stack1 = new Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        int int8 = stack1.size();
        int int9 = stack1.pop();
        boolean boolean10 = stack1.isEmpty();
        java.lang.Class<?> wildcardClass11 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        Stack stack1 = new Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        int int6 = stack1.pop();
        int int7 = stack1.size();
        int int8 = stack1.size();
        boolean boolean9 = stack1.isFull();
        boolean boolean10 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        Stack stack1 = new Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.size();
        boolean boolean10 = stack1.isFull();
        stack1.push((int) '4');
        int int13 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        Stack stack1 = new Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isFull();
        int int7 = stack1.size();
        int int8 = stack1.peek();
        int int9 = stack1.peek();
        boolean boolean10 = stack1.isFull();
        int int11 = stack1.size();
        int int12 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        Stack stack1 = new Stack((int) 'a');
        stack1.push((int) (short) 0);
        int int4 = stack1.peek();
        stack1.push((-1));
        stack1.push((int) '#');
        stack1.push((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        Stack stack1 = new Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        int int3 = stack1.size();
        int int4 = stack1.size();
        boolean boolean5 = stack1.isFull();
        boolean boolean6 = stack1.isFull();
        stack1.push((int) (byte) -1);
        int int9 = stack1.size();
        int int10 = stack1.pop();
        java.lang.Class<?> wildcardClass11 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        Stack stack1 = new Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.size();
        boolean boolean11 = stack1.isEmpty();
        int int12 = stack1.peek();
        int int13 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        Stack stack1 = new Stack(35);
        // The following exception was thrown during execution in test generation
        try {
            int int2 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        Stack stack1 = new Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        boolean boolean5 = stack1.isEmpty();
        int int6 = stack1.peek();
        stack1.push((int) (short) 0);
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.size();
        int int11 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        Stack stack1 = new Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isEmpty();
        int int7 = stack1.peek();
        boolean boolean8 = stack1.isEmpty();
        boolean boolean9 = stack1.isEmpty();
        int int10 = stack1.size();
        stack1.push(3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        Stack stack1 = new Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        boolean boolean5 = stack1.isEmpty();
        int int6 = stack1.peek();
        boolean boolean7 = stack1.isEmpty();
        boolean boolean8 = stack1.isFull();
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.pop();
        java.lang.Class<?> wildcardClass11 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }
}

