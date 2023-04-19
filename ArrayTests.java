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
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void newtestreverse(){
    int[] input1 = { 1, 2, 3};
    int[] input2 = {3, 2, 1,};
    assertArrayEquals(input2, ArrayExamples.reversed(input1) );
  }

  @Test
  public void ReverseInPlacetest(){
    int[] input = {4, 5 };
    ArrayExamples.reverseInPlace(input);
    assertArrayEquals(new int[]{5, 4}, input);
  }

  @Test
  public void averageWithoutLowesttest(){
    double [] input = {2,2, 4, 4,};
    assertEquals(5, ArrayExamples.averageWithoutLowest(input), 0.01);
  }
}
