//***************************************************************************************************************************************************
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame         ;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class Register 
{
  //=================================================================================================================================================

 private static int NOS;
 static boolean flag = false;
  //=================================================================================================================================================
public void Register(){
		String txt;
	   
	   int NOI;
	   int NOC;
	   final JFrame frame = new JFrame();  
	    JPanel panel = new JPanel();    
	    final JTextField nameField = new JTextField(4);    
	    JButton button1 = new JButton();
	    final JLabel label1 = new JLabel();
	    label1.setText("txt");
	    label1.setVisible(false);
	    

	    frame.add(panel);
	    panel.add(button1);
	    panel.add(label1);
	    frame.setSize(200,200);
	    button1.setName("Start");
	    button1.setSize(10,10);
	    panel.add(nameField);
	    frame.setSize(600,400); 
	    nameField.setBounds(400, 40, 400, 30);
	    frame.setVisible(true);
	
	
}
  public static void main ( String[] args )
  {
    //-----------------------------------------------------------------------------------------------------------------------------------------------

    // Usage: Register [NumberOfInstructors] [NumberOfStudents] [NumberOfCourses] [NumberOfComputers]

    //-----------------------------------------------------------------------------------------------------------------------------------------------
            
	   
	   int NOI;
	   int NOC;
	   final JFrame frame = new JFrame();  
	    JPanel panel = new JPanel();    
	    final JTextField nameField = new JTextField(4);    
	    JButton button1 = new JButton();
	    final JLabel label1 = new JLabel();
	    label1.setText("txt");
	    label1.setVisible(false);
	    
            
	    frame.add(panel);
	    panel.add(button1);
	    panel.add(label1);
	    frame.setSize(200,200);
	    button1.setName("Start");
	    button1.setSize(10,10);
	    panel.add(nameField);
	    frame.setSize(600,400); 
	    nameField.setBounds(400, 40, 400, 30);
	    frame.setVisible(true);  
            
	    
	     button1.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
                        String txt;
			txt = nameField.getText();
			NOS = Integer.parseInt(txt);
			flag =true;
			System.out.println(flag);
			// TODO Auto-generated method stub
			
		}
	});
	 
             
        
	 while(true){
             System.out.print("");
             if(flag)
             {
                 break;}}
         
	    System.out.println(NOS+"ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc");
	
	//Register r = new Register();

    int numberOfInstructors =  3;//assign those variavles here Using Reflection
    int numberOfStudents    =  NOS;
    int numberOfCourses     =  10;
    int numberOfComputers   =  2;
    
    if ( args.length >= 1 )  { numberOfInstructors = Integer.parseInt( args[0].trim() ) ; }
    if ( args.length >= 2 )  { numberOfStudents    = Integer.parseInt( args[1].trim() ) ; }
    if ( args.length >= 3 )  { numberOfCourses     = Integer.parseInt( args[2].trim() ) ; }
    if ( args.length >= 4 )  { numberOfComputers   = Integer.parseInt( args[3].trim() ) ; }

    
    Department ceng = new Department( numberOfInstructors , numberOfStudents , numberOfCourses , numberOfComputers ) ;
    
    
   // System.out.println(ceng.students.get(0).+"");
    //ceng.courses.get(1);
    //-----------------------------------------------------------------------------------------------------------------------------------------------

    System.out.println( "Number of Instructors = " + ceng.instructors.size() ) ;
    System.out.println( "Number of Students    = " + ceng.students   .size() ) ;
    System.out.println( "Number of Courses     = " + ceng.courses    .size() ) ;
    System.out.println( "Number of Computers   = " + ceng.computers  .size() ) ;

    System.out.println( "\n" + "Instructors" + " :" + "\n" ) ;  for ( Instructor i : ceng.instructors )  { System.out.println( "  " + i ) ; }
    System.out.println( "\n" + "Students"    + " :" + "\n" ) ;  for ( Student    i : ceng.students    )  { System.out.println( "  " + i ) ; }
    System.out.println( "\n" + "Courses"     + " :" + "\n" ) ;  for ( Course     i : ceng.courses     )  { System.out.println( "  " + i ) ; }
    System.out.println( "\n" + "Computers"   + " :" + "\n" ) ;  for ( Computer   i : ceng.computers   )  { System.out.println( "  " + i ) ; }

    //-----------------------------------------------------------------------------------------------------------------------------------------------

   
    //####### After Implementing the Thread in student     
   for ( Student s : ceng.students )
    {
      s.start( ceng ) ;
    }

    //-----------------------------------------------------------------------------------------------------------------------------------------------
  }
  
  //=================================================================================================================================================
}

//***************************************************************************************************************************************************

