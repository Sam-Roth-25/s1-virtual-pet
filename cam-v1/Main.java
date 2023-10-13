import javax.swing.*;
public class Main{

    public Main(){
    VirtualPet p = new VirtualPet();
    p.dialog("yes", "no","can i type?","the answer is no");
    }

    public String getR(String q){
        String s = (String)JOptionPane.showInputDialog(
            new JFrame(),
            q,
            "get a response",
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