package NotePadApp;


/**
* NotePadApp/NotePadOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from NotePad.idl
* 25 ������ 2019 �. 20:31:45 MSK
*/

public interface NotePadOperations 
{
  boolean addNote (String a);
  String showNotes ();
  boolean deleteNote (int b);
  void shutdown ();
} // interface NotePadOperations
