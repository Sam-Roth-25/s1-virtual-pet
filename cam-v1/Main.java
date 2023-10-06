import javax.swing.*;
public class Main{

    public Main(){
    VirtualPet p = new VirtualPet();
    p.sleep();
    pause(5000);
    p.feed();
    pause(5000);
    p.exercise();
    }

    public String getR(String q){
        String s = (String)JOptionPane.showInputDialog(
            new JFrame(),
            "Your Message",
            "Your Title",
            JOptionPane.PLAIN_MESSAGE
        );
        return s;

    }

    public void pause(int milliseconds){try {
        Thread.sleep(milliseconds);
    } catch(Exception e){
    
    }}

    public static void main(String[] args){
        new Main();
    }
}