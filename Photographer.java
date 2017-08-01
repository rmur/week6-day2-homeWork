import java.util.*;

class Photographer {
  private ArrayList<CameraStore> cameras;

  public Photographer(){
    this.cameras = new ArrayList<CameraStore>();
  }


  public void addCamera(CameraStore cameraNew){
   this.cameras.add(cameraNew); 
  }

  public void removeCamera(){
    this.cameras.clear();
  }

  public int cameraCount(){
    return this.cameras.size();
  }



}

