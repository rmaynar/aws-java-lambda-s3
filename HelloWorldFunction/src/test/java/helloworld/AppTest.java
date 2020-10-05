package helloworld;

import com.maynar.App;
import com.amazonaws.services.s3.event.S3EventNotification;
import org.junit.Test;

import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class AppTest {
  @Test
  public void successfulResponse() {
    App app = new App();
    String result = app.handleRequest(new S3EventNotification(Collections.emptyList()), null);
    assertEquals(null, result);
  }
}
