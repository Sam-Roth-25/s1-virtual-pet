package testStuff;

import javax.swing.*;

public class test {
public static int main(String[] args) {
    Object[] options = {
        "Yes",
        "No"};
    int n = JOptionPane.showOptionDialog(new JFrame(),
    "Is the world turning?",
    "Q1",
    JOptionPane.YES_NO_OPTION,
    JOptionPane.QUESTION_MESSAGE,
    null,
    options,
    options[1]);
    return n;
    }
}
