/*Exception Handling using throw*/
import java.io.*;
class Exception{
public static void main(String[] args){
  try{
    throw new IOException();
      }
  catch(IOException io){
  System.out.println("Exception"+io.getMessage());
      }
  }
}
