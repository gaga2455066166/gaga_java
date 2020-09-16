package com.cjl.基础练习;

import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class KeyWordSuggest extends JFrame {

    private static final long serialVersionUID = 1L;
    private JTextField input = new JTextField(30);
    private JTextArea hint = new JTextArea(30, 30);
    public KeyWordSuggest() {

        setSize(500, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setLocationRelativeTo(null);
        getContentPane().add(input);
        getContentPane().add(hint);
        addListener();

    }


    private void addListener() {
        input.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                List<String> suggests;
                try {
                    suggests = getSuggest(input.getText());
                    hint.setText("");
                    for (String suggest : suggests) {
                        hint.append(suggest + "\n");
                    }
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });
    }
    private List<String> getSuggest(String input) throws IOException {
        List<String> suggests = new ArrayList<String>();
        String url = "https://www.baidu.com/sugrec?pre=1&p=3&ie=utf-8&json=1&prod=pc&from=pc_web&wd=" + input;
        URL url2 = new URL(url);
        InputStream in = url2.openStream();
        byte[] buf = new byte[1024];
        String result = "";
        while (in.read(buf) != -1) {
            result += new String(buf, 0, buf.length);
        }

        String regex = "\\{\"type\":\"sug\",\"sa\":\".*?\",\"q\":\"(.*?)\"\\}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(result);
        while (matcher.find()) {
            suggests.add(matcher.group(1));
        }
        return suggests;
    }


    public static void main(String[] args) {
        new KeyWordSuggest().setVisible(true);

    }

}
