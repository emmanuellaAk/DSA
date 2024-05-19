import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Creation extends JFrame {
    private List<String> story;
    private List<String> verses;
    private JTextArea displayArea;
    private JComboBox<Integer> daySelector;
    private JButton showEventButton;
    private JCheckBox showVerseCheckBox;

    public Creation() {
        // Initialize the creation events and corresponding Bible verses
        story = new ArrayList<>();
        story.add("Day 1: God created light and separated the light from the darkness.");
        story.add("Day 2: God created the sky and separated the waters above from the waters below.");
        story.add("Day 3: God gathered the waters to one place, dry ground appeared, and God created vegetation.");
        story.add("Day 4: God created the sun, moon, and stars to give light to the earth and to govern the day and night.");
        story.add("Day 5: God created the fish and the birds.");
        story.add("Day 6: God created the animals on land and created mankind in His own image.");
        story.add("Day 7: God rested from all His work and blessed the seventh day and made it holy.");

        verses = new ArrayList<>();
        verses.add("Genesis 1:3-5");
        verses.add("Genesis 1:6-8");
        verses.add("Genesis 1:9-13");
        verses.add("Genesis 1:14-19");
        verses.add("Genesis 1:20-23");
        verses.add("Genesis 1:24-31");
        verses.add("Genesis 2:1-3");

        // Setup the frame
        setTitle("Creation Story Viewer");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create components
        displayArea = new JTextArea();
        displayArea.setEditable(false);

        daySelector = new JComboBox<>();
        for (int i = 1; i <= 7; i++) {
            daySelector.addItem(i);
        }

        showEventButton = new JButton("Show Event");
        showVerseCheckBox = new JCheckBox("Show Corresponding Bible Verse");

        // Setup panel for controls
        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());
        controlPanel.add(new JLabel("Select Day:"));
        controlPanel.add(daySelector);
        controlPanel.add(showEventButton);
        controlPanel.add(showVerseCheckBox);

        // Add components to the frame
        add(new JScrollPane(displayArea), BorderLayout.CENTER);
        add(controlPanel, BorderLayout.SOUTH);

        // Add action listener for the button
        showEventButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int day = (Integer) daySelector.getSelectedItem();
                String event = story.get(day - 1);
                displayArea.setText(event);

                if (showVerseCheckBox.isSelected()) {
                    String verse = verses.get(day - 1);
                    displayArea.append("\n\nCorresponding Bible verse: " + verse);
                }
            }
        });
    }

    public static void main(String[] args) {
        // Run the GUI application
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Creation().setVisible(true);
            }
        });
    }
}
