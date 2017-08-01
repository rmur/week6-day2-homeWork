import static org.junit.Assert.assertEquals;
import org.junit.*;

public class PhotographerTest {

  Photographer photographer;
  DigitalCamera nikon;

  @Before
  public void before(){
  photographer = new Photographer();
  nikon = new DigitalCamera();  
  }  


@Test
public void addingCamera(){
  photographer.addCamera(nikon);
  assertEquals(1, photographer.cameraCount());
}

@Test
public void deletingCamera(){
  photographer.removeCamera();
  assertEquals(0, photographer.cameraCount());
}



}
