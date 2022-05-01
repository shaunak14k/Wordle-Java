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

public class MainWordle extends JFrame
{
    private JPanel wordsPanel1; // THe panel on which words will be printed

    // *** ALL THE TEXT FIELDS
    private static JTextField word1TextField;
    private JTextField word2TextField;

    private JTextField word3TextField;

    private JTextField word4TextField;

    private JTextField word5TextField;

    private JTextField word6TextField;

    // ALL THE JLABELS
    // WORD 1
    private JLabel word1Label1;
    private JLabel word1Label2;
    private JLabel word1Label3;
    private JLabel word1Label4;
    private JLabel word1Label5;

    // WORD 2
    private JLabel word2Label1;
    private JLabel word2Label2;
    private JLabel word2Label3;
    private JLabel word2Label4;
    private JLabel word2Label5;

    // WORD 3
    private JLabel word3Label1;
    private JLabel word3Label2;
    private JLabel word3Label3;
    private JLabel word3Label4;
    private JLabel word3Label5;

    // WORD 4
    private JLabel word4Label1;
    private JLabel word4Label2;
    private JLabel word4Label3;
    private JLabel word4Label4;
    private JLabel word4Label5;

    // WORD 5
    private JLabel word5Label1;
    private JLabel word5Label2;
    private JLabel word5Label3;
    private JLabel word5Label4;
    private JLabel word5Label5;

    // WORD 6
    private JLabel word6Label1;
    private JLabel word6Label2;
    private JLabel word6Label3;
    private JLabel word6Label4;
    private JLabel word6Label5;



    String word1;
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

        //generate a random integer for random line number in text file
        int min = 1,max=5757;
        int randomLineNumber = (int)(Math.random()*(max-min+1)+min);

        System.out.println("Random number : "+randomLineNumber);

        //Take the word that is at randomLineNumber and that word will be the word for the game


            wordFileURL = new URL("https://raw.githubusercontent.com/charlesreid1/five-letter-words/master/sgb-words.txt");

            Scanner s = new Scanner(wordFileURL.openStream());

            BufferedReader br1 = new BufferedReader(new InputStreamReader(wordFileURL.openStream()));

        String st="";
        for(int i=0; i<randomLineNumber; i++)
        {
            st = br1.readLine();
        }

        // THIS WILL BE THE WORD FOR THE GAME
        word_for_wordle = st;


        setContentPane(wordsPanel1);
        setTitle("Wordlle Clone");
        setLayout(null);
        setSize(715,800);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        //setLayout(null);


    }

    public void setPropertiesForWords()
    {
        Font wordFont = new Font("SansSerif", Font.BOLD, 40);

        // 1st ROW
        int XAxis = 160;
        int YAxis = 15;

        word1TextField = new JTextField();
        word1TextField.setBounds(160,YAxis,375,75);
        word1TextField.setHorizontalAlignment(JTextField.CENTER);
        word1TextField.setFont(wordFont);
        word1TextField.setEditable(true);

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
        YAxis +=80;
        XAxis = 160;

        word2TextField = new JTextField();
        word2TextField.setBounds(XAxis, YAxis,375,75);
        word2TextField.setHorizontalAlignment(JTextField.CENTER);
        word2TextField.setFont(wordFont);
        word2TextField.setEditable(false);

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
        YAxis+=80;
        XAxis=160;

        word3TextField = new JTextField();
        word3TextField.setBounds(XAxis, YAxis,375,75);
        word3TextField.setHorizontalAlignment(JTextField.CENTER);
        word3TextField.setFont(wordFont);
        word3TextField.setEditable(false);

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
        YAxis+=80;
        XAxis=160;

        word4TextField = new JTextField();
        word4TextField.setBounds(XAxis, YAxis,375,75);
        word4TextField.setHorizontalAlignment(JTextField.CENTER);
        word4TextField.setFont(wordFont);
        word4TextField.setEditable(false);

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
        YAxis+=80;
        XAxis=160;

        word5TextField = new JTextField();
        word5TextField.setBounds(XAxis, YAxis,375,75);
        word5TextField.setHorizontalAlignment(JTextField.CENTER);
        word5TextField.setFont(wordFont);
        word5TextField.setEditable(false);

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
        YAxis+=80;
        XAxis=160;

        word6TextField = new JTextField();
        word6TextField.setBounds(XAxis, YAxis,375,75);
        word6TextField.setHorizontalAlignment(JTextField.CENTER);
        word6TextField.setFont(wordFont);
        word6TextField.setEditable(false);

        // FORMAT INPUT TO CAPITAL LETTERS
        word6TextField.addKeyListener(new KeyAdapter() {

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
        word6TextField.setDocument(new JTextFieldLimit(5));


        //Add to panel
        wordsPanel1.add(word1TextField);
        wordsPanel1.add(word2TextField);
        wordsPanel1.add(word3TextField);
        wordsPanel1.add(word4TextField);
        wordsPanel1.add(word5TextField);
        wordsPanel1.add(word6TextField);




        // FIRST WORD LABEL
        YAxis=15;
        XAxis=150;

        //word1Label1 = new JLabel();
        word1Label1 = setPropertiesForWordLabel(word1Label1,XAxis,YAxis);

        //word1Label2 = new JLabel();
        word1Label2 = setPropertiesForWordLabel(word1Label2,XAxis+=80,YAxis);

        //word1Label3 = new JLabel();
        word1Label3 = setPropertiesForWordLabel(word1Label3,XAxis+=80,YAxis);

        //word1Label4 = new JLabel();
        word1Label4 = setPropertiesForWordLabel(word1Label4,XAxis+=80,YAxis);

        //word1Label5 = new JLabel();
        word1Label5 = setPropertiesForWordLabel(word1Label5,XAxis+=80,YAxis);



        // SECOND WORD LABEL ***********
        YAxis+=80;
        XAxis=150;

        //word2Label1 = new JLabel();
        word2Label1 = setPropertiesForWordLabel(word1Label5,XAxis,YAxis);

        //word2Label2 = new JLabel();
        word2Label2 = setPropertiesForWordLabel(word1Label5,XAxis+=80,YAxis);

        //word2Label3 = new JLabel();
        word2Label3 = setPropertiesForWordLabel(word1Label5,XAxis+=80,YAxis);

        //word2Label4 = new JLabel();
        word2Label4 = setPropertiesForWordLabel(word1Label5,XAxis+=80,YAxis);

        //word2Label5 = new JLabel();
        word2Label5 = setPropertiesForWordLabel(word1Label5,XAxis+=80,YAxis);



        // 3rd WORD LABEL ***********
        YAxis+=80;
        XAxis=150;

        //word3Label1 = new JLabel();
        word3Label1 = setPropertiesForWordLabel(word1Label5,XAxis,YAxis);

       // word3Label2 = new JLabel();
        word3Label2 = setPropertiesForWordLabel(word1Label5,XAxis+=80,YAxis);

        //word3Label3 = new JLabel();
        word3Label3 = setPropertiesForWordLabel(word1Label5,XAxis+=80,YAxis);

        //word3Label4 = new JLabel();
        word3Label4 = setPropertiesForWordLabel(word1Label5,XAxis+=80,YAxis);

        //word3Label5 = new JLabel();
        word3Label5 = setPropertiesForWordLabel(word1Label5,XAxis+=80,YAxis);


        // 4th WORD LABEL ***********
        YAxis+=80;
        XAxis=150;

        //word4Label1 = new JLabel();
        word4Label1 = setPropertiesForWordLabel(word1Label5,XAxis,YAxis);

        //word4Label2 = new JLabel();
        word4Label2 = setPropertiesForWordLabel(word1Label5,XAxis+=80,YAxis);

        //word4Label3 = new JLabel();
        word4Label3 = setPropertiesForWordLabel(word1Label5,XAxis+=80,YAxis);

        //word4Label4 = new JLabel();
        word4Label4 = setPropertiesForWordLabel(word1Label5,XAxis+=80,YAxis);

        //word4Label5 = new JLabel();
        word4Label5 = setPropertiesForWordLabel(word1Label5,XAxis+=80,YAxis);

        // 5th WORD LABEL ***********
        YAxis+=80;
        XAxis=150;

        //word5Label1 = new JLabel();
        word5Label1 = setPropertiesForWordLabel(word1Label5,XAxis,YAxis);

        //word5Label2 = new JLabel();
        word5Label2 = setPropertiesForWordLabel(word1Label5,XAxis+=80,YAxis);

        //word5Label3 = new JLabel();
        word5Label3 = setPropertiesForWordLabel(word1Label5,XAxis+=80,YAxis);

        //word5Label4 = new JLabel();
        word5Label4 = setPropertiesForWordLabel(word1Label5,XAxis+=80,YAxis);

        //word5Label5 = new JLabel();
        word5Label5 = setPropertiesForWordLabel(word1Label5,XAxis+=80,YAxis);



        // 6th WORD LABEL ***********
        YAxis+=80;
        XAxis=150;

        //word6Label1 = new JLabel();
        word6Label1 = setPropertiesForWordLabel(word1Label5,XAxis,YAxis);

        //word6Label2 = new JLabel();
        word6Label2 = setPropertiesForWordLabel(word1Label5,XAxis+=80,YAxis);

        //word6Label3 = new JLabel();
        word6Label3 = setPropertiesForWordLabel(word1Label5,XAxis+=80,YAxis);

        //word6Label4 = new JLabel();
        word6Label4 = setPropertiesForWordLabel(word1Label5,XAxis+=80,YAxis);

        //word6Label5 = new JLabel();
        word6Label5 = setPropertiesForWordLabel(word1Label5,XAxis+=80,YAxis);
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

                     // CHECK IF WORD EXISTS IN THE LIST *********************
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

                     checkIfWin(1, word1);


                    word2TextField.setEditable(true);
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

                    checkIfWin(2, word2);

                    word3TextField.setEditable(true);
                    word3TextField.requestFocus();

                }
            }
        });


        word3TextField.addKeyListener(new KeyAdapter()
        {
            public void keyPressed(KeyEvent e)
            {
                int key = e.getKeyCode();

                boolean wordFlag=false;
                if (key == KeyEvent.VK_ENTER)
                {
                    word3 = word3TextField.getText();
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

                        if(st.equalsIgnoreCase(word3))
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

                    word3TextField.setVisible(false);

                    //word3 = word3.toUpperCase();
                    //word_for_wordle = word_for_wordle.toUpperCase();

                    Border border = BorderFactory.createLineBorder(Color.black, 1);
                    word3Label1.setBorder(border);
                    word3Label2.setBorder(border);
                    word3Label3.setBorder(border);
                    word3Label4.setBorder(border);
                    word3Label5.setBorder(border);


                    // FOR FIRST WORD ***********************
                    // LETTER 1
                    if(word3.charAt(0) == word_for_wordle.charAt(0))
                    {
                        word3Label1.setOpaque(true);
                        word3Label1.setBackground(Color.green);
                        word3Label1.setText(String.valueOf(word3.charAt(0)));
                    }
                    else if(word_for_wordle.indexOf(word3.charAt(0))!=-1)
                    {
                        word3Label1.setOpaque(true);
                        word3Label1.setBackground(Color.yellow);
                        word3Label1.setText(String.valueOf(word3.charAt(0)));
                    }
                    else
                    {
                        word3Label1.setText(String.valueOf(word3.charAt(0)));
                    }

                    // LETTER 2
                    if(word3.charAt(1) == word_for_wordle.charAt(1))
                    {
                        word3Label2.setOpaque(true);
                        word3Label2.setBackground(Color.green);
                        word3Label2.setText(String.valueOf(word3.charAt(1)));
                    }
                    else if(word_for_wordle.indexOf(word3.charAt(1))!=-1)
                    {
                        word3Label2.setOpaque(true);
                        word3Label2.setBackground(Color.yellow);
                        word3Label2.setText(String.valueOf(word3.charAt(1)));
                    }
                    else
                    {
                        word3Label2.setText(String.valueOf(word3.charAt(1)));
                    }

                    // LETTER 3
                    if(word3.charAt(2) == word_for_wordle.charAt(2))
                    {
                        word3Label3.setOpaque(true);
                        word3Label3.setBackground(Color.green);
                        word3Label3.setText(String.valueOf(word3.charAt(2)));
                    }
                    else if(word_for_wordle.indexOf(word3.charAt(2))!=-1)
                    {
                        word3Label3.setOpaque(true);
                        word3Label3.setBackground(Color.yellow);
                        word3Label3.setText(String.valueOf(word3.charAt(2)));
                    }
                    else
                    {
                        word3Label3.setText(String.valueOf(word3.charAt(2)));
                    }

                    // LETTER 4
                    if(word3.charAt(3) == word_for_wordle.charAt(3))
                    {
                        word3Label4.setOpaque(true);
                        word3Label4.setBackground(Color.green);
                        word3Label4.setText(String.valueOf(word3.charAt(3)));
                    }
                    else if(word_for_wordle.indexOf(word3.charAt(3))!=-1)
                    {
                        word3Label4.setOpaque(true);
                        word3Label4.setBackground(Color.yellow);
                        word3Label4.setText(String.valueOf(word3.charAt(3)));
                    }
                    else
                    {
                        word3Label4.setText(String.valueOf(word3.charAt(3)));
                    }

                    // LETTER 5
                    if(word3.charAt(4) == word_for_wordle.charAt(4))
                    {
                        word3Label5.setOpaque(true);
                        word3Label5.setBackground(Color.green);
                        word3Label5.setText(String.valueOf(word3.charAt(4)));
                    }
                    else if(word_for_wordle.indexOf(word3.charAt(4))!=-1)
                    {
                        word3Label4.setOpaque(true);
                        word3Label5.setBackground(Color.yellow);
                        word3Label5.setText(String.valueOf(word3.charAt(4)));
                    }
                    else
                    {
                        word3Label5.setText(String.valueOf(word3.charAt(4)));
                    }

                    word3Label1.setVisible(true);
                    word3Label2.setVisible(true);
                    word3Label3.setVisible(true);
                    word3Label4.setVisible(true);
                    word3Label5.setVisible(true);

                    checkIfWin(3, word3);

                    word4TextField.setEditable(true);
                    word4TextField.requestFocus();

                }
            }
        });

        word4TextField.addKeyListener(new KeyAdapter()
        {
            public void keyPressed(KeyEvent e)
            {
                int key = e.getKeyCode();

                boolean wordFlag=false;
                if (key == KeyEvent.VK_ENTER)
                {
                    word4 = word4TextField.getText();
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

                        if(st.equalsIgnoreCase(word4))
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

                    word4TextField.setVisible(false);

                    //word4 = word4.toUpperCase();
                    //word_for_wordle = word_for_wordle.toUpperCase();

                    Border border = BorderFactory.createLineBorder(Color.black, 1);
                    word4Label1.setBorder(border);
                    word4Label2.setBorder(border);
                    word4Label3.setBorder(border);
                    word4Label4.setBorder(border);
                    word4Label5.setBorder(border);


                    // FOR FIRST WORD ***********************
                    // LETTER 1
                    if(word4.charAt(0) == word_for_wordle.charAt(0))
                    {
                        word4Label1.setOpaque(true);
                        word4Label1.setBackground(Color.green);
                        word4Label1.setText(String.valueOf(word4.charAt(0)));
                    }
                    else if(word_for_wordle.indexOf(word4.charAt(0))!=-1)
                    {
                        word4Label1.setOpaque(true);
                        word4Label1.setBackground(Color.yellow);
                        word4Label1.setText(String.valueOf(word4.charAt(0)));
                    }
                    else
                    {
                        word4Label1.setText(String.valueOf(word4.charAt(0)));
                    }

                    // LETTER 2
                    if(word4.charAt(1) == word_for_wordle.charAt(1))
                    {
                        word4Label2.setOpaque(true);
                        word4Label2.setBackground(Color.green);
                        word4Label2.setText(String.valueOf(word4.charAt(1)));
                    }
                    else if(word_for_wordle.indexOf(word4.charAt(1))!=-1)
                    {
                        word4Label2.setOpaque(true);
                        word4Label2.setBackground(Color.yellow);
                        word4Label2.setText(String.valueOf(word4.charAt(1)));
                    }
                    else
                    {
                        word4Label2.setText(String.valueOf(word4.charAt(1)));
                    }

                    // LETTER 3
                    if(word4.charAt(2) == word_for_wordle.charAt(2))
                    {
                        word4Label3.setOpaque(true);
                        word4Label3.setBackground(Color.green);
                        word4Label3.setText(String.valueOf(word4.charAt(2)));
                    }
                    else if(word_for_wordle.indexOf(word4.charAt(2))!=-1)
                    {
                        word4Label3.setOpaque(true);
                        word4Label3.setBackground(Color.yellow);
                        word4Label3.setText(String.valueOf(word4.charAt(2)));
                    }
                    else
                    {
                        word4Label3.setText(String.valueOf(word4.charAt(2)));
                    }

                    // LETTER 4
                    if(word4.charAt(3) == word_for_wordle.charAt(3))
                    {
                        word4Label4.setOpaque(true);
                        word4Label4.setBackground(Color.green);
                        word4Label4.setText(String.valueOf(word4.charAt(3)));
                    }
                    else if(word_for_wordle.indexOf(word4.charAt(3))!=-1)
                    {
                        word4Label4.setOpaque(true);
                        word4Label4.setBackground(Color.yellow);
                        word4Label4.setText(String.valueOf(word4.charAt(3)));
                    }
                    else
                    {
                        word4Label4.setText(String.valueOf(word4.charAt(3)));
                    }

                    // LETTER 5
                    if(word4.charAt(4) == word_for_wordle.charAt(4))
                    {
                        word4Label5.setOpaque(true);
                        word4Label5.setBackground(Color.green);
                        word4Label5.setText(String.valueOf(word4.charAt(4)));
                    }
                    else if(word_for_wordle.indexOf(word4.charAt(4))!=-1)
                    {
                        word4Label4.setOpaque(true);
                        word4Label5.setBackground(Color.yellow);
                        word4Label5.setText(String.valueOf(word4.charAt(4)));
                    }
                    else
                    {
                        word4Label5.setText(String.valueOf(word4.charAt(4)));
                    }

                    word4Label1.setVisible(true);
                    word4Label2.setVisible(true);
                    word4Label3.setVisible(true);
                    word4Label4.setVisible(true);
                    word4Label5.setVisible(true);

                    checkIfWin(4, word4);

                    word5TextField.setEditable(true);
                    word5TextField.requestFocus();

                }
            }
        });

        word5TextField.addKeyListener(new KeyAdapter()
        {
            public void keyPressed(KeyEvent e)
            {
                int key = e.getKeyCode();

                boolean wordFlag=false;
                if (key == KeyEvent.VK_ENTER)
                {
                    word5 = word5TextField.getText();
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

                        if(st.equalsIgnoreCase(word5))
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

                    word5TextField.setVisible(false);

                    //word5 = word5.toUpperCase();
                    //word_for_wordle = word_for_wordle.toUpperCase();

                    Border border = BorderFactory.createLineBorder(Color.black, 1);
                    word5Label1.setBorder(border);
                    word5Label2.setBorder(border);
                    word5Label3.setBorder(border);
                    word5Label4.setBorder(border);
                    word5Label5.setBorder(border);


                    // FOR FIRST WORD ***********************
                    // LETTER 1
                    if(word5.charAt(0) == word_for_wordle.charAt(0))
                    {
                        word5Label1.setOpaque(true);
                        word5Label1.setBackground(Color.green);
                        word5Label1.setText(String.valueOf(word5.charAt(0)));
                    }
                    else if(word_for_wordle.indexOf(word5.charAt(0))!=-1)
                    {
                        word5Label1.setOpaque(true);
                        word5Label1.setBackground(Color.yellow);
                        word5Label1.setText(String.valueOf(word5.charAt(0)));
                    }
                    else
                    {
                        word5Label1.setText(String.valueOf(word5.charAt(0)));
                    }

                    // LETTER 2
                    if(word5.charAt(1) == word_for_wordle.charAt(1))
                    {
                        word5Label2.setOpaque(true);
                        word5Label2.setBackground(Color.green);
                        word5Label2.setText(String.valueOf(word5.charAt(1)));
                    }
                    else if(word_for_wordle.indexOf(word5.charAt(1))!=-1)
                    {
                        word5Label2.setOpaque(true);
                        word5Label2.setBackground(Color.yellow);
                        word5Label2.setText(String.valueOf(word5.charAt(1)));
                    }
                    else
                    {
                        word5Label2.setText(String.valueOf(word5.charAt(1)));
                    }

                    // LETTER 3
                    if(word5.charAt(2) == word_for_wordle.charAt(2))
                    {
                        word5Label3.setOpaque(true);
                        word5Label3.setBackground(Color.green);
                        word5Label3.setText(String.valueOf(word5.charAt(2)));
                    }
                    else if(word_for_wordle.indexOf(word5.charAt(2))!=-1)
                    {
                        word5Label3.setOpaque(true);
                        word5Label3.setBackground(Color.yellow);
                        word5Label3.setText(String.valueOf(word5.charAt(2)));
                    }
                    else
                    {
                        word5Label3.setText(String.valueOf(word5.charAt(2)));
                    }

                    // LETTER 4
                    if(word5.charAt(3) == word_for_wordle.charAt(3))
                    {
                        word5Label4.setOpaque(true);
                        word5Label4.setBackground(Color.green);
                        word5Label4.setText(String.valueOf(word5.charAt(3)));
                    }
                    else if(word_for_wordle.indexOf(word5.charAt(3))!=-1)
                    {
                        word5Label4.setOpaque(true);
                        word5Label4.setBackground(Color.yellow);
                        word5Label4.setText(String.valueOf(word5.charAt(3)));
                    }
                    else
                    {
                        word5Label4.setText(String.valueOf(word5.charAt(3)));
                    }

                    // LETTER 5
                    if(word5.charAt(4) == word_for_wordle.charAt(4))
                    {
                        word5Label5.setOpaque(true);
                        word5Label5.setBackground(Color.green);
                        word5Label5.setText(String.valueOf(word5.charAt(4)));
                    }
                    else if(word_for_wordle.indexOf(word5.charAt(4))!=-1)
                    {
                        word5Label4.setOpaque(true);
                        word5Label5.setBackground(Color.yellow);
                        word5Label5.setText(String.valueOf(word5.charAt(4)));
                    }
                    else
                    {
                        word5Label5.setText(String.valueOf(word5.charAt(4)));
                    }

                    word5Label1.setVisible(true);
                    word5Label2.setVisible(true);
                    word5Label3.setVisible(true);
                    word5Label4.setVisible(true);
                    word5Label5.setVisible(true);

                    checkIfWin(5, word5);

                    word6TextField.setEditable(true);
                    word6TextField.requestFocus();

                }
            }
        });

        word6TextField.addKeyListener(new KeyAdapter()
        {
            public void keyPressed(KeyEvent e)
            {
                int key = e.getKeyCode();

                boolean wordFlag=false;
                if (key == KeyEvent.VK_ENTER)
                {
                    word6 = word6TextField.getText();
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

                        if(st.equalsIgnoreCase(word6))
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

                    word6TextField.setVisible(false);

                    //word6 = word6.toUpperCase();
                    //word_for_wordle = word_for_wordle.toUpperCase();

                    Border border = BorderFactory.createLineBorder(Color.black, 1);
                    word6Label1.setBorder(border);
                    word6Label2.setBorder(border);
                    word6Label3.setBorder(border);
                    word6Label4.setBorder(border);
                    word6Label5.setBorder(border);


                    // FOR FIRST WORD ***********************
                    // LETTER 1
                    if(word6.charAt(0) == word_for_wordle.charAt(0))
                    {
                        word6Label1.setOpaque(true);
                        word6Label1.setBackground(Color.green);
                        word6Label1.setText(String.valueOf(word6.charAt(0)));
                    }
                    else if(word_for_wordle.indexOf(word6.charAt(0))!=-1)
                    {
                        word6Label1.setOpaque(true);
                        word6Label1.setBackground(Color.yellow);
                        word6Label1.setText(String.valueOf(word6.charAt(0)));
                    }
                    else
                    {
                        word6Label1.setText(String.valueOf(word6.charAt(0)));
                    }

                    // LETTER 2
                    if(word6.charAt(1) == word_for_wordle.charAt(1))
                    {
                        word6Label2.setOpaque(true);
                        word6Label2.setBackground(Color.green);
                        word6Label2.setText(String.valueOf(word6.charAt(1)));
                    }
                    else if(word_for_wordle.indexOf(word6.charAt(1))!=-1)
                    {
                        word6Label2.setOpaque(true);
                        word6Label2.setBackground(Color.yellow);
                        word6Label2.setText(String.valueOf(word6.charAt(1)));
                    }
                    else
                    {
                        word6Label2.setText(String.valueOf(word6.charAt(1)));
                    }

                    // LETTER 3
                    if(word6.charAt(2) == word_for_wordle.charAt(2))
                    {
                        word6Label3.setOpaque(true);
                        word6Label3.setBackground(Color.green);
                        word6Label3.setText(String.valueOf(word6.charAt(2)));
                    }
                    else if(word_for_wordle.indexOf(word6.charAt(2))!=-1)
                    {
                        word6Label3.setOpaque(true);
                        word6Label3.setBackground(Color.yellow);
                        word6Label3.setText(String.valueOf(word6.charAt(2)));
                    }
                    else
                    {
                        word6Label3.setText(String.valueOf(word6.charAt(2)));
                    }

                    // LETTER 4
                    if(word6.charAt(3) == word_for_wordle.charAt(3))
                    {
                        word6Label4.setOpaque(true);
                        word6Label4.setBackground(Color.green);
                        word6Label4.setText(String.valueOf(word6.charAt(3)));
                    }
                    else if(word_for_wordle.indexOf(word6.charAt(3))!=-1)
                    {
                        word6Label4.setOpaque(true);
                        word6Label4.setBackground(Color.yellow);
                        word6Label4.setText(String.valueOf(word6.charAt(3)));
                    }
                    else
                    {
                        word6Label4.setText(String.valueOf(word6.charAt(3)));
                    }

                    // LETTER 5
                    if(word6.charAt(4) == word_for_wordle.charAt(4))
                    {
                        word6Label5.setOpaque(true);
                        word6Label5.setBackground(Color.green);
                        word6Label5.setText(String.valueOf(word6.charAt(4)));
                    }
                    else if(word_for_wordle.indexOf(word6.charAt(4))!=-1)
                    {
                        word6Label4.setOpaque(true);
                        word6Label5.setBackground(Color.yellow);
                        word6Label5.setText(String.valueOf(word6.charAt(4)));
                    }
                    else
                    {
                        word6Label5.setText(String.valueOf(word6.charAt(4)));
                    }

                    word6Label1.setVisible(true);
                    word6Label2.setVisible(true);
                    word6Label3.setVisible(true);
                    word6Label4.setVisible(true);
                    word6Label5.setVisible(true);

                    checkIfWin(6, word6);

                    word6TextField.requestFocus();

                }
            }
        });


    }

    JLabel setPropertiesForWordLabel(JLabel thisJLabel, int XAxis, int YAxis)
    {
        thisJLabel = new JLabel();
        thisJLabel.setBounds(XAxis,YAxis,75,75);
        thisJLabel.setFont(new Font("Serif", Font.PLAIN, 50));
        thisJLabel.setHorizontalAlignment(JLabel.CENTER);
        thisJLabel.setVisible(false);
        wordsPanel1.add(thisJLabel);

        return thisJLabel;
    }

    void checkIfWin(int wordCount, String currentWord)
    {
        if(currentWord.equalsIgnoreCase(word_for_wordle))
        {
            Toolkit.getDefaultToolkit().beep();
            JFrame winFrame = new JFrame();
            int ans = JOptionPane.showConfirmDialog(winFrame,"Congratulations ! You have guessed the word correctly. \n\n Do you want to play again with another word ? \n\n");

            if(ans == JOptionPane.YES_OPTION)
            {
                wordsPanel1.removeAll();
                wordsPanel1.revalidate();
                wordsPanel1.repaint();
                setVisible(false);
                try {
                    main(null);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
            if(ans == JOptionPane.NO_OPTION)
            {
                System.exit(0);
            }
            if(ans == JOptionPane.CANCEL_OPTION)
            {
                System.exit(0);
            }


        }
        else if(wordCount==6 && !currentWord.equalsIgnoreCase(word_for_wordle))
        {
            Toolkit.getDefaultToolkit().beep();
            JFrame winFrame = new JFrame();
            String message = "The correct word was '";
            message += word_for_wordle;
            message += "'. \n\n Do you want to play again with another word ? \n\n";
            int ans = JOptionPane.showConfirmDialog(winFrame,message);

            if(ans == JOptionPane.YES_OPTION)
            {
                wordsPanel1.removeAll();
                wordsPanel1.revalidate();
                wordsPanel1.repaint();
                setVisible(false);
                try {
                    main(null);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
            if(ans == JOptionPane.NO_OPTION)
            {
                System.exit(0);
            }
            if(ans == JOptionPane.CANCEL_OPTION)
            {
                System.exit(0);
            }
        }
    }

    public static void main(String args[]) throws IOException {

        //word_for_wordle = "TODAY";

        MainWordle frame = new MainWordle();

        // word1 = word1TextField.getText() + w01.getText() + w02.getText() + w03.getText() + w04.getText();

        // Chekc which word is correct
        frame.checkForWordValidity();
    }

}
