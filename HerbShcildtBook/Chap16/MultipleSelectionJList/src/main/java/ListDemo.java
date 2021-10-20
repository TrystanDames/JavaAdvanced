import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class ListDemo implements ListSelectionListener {

    JList<String> jlst;
    JLabel jlab;
    JScrollPane jscrlp;

    // Create an array of names.
    String names[] = { "Sherry", "Jon", "Rachel",
            "Sasha", "Josselyn",  "Randy",
            "Tom", "Mary", "Ken",
            "Andrew", "Matt", "Todd" };

    ListDemo() {
        // Create a new JFrame container.
        JFrame jfrm = new JFrame("JList Demo");

        // Specify a flow Layout.
        jfrm.setLayout(new FlowLayout());

        // Give the frame an initial size.
        jfrm.setSize(200, 160);

        // Terminate the program when the user closes the application.
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JList.
        jlst = new JList<String>(names);

        // By removing the following line, multiple selection (which
        // is the the default behavior of a JList) will be used.
//    jlst.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Add list to a scroll pane.
        jscrlp = new JScrollPane(jlst);

        // Set the preferred size of the scroll pane.
        jscrlp.setPreferredSize(new Dimension(120, 90));

        // Make a label that displays the selection.
        jlab = new JLabel("Please choose a name");

        // Add list selection handler.
        jlst.addListSelectionListener(this);

        // Add the list and label to the content pane.
        jfrm.add(jscrlp);
        jfrm.add(jlab);

        // Display the frame.
        jfrm.setVisible(true);
    }

    // Handle list selection events.
    public void valueChanged(ListSelectionEvent le) {
        // Get the indices of the changed item.
        int indices[] = jlst.getSelectedIndices();

        // Display the selections, if one or more items
        // was selected.
        if(indices.length != 0) {
            String who = "";

            // Construct a string of the names.
            for(int i : indices)
                who += names[i] + " ";

            jlab.setText("Current selections: " + who);
        }
        else // Othewise, reprompt.
            jlab.setText("Please choose an name");
    }

    public static void main(String args[]) {
        // Create the frame on the event dispatching thread.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ListDemo();
            }
        });
    }
}
