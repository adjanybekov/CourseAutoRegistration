import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

//***************************************************************************************************************************************************

public class Instructor extends Entity
{
  //=================================================================================================================================================

  public Instructor ( String name )
  {
    super( name ) ;
  }

  //=================================================================================================================================================

   boolean  isRegistrationOK ( Student student ) //Use Double Reflection to access the course level 
  {
	  
	  Department.log( getName() , "I am checking registration of "+student.getName() ) ;
	  
	  int studentLevel = 0;
	  Field StudntLevel = null;
	  
	  try {
		StudntLevel = student.getClass().getDeclaredField("level");
	} catch (NoSuchFieldException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	} catch (SecurityException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	  
	  //assign the student level from the student class to the student level in the instructor class 
	  StudntLevel.setAccessible(true);
	  
	  try {
		studentLevel = (int) StudntLevel.getInt(student);

	} catch (IllegalArgumentException e2) {
		// TODO Auto-generated catch block
		e2.printStackTrace();
	} catch (IllegalAccessException e2) {
		// TODO Auto-generated catch block
		e2.printStackTrace();
	}
	  
	  
	
	  
	  
	  
	  
	  
	  
	  Field privList = null;
	  
		try {
			privList =  student.getClass().getDeclaredField("courses");
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		privList.setAccessible(true);
		 
		  
		 
		List<Course> clist = new ArrayList<Course>();
		
		try {
			clist = (List) privList.get(student);
			
		} catch (IllegalArgumentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		int CourseLevel;
		
		Field CL= null;
		
		//Implementing the cour
		try {
			CL = clist.get(0).getClass().getDeclaredField("level");
		} catch (NoSuchFieldException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SecurityException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		CL.setAccessible(true);
		//just prints
		int courseLevel =0;
		try {
			courseLevel = (int) CL.get(clist.get(0));
		} catch (IllegalArgumentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
		
		//Use canTakCourse Method instead 
	
				//NEEDDDDDif(CL.get(clist.get(j)) != StudntLevel){
					
		
	
	
	Department dep = null;
	
	Field department =null;

     try {
    	 
    	 department =  student.getClass().getDeclaredField("department");
		
	} catch (NoSuchFieldException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SecurityException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
     department.setAccessible(true);
     try {
		dep = (Department) department.get(student);
	} catch (IllegalArgumentException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	} catch (IllegalAccessException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
     
     	Object s =  dep ;	

		
		
		Class c = s.getClass( );
		
	
		Class[] parms = new Class[] { Integer.TYPE, Integer.TYPE };

		
		
		
	 	Method m  = null;
    try {
		 m  = (Method)  c.getDeclaredMethod("canTakeCourse" ,parms);
	} catch (NoSuchMethodException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SecurityException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

    
    for(int nth =0; nth <3 ; nth++){
    	try {
			courseLevel = (int) CL.get(clist.get(nth));
		} catch (IllegalArgumentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    	
    Object[] args = new Object[] {new Integer( courseLevel ), new Integer(studentLevel)};
    m.setAccessible(true);

	boolean isOkey = true;
    try {
		isOkey = (boolean ) m.invoke( null, args );
	} catch (IllegalAccessException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IllegalArgumentException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (InvocationTargetException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
    if(isOkey){
    	Department.log( getName() ,clist.get(nth) +"-> YES");
    }
    else{Department.log( getName() ,clist.get(nth) +"-> NO");
    		
    		return false;
    		}
    	
    }
    return true;//###################### I didn't

    // ...
  }
  
  
  
  //=================================================================================================================================================
}

//***************************************************************************************************************************************************

