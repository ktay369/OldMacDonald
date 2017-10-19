class NamedCow extends Cow
{
  private String myType;
  private String myName;
  private String mySound;
  public NamedCow(String type, String name, String sound){
    myType = type;
    myName = name;
    mySound = sound;
  }
  public NamedCow(){
    myType  = "unknown";
    myName = "unknown";
    mySound = "unknown";
  }
  public String getType(){
   return myType; 
  }
  public String getName(){
   return myName; 
  }
  public String getSound(){
   return mySound; 
  }
}