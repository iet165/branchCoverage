import org.junit.Test;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class TestCompute {
  Compute c;
  @Test
  public void example() {
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);
    assertTrue(true);
  }
  
  @Test
  public void testBosQueue() {
    MessageQueue mq = mock(MessageQueue.class);
    when(mq.size()).thenReturn(0);
    Compute compute = new Compute(mq);
    assertEquals(-1, compute.countNumberOfOccurrences("deneme"));
  }

  @Test
  public void testQueueElementYok() {
    MessageQueue mq = mock(MessageQueue.class);
    when(mq.contains("deneme")).thenReturn(false);
    when(mq.size()).thenReturn(10); 
    Compute compute = new Compute(mq);
    assertEquals(0, compute.countNumberOfOccurrences("deneme"));
  }

  @Test
  public void testQueueElementBirdenFazla() {
    MessageQueue mq = mock(MessageQueue.class);
    when(mq.contains("element")).thenReturn(true);
    when(mq.size()).thenReturn(3);
    when(mq.getAt(0)).thenReturn("element");
    when(mq.getAt(1)).thenReturn("element");
    when(mq.getAt(2)).thenReturn("other");
    Compute compute = new Compute(mq);

    assertEquals(2, compute.countNumberOfOccurrences("element"));
  }

  @Test
  public void testQueueElementBirKere() {
    MessageQueue mq = mock(MessageQueue.class);
    when(mq.contains("element")).thenReturn(true);
    when(mq.size()).thenReturn(3);
    when(mq.getAt(0)).thenReturn("other");
    when(mq.getAt(1)).thenReturn("element");
    when(mq.getAt(2)).thenReturn("other");
    Compute compute = new Compute(mq);

    assertEquals(1, compute.countNumberOfOccurrences("element"));
  }



}
