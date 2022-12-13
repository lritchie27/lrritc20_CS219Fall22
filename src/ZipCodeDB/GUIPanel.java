/*
    Logan Ritchie
    Final Exam
    12/13/2022
 */

package ZipCodeDB;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// JPanel is the "base class". GUIPanel is the "derived" class.

public class GUIPanel extends JPanel{
    private JTextField zipcode;
    private JButton submit;
    private JTextArea output;
    private Database db;  // The zipcode database
    private JButton northernmost;

    public GUIPanel() {
        this.zipcode = new JTextField("zipcode", 7);
        this.add(this.zipcode);

        this.submit = new JButton("Submit");
        this.add(this.submit);
        this.submit.addActionListener(new SubmitButtonListener());

        this.output = new JTextArea(5, 20);
        this.add(this.output);

        this.db = new Database();  // load the zipcodes

        this.northernmost = new JButton("Northernmost");
        this.add(this.northernmost);
        this.northernmost.addActionListener(new northernmostButtonListener());
    }

    class SubmitButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // function will get called when the user presses submit

            // get the zipcode out of the text field
            String code = zipcode.getText();

            Zipcode zc = db.search(code);
            WeatherObservation wob = zc.getWeatherData();
            output.setText(wob.toString());
            System.out.println(wob);

        }
    }

    class northernmostButtonListener implements ActionListener {
        // function will get called when the user presses maxLat

        public void actionPerformed(ActionEvent e) {
            // function will get called when the user presses maxLat

            // find zipcode of northernmost latitude
            Zipcode zc = db.getNorthern();

            // find weather data for that zipcode
            WeatherObservation wob = zc.getWeatherData();

            // put info on the output box on JPanel
            output.setText(zc + "\n" + wob.toString());

            // print to the console
            System.out.println(zc);
            System.out.println(wob);

        }

    }
}
