//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//import java.awt.Color;
//
//public class Lecture extends JFrame implements ActionListener {
//
//    private JMenuBar mainBar = new JMenuBar();
//
//    private JMenu menu1 = new JMenu("File");
//    private JMenu menu2 = new JMenu("Colors");
//
//    private JMenuItem exitItem = new JMenuItem("Exit");
//    private JMenuItem yellow = new JMenuItem("Yellow");
//
//    public Lecture(){
//        super("Menu Demo");
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setSize(300,300);
//        setLayout(new FlowLayout());
//
//        //Initalizes main menu bar onto the screen
//        //Wont show if it isnt populated
//        setJMenuBar(mainBar);
//
//        mainBar.add(menu1);
//        mainBar.add(menu2);
//
//        menu1.add(menu2);
//        menu2.add(yellow);
//        menu2.add(exitItem);
//
//        exitItem.addActionListener(this);
//        yellow.addActionListener(this);
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        Object source = e.getSource();
//        Container con = getContentPane();
//
//        if (source == exitItem)
//            super.dispose();
//        else if (source == yellow){
//            con.setBackground(Color.YELLOW);
//        }
//    }
//}
