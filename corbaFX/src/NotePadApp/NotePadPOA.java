package NotePadApp;


/**
* NotePadApp/NotePadPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from NotePad.idl
* 25 ������ 2019 �. 20:31:45 MSK
*/

public abstract class NotePadPOA extends org.omg.PortableServer.Servant
 implements NotePadApp.NotePadOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("addNote", new java.lang.Integer (0));
    _methods.put ("showNotes", new java.lang.Integer (1));
    _methods.put ("deleteNote", new java.lang.Integer (2));
    _methods.put ("shutdown", new java.lang.Integer (3));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // NotePadApp/NotePad/addNote
       {
         String a = in.read_string ();
         boolean $result = false;
         $result = this.addNote (a);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 1:  // NotePadApp/NotePad/showNotes
       {
         String $result = null;
         $result = this.showNotes ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 2:  // NotePadApp/NotePad/deleteNote
       {
         int b = in.read_long ();
         boolean $result = false;
         $result = this.deleteNote (b);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 3:  // NotePadApp/NotePad/shutdown
       {
         this.shutdown ();
         out = $rh.createReply();
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:NotePadApp/NotePad:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public NotePad _this() 
  {
    return NotePadHelper.narrow(
    super._this_object());
  }

  public NotePad _this(org.omg.CORBA.ORB orb) 
  {
    return NotePadHelper.narrow(
    super._this_object(orb));
  }


} // class NotePadPOA
