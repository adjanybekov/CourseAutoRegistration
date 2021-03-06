//***************************************************************************************************************************************************
import java.awt.Color;

import javax.swing.JPanel;

public abstract class Entity extends JPanel
{
  //=================================================================================================================================================

  private final String name ;

  //=================================================================================================================================================

  public Entity ( String name )
  {
	 setBackground( Color.WHITE ) ;
    this.name = name ;
  }

  //=================================================================================================================================================

  public String getName ()
  {
    return name ;
  }

  //=================================================================================================================================================

  @Override
  public String toString ()
  {
    return name ;
  }

  //=================================================================================================================================================
}

//***************************************************************************************************************************************************

