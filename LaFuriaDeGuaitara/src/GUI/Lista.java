/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author jdoli
 */
public class Lista extends JList<String> implements ListSelectionListener{
    private JList l = new JList();
    private JButton b = new JButton();
    private DefaultListModel listModel;
    
    public void valueChanged(ListSelectionEvent e) {
        if (e.getValueIsAdjusting() == false) {
            if (l.getSelectedIndex() == -1) {
            //No selection, disable fire button.
                b.setEnabled(false);
            } else {
            //Selection, enable the fire button.
             b.setEnabled(true);
            }
        }
    }
    
    
    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //This method can be called only if
            //there's a valid selection
            //so go ahead and remove whatever's selected.
            int index = l.getSelectedIndex();
            listModel.remove(index);

            int size = listModel.getSize();

            if (size == 0) { //Nobody's left, disable firing.
                b.setEnabled(false);

            } else { //Select an index.
                if (index == listModel.getSize()) {
                    //removed item in last position
                    index--;
                }

                l.setSelectedIndex(index);
                l.ensureIndexIsVisible(index);
            }
        }
    }
}
