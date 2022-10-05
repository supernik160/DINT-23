/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JTextField;

/**
 *
 * @author usuario
 */
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class LimiteLonxitudeJTextField extends PlainDocument {

    private int lonxitude;

    public LimiteLonxitudeJTextField(int lonxitude) {
        super();
        this.lonxitude = lonxitude;
    }

    @Override
    public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
        if (str == null) {
            return;
        }
        if ((getLength() + str.length()) <= lonxitude) {
            super.insertString(offset, str, attr);
        }
    }
}
