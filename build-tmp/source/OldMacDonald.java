import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OldMacDonald extends PApplet {

//your variable declarations here
public void setup()
{
  Cow c = new Cow("cow", "moo");   
  System.out.println(c.getType() + " goes " + c.getSound());
  Chick birdy = new Chick("bird", "tweet");   
  System.out.println(birdy.getType() + " goes " + birdy.getSound()); 
  Pig piglet = new Pig("pig", "oink");   
  System.out.println(piglet.getType() + " goes " + piglet.getSound());  
  }

  interface Animal 
  {    
    public String getSound();        
    public String getType(); 
  }
  class Cow implements Animal 
  {     
    private String myType;     
    private String mySound;      
    public Cow(String type, String sound)    
    {         
     myType = type;         
     mySound = sound;     
   }     
   public Cow()    
   {         
     myType = "unknown";         
     mySound = "unknown";     
   }      
   public String getSound(){return mySound;}     
   public String getType(){return myType;} 
 }

 class Pig implements Animal 
 {     
  private String myType;     
  private String mySound;      
  public Pig(String type, String sound)    
  {         
   myType = type;         
   mySound = sound;     
 }     
 public Pig()    
 {         
   myType = "unknown";         
   mySound = "unknown";     
 }      
 public String getSound(){return mySound;}     
 public String getType(){return myType;} 
}


class Chick implements Animal 
{     
  private String myType;     
  private String mySound;      
  public Chick(String type, String sound)    
  {         
   myType = type;         
   mySound = sound;     
 }     
 public Chick()    
 {         
   myType = "unknown";         
   mySound = "unknown";     
 }      
 public String getSound(){return mySound;}     
 public String getType(){return myType;} 
}


class Farm  
{     
  private Animal[] aBunchOfAnimals = new Animal[3];    
  public Farm()     
  {       
    aBunchOfAnimals[0] = new Cow("cow","moo");           
    aBunchOfAnimals[1] = new Chick("chick","cluck");       
    aBunchOfAnimals[2] = new Pig("pig","oink");    
  }         
  public void animalSounds()    
  {       
    for (int nI=0; nI < aBunchOfAnimals.length; nI++)      
    {          
     System.out.println( aBunchOfAnimals[nI].getType() + " goes " + aBunchOfAnimals[nI].getSound());       
   }    
 } 
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OldMacDonald" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
