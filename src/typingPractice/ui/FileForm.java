package typingPractice.ui;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileForm {


    JFrame frame;
    private JPanel panel1;
    private JTextField filePathField;
    private JButton browseButton;
    private JButton OKButton;
    private JButton closeButton;

    private JFrame parentFrame;

    private GuiForm guiForm;

    public FileForm(GuiForm guiForm){
        this.parentFrame = guiForm.getFrame();
        this.guiForm = guiForm;
        showFrame();
        fileFormListener();

    }
    private JFrame getParentFrame() {
        return this.parentFrame;
    }
    private Class<?> getParentClass(String className) {
        try {
            return Class.forName(className);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
    public void showFrame() {
        SwingUtilities.invokeLater(() -> {
            frame = new JFrame("FileForm");
            //frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.setContentPane(panel1);
            frame.pack();
            JFrame parentFrame = getParentFrame();
            // 부모 프레임의 위치 정보 가져오기
            int parentX = parentFrame.getLocation().x;
            int parentY = parentFrame.getLocation().y;
            int parentWidth = parentFrame.getSize().width;
            int parentHeight = parentFrame.getSize().height;
            frame.setSize(400,150);
            // 자식 프레임의 위치 계산
            int childX = parentX + (parentWidth - frame.getWidth()) / 2;
            int childY = parentY + (parentHeight - frame.getHeight()) / 2;
            frame.setLocation(childX, childY);
            frame.setResizable(false);
            frame.setVisible(true);
            frame.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                    SwingUtilities.invokeLater(() -> {
                        frame.setVisible(false);
                    });
                }
            });
        });
    }
    public void setVisible(boolean bool) {
        SwingUtilities.invokeLater(() -> {
            frame.setVisible(bool);
        });
    }
    private void fileFormListener() {
        SwingUtilities.invokeLater(() -> {
            filePathField.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                }
            });
            OKButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String filePath = filePathField.getText();

                    try {
                        List<String> fileContent = readFileToString(filePath);
                        guiForm.setTextList(fileContent);

                    } catch (IOException ioe) {
                        ioe.printStackTrace();
                    }
                    frame.setVisible(false);

                }
            });
            closeButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    frame.setVisible(false);
                }
            });

            browseButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("browseButton click");
                    JFileChooser fileChooser = new JFileChooser();
                    fileChooser.setCurrentDirectory(new File("C:\\Users\\KEDI\\Documents\\타자연습"));
                    FileNameExtensionFilter filter = new FileNameExtensionFilter("Text files", "txt");
                    fileChooser.setFileFilter(filter);
                    int result = fileChooser.showOpenDialog(frame);
                    if (result == JFileChooser.APPROVE_OPTION) {
                        String filePath = fileChooser.getSelectedFile().getAbsolutePath();
                        filePathField.setText(filePath);
                    }
                }
            });

        });
    }
    private List<String> readFileToString(String filePath) throws IOException {
        List<String> list = new ArrayList<>();
        Charset charset = Charset.forName("MS949");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), charset))) {
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                list.add(line);
            }
        }
        return list;
    }
}
