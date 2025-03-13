package Projects_java;
//it is real time clock
import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;
public class RealTimeClock extends JFrame{
        private JLabel timeLabel;
        private JLabel dateLabel;
        private SimpleDateFormat timeFormat;
        private SimpleDateFormat dateFormat;

        public RealTimeClock() {
            setTitle("Ahsnclock");
            setSize(400, 200);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(new GridLayout(2, 1));
            getContentPane().setBackground(Color.BLACK);

            timeFormat = new SimpleDateFormat("HH:mm:ss");
            dateFormat = new SimpleDateFormat("EEEE, MMMM dd, yyyy");

            timeLabel = new JLabel("", SwingConstants.CENTER);
            dateLabel = new JLabel("", SwingConstants.CENTER);

            timeLabel.setForeground(Color.GREEN);
            timeLabel.setFont(new Font("Monospaced", Font.BOLD, 40));

            dateLabel.setForeground(Color.GREEN);
            dateLabel.setFont(new Font("Monospaced", Font.BOLD, 20));

            add(timeLabel);
            add(dateLabel);

            setVisible(true);
            startClock();
        }

        private void startClock() {
            Timer timer = new Timer(1000, e -> {
                Date now = new Date();
                timeLabel.setText(timeFormat.format(now));
                dateLabel.setText(dateFormat.format(now));
            });
            timer.start();
        }

        public static void main(String[] args) {
            SwingUtilities.invokeLater(RealTimeClock::new);
        }
    }
