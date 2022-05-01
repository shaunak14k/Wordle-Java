import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class MainWordle extends JFrame{
    private JPanel wordsPanel1;
    private static JTextField word1TextField;
    private static JTextField w01;
    private static JTextField w02;
    private static JTextField w03;
    private static JTextField w04;
    private JTextField word2TextField;
    private JTextField w11;
    private JTextField w12;
    private JTextField w13;
    private JTextField w14;
    private JTextField word3TextField;
    private JTextField w21;
    private JTextField w22;
    private JTextField w23;
    private JTextField w24;
    private JTextField word4TextField;
    private JTextField w31;
    private JTextField w32;
    private JTextField w33;
    private JTextField w34;
    private JTextField word5TextField;
    private JTextField w41;
    private JTextField w42;
    private JTextField w43;
    private JTextField w44;
    private JTextField word6TextFIeld;
    private JTextField w51;
    private JTextField w52;
    private JTextField w53;
    private JTextField w54;

    private JLabel word1Label1;
    private JLabel word1Label2;
    private JLabel word1Label3;
    private JLabel word1Label4;
    private JLabel word1Label5;

    private JLabel word2Label1;
    private JLabel word2Label2;
    private JLabel word2Label3;
    private JLabel word2Label4;
    private JLabel word2Label5;


    static String word1="";
    String word2;
    String word3;
    String word4;
    String word5;
    String word6;
    static String word_for_wordle;

    URL wordFileURL;
    BufferedReader br;
    MainWordle() throws IOException {
        //wordsPanel1.setBounds(5,5,500,75);

        wordsPanel1 = new JPanel();
        wordsPanel1.setBounds(1,1,500,500);

        setPropertiesForWords();

        //word1TextField.addActionListener((ActionListener) this);

        setContentPane(wordsPanel1);
        setTitle("Wordlle Clone");
        setLayout(null);
        setSize(600,700);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        //setLayout(null);


//        java.UppercaseDocumentFilter filter = new java.UppercaseDocumentFilter();
//        ((AbstractDocument)word1TextField.getDocument()).setDocumentFilter(filter);

    }

    public void setPropertiesForWords()
    {
        Font wordFont = new Font("SansSerif", Font.BOLD, 40);

        // 1st ROW
        int XAxis=80;


//        word1TextField.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent arg0) {
//
//            }
//        });

        int YAxis = 8+80;

        word1TextField = new JTextField();
        word1TextField.setBounds(XAxis,5,75*5,75);
        word1TextField.setHorizontalAlignment(JTextField.CENTER);
        word1TextField.setFont(wordFont);

        // FORMAT INPUT TO CAPITAL LETTERS
        word1TextField.addKeyListener(new KeyAdapter() {

            public void keyTyped(KeyEvent e) {
                char keyChar = e.getKeyChar();
                if (Character.isLowerCase(keyChar)) {
                    e.setKeyChar(Character.toUpperCase(keyChar));
                }
            }

        });

        // 2nd ROW
        YAxis = 8+80;
        XAxis=80;

        word2TextField = new JTextField();
        word2TextField.setBounds(XAxis, YAxis,75*5,75);
        word2TextField.setHorizontalAlignment(JTextField.CENTER);
        word2TextField.setFont(wordFont);

        // FORMAT INPUT TO CAPITAL LETTERS
        word2TextField.addKeyListener(new KeyAdapter() {

            public void keyTyped(KeyEvent e) {
                char keyChar = e.getKeyChar();
                if (Character.isLowerCase(keyChar)) {
                    e.setKeyChar(Character.toUpperCase(keyChar));
                }
            }

        });


        //3rd ROW
        YAxis=8+80+80;
        XAxis=80;

        word3TextField = new JTextField();
        word3TextField.setBounds(XAxis, YAxis,75*5,75);
        word3TextField.setHorizontalAlignment(JTextField.CENTER);
        word3TextField.setFont(wordFont);

        // FORMAT INPUT TO CAPITAL LETTERS
        word3TextField.addKeyListener(new KeyAdapter() {

            public void keyTyped(KeyEvent e) {
                char keyChar = e.getKeyChar();
                if (Character.isLowerCase(keyChar)) {
                    e.setKeyChar(Character.toUpperCase(keyChar));
                }
            }

        });


        //4rd ROW
        YAxis=8+80+80+80;
        XAxis=80;

        word4TextField = new JTextField();
        word4TextField.setBounds(XAxis, YAxis,75*5,75);
        word4TextField.setHorizontalAlignment(JTextField.CENTER);
        word4TextField.setFont(wordFont);

        // FORMAT INPUT TO CAPITAL LETTERS
        word4TextField.addKeyListener(new KeyAdapter() {

            public void keyTyped(KeyEvent e) {
                char keyChar = e.getKeyChar();
                if (Character.isLowerCase(keyChar)) {
                    e.setKeyChar(Character.toUpperCase(keyChar));
                }
            }

        });

        //5th ROW
        YAxis=8+80+80+80+80;
        XAxis=80;

        word5TextField = new JTextField();
        word5TextField.setBounds(XAxis, YAxis,75*5,75);
        word5TextField.setHorizontalAlignment(JTextField.CENTER);
        word5TextField.setFont(wordFont);

        // FORMAT INPUT TO CAPITAL LETTERS
        word5TextField.addKeyListener(new KeyAdapter() {

            public void keyTyped(KeyEvent e) {
                char keyChar = e.getKeyChar();
                if (Character.isLowerCase(keyChar)) {
                    e.setKeyChar(Character.toUpperCase(keyChar));
                }
            }

        });


        //6th ROW
        YAxis=8+80+80+80+80+80;
        XAxis=80;

        word6TextFIeld = new JTextField();
        word6TextFIeld.setBounds(XAxis, YAxis,75*5,75);
        word6TextFIeld.setHorizontalAlignment(JTextField.CENTER);
        word6TextFIeld.setFont(wordFont);

        // FORMAT INPUT TO CAPITAL LETTERS
        word6TextFIeld.addKeyListener(new KeyAdapter() {

            public void keyTyped(KeyEvent e) {
                char keyChar = e.getKeyChar();
                if (Character.isLowerCase(keyChar)) {
                    e.setKeyChar(Character.toUpperCase(keyChar));
                }
            }

        });

        //set 1 character limit
        word1TextField.setDocument(new JTextFieldLimit(5));
        word2TextField.setDocument(new JTextFieldLimit(5));
        word3TextField.setDocument(new JTextFieldLimit(5));
        word4TextField.setDocument(new JTextFieldLimit(5));
        word5TextField.setDocument(new JTextFieldLimit(5));
        word6TextFIeld.setDocument(new JTextFieldLimit(5));


        //Add to panel
        wordsPanel1.add(word1TextField);
        wordsPanel1.add(word2TextField);
        wordsPanel1.add(word3TextField);
        wordsPanel1.add(word4TextField);
        wordsPanel1.add(word5TextField);
        wordsPanel1.add(word6TextFIeld);




        // FIRST WORD LABEL
        YAxis=5;
        XAxis=80;

        word1Label1 = new JLabel();
        word1Label1.setBounds(XAxis,5,75,75);
        word1Label1.setFont(new Font("Serif", Font.PLAIN, 50));
        word1Label1.setHorizontalAlignment(JLabel.CENTER);
        word1Label1.setVisible(false);
        wordsPanel1.add(word1Label1);

        word1Label2 = new JLabel();
        word1Label2.setBounds(XAxis+=80,5,75,75);
        word1Label2.setFont(new Font("Serif", Font.PLAIN, 50));
        word1Label2.setHorizontalAlignment(JLabel.CENTER);
        word1Label2.setVisible(false);
        wordsPanel1.add(word1Label2);

        word1Label3 = new JLabel();
        word1Label3.setBounds(XAxis+=80,5,75,75);
        word1Label3.setFont(new Font("Serif", Font.PLAIN, 50));
        word1Label3.setHorizontalAlignment(JLabel.CENTER);
        word1Label3.setVisible(false);
        wordsPanel1.add(word1Label3);

        word1Label4 = new JLabel();
        word1Label4.setBounds(XAxis+=80,5,75,75);
        word1Label4.setFont(new Font("Serif", Font.PLAIN, 50));
        word1Label4.setHorizontalAlignment(JLabel.CENTER);
        word1Label4.setVisible(false);
        wordsPanel1.add(word1Label4);

        word1Label5 = new JLabel();
        word1Label5.setBounds(XAxis+=80,5,75,75);
        word1Label5.setFont(new Font("Serif", Font.PLAIN, 50));
        word1Label5.setHorizontalAlignment(JLabel.CENTER);
        word1Label5.setVisible(false);
        wordsPanel1.add(word1Label5);



        // SECOND WORD LABEL ***********
        YAxis=8+80;
        XAxis=80;

        word2Label1 = new JLabel();
        word2Label1.setBounds(XAxis,YAxis,75,75);
        word2Label1.setFont(new Font("Serif", Font.PLAIN, 50));
        word2Label1.setHorizontalAlignment(JLabel.CENTER);
        word2Label1.setVisible(false);
        wordsPanel1.add(word1Label1);

        word2Label2 = new JLabel();
        word2Label2.setBounds(XAxis+=80,YAxis,75,75);
        word2Label2.setFont(new Font("Serif", Font.PLAIN, 50));
        word2Label2.setHorizontalAlignment(JLabel.CENTER);
        word2Label2.setVisible(false);
        wordsPanel1.add(word1Label2);

        word2Label3 = new JLabel();
        word2Label3.setBounds(XAxis+=80,YAxis,75,75);
        word2Label3.setFont(new Font("Serif", Font.PLAIN, 50));
        word2Label3.setHorizontalAlignment(JLabel.CENTER);
        word2Label3.setVisible(false);
        wordsPanel1.add(word1Label3);

        word2Label4 = new JLabel();
        word2Label4.setBounds(XAxis+=80,YAxis,75,75);
        word2Label4.setFont(new Font("Serif", Font.PLAIN, 50));
        word2Label4.setHorizontalAlignment(JLabel.CENTER);
        word2Label4.setVisible(false);
        wordsPanel1.add(word1Label4);

        word2Label5 = new JLabel();
        word2Label5.setBounds(XAxis+=80,YAxis,75,75);
        word2Label5.setFont(new Font("Serif", Font.PLAIN, 50));
        word2Label5.setHorizontalAlignment(JLabel.CENTER);
        word2Label5.setVisible(false);
        wordsPanel1.add(word1Label5);
    }

    public static void main(String args[]) throws IOException {

        word_for_wordle = "TODAY";

        MainWordle frame = new MainWordle();

       // word1 = word1TextField.getText() + w01.getText() + w02.getText() + w03.getText() + w04.getText();

        frame.checkForWordValidity();

        System.out.println(word1);




    }

    void checkForWordValidity()
    {
        word1 = "";
        word2 = "";

        word1TextField.addKeyListener(new KeyAdapter()
        {
             public void keyPressed(KeyEvent e)
             {
                 int key = e.getKeyCode();

                 boolean wordFlag=false;
                 if (key == KeyEvent.VK_ENTER)
                 {
                    word1 = word1TextField.getText();
                     String st;

                     try {
                         wordFileURL = new URL("https://raw.githubusercontent.com/charlesreid1/five-letter-words/master/sgb-words.txt");
                     } catch (MalformedURLException ex) {
                         throw new RuntimeException(ex);
                     }
                     try {
                         Scanner s = new Scanner(wordFileURL.openStream());
                     } catch (IOException ex) {
                         throw new RuntimeException(ex);
                     }
                     try {
                         br = new BufferedReader(new InputStreamReader(wordFileURL.openStream()));
                     } catch (IOException ex) {
                         throw new RuntimeException(ex);
                     }

                     while (true)
                     {
                         try {
                             if (!((st = br.readLine()) != null)) break;
                         } catch (IOException ex) {
                             throw new RuntimeException(ex);
                         }
                         //System.out.println(st);

                         if(st.equalsIgnoreCase(word1))
                         {
                             wordFlag=true;
                             break;
                         }

                     }
                     if(wordFlag==false)
                     {
                         Toolkit.getDefaultToolkit().beep();
                         JFrame dialogFrame = new JFrame();
                         JOptionPane.showMessageDialog(dialogFrame,"Word does not exist");
                         return;
                     }

                    word1TextField.setVisible(false);

                    word1 = word1.toUpperCase();
                    word_for_wordle = word_for_wordle.toUpperCase();

                    Border border = BorderFactory.createLineBorder(Color.black, 1);
                    word1Label1.setBorder(border);
                     word1Label2.setBorder(border);
                     word1Label3.setBorder(border);
                     word1Label4.setBorder(border);
                     word1Label5.setBorder(border);


                    // FOR FIRST WORD ***********************
                    // LETTER 1
                    if(word1.charAt(0) == word_for_wordle.charAt(0))
                    {
                        word1Label1.setOpaque(true);
                        word1Label1.setBackground(Color.green);
                        word1Label1.setText(String.valueOf(word1.charAt(0)));
                    }
                    else if(word_for_wordle.indexOf(word1.charAt(0))!=-1)
                    {
                        word1Label1.setOpaque(true);
                        word1Label1.setBackground(Color.yellow);
                        word1Label1.setText(String.valueOf(word1.charAt(0)));
                    }
                    else
                    {
                        word1Label1.setText(String.valueOf(word1.charAt(0)));
                    }

                    // LETTER 2
                    if(word1.charAt(1) == word_for_wordle.charAt(1))
                    {
                        word1Label2.setOpaque(true);
                        word1Label2.setBackground(Color.green);
                        word1Label2.setText(String.valueOf(word1.charAt(1)));
                    }
                    else if(word_for_wordle.indexOf(word1.charAt(1))!=-1)
                    {
                        word1Label2.setOpaque(true);
                        word1Label2.setBackground(Color.yellow);
                        word1Label2.setText(String.valueOf(word1.charAt(1)));
                    }
                    else
                    {
                        word1Label2.setText(String.valueOf(word1.charAt(1)));
                    }

                    // LETTER 3
                    if(word1.charAt(2) == word_for_wordle.charAt(2))
                    {
                        word1Label3.setOpaque(true);
                        word1Label3.setBackground(Color.green);
                        word1Label3.setText(String.valueOf(word1.charAt(2)));
                    }
                    else if(word_for_wordle.indexOf(word1.charAt(2))!=-1)
                    {
                        word1Label3.setOpaque(true);
                        word1Label3.setBackground(Color.yellow);
                        word1Label3.setText(String.valueOf(word1.charAt(2)));
                    }
                    else
                    {
                        word1Label3.setText(String.valueOf(word1.charAt(2)));
                    }

                    // LETTER 4
                    if(word1.charAt(3) == word_for_wordle.charAt(3))
                    {
                     word1Label4.setOpaque(true);
                     word1Label4.setBackground(Color.green);
                     word1Label4.setText(String.valueOf(word1.charAt(3)));
                    }
                    else if(word_for_wordle.indexOf(word1.charAt(3))!=-1)
                    {
                        word1Label4.setOpaque(true);
                        word1Label4.setBackground(Color.yellow);
                        word1Label4.setText(String.valueOf(word1.charAt(3)));
                    }
                    else
                    {
                        word1Label4.setText(String.valueOf(word1.charAt(3)));
                    }

                    // LETTER 5
                    if(word1.charAt(4) == word_for_wordle.charAt(4))
                    {
                     word1Label5.setOpaque(true);
                     word1Label5.setBackground(Color.green);
                     word1Label5.setText(String.valueOf(word1.charAt(4)));
                    }
                    else if(word_for_wordle.indexOf(word1.charAt(4))!=-1)
                     {
                         word1Label4.setOpaque(true);
                         word1Label5.setBackground(Color.yellow);
                         word1Label5.setText(String.valueOf(word1.charAt(4)));
                     }
                     else
                     {
                         word1Label5.setText(String.valueOf(word1.charAt(4)));
                     }

                    word1Label1.setVisible(true);
                    word1Label2.setVisible(true);
                     word1Label3.setVisible(true);
                     word1Label4.setVisible(true);
                     word1Label5.setVisible(true);



                    word2TextField.requestFocus();

                 }
             }
        });

        word2TextField.addKeyListener(new KeyAdapter()
        {
            public void keyPressed(KeyEvent e)
            {
                int key = e.getKeyCode();

                boolean wordFlag=false;
                if (key == KeyEvent.VK_ENTER)
                {
                    word2 = word2TextField.getText();
                    String st;

                    try {
                        wordFileURL = new URL("https://raw.githubusercontent.com/charlesreid1/five-letter-words/master/sgb-words.txt");
                    } catch (MalformedURLException ex) {
                        throw new RuntimeException(ex);
                    }
                    try {
                        Scanner s = new Scanner(wordFileURL.openStream());
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    try {
                        br = new BufferedReader(new InputStreamReader(wordFileURL.openStream()));
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }

                    while (true)
                    {
                        try {
                            if (!((st = br.readLine()) != null)) break;
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);
                        }
                        //System.out.println(st);

                        if(st.equalsIgnoreCase(word2))
                        {
                            wordFlag=true;
                            break;
                        }

                    }
                    if(wordFlag==false)
                    {
                        Toolkit.getDefaultToolkit().beep();
                        JFrame dialogFrame = new JFrame();
                        JOptionPane.showMessageDialog(dialogFrame,"Word does not exist");
                        return;
                    }

                    word2TextField.setVisible(false);

                    //word2 = word2.toUpperCase();
                    //word_for_wordle = word_for_wordle.toUpperCase();

                    Border border = BorderFactory.createLineBorder(Color.black, 1);
                    word2Label1.setBorder(border);
                    word2Label2.setBorder(border);
                    word2Label3.setBorder(border);
                    word2Label4.setBorder(border);
                    word2Label5.setBorder(border);


                    // FOR FIRST WORD ***********************
                    // LETTER 1
                    if(word2.charAt(0) == word_for_wordle.charAt(0))
                    {
                        word2Label1.setOpaque(true);
                        word2Label1.setBackground(Color.green);
                        word2Label1.setText(String.valueOf(word2.charAt(0)));
                    }
                    else if(word_for_wordle.indexOf(word2.charAt(0))!=-1)
                    {
                        word2Label1.setOpaque(true);
                        word2Label1.setBackground(Color.yellow);
                        word2Label1.setText(String.valueOf(word2.charAt(0)));
                    }
                    else
                    {
                        word2Label1.setText(String.valueOf(word2.charAt(0)));
                    }

                    // LETTER 2
                    if(word2.charAt(1) == word_for_wordle.charAt(1))
                    {
                        word2Label2.setOpaque(true);
                        word2Label2.setBackground(Color.green);
                        word2Label2.setText(String.valueOf(word2.charAt(1)));
                    }
                    else if(word_for_wordle.indexOf(word2.charAt(1))!=-1)
                    {
                        word2Label2.setOpaque(true);
                        word2Label2.setBackground(Color.yellow);
                        word2Label2.setText(String.valueOf(word2.charAt(1)));
                    }
                    else
                    {
                        word2Label2.setText(String.valueOf(word2.charAt(1)));
                    }

                    // LETTER 3
                    if(word2.charAt(2) == word_for_wordle.charAt(2))
                    {
                        word2Label3.setOpaque(true);
                        word2Label3.setBackground(Color.green);
                        word2Label3.setText(String.valueOf(word2.charAt(2)));
                    }
                    else if(word_for_wordle.indexOf(word2.charAt(2))!=-1)
                    {
                        word2Label3.setOpaque(true);
                        word2Label3.setBackground(Color.yellow);
                        word2Label3.setText(String.valueOf(word2.charAt(2)));
                    }
                    else
                    {
                        word2Label3.setText(String.valueOf(word2.charAt(2)));
                    }

                    // LETTER 4
                    if(word2.charAt(3) == word_for_wordle.charAt(3))
                    {
                        word2Label4.setOpaque(true);
                        word2Label4.setBackground(Color.green);
                        word2Label4.setText(String.valueOf(word2.charAt(3)));
                    }
                    else if(word_for_wordle.indexOf(word2.charAt(3))!=-1)
                    {
                        word2Label4.setOpaque(true);
                        word2Label4.setBackground(Color.yellow);
                        word2Label4.setText(String.valueOf(word2.charAt(3)));
                    }
                    else
                    {
                        word2Label4.setText(String.valueOf(word2.charAt(3)));
                    }

                    // LETTER 5
                    if(word2.charAt(4) == word_for_wordle.charAt(4))
                    {
                        word2Label5.setOpaque(true);
                        word2Label5.setBackground(Color.green);
                        word2Label5.setText(String.valueOf(word2.charAt(4)));
                    }
                    else if(word_for_wordle.indexOf(word2.charAt(4))!=-1)
                    {
                        word2Label4.setOpaque(true);
                        word2Label5.setBackground(Color.yellow);
                        word2Label5.setText(String.valueOf(word2.charAt(4)));
                    }
                    else
                    {
                        word2Label5.setText(String.valueOf(word2.charAt(4)));
                    }

                    word2Label1.setVisible(true);
                    word2Label2.setVisible(true);
                    word2Label3.setVisible(true);
                    word2Label4.setVisible(true);
                    word2Label5.setVisible(true);


                    word3TextField.requestFocus();

                }
            }
        });



    }



    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
