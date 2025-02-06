package pj;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;
public class TimeCounter extends Puzzle{



    public TimeCounter() {

        CounterLabel = new JLabel("");
        CounterLabel.setBounds(300, 20, 200, 100);

        CounterLabel.setFont(font1);


    add(CounterLabel);

        second = 0;
        minute = 0;
        Timer1();
        timer.start();
    }

    public void Timer1() {
        timer = new Timer(1000, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                second++;
                CounterLabel.setText("Time "+minute+":"+second);
                if(second == 60) {
                    second = 0;
                    minute++;
                    CounterLabel.setText("Time : "+minute+":"+second);
                }
            }
        });
    }

}