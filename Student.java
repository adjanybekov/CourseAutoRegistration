import java.lang.reflect.Field;
import java.util.ArrayList;//################
import java.util.List;//###################


//***************************************************************************************************************************************************

public class Student extends Entity implements Runnable
{
  //=================================================================================================================================================

  private final int          level      ;
  private final List<Course> courses    ;
  private final Thread       thread     ;
  private       Instructor   advisor    ;
  private       Department   department ;

  //=================================================================================================================================================

  public Student ( String name )
  {
    super( name ) ;

    this.level      = Department.generateRandomLevel() ;
    this.courses    = new ArrayList<Course>()          ;
    this.thread     = new Thread( this , name )        ;
    this.advisor    = null                             ;
    this.department = null                             ;
  }

  //=================================================================================================================================================

  public void setAdvisor ( Instructor instructor )
  {
    this.advisor = instructor ;
  }

  //=================================================================================================================================================

  private boolean addCourse ( Course course )
  {
   if ( courses.contains( course ) )  { return false ;}
   		courses.add( course ) ;

    return true; //
  }

  //=================================================================================================================================================

  private void clearCourses ()
  {
    courses.clear() ;
  }

  //=================================================================================================================================================

  @Override
  public String toString ()
  {
    String advisorString = (advisor == null) ? "-" : advisor.toString();

    return ( getName() + " (" + Department.getLevelString( level ) + ", " + advisorString + ", " + courses.size() + ")" ) ;
  }

  //=================================================================================================================================================

  public void start ( Department department )
  {
    this.department = department;
    thread.start();
    
  }

  //=================================================================================================================================================

  @Override
  public void run ()
  {
      
    //-----------------------------------------------------------------------------------------------------------------------------------------------
	  
	  boolean registrationDone = false ;
    
    while ( ! registrationDone )//commands for one student Only! 
    {
    	
    	
        
        Computer comp = null;
        
        boolean notified = false;
    	boolean foundComputer = false;
    	int idx = 0;
    	
    	synchronized(department.computers){
    		
    	Department.log( getName() , "I am in the laboratory looking for a free computer" );
    	while(!foundComputer){
    		for(int i=0; i < department.computers.size(); i++ ){ // set the Name of the
    		//while(i<department.computers.size())
    		
    		if(!department.computers.get(i).isInUse()){//If Computer is free
    			comp = department.computers.get(i);
    			//dont print it if enters twice 
    			idx = i;
    			foundComputer  = true;
    			department.simulatePassingTime();
    			Department.log( getName() , "I got computer " + department.computers.get(idx));
    			Department.log( getName() , "I am registering for 3 courses");
    			department.computers.get(i).setInUse(true);		
    			break;
    		}
    		
    	}

    	
    	
    	if(!foundComputer){
    		
    		Department.log( getName() , "No available computers, I'm waiting");
    		
    		//Barrier b = new Barrier( department.students.size()- department.computers.size());
    		//b.await(this);
    		try {
				department.computers.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		department.simulatePassingTime();
    		Department.log( getName() , "Someone just left the laboratory, I'll now check again for a free computer");
    	}
    	
    	
    }
    	
    }
    
    	//it will not get out of the lop until it gets the computer 
    	int courseCount =0;
    	while(courses.size() < 3){
    		Course c = department.getRandomCourse();    		
    		if(!courses.contains(c))
    			{this.addCourse(c);
    			department.simulatePassingTime();
    			Department.log( getName() , "I took " + courses.get(courseCount));
    			courseCount++;
    			}
    	}
    	
    	synchronized (department.computers){
    		department.computers.notifyAll();
    		Department.log( getName() , "I am leaving computer " + department.computers.get(idx));//hata 
    		department.simulatePassingTime();
    		Department.log( getName() ,"I am about to get my registration checked"+ advisor); 
    		comp.setInUse(false);
    	}
    	
    	
    	
    	boolean isFree = true;
    	synchronized (department.instructors){
    		isFree = false;
    		boolean isOk = advisor.isRegistrationOK(this);
	    	if(isOk){
	    		
	    		registrationDone = true;//#####################
	    		break;
	    	}
	    	
	    	else
	    	{
	    		Department.log( getName() , "I need to register again");
	    		department.simulatePassingTime();
	    	}
	    	
	    	if(!isFree){
	    		try {
					department.instructors.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    	}
    	}
    	
    	

    	
    
    	}
    	
    	
    	
    	
    	
    	
    	
    	

    //-----------------------------------------------------------------------------------------------------------------------------------------------
    //After Every thread Fins registrationCourse Finishes Start the Party !
    
    Department.log( getName() , "I'm joining the after-registration party" ) ;

    department.barrierParty.await(this) ;//
    
  
    Department.log( getName() , Department.getRandomPartyTalk() ) ;
    Department.log( getName(), " Bingo!");
    
    //-----------------------------------------------------------------------------------------------------------------------------------------------
  }

  //=================================================================================================================================================
}

//***************************************************************************************************************************************************

