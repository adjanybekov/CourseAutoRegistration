//***************************************************************************************************************************************************

public class Course extends Entity
{
  //=================================================================================================================================================

  private final int code  ;
  private final int level ;


  //=================================================================================================================================================

  public Course ( int code , String name )
  {
    super( name ) ;

    this.code  = code                             ;
    this.level = Department.generateRandomLevel() ;
  }

  //=================================================================================================================================================

  @Override
  public String toString ()
  {
    return ( "CENG " + code + " - " + getName() + " (" + Department.getLevelString( level ) + ")" ) ;
  }
  
  //=================================================================================================================================================
}

//***************************************************************************************************************************************************

