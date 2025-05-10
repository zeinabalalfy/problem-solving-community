package loginandsignup;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class Login extends JFrame {

    private JPanel jPanel1;
    private JPanel jPanel2;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JTextField jTextField1;
    private JLabel jLabel3;
    private JPasswordField jPasswordField1;
    private JButton jButton1;
    private JLabel jLabel4;
    private JButton jButton2;
    private JLabel jLabel5;

    public Login() {
        initComponents();
    }

    private void initComponents() {
        jPanel1 = new JPanel();
        jPanel2 = new JPanel();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jTextField1 = new JTextField();
        jLabel3 = new JLabel();
        jPasswordField1 = new JPasswordField();
        jButton1 = new JButton();
        jLabel4 = new JLabel();
        jButton2 = new JButton();
        jLabel5 = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(800, 500));

        jPanel1.setBackground(new Color(245, 245, 245));
        jPanel1.setPreferredSize(new Dimension(800, 500));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new Color(150, 0, 24));

        // Load and scale fehu logo
        try {
            URL imgURL = getClass().getResource("/loginandsignup/resources/fehu.jpg");
            if (imgURL != null) {
                System.out.println("Image URL: " + imgURL);
                BufferedImage originalImg = ImageIO.read(imgURL);
                if (originalImg != null) {
                    System.out.println("Image loaded successfully. Original dimensions: " + originalImg.getWidth() + "x" + originalImg.getHeight());
                    // Scale the image to 200x200 using BufferedImage
                    BufferedImage scaledImg = new BufferedImage(200, 200, BufferedImage.TYPE_INT_ARGB);
                    Graphics2D g2d = scaledImg.createGraphics();
                    g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
                    g2d.drawImage(originalImg, 0, 0, 200, 200, null);
                    g2d.dispose();
                    jLabel5.setIcon(new ImageIcon(scaledImg));
                    System.out.println("Image scaled to 200x200 and set in JLabel.");
                    jLabel5.revalidate();
                    jLabel5.repaint();
                } else {
                    System.out.println("Error: Image /loginandsignup/resources/fehu.jpg loaded but could not be read as an image.");
                    jLabel5.setText("Image Invalid");
                    jLabel5.setForeground(Color.WHITE);
                }
            } else {
                System.out.println("Warning: Image /loginandsignup/resources/fehu.jpg not found.");
                jLabel5.setText("Logo Missing");
                jLabel5.setForeground(Color.WHITE);
            }
        } catch (Exception e) {
            System.out.println("Error loading image: " + e.getMessage());
            jLabel5.setText("Image Error");
            jLabel5.setForeground(Color.WHITE);
        }
        jLabel5.setPreferredSize(new Dimension(200, 200));
        jLabel5.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                .addGap(94, 94, 94))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(267, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 400, 500);

        jLabel1.setFont(new Font("Segoe UI", Font.BOLD, 36));
        jLabel1.setForeground(new Color(150, 0, 24));
        jLabel1.setText("LOGIN");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(520, 30, 140, 50);

        jLabel2.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        jLabel2.setForeground(new Color(50, 50, 50));
        jLabel2.setText("Email");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(430, 90, 70, 20);

        jTextField1.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        jTextField1.setBackground(new Color(255, 255, 255));
        jPanel1.add(jTextField1);
        jTextField1.setBounds(430, 110, 310, 30);

        jLabel3.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        jLabel3.setForeground(new Color(50, 50, 50));
        jLabel3.setText("Password");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(430, 150, 70, 20);

        jPasswordField1.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        jPasswordField1.setBackground(new Color(255, 255, 255));
        jPanel1.add(jPasswordField1);
        jPasswordField1.setBounds(430, 170, 310, 30);

        jButton1.setBackground(new Color(150, 0, 24));
        jButton1.setForeground(Color.WHITE);
        jButton1.setText("Login");
        jPanel1.add(jButton1);
        jButton1.setBounds(430, 230, 100, 30);

        jLabel4.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        jLabel4.setForeground(new Color(50, 50, 50));
        jLabel4.setText("I don't have an account");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(430, 270, 130, 20);

        jButton2.setBackground(new Color(150, 0, 24));
        jButton2.setForeground(Color.WHITE);
        jButton2.setText("SIGN UP");
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                new SignUp().setVisible(true);
                dispose();
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(560, 270, 100, 20);

        //

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        pack();
    }

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
}