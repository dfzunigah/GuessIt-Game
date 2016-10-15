package UI;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.Scanner;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class UI extends javax.swing.JFrame {

    public UI() {
        initComponents();
        Toolkit kit = Toolkit.getDefaultToolkit();
        try{
            URL icon  = new URL("https://dl.dropboxusercontent.com/u/83568390/icon.png");
            Image img = kit.createImage(icon);
            setIconImage(img);
        }catch(MalformedURLException e){
            Image imgException = kit.createImage("icon.png");
            setIconImage(imgException);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jButton4.setText("jButton4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Guess It!");
        setPreferredSize(new java.awt.Dimension(270, 320));
        setResizable(false);
        setSize(new java.awt.Dimension(270, 320));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "English", "Español", "Francais"}));
        jComboBox1.setMinimumSize(new java.awt.Dimension(80, 30));
        jComboBox1.setPreferredSize(new java.awt.Dimension(70, 30));
        jComboBox1.setSelectedItem("English");
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton1.setText(translator.getString("exitButton"));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText(translator.getString("creditsButton"));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText(translator.getString("gamelogButton"));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setText(translator.getString("reviewButton"));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText(translator.getString("playButton"));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel1.setText("V4.0.5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(jLabel1))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(47, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(5, 5, 5))))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        String language = (String)jComboBox1.getSelectedItem();
        if(language == null || language.isEmpty()){
            languageSelector = new Locale("en","EN");
            translator = ResourceBundle.getBundle("MessagesBundle",languageSelector);
            this.jButton1.setText(translator.getString("exitButton"));
            this.jButton2.setText(translator.getString("creditsButton"));
            this.jButton3.setText(translator.getString("gamelogButton"));
            this.jButton5.setText(translator.getString("reviewButton"));
            this.jButton6.setText(translator.getString("playButton"));
        }else if(language.equals("English")){
            languageSelector = new Locale("en","EN");
            translator = ResourceBundle.getBundle("MessagesBundle",languageSelector);
            this.jButton1.setText(translator.getString("exitButton"));
            this.jButton2.setText(translator.getString("creditsButton"));
            this.jButton3.setText(translator.getString("gamelogButton"));
            this.jButton5.setText(translator.getString("reviewButton"));
            this.jButton6.setText(translator.getString("playButton"));
        }else if(language.equals("Español")){
            languageSelector = new Locale("es","ES");
            translator = ResourceBundle.getBundle("MessagesBundle",languageSelector);
            this.jButton1.setText(translator.getString("exitButton"));
            this.jButton2.setText(translator.getString("creditsButton"));
            this.jButton3.setText(translator.getString("gamelogButton"));
            this.jButton5.setText(translator.getString("reviewButton"));
            this.jButton6.setText(translator.getString("playButton"));
        }else if(language.equals("Francais")){
            languageSelector = new Locale("fr","FR");
            translator = ResourceBundle.getBundle("MessagesBundle",languageSelector);
            this.jButton1.setText(translator.getString("exitButton"));
            this.jButton2.setText(translator.getString("creditsButton"));
            this.jButton3.setText(translator.getString("gamelogButton"));
            this.jButton5.setText(translator.getString("reviewButton"));
            this.jButton6.setText(translator.getString("playButton"));
        }
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JOptionPane.showMessageDialog(null, translator.getString("credits"),translator.getString("creditsButton"), JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JOptionPane.showMessageDialog(null, translator.getString("gamelog"), translator.getString("gamelogButton") , JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        JFrame reviewFrame = new JFrame (translator.getString("reviewButton"));
                reviewFrame.setPreferredSize(new Dimension(500,200));
                reviewFrame.setDefaultCloseOperation (WindowConstants.DO_NOTHING_ON_CLOSE);
                createReviewMenu(reviewFrame);
                reviewFrame.pack();
                reviewFrame.setVisible (true);
                reviewFrame.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        int limit;
                try{
                    String reponse= JOptionPane.showInputDialog(translator.getString("range"));     
                    if(verifyNumber(reponse)){
                        limit=Integer.parseInt(reponse);
                    }else{
                        while(!verifyNumber(reponse)){
                            reponse= JOptionPane.showInputDialog(translator.getString("range"));
                        }
                        limit = Integer.parseInt(reponse);
                    }
                    randomNumber = new Random().nextInt(limit);
                    createGame(this.getContentPane(),limit);
                }catch(NullPointerException X){}
    }//GEN-LAST:event_jButton6ActionPerformed

    private void createReviewMenu(JFrame reviewFrame){
        JRadioButton one = new JRadioButton("1");
        JRadioButton two = new JRadioButton("2");
        JRadioButton three = new JRadioButton("3");
        JRadioButton four = new JRadioButton("4");
        JRadioButton five = new JRadioButton("5");
        JRadioButton six = new JRadioButton("6");
        JRadioButton seven = new JRadioButton("7");
        JRadioButton eight = new JRadioButton("8");
        JRadioButton nine = new JRadioButton("9");
        JRadioButton ten = new JRadioButton("10");
        ButtonGroup points = new ButtonGroup();
        points.add(one);
        points.add(two);
        points.add(three);
        points.add(four);
        points.add(five);
        points.add(six);
        points.add(seven);
        points.add(eight);
        points.add(nine);
        points.add(ten);
        JPanel pointsPanel = new JPanel();
        pointsPanel.add(one);
        pointsPanel.add(two);
        pointsPanel.add(three);
        pointsPanel.add(four);
        pointsPanel.add(five);
        pointsPanel.add(six);
        pointsPanel.add(seven);
        pointsPanel.add(eight);
        pointsPanel.add(nine);
        pointsPanel.add(ten);
        Toolkit kit = Toolkit.getDefaultToolkit();
        try{
            URL icon  = new URL("https://dl.dropboxusercontent.com/u/83568390/icon.png");
            Image img = kit.createImage(icon);
            reviewFrame.setIconImage(img);
        }catch(MalformedURLException e){
            Image imgException = kit.createImage("icon.png");
            setIconImage(imgException);
        }
        reviewFrame.setResizable(false);
        reviewFrame.setLayout(new GridLayout(4,1));
        JButton exitButton = new JButton(translator.getString("done"));
        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    FileWriter writer = new FileWriter("reviews.ser",true);
                    if(getSelectedButton(points).equals("1")){
                        writer.write(1 + " ");   
                    }else if(getSelectedButton(points).equals("2")){
                        writer.write(2 + " ");
                    }else if(getSelectedButton(points).equals("3")){
                        writer.write(3 + " ");
                    }else if(getSelectedButton(points).equals("4")){
                        writer.write(4 + " ");
                    }else if(getSelectedButton(points).equals("5")){
                        writer.write(5 + " ");
                    }else if(getSelectedButton(points).equals("6")){
                        writer.write(6 + " ");
                    }else if(getSelectedButton(points).equals("7")){
                        writer.write(7 + " ");
                    }else  if(getSelectedButton(points).equals("8")){
                        writer.write(8 + " ");
                    }else if(getSelectedButton(points).equals("9")){
                        writer.write(9 + " ");
                    }else if(getSelectedButton(points).equals("10")){
                        writer.write(10 + " ");
                    }
                    writer.close();
                } catch (IOException ex) {
                    ex.getStackTrace();
                } catch (NullPointerException ex2) {
                    ex2.getStackTrace();
                }
                reviewFrame.dispose();
            }
        });
        reviewFrame.getContentPane().add(new JLabel(translator.getString("review")));
        reviewFrame.getContentPane().add(pointsPanel);
        reviewFrame.getContentPane().add(new JLabel(currentStatus()));
        reviewFrame.getContentPane().add(exitButton);
    }
        
    String getSelectedButton(ButtonGroup buttonGroup1){  
        for (Enumeration<AbstractButton> buttons = buttonGroup1.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();
            if (button.isSelected()) {
                return button.getText();
            }
        }
        return null;
    }
    
    public String currentStatus() {
        reviewsMade.clear();
        try{
            File AXE = new File("reviews.ser");
            Scanner fileReader = new Scanner(AXE);
            while(fileReader.hasNext()){
                reviewsMade.add(fileReader.nextInt());
            }                
            fileReader.close();
        }catch(FileNotFoundException e){
             e.getStackTrace();
        }
        if(reviewsMade.isEmpty()){
            return translator.getString("current1") + 0 + translator.getString("current2") + "0  " + translator.getString("current3");
        }
        int total=0;
        for(int base : reviewsMade){
            total+=base;
        }
        double average=((double)total/reviewsMade.size());
        return translator.getString("current1") + round(average) + translator.getString("current2") + reviewsMade.size() + " " + translator.getString("current3");
    }
    
    public static double round(double value) {
        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
    
    public boolean verifyNumber(String answer){
         if (answer.matches("[0-9]+")){
            if(answer.length()<=10){
                Long beforeIt = Long.parseLong(answer);
                if(beforeIt<=2147483647 || beforeIt>1){
                    return true;
                }
            }
        }
        return false;
    }
    
    private void createGame(Container container, int limit){
        this.getContentPane().removeAll();
        JLabel gameboard= new JLabel("0 - " + limit);
        gameboard.setFont(new Font("Serif", Font.PLAIN, 48));
        gameboard.setHorizontalAlignment(SwingConstants.CENTER);
        JPanel guesses = new JPanel();
        guesses.setLayout(new GridLayout(1,3));
        guesses.add(new JLabel(" " + translator.getString("guessPanel")));
        JTextField guess = new JTextField();
        guesses.add(guess);
        JLabel tries = new JLabel();
        guess.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int number=-1;
                if(!verifyNumber(guess.getText())){
                    JOptionPane.showMessageDialog(null, translator.getString("warning"), translator.getString("warningButton") , JOptionPane.PLAIN_MESSAGE);
                }else {
                    number = Integer.parseInt(guess.getText());
                }
                if(number==-1){
                    //DO NOTHING
                }else if(number<randomNumber){
                    gameboard.setText(translator.getString("greater"));
                    yourGuess++;
                    tries.setText(" " + translator.getString("guessesMade") + yourGuess);
                    guess.setText("");
                }else if(number>randomNumber){
                    gameboard.setText(translator.getString("lesser"));
                    yourGuess++;
                    tries.setText(" " + translator.getString("guessesMade") + yourGuess);
                    guess.setText("");
                }else{
                    gameboard.setText(translator.getString("youWin"));
                    yourGuess++;
                    tries.setText(" " + translator.getString("guessesMade") + yourGuess);
                    guess.setEnabled(false);
                    int dialogButton = JOptionPane.YES_NO_OPTION;
                    int dialogResult = JOptionPane.showConfirmDialog(null, translator.getString("return"), translator.getString("congrats"), dialogButton);
                    if(dialogResult == 0) {
                        yourGuess=0;
                        getContentPane().removeAll();
                        initComponents();
                    } 
                }
            }
        });
        guesses.add(tries);
        gamePanel.add(new JLabel());
        gamePanel.add(gameboard);
        gamePanel.add(new JLabel());
        gamePanel.add(guesses);
        this.setContentPane(gamePanel);
        this.setLayout(new GridLayout(4,1));
        this.validate();
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
    private Locale languageSelector = new Locale("en","EN");
    private ResourceBundle translator = ResourceBundle.getBundle("MessagesBundle",languageSelector);
    private ArrayList<Integer> reviewsMade = new ArrayList<Integer>();
    private int randomNumber;
    private int yourGuess=0;
    private JPanel gamePanel = new JPanel();
}

