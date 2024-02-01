import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test 
	public void testReverseInPlace2() {
    int[] input = { 3, 2, 1 };
    ArrayExamples.reverseInPlace(input);
    assertArrayEquals(new int[]{ 1, 2, 3 }, input);
	}

  @Test
  public void testReversed() {
    int[] input1 = { 3, 2, 1 };
    assertArrayEquals(new int[]{ 1, 2, 3}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed2() {
    int[] input1 = {2, 3, 4};
    assertArrayEquals(new int[]{ 4, 3, 2}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testAverageWithoutLowest() {
    double[] input1 = {2.0, 3.0, 4.0, 1.0, 2.0, 1.0};
    assertEquals(2.4, ArrayExamples.averageWithoutLowest(input1), 0);
  }
}
