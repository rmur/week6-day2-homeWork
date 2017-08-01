import static org.junit.Assert.assertEquals;
import org.junit.*;

public class PhotographerTest {

  Photographer photographer;
  DigitalCamera nikon;
  AnalogCamera kodak;

  @Before
  public void before(){
  photographer = new Photographer();
  nikon = new DigitalCamera(); 
  kodak = new AnalogCamera(); 
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
