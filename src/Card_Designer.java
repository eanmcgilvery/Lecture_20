import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;


public class Card_Designer extends JFrame implements ActionListener {

    private JMenuBar mainBar = new JMenuBar();

    private JMenu menu1 = new JMenu("File");
    private JMenu menu2 = new JMenu("Select");
    private JMenu menu3 = new JMenu("Colors");
    private JMenu menu4 = new JMenu("Font");

    private JMenuItem exitItem = new JMenuItem("Exit");

    private JMenuItem home = new JMenuItem("Home");
    private JMenuItem congratsCard = new JMenuItem("Congratulations Card");
    private JMenuItem birthdayCard = new JMenuItem("Birthday Card");

    private JMenuItem yellow = new JMenuItem("Yellow");
    private JMenuItem blue = new JMenuItem("Blue");
    private JMenuItem red = new JMenuItem("Red");
    private JMenuItem green = new JMenuItem("Green");
    private JMenuItem cyan = new JMenuItem("Cyan");

    private JMenuItem arial = new JMenuItem("Arial");

    private JPanel card1 = new JPanel(new GridLayout(3,1,5,5));
    private JPanel bPanel = new JPanel(new GridLayout());
    private JPanel hPanel = new JPanel(new GridLayout());

    private JLabel header = new JLabel("Card Designer Application");
    private JTextField nameOfBirthday = new JTextField("\"Please Enter the Recipient's Name\"");
    private JLabel initialMessage = new JLabel("Then Get Started By Making Selections From the Menu.");

    //Cards
    private JPanel enteredMessage = new JPanel(new FlowLayout());
    private JTextArea message = new JTextArea("Enter your message here");

    CardLayout myCardLayout = new CardLayout();

    public Card_Designer(){
        super("Pimp my JFrame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(675,375);


        setLayout(myCardLayout);

        //Initalizes main menu bar onto the screen
        //Wont show if it isnt populated
        setJMenuBar(mainBar);

        header.setFont(new Font("Arial", Font.BOLD, 22));
        nameOfBirthday.setFont(new Font("Arial", Font.ITALIC, 22));
        mainBar.add(menu1);
        mainBar.add(menu2);
        mainBar.add(menu3);
        mainBar.add(menu4);

        menu1.add(exitItem);
        menu2.add(home);
        menu2.add(congratsCard);
        menu2.add(birthdayCard);
        menu3.add(yellow);
        menu3.add(blue);
        menu3.add(red);
        menu3.add(green);
        menu3.add(cyan);
        menu4.add(arial);

        card1.add(header);
        card1.add(nameOfBirthday);
        card1.add(initialMessage);
        add(card1, "Initial Card");

        hPanel.add(enteredMessage);
        hPanel.add(message);
        add(hPanel, "Happy Birthday Card");

        bPanel.add(enteredMessage);
        bPanel.add(message);
        add(bPanel, "Congrats Card");

        exitItem.addActionListener(this);
        home.addActionListener(this);
        congratsCard.addActionListener(this);
        birthdayCard.addActionListener(this);

        red.addActionListener(this);
        blue.addActionListener(this);
        green.addActionListener(this);
        cyan.addActionListener(this);
        yellow.addActionListener(this);

        arial.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        Container con = getContentPane();

        if (source == exitItem)
            super.dispose();
        if( source == congratsCard){
            myCardLayout.show(getContentPane(), "Congrats Card");
        }
        if( source == birthdayCard){
            myCardLayout.show(getContentPane(), "Happy Birthday Card");
        }
        if (source == yellow){
            con.setBackground(Color.YELLOW);
        }
        if (source == green){
            con.setBackground(Color.GREEN);
        }
        if (source == blue){
            con.setBackground(Color.BLUE);
        }
        if (source == red){
            con.setBackground(Color.RED);
        }
        if (source == cyan){
            con.setBackground(Color.CYAN);
        }
    }

}
