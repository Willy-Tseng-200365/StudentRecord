
/**
 * Driver for the class StudentRecord
 *
 * @JKim 
 * @version (0.1)
 */
public class StudentRecordTester
{
    public static void main(String[] args)
    {
        int[] a={50,50,20,80,30};
        int[] b={20,50,50,53,80};
        int[] c={20,50,50,80};
        
        StudentRecord[] sr = new StudentRecord[3];
        sr[0] = new StudentRecord(a);
        sr[1] = new StudentRecord(b);
        sr[2] = new StudentRecord(c);
        double average(int first, int last);
        int increaseA = 0;
        int increaseB = 0;
        int increaseC = 0;
        for(int i = 0; i < a.length; i ++){
            if(a[i] <= a[i-1]){
                increaseA = 0;
                
            }
            else if(a[i] > a[i-1]){
                increaseA =1;
            }
        }
        for(int i = 0; i < b.length; i ++){
            if(b[i] <= b[i-1]){
                increaseB = 0;
                
            }
            else if(b[i] > b[i-1]){
                increaseB =1;
            }
        }    
        for(int i = 0; i < c.length; i ++){
            if(c[i] <= c[i-1]){
                increaseC = 0;
                
            }
            else if(c[i] > c[i-1]){
                increaseC =1;
            }
        }
        String yesA = "No";
        String yesB = "No";
        String yesC = "No";
        if(increaseA ==1){
            yesA = "Yes";
        }
        else{
            yesA = "No";
        }
        
        if(increaseB ==1){
            yesB = "Yes";
        }
        else{
            yesB = "No";
        }
        
        if(increaseC == 1){
            yesC = "Yes";
        }
        else{
            yesC = "No";
        }
    
    
        
        
        
        
        
        
        
        
        
        //chart maker;
        System.out.println("Student Scores" + "                " + "Improved?" + "          " + " Final Average");
        System.out.println(a+"           " + yesA + "         " );
        System.out.println(b+"           " + yesB + "         " );
        System.out.println(c+"           " + yesC + "         " );
        
    }
    
}
