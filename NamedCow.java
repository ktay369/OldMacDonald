class NamedCow extends Cow
{
  String myName;
  public NamedCow(String name){
    myName = name;
  }
  public NamedCow(){
    myName = "unknown";
  }
  public String getName(){
   return myName; 
  }
}