import java.util.*;

class Photographer {
  private ArrayList<Printable> cameras;

  public Photographer(){
    this.cameras = new ArrayList<Printable>();
  }


  public void addCamera(Printable cameraNew){
   this.cameras.add(cameraNew); 
  }

  public void removeCamera(){
    this.cameras.clear();
  }

  public int cameraCount(){
    return this.cameras.size();
  }



}

