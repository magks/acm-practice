import java.util.ArrayList;

public class Sorting {

    /* Two Judges.
       Judges agree if one goes up relative 
       to the nextstore while the other goes down. 
    */
    
    /* 1    2    3    4    5   6   7  8   */
    /* 80   60   40   20   10  30  50 70 
       160  100  120  80   20  60  90 135
    */

    Scanner sin = new Scanner(System.in);
    CharSequence end1 = "end-of-file";
    CharSequence end2 = "EOF";
    CharSequence end3 = "End Of File";
    int count = 0; 
    ArrayList<String> sp = new ArrayList<String>(); // sp = score pairs

    /*
    int i =0;

    
    // get input lines
    while(sin.hasNext()) {
	// get next line
	sp.add(sin.nextLine());
	// read first number
	numCont = String.valueOf(example.charAt(0)); //sp.get(0) Integer.parseInt("1234");
	//If the input string contains end-of-file or EOF or End Of File. 
	if( (Arr.get(i).contains(end1)) == true || (Arr.get(i).contains(end2)) == true || (Arr.get(i).contains(end3) ) == true) { i++;break;}
	else { i++; }
    }
    Scanner scanner = new Scanner(number);
    List< ArrayList<Integer> > sp = new ArrayList<>(); // all lists of score pairs (list of lists)
    
    List<Integer> n = new ArrayList<Integer>();
    int numCont = 0;                             // number of contestants
    */
    while (scanner.hasNext()) {
        // Get next input as string
	String str = scanner.next();
	//If the input string contains end-of-file or EOF or End Of File. 
	if( (str.equals(end1)) == true
	     || (str.equals(end2)) == true
	     || (str.equals(end3)) == true){
	  i++;
	  break;
        }
	else { i++; }
	
	// Parse the line
	// get the number of contestants and store in list      
	numCont = Integer.parseInt( String.valueOf( str.charAt(0)) ); //sp.get(0) Integer.parseInt("1234");	
	n.add( numCont ) ;
 
	List<Integer> judge1 = new ArrayList<>();  // one list of score pairs
	List<Integer> judge2 = new ArrayList<>();
	// read n ints into one temporary list
	for( int i = 0; i < numCont*2 ; i++){
	    if ( i < numCont)
		judge1.add( scanner.nextInt() );
	    else
		judge2.add( scanner.nextInt() );	    
	} //end while
	
	//add lists of two judge scores to Score Pair List
	ScorePair scores = new ScorePair(judge1, judge2);
	sp.add(scores);
    }
    
    

    

    private static class ScorePair(){
        List judge1;
	List judge2;
	int n;	
	public ScorePairs( ArrayList<Integer> j1, ArrayList<Integer> j2 ){
	    judge1 = j1;
	    judge2 = j2;
	    n = 0;
	}
	public ScorePairs() {
	    judge1 = j1;
	    judge2 = j2;
	    n = 0;
	}
	
    }
    
    
}// end class
