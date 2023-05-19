package typingPractice.ui;

import typingPractice.obj.Typing;
import typingPractice.util.TypingUtil;

import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;

public class GuiForm {
    private JPanel panel1;
    private JTextPane textPane1;
    private JTextField textField1;
    private JButton openButton;
    private JButton clearButton;
    private JTextPane textPane2;

    private JFrame frame;
    private FileForm fireForm;

    private List<String> textList;

    private String currentLine = "";
    private JTextPane mainTextPane;
    private JTextPane information;

    private long startTime = 0;
    private long endTime = 0;
    private Typing typing;
    public JTextField getTextField1() {
        return textField1;
    }
    public GuiForm(){
        addTextFiled1Listener();
        addClearButtonListener();
        addOpenButtonListener();
        showFrame();
        setFocusToTextField1();



    }

    public JFrame getFrame() {
        return frame;
    }

    public void addClearButtonListener() {
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clear();
                System.out.println("실행");
            }
        });
    }
    public void addOpenButtonListener() {
        GuiForm guiForm = this;
        openButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(() -> {
                    if(fireForm == null) {
                        fireForm = new FileForm(guiForm);
                    } else {
                        fireForm.setVisible(true);
                    }
                });
            }
        });
    }
    public void setMainTextPane(){
        SwingUtilities.invokeLater(() -> {
            currentLine = textList.get(0);
            textPane1.setText(currentLine);
            textPane2.setText("");
            textList.remove(0);
        });
    }
    public void setTextList(List<String> textList) {
        SwingUtilities.invokeLater(() -> {
            this.textList = textList;
        });
        clear();
        setMainTextPane();

    }

    public String getCurrentLine() {
        return currentLine;
    }

    private void enteredLine(){
        SwingUtilities.invokeLater(() -> {
            endTime = System.currentTimeMillis();

            String textFiledValue = textField1.getText();
            //mainTextPane.add("\n"+textFiledValue);
            String text = textFiledValue;
            StyledDocument document = mainTextPane.getStyledDocument();
            Style style = mainTextPane.addStyle("ColoredStyle", null);
            Style boldStyle = mainTextPane.addStyle("BoldStyle", null);


            // 먼저 예제부터 입력하고 나서..
            try {
                StyleConstants.setForeground(style, Color.BLACK);
                document.insertString(document.getLength(), currentLine, style);
                document.insertString(document.getLength(), "\n", style);
            } catch (BadLocationException ble) {
                ble.printStackTrace();
            }
            int j = 0;
            text = text.trim();
            currentLine = currentLine.trim();
            int compareLength = 0;
            if(currentLine.length() < text.length()) {
                compareLength = currentLine.length();
            } else {
                compareLength = text.length();
            }
            int wrongCount = 0;
            for (int i = 0; i < compareLength; i++) {
                try {
                    if(currentLine.charAt(i) == text.charAt(j)) {
                        StyleConstants.setForeground(style, Color.BLACK);
                        document.insertString(document.getLength(), String.valueOf(text.charAt(i)), style);

                    } else {
                        wrongCount++;
                        StyleConstants.setForeground(style, Color.MAGENTA);
                        StyleConstants.setBold(boldStyle, true);
                        document.insertString(document.getLength(), String.valueOf(text.charAt(i)), style);
                        if(currentLine.charAt(i) == ' ') {
                            document.insertString(document.getLength(), " ", style);
                            j--;
                        }
                    }

                } catch (BadLocationException ble) {
                    ble.printStackTrace();
                }
                j++;
            }
            try {
                document.insertString(document.getLength(), "\n", style);
            } catch (BadLocationException ble) {
                ble.printStackTrace();
            }
            int totalCount = TypingUtil.countTypingCharacters(currentLine);
            System.out.println("totalCount: " + totalCount);
            int correctCount = totalCount - wrongCount - (Math.abs(TypingUtil.countTypingCharacters(currentLine) - TypingUtil.countTypingCharacters(text)));
            if(typing == null ) {
                System.out.println("여기냐?");
                typing = new Typing(startTime, endTime, correctCount, totalCount);
            } else {
                System.out.println("여기냐2?");
                typing = TypingUtil.getTyping(typing, new Typing(startTime, endTime, correctCount, totalCount));
            }
            System.out.println(typing.getDuration());
            System.out.println(typing.toString());
            setInformation("속도: "+ typing.getSpeed() + ", 정확도: " + typing.getPerpect());
            startTime = 0;
            textField1.setText("");
            setMainTextPane();
        });
    }
    public void setInformation(String info) {
        StyledDocument document = information.getStyledDocument();
        Style style = mainTextPane.addStyle("ColoredStyle", null);
        StyleConstants.setForeground(style, Color.BLACK);
        try{
            document.remove(0, document.getLength());
            document.insertString(document.getLength(), info, style);
        } catch (BadLocationException ble) {

        }


    }
    public void addTextFiled1Listener() {

        textField1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent event) {
                //enteredLine();
            }
        });
        textField1.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                if(startTime == 0) startTime = System.currentTimeMillis();

                char c = e.getKeyChar();
                textPane2.setText(textField1.getText());
                if(textField1.getText().length() >= getCurrentLine().length()) {
                    enteredLine();

                } else if(c == KeyEvent.VK_ENTER) {
                    enteredLine();
                }

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
    }

    public void showFrame() {
        SwingUtilities.invokeLater(() -> {
            frame = new JFrame("GuiForm");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setContentPane(panel1);
            frame.pack();
            frame.setBounds(100, 100, 800, 800);
            frame.setVisible(true);
            System.out.println("보여주기");

        });
    }


    public void clear(){
        SwingUtilities.invokeLater(() -> {
            typing = null;
            startTime = 0;
            endTime = 0;
            information.setText("");
            textField1.setText("");
            textPane1.setText("");
            textPane2.setText("");
            mainTextPane.setText("");
        });
        setFocusToTextField1();
    }
    public void setFocusToTextField1() {
        SwingUtilities.invokeLater(() -> textField1.requestFocusInWindow());
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
