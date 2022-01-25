import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Calendar {
    int month = java.util.Calendar.getInstance().get(java.util.Calendar.MONTH);
    int year = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);;
    JLabel l = new JLabel("", JLabel.CENTER);
    String day = "";
    JDialog calender;
    JButton[] button = new JButton[49];

    public Calendar(JFrame parent) {
        calender = new JDialog();
        calender.setModal(true);
        String[] header = { "Sun", "Mon", "Tue", "Wed", "Thur", "Fri", "Sat" };
        JPanel panel1 = new JPanel(new GridLayout(7, 7));
        panel1.setPreferredSize(new Dimension(430, 120));

        for (int x = 0; x < button.length; x++) {
            final int selection = x;
            button[x] = new JButton();
            button[x].setFocusPainted(false);
            button[x].setBackground(Color.white);
            if (x > 6)
                button[x].addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent ae) {
                        day = button[selection].getActionCommand();
                        calender.dispose();
                    }
                });
            if (x < 7) {
                button[x].setText(header[x]);
                button[x].setForeground(Color.red);
            }
            panel1.add(button[x]);
        }
        JPanel panel2 = new JPanel(new GridLayout(1, 3));
        JButton previous = new JButton("<< Previous");
        previous.setBackground(Color.decode("#40E0D0"));
        previous.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                month--;
                displayDate();
            }
        });
        panel2.add(previous);
        panel2.add(l);
        JButton next = new JButton("Next >>");
        next.setBackground(Color.decode("#40E0D0"));
        next.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                month++;
                displayDate();
            }
        });
        panel2.add(next);
        calender.add(panel1, BorderLayout.CENTER);
        calender.add(panel2, BorderLayout.SOUTH);
        calender.pack();
        calender.setLocationRelativeTo(parent);
        displayDate();
        calender.setVisible(true);
    }

    public void displayDate() {
        for (int x = 7; x < button.length; x++)
            button[x].setText("");
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(
                "MMMM yyyy");
        java.util.Calendar cal = java.util.Calendar.getInstance();
        cal.set(year, month, 1);
        int dayOfWeek = cal.get(java.util.Calendar.DAY_OF_WEEK);
        int daysInMonth = cal.getActualMaximum(java.util.Calendar.DAY_OF_MONTH);
        for (int x = 6 + dayOfWeek, day = 1; day <= daysInMonth; x++, day++)
            button[x].setText("" + day);
        l.setText(sdf.format(cal.getTime()));
        calender.setTitle("Calendar");

    }

    public String setPickedDate() {
        if (day.equals(""))
            return day;
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(
                "dd-MM-yyyy");
        java.util.Calendar cal = java.util.Calendar.getInstance();
        cal.set(year, month, Integer.parseInt(day));
        return sdf.format(cal.getTime());
    }
}

class Picker {
    public static void main(String[] args) {
        JLabel label = new JLabel("Selected Date:");
        final JTextField text = new JTextField(20);
        JButton btn = new JButton("Choose a date");
        btn.setBackground(Color.decode("#40E0D0"));
        JPanel panel = new JPanel();
        panel.add(label);
        panel.add(text);
        panel.add(btn);
        final JFrame f = new JFrame();
        f.getContentPane().add(panel);
        f.pack();
        f.setVisible(true);
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                text.setText(new Calendar(f).setPickedDate());
            }
        });
    }
}