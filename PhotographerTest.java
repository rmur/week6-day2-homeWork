import static org.junit.Assert.assertEquals;
import org.junit.*;

public class PhotographerTest {

  Photographer photographer;
  DigitalCamera nikon;
  AnalogCamera sony;

  @Before
  public void before(){
  photographer = new Photographer();
  nikon = new DigitalCamera("Nikon 34T, Noise reduction filter Hi-Resolution" ); 
  sony = new AnalogCamera("Sony No noise reduction Lo-resolution"); 
  }  


@Test
public void addingCamera(){
  photographer.addCamera(nikon);
  photographer.addCamera(sony);
  assertEquals(2, photographer.cameraCount());
}

@Test
public void deletingCamera(){
  photographer.removeCamera();
  assertEquals(0, photographer.cameraCount());
}

@Test
public void printAllCameras(){
 photographer.addCamera(nikon);
 assertEquals("Nikon 34T, Noise reduction filter Hi-Resolution",photographer.printAllCameras());

}


}
