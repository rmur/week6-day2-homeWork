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

  public String printAllCameras(){
    String hold = "";
    for (Printable cameraSpaces : this.cameras){
      hold = hold + cameraSpaces.printDetails();
    }
    return hold;
  }


}

