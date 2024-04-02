import java.awt.*;
import java.awt.event.*;

public class DateSelector extends Frame implements ItemListener {
    private Choice dayChoice, monthChoice, yearChoice;
    private Label selectedDateLabel;

    public DateSelector() {
        setTitle("Date Selector");
        setSize(300, 150);
        setLayout(null);
        setBackground( Color.blue);

        Label dayLabel = new Label("Day:");
        dayLabel.setBounds(20, 50, 50, 20);
        add(dayLabel);

        dayChoice = new Choice();
        dayChoice.setBounds(80, 50, 50, 20);
        for (int i = 1; i <= 31; i++) {
            dayChoice.add(String.valueOf(i));
        }
        add(dayChoice);

        Label monthLabel = new Label("Month:");
        monthLabel.setBounds(140, 50, 50, 20);
        add(monthLabel);

        monthChoice = new Choice();
        monthChoice.setBounds(200, 50, 100, 20);
        for (int i = 1; i <= 12; i++) {
            monthChoice.add(String.valueOf(i));
        }
        add(monthChoice);

        Label yearLabel = new Label("Year:");
        yearLabel.setBounds(20, 80, 50, 20);
        add(yearLabel);

        yearChoice = new Choice();
        yearChoice.setBounds(80, 80, 100, 20);
        for (int i = 1990; i <= 2050; i++) {
            yearChoice.add(String.valueOf(i));
        }
        add(yearChoice);

        selectedDateLabel = new Label("Selected Date: 01/01/2000");
        selectedDateLabel.setBounds(20, 110, 200, 20);
        add(selectedDateLabel);

        dayChoice.addItemListener(this);
        monthChoice.addItemListener(this);
        yearChoice.addItemListener(this);

        setVisible(true);
    }

    public void itemStateChanged(ItemEvent e) {
        String selectedDay = dayChoice.getSelectedItem();
        String selectedMonth = monthChoice.getSelectedItem();
        String selectedYear = yearChoice.getSelectedItem();

        selectedDateLabel.setText("Selected Date: " + selectedDay + "/" + selectedMonth + "/" + selectedYear);
    }

    public static void main(String[] args) {
        new DateSelector();
    }
}
