import javax.swing.JOptionPane;	
public class DigitalIdeErr {
    public static void main(String[] args){
    	/*Object[] options = {"Yes, please",
                    "No, thanks",
                    "No eggs, no ham!"};
		/*int n = JOptionPane.showOptionDialog(null,
    	"Would you like some green eggs to go "
    + "with that ham?",
    "A Silly Question",
    JOptionPane.YES_NO_CANCEL_OPTION,
    JOptionPane.QUESTION_MESSAGE,
    null,
    options,
    options[2]);	*/
    	Object[] options = {"Open Ide",
                    "Exit",};
                    int n=4;
         int t=Integer.parseInt(args[0]) ; 
         int r=Integer.parseInt(args[1]);        
         n=JOptionPane.showOptionDialog(null, (r==0)?("Your Code didn't "+ ((t==0)?"compile ":"run ")+"properly"):("Wrong Answer"),
         (r==0)?((t==0)?"Syntax Error":"Runtime Error"):("Incorrect Coding"),JOptionPane.YES_NO_CANCEL_OPTION, 
        	JOptionPane.ERROR_MESSAGE,null,
   			options,options[0]);            	        
        System.out.println(n);// Check for cancel option too.
    }
}