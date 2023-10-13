/* Virtual Pet, version 1
 * 
 * @author Cam
 * @author ?
 */

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VirtualPet {
    
    VirtualPetFace face;
    int hunger = 0;   // how hungry the pet is.
    
    // constructor
    public VirtualPet() {
        face = new VirtualPetFace();
        face.setImage("normal");
        face.setMessage("Hello.");
    }
    
    public void feed() {
        if (hunger > 10) {
            hunger = hunger - 10;
        } else {
            hunger = 0;
        }
        face.setMessage("Yum, thanks");
        face.setImage("normal");
    }
    
    public void exercise() {
        hunger = hunger + 3;
        face.setMessage("1, 2, 3, jump.  Whew.");
        face.setImage("tired");
    }
    
    public void sleep() {
        hunger = hunger + 1;
        face.setImage("asleep");
    }

    public void death(){
        face.setImage("skeleton");
    }
    public void angel(){
        face.setImage("angel");
    }

    public int dialog(String answerA, String answerB, String question, String title){
        Object[] options = {answerA, answerB};
        int n = JOptionPane.showOptionDialog(new JFrame(),
        question,
        title,
        JOptionPane.YES_NO_OPTION,
        JOptionPane.QUESTION_MESSAGE,
        null,
        options,
        options[1]);
        return n;
    }

    public void message(String message, String title){
        JOptionPane.showMessageDialog(new JFrame(),
    message, title,
    JOptionPane.PLAIN_MESSAGE);
    }

} // end Virtual Pet
