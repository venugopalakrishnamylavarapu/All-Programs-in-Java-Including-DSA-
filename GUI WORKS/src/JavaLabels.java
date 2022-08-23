import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class JavaLabels {
    public static void main(String[] args) {
        Border border=BorderFactory.createLineBorder(Color.BLUE,5); //created a borer with the border class

        //content add cheydham frame lo
        JLabel content=new JLabel();
        ImageIcon image2=new ImageIcon("C:\\Users\\Dell\\IdeaProjects\\GUI WORKS\\vlcsnap-2022-07-31-08h38m55s877.png");       //created new imageicon object since we need a different image inside the jframe
        content.setText("This is displayed inside the frame");      //adding text in the jframe
        content.setIcon(image2);            //added the image icon to the label
        content.setHorizontalTextPosition(JLabel.CENTER);  //align the text position to the center wrt to image
        content.setVerticalTextPosition(JLabel.TOP);       //align the text position to the top wrt to image
        content.setForeground(Color.WHITE);             //adding color to the font
        content.setFont(new Font("MV Boli",Font.ITALIC,60));        //adding styles to the text(font)
        content.setIconTextGap(50);         //adds the gap between text and icon
        content.setBackground(Color.BLACK);      //adding background to the label(*NOT FOR THE JFRAME*)
        content.setOpaque(true);                //to make the background apply on the label we need to call this method
        content.setBorder(border);          //calling the border object to add the border to the label(*NOT THE JFRAME*)
        content.setVerticalAlignment(JLabel.CENTER);   //change the whole panel position vertical alignment
        content.setHorizontalAlignment(JLabel.CENTER);   //change the whole position horizontal alignment


        //ikkada kinda code creation of frame gurinchi
        JFrame tab=new JFrame();
        ImageIcon imageIcon=new ImageIcon("spiderman-logo-illustration.jpg");
        tab.setVisible(true);
        tab.setSize(700,900);
        tab.setTitle("BackGround image in the Frame");
        tab.setResizable(true);
        tab.setIconImage(imageIcon.getImage());
        tab.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        //adding jlabels components to the jframe
        tab.add(content);       //adding the content(JLabel component) to the JFrame

    }
}