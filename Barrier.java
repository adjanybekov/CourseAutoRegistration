//***************************************************************************************************************************************************

public class Barrier
{
  //=================================================================================================================================================

  private int numberOfThreadsCurrentlyWaiting    ; //wait();  notify(); 
  private int numberOfThreadsToReachBarrierPoint ;

  //=================================================================================================================================================

  public Barrier(int numberOfThreadsToReachBarrierPoint )//numberofStudents
  {
	  this.numberOfThreadsToReachBarrierPoint = numberOfThreadsToReachBarrierPoint; 
	  this.numberOfThreadsCurrentlyWaiting = 0;
  }

  //=================================================================================================================================================

  
  public  synchronized void  await ( Student s) //
  {
	  
	  System.out.println(s.getName()+"000000000000000000000000000000000000000000000000000000000000000000");
	  
	  System.out.println(numberOfThreadsToReachBarrierPoint + " is waiting 999999999999999999999999999999999999999999999");
	  
	 while(numberOfThreadsCurrentlyWaiting-1 < numberOfThreadsToReachBarrierPoint){
		 
		 //System.out.println(numberOfThreadsCurrentlyWaiting + " is waiting 8888888888888888888888aaaaaaaaaaaaaAAAAAAAAAAAAAAAAAAAA");
		 numberOfThreadsCurrentlyWaiting++; 
		 
		 if( numberOfThreadsCurrentlyWaiting == numberOfThreadsToReachBarrierPoint)
			  
		  { //System.out.println("Bittiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
				 notifyAll();}
	  }
		 try {
		wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
	  }
	 
	// System.out.println(numberOfThreadsCurrentlyWaiting + " is waiting 8888888888888888888888aaaaaaaaaaaaaAAAAAAAAAAAAAAAAAAAA");
	 
	 

  //=================================================================================================================================================
}

//***************************************************************************************************************************************************

