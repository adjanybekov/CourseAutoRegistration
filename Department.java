//***************************************************************************************************************************************************
import javax.swing.JFrame         ;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.List      ;
import java.util.Random    ;
import java.util.ArrayList ;

//***************************************************************************************************************************************************




//***************************************************************************************************************************************************

public class Department 
{
	public JFrame freim = new JFrame("Hie"); 
	
  //=================================================================================================================================================
	
  public final Instructor allInstructors [] =
    { new Instructor( "Selim Temizer"            )
    , new Instructor( "Emre Akbas"               )
    , new Instructor( "Ahmet Oguz Akyuz"         )
    , new Instructor( "Ferda Nur Alpaslan"       )
    , new Instructor( "Ismail Sengor Altingovde" )
    , new Instructor( "Volkan Atalay"            )
    , new Instructor( "Aysenur Birturk"          )
    , new Instructor( "Tolga Can"                )
    , new Instructor( "Ahmet Cosar"              )
    , new Instructor( "Ruken Cakici"             )
    , new Instructor( "Nihan Kesim Cicekli"      )
    , new Instructor( "Ali Hikmet Dogru"         )
    , new Instructor( "Seyda Ertekin"            )
    , new Instructor( "Veysi Isler"              )
    , new Instructor( "Sinan Kalkan"             )
    , new Instructor( "Pinar Karagoz"            )
    , new Instructor( "Murat Manguoglu"          )
    , new Instructor( "Halit Oguztuzun"          )
    , new Instructor( "Ertan Onur"               )
    , new Instructor( "Atilla Ozgit"             )
    , new Instructor( "Faruk Polat"              )
    , new Instructor( "Yusuf Sahillioglu"        )
    , new Instructor( "Uluc Saranli"             )
    , new Instructor( "Erol Sahin"               )
    , new Instructor( "Onur Tolga Sehitoglu"     )
    , new Instructor( "Cevat Sener"              )
    , new Instructor( "Sibel Tari"               )
    , new Instructor( "Ismail Hakki Toroslu"     )
    , new Instructor( "Gokturk Ucoluk"           )
    , new Instructor( "Fatos Yarman-Vural"       )
    , new Instructor( "Adnan Yazici"             )
    } ;

  //-------------------------------------------------------------------------------------------------------------------------------------------------

  private final Student allStudents [] =
    { new Student   ( "Abdulkadir Dalga"         )
    , new Student   ( "Abdullah Goktug Mert"     )
    , new Student   ( "Ali Abbasi"               )
    , new Student   ( "Ali Haydar Karapinar"     )
    , new Student   ( "Arda Guney"               )
    , new Student   ( "Artur Mantaluta"          )
    , new Student   ( "Azat Dzhanybekov"         )
    , new Student   ( "Bahadir Berkay Unsal"     )
    , new Student   ( "Baler Ilhan"              )
    , new Student   ( "Baris Ozcelik"            )
    , new Student   ( "Bunyamin Sarigul"         )
    , new Student   ( "Burak Balci"              )
    , new Student   ( "Cemil Kocaman"            )
    , new Student   ( "Cemre Goc"                )
    , new Student   ( "Dicle Ayzit"              )
    , new Student   ( "Doguscan Namal"           )
    , new Student   ( "Efe Erdil"                )
    , new Student   ( "Ekrem Demirhan"           )
    , new Student   ( "Emel Varol"               )
    , new Student   ( "Emre Akin"                )
    , new Student   ( "Emre Can Kucukoglu"       )
    , new Student   ( "Emre Yigit Alparslan"     )
    , new Student   ( "Fatih Burak Belce"        )
    , new Student   ( "Ismail Sarp Dikkaya"      )
    , new Student   ( "Kaan Toker"               )
    , new Student   ( "Kadir Can Buldurucu"      )
    , new Student   ( "Mehmet Emin Kucuk"        )
    , new Student   ( "Mehmet Mustafa Nacar"     )
    , new Student   ( "Melih Burak Mert"         )
    , new Student   ( "Mertcan Boz"              )
    , new Student   ( "Mesut Yilmaz"             )
    , new Student   ( "Metin Aksit"              )
    , new Student   ( "Musa Karabulut"           )
    , new Student   ( "Mustafa Bugra Tamer"      )
    , new Student   ( "Mustafa Senol Cosar"      )
    , new Student   ( "Nazli Mehrazar"           )
    , new Student   ( "Oguzhan Demir"            )
    , new Student   ( "Oyku Ozlem Cakal"         )
    , new Student   ( "Ozgur Baskin"             )
    , new Student   ( "Sabri Safa Ozturk"        )
    , new Student   ( "Samet Aytac"              )
    , new Student   ( "Saygin Sarioglu"          )
    , new Student   ( "Sema Kose"                )
    , new Student   ( "Sercan Hocaoglu"          )
    , new Student   ( "Serhan Yilmaz"            )
    , new Student   ( "Sevim Begum Sozer"        )
    , new Student   ( "Suleyman Arikan"          )
    , new Student   ( "Turan Soyuer"             )
    , new Student   ( "Ugur Yanikoglu"           )
    , new Student   ( "Utku Caglayan"            )
    , new Student   ( "Yagiz Arkayin"            )
    , new Student   ( "Yunus Olgun"              )
    , new Student   ( "Zeliha Yilmaz"            )
    , new Student   ( "Zeynep Sengil"            )
    , new Student   ( "Zeynep Havva Dinc"        )
    } ;

  //-------------------------------------------------------------------------------------------------------------------------------------------------

  private final Course allCourses [] =
    { new Course( 100 , "Computer Engineering Orientation"                                  )
    , new Course( 111 , "Introduction to Computer Engineering Concepts"                     )
    , new Course( 213 , "Data Structures"                                                   )
    , new Course( 223 , "Discrete Computational Structures"                                 )
    , new Course( 300 , "Summer Practice - I"                                               )
    , new Course( 315 , "Algorithms"                                                        )
    , new Course( 331 , "Computer Organization"                                             )
    , new Course( 351 , "Data Management And File Structures"                               )
    , new Course( 400 , "Summer Practice - II"                                              )
    , new Course( 435 , "Data Communications and Networking"                                )
    , new Course( 477 , "Introduction to Computer Graphics"                                 )
    , new Course( 491 , "Computer Engineering Design I"                                     )
    , new Course( 352 , "Database Management Systems"                                       )
    , new Course( 382 , "Analysis of Dynamic Systems with Feedback"                         )
    , new Course( 424 , "Logic for Computer Sciences"                                       )
    , new Course( 443 , "Introduction to Object Oriented Programming Languages and Systems" )
    , new Course( 451 , "Information Systems Analysis and Design"                           )
    , new Course( 462 , "Introduction to Artificial Intelligence"                           )
    , new Course( 465 , "Introduction to Bioinformatics"                                    )
    , new Course( 466 , "Fundamental Image Processing Techniques"                           )
    , new Course( 498 , "Software Development with Scripting Languges"                      )
    , new Course( 499 , "Special Topics: Introduction to Machine Learning"                  )
    , new Course( 200 , "Introduction to Computers And Fortran Programming"                 )
    , new Course( 301 , "Algorithms And Data Structures"                                    )
    , new Course( 302 , "Introduction to Database Management Systems"                       )
    , new Course( 305 , "Object-Oriented Programming with Java"                             )
    , new Course( 530 , "Computer Networks and Communications"                              )
    , new Course( 532 , "Distributed Computing Systems"                                     )
    , new Course( 536 , "Advanced Unix"                                                     )
    , new Course( 540 , "Programming Languages"                                             )
    , new Course( 551 , "System Development with Abstract Design"                           )
    , new Course( 561 , "Artificial Intelligence"                                           )
    , new Course( 562 , "Machine Learning"                                                  )
    , new Course( 564 , "Pattern Recognition"                                               )
    , new Course( 565 , "Theory of Computation"                                             )
    , new Course( 566 , "Image Processing"                                                  )
    , new Course( 567 , "Design and Analysis of Algorithms"                                 )
    , new Course( 568 , "Knowledge Engineering"                                             )
    , new Course( 574 , "Statistical Data Analysis"                                         )
    , new Course( 583 , "Computer Vision"                                                   )
    , new Course( 591 , "Graduate Seminar"                                                  )
    , new Course( 707 , "Data Structures and Algorithms"                                    )
    , new Course( 709 , "Computer Architecture and Operating Systems"                       )
    , new Course( 789 , "Digital Geometry Processing - Second Program"                      )
    , new Course( 542 , "Human Computer Interaction"                                        )
    , new Course( 547 , "Formal Specification Techniques"                                   )
    , new Course( 550 , "Software Engineering"                                              )
    , new Course( 599 , "Term Project"                                                      )
    , new Course( 701 , "Virtual Reality"                                                   )
    , new Course( 780 , "Sparse Matrix Computations"                                        )
    , new Course( 784 , "Statistical Methods in Natural Language Processing"                )
    , new Course( 785 , "Algorithmic Trading and Quantitative Strategies"                   )
    , new Course( 786 , "Robot Motion Planning and Control"                                 )
    , new Course( 789 , "Digital Geometry Processing"                                       )
    } ;

  //-------------------------------------------------------------------------------------------------------------------------------------------------

  private final Computer allComputers [] =
    { new Computer( "Inek-01" )
    , new Computer( "Inek-02" )
    , new Computer( "Inek-03" )
    , new Computer( "Inek-04" )
    , new Computer( "Inek-05" )
    , new Computer( "Inek-06" )
    , new Computer( "Inek-07" )
    , new Computer( "Inek-08" )
    , new Computer( "Inek-09" )
    , new Computer( "Inek-10" )
    , new Computer( "Inek-11" )
    , new Computer( "Inek-12" )
    , new Computer( "Inek-13" )
    , new Computer( "Inek-14" )
    , new Computer( "Inek-15" )
    , new Computer( "Inek-16" )
    , new Computer( "Inek-17" )
    , new Computer( "Inek-18" )
    , new Computer( "Inek-19" )
    , new Computer( "Inek-20" )
    } ;

  //-------------------------------------------------------------------------------------------------------------------------------------------------

  private static final String allPartyTalk [] =
    { "Hi"
    , "Hello"
    , "Good day"
    , "What's up?"
    , "Nice party"
    , "How are you?"
    , "Nice weather"
    } ;

  //=================================================================================================================================================

  // General purpose random number generator :

  private static final Random random = new Random() ;

  //=================================================================================================================================================

  // Education levels offered in the department :

  private static final int BS  = 123 ;
  private static final int MS  = 456 ;
  private static final int PHD = 789 ;

  //=================================================================================================================================================

  // API related to education levels :

  public static boolean isBS  ( int level )  { return level == BS  ; }
  public static boolean isMS  ( int level )  { return level == MS  ; }
  public static boolean isPHD ( int level )  { return level == PHD ; }

  //-------------------------------------------------------------------------------------------------------------------------------------------------

  public static int generateRandomLevel ()
  {
    switch ( random.nextInt(3) )
    {
      default :
      case 0  : return BS  ;
      case 1  : return MS  ;
      case 2  : return PHD ;
    }
  }
  
  //-------------------------------------------------------------------------------------------------------------------------------------------------

  public static String getLevelString ( int level )
  {
    switch ( level )
    {
      case BS  : return "BS"      ;
      case MS  : return "MS"      ;
      case PHD : return "PHD"     ;
      default  : return "INVALID" ;
    }
  }

  //-------------------------------------------------------------------------------------------------------------------------------------------------

  private static boolean canTakeCourse ( int studentLevel , int courseLevel )
  {
                                                    /*     Course Level      */
                                                    /*  BS      MS      PHD  */
                                                    /* -----   -----   ----- */
    boolean matrix[][] = { /*                BS  */ {  true  , true  , false  } ,
                           /* Student Level  MS  */ {  true  , true  , true   } ,
                           /*                PHD */ {  false , true  , true   } } ;

    int studentLevelIndex = 0 ;
    int  courseLevelIndex = 0 ;

    if      ( isBS ( studentLevel ) )  { studentLevelIndex = 0 ; }
    else if ( isMS ( studentLevel ) )  { studentLevelIndex = 1 ; }
    else if ( isPHD( studentLevel ) )  { studentLevelIndex = 2 ; }

    if      ( isBS (  courseLevel ) )  {  courseLevelIndex = 0 ; }
    else if ( isMS (  courseLevel ) )  {  courseLevelIndex = 1 ; }
    else if ( isPHD(  courseLevel ) )  {  courseLevelIndex = 2 ; }

    return matrix[ studentLevelIndex ][ courseLevelIndex ] ;
  }

  //=================================================================================================================================================

  // Static utility method(s) :

  public static String getRandomPartyTalk ()
  {
    return allPartyTalk[ random.nextInt( allPartyTalk.length ) ] ;
  }

  //-------------------------------------------------------------------------------------------------------------------------------------------------

  public static void log ( String name , String message )
  {
    synchronized ( System.out )
    {
      System.out.println( String.format( "%-" + maxNameWidth + "s : %s" , name , message ) ) ;
    }
  }

  //-------------------------------------------------------------------------------------------------------------------------------------------------

  public static void simulatePassingTime ()
  {
    simulatePassingTime( 100 , 200) ;
  }

  //-------------------------------------------------------------------------------------------------------------------------------------------------

  private static void simulatePassingTime ( int minimumMilliseconds , int maximumMilliseconds )
  {
    try                               { Thread.sleep( minimumMilliseconds + random.nextInt( maximumMilliseconds - minimumMilliseconds ) ) ; }
    catch ( InterruptedException e )  { /* Do nothing */                                                                                    }
  }

  //=================================================================================================================================================

  // Non-static utility method(s) :

  public Course getRandomCourse ()
  {
    return courses.get( random.nextInt( courses.size() ) ) ;
  }

  //=================================================================================================================================================

  // Physical members of a department :

  public List< Instructor > instructors = new ArrayList<>() ;
  public List< Student    > students    = new ArrayList<>() ;
  public List< Course     > courses     = new ArrayList<>() ;
  public List< Computer   > computers   = new ArrayList<>() ;

  //-------------------------------------------------------------------------------------------------------------------------------------------------

  // Logical members of a department :

  public        Barrier barrierParty = null ;
  public static int     maxNameWidth = 0    ;

  //=================================================================================================================================================

  // Department constructor :

  public Department ( int numberOfInstructors , int numberOfStudents , int numberOfCourses , int numberOfComputers )
  {
    //-----------------------------------------------------------------------------------------------------------------------------------------------
	 
    // Clamp values inside valid ranges :
	 // numberOfInstructors = 0; numberOfStudents =0;  numberOfCourses =0; numberOfComputers= 0;
	  
    if ( numberOfInstructors < 1                     )  { numberOfInstructors = 1                     ; }
    if ( numberOfInstructors > allInstructors.length )  { numberOfInstructors = allInstructors.length ; }

    if ( numberOfStudents    < 1                     )  { numberOfStudents    = 1                     ; }
    if ( numberOfStudents    > allStudents   .length )  { numberOfStudents    = allStudents   .length ; }

    if ( numberOfCourses     < 1                     )  { numberOfCourses     = 1                     ; }
    if ( numberOfCourses     > allCourses    .length )  { numberOfCourses     = allCourses    .length ; }

    if ( numberOfComputers   < 1                     )  { numberOfComputers   = 1                     ; }
    if ( numberOfComputers   > allComputers  .length )  { numberOfComputers   = allComputers  .length ; }

    //-----------------------------------------------------------------------------------------------------------------------------------------------

    // Fill lists and build a department :

    for ( int i = 0 ; i < numberOfInstructors ; i++ )  { instructors.add( allInstructors[i] ) ; }
    for ( int i = 0 ; i < numberOfStudents    ; i++ )  { students   .add( allStudents   [i] ) ; }
    for ( int i = 0 ; i < numberOfCourses     ; i++ )  { courses    .add( allCourses    [i] ) ; }
    for ( int i = 0 ; i < numberOfComputers   ; i++ )  { computers  .add( allComputers  [i] ) ; }

    barrierParty = new Barrier( numberOfStudents ) ;
    for ( Instructor i : instructors )  { if ( i.getName().length() > maxNameWidth )  { maxNameWidth = i.getName().length() ; } }
    for ( Student    i : students    )  { if ( i.getName().length() > maxNameWidth )  { maxNameWidth = i.getName().length() ; } }

    //-----------------------------------------------------------------------------------------------------------------------------------------------

    // Assign advisors to students :

    int instructorIndex = 0 ;

    for ( Student s : students )
    {
      s.setAdvisor(instructors.get( instructorIndex++ ) ) ;

      if ( instructorIndex >= instructors.size() )  { instructorIndex = 0 ; }
    }

    //-----------------------------------------------------------------------------------------------------------------------------------------------
  /* JLabel emptyLabel = new JLabel("");
    freim.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    freim.setPreferredSize(new Dimension(175, 100));
    freim.getContentPane().add(emptyLabel, BorderLayout.CENTER);
    freim.pack();
    freim.setVisible(true);
    */
  
  
  
  }

  //=================================================================================================================================================
}

//***************************************************************************************************************************************************

