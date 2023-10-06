 import javax.swing.*;
public class Runner{
   
    public  Runner(){
        VirtualPet p=new VirtualPet();
        p.feed();
        pause(1000);
        p.exercise();
        pause(1000);
        p.sleep();
        pause(1000);
        System.out.println(getResponse("How was your day"));
        p.born();
    }
    public String getResponse(String q){

        String s = (String)JOptionPane.showInputDialog(
                        new JFrame(),
                        q,
                        "Your Title",
                        JOptionPane.PLAIN_MESSAGE
        );
        return s;
    }
    public void pause(int milliseconds){
        try{
            Thread.sleep(milliseconds);
        } catch(Exception e){

        }
    }
    public static void main(String[] args){
        new Runner();  
    }
}