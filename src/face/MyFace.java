package face;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.io.*;
import java.net.URI;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.Timer;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 * @author hanlin Shen
 * @version May 7 2013
 */
public class MyFace extends JComponent {
    
    private int eyeSize;
    private int eyeLevel;
    private int red;
    private int green;
    private int bule;
    private int eyeBrowSize;
    private int eyeBrowLevel;
    private Color faceColor;
    private int mouthArcStart;
    private int mouthArcEnd;
    private int eyeBrowArcStart;
    private int eyeBrowArcEnd;
    private int bordFaceLeftEyeBrowX1;
    private int bordFaceLeftEyeBrowX2;
    private int bordFaceRightEyeBrowX1;
    private int bordFaceRightEyeBrowX2;
    private int bordFaceMouthX1;
    private int bordFaceMouthX2;
    private int miniManX;
    private int miniManY;
    private int miniManTransformX;
    private Color miniManFaceColor;
    private int hatWidth;
    private int hatHeight;
    private int hatX;
    private int hatY;
    private Image hat1;
    private Image weapon;
    private boolean Transformed;
    Timer timer;
    ImageIcon cowBoyHat = new ImageIcon("cb.png");
    ImageIcon baseBallCap = new ImageIcon("cap.png");
    ImageIcon footBallHemCap = new ImageIcon("footBallHem.png");
    ImageIcon chineseHat = new ImageIcon("chinese hat.png");
    ImageIcon midEastHat = new ImageIcon("mideasthat.png");    
    ImageIcon lightsberOn = new ImageIcon("lightsaberOn.png");
    ImageIcon lightsberOff = new ImageIcon("lightsaberOff.png");
    
    public MyFace() {
        eyeSize = 20;
        eyeLevel = 0;
        faceColor = Color.YELLOW;
        mouthArcStart = 185;
        mouthArcEnd = 175;
        eyeBrowArcStart = 20;
        eyeBrowArcEnd = 150;
        bordFaceLeftEyeBrowX1 = -100;
        bordFaceLeftEyeBrowX2 = -100;
        bordFaceRightEyeBrowX1 = -100;
        bordFaceRightEyeBrowX2 = -100;
        bordFaceMouthX1 = -100;
        bordFaceMouthX2 = -100;
        
        hatWidth = 0;
        hatHeight = 0;
        hatX = 0;
        hatY = 0;
        hat1 = null;
        
        weapon = null;
        
        miniManX = 0;
        miniManY = 0;
        miniManTransformX = 0;
        miniManFaceColor = Color.YELLOW;
        Transformed = false;
        
        
    }
    
    /*
     * reset all
     */
    public void reset() {
        eyeSize = 20;
        eyeLevel = 0;
        faceColor = Color.YELLOW;
        mouthArcStart = 185;
        mouthArcEnd = 175;
        eyeBrowArcStart = 20;
        eyeBrowArcEnd = 150;
        bordFaceLeftEyeBrowX1 = -100;
        bordFaceLeftEyeBrowX2 = -100;
        bordFaceRightEyeBrowX1 = -100;
        bordFaceRightEyeBrowX2 = -100;
        bordFaceMouthX1 = -100;
        bordFaceMouthX2 = -100;
        
        hatWidth = 0;
        hatHeight = 0;
        hatX = 0;
        hatY = 0;
        hat1 = null;
        
        weapon = null;
        
        miniManX = 0;
        miniManY = 0;
        miniManTransformX = 0;
        miniManFaceColor = Color.YELLOW;
        Transformed = false;
        
        repaint();
    }
    /*
     *  set the eye size
     */
    public void setEyeSize(int eyeSize) {
        this.eyeSize = eyeSize;
        repaint();
    }
    
    /*
     * set the eye level
     */
    public void setEyeLevel(int eyeLevel) {
        this.eyeLevel = eyeLevel;
        repaint();
    }
    
    /*
     * set the eye color, the red part
     */
    public void setEyeColorRed(int r) {
        red = r;
        repaint();
    }
    
    /*
     * set the eye color, the green part
     */
    public void setEyeColorGreen(int g) {
        green = g;
        repaint();
    }
    
    /*
     * set the eye color, the bule part
     */
    public void setEyeColorBule(int b) {
        bule = b;
        repaint();
    }
    
    /*
     * set eye brow size
     */
    public void setEyeBrowSize(int eyeBrowSize) {
        this.eyeBrowSize = eyeBrowSize;
        repaint();
    }
    
    /*
     * set eye brow level
     */
    public void setEyeBrowLevel(int eyeBrowLevel) {
        this.eyeBrowLevel = eyeBrowLevel;
        repaint();
    }
    
    /*
     * set the face color
     */
    public void setFaceColor(Color faceColor) {
        this.faceColor = faceColor;
        repaint();
    }
    
    /*
     * Hide the bord face 
     */
    public void setBordFaceOff() {
        bordFaceLeftEyeBrowX1 = -100;
        bordFaceLeftEyeBrowX2 = -100;
        bordFaceRightEyeBrowX1 = -100;
        bordFaceRightEyeBrowX2 = -100;
        bordFaceMouthX1 = -100;
        bordFaceMouthX2 = -100;
    }
    
    /*
     * make face look sad
     */
    public void setSadFace() {
        setBordFaceOff();
        mouthArcStart = 10;
        mouthArcEnd = 170;
        eyeBrowArcStart = 185;
        eyeBrowArcEnd = 175;
        eyeLevel = 17;
        repaint();
    }
    
    /*
     * make face look happy
     */
    public void setHappyFace() {
        setBordFaceOff();
        mouthArcStart = 185;
        mouthArcEnd = 175;
        eyeBrowArcStart = 20;
        eyeBrowArcEnd = 150;
        eyeLevel = 0;
        repaint();
    }
    
    /*
     * make face look bord
     */
    public void setBordFace() {
        bordFaceLeftEyeBrowX1 = 235;
        bordFaceLeftEyeBrowX2 = 285;
        bordFaceRightEyeBrowX1 = 375;
        bordFaceRightEyeBrowX2 = 425;
        bordFaceMouthX1 = 260;
        bordFaceMouthX2 = 400;
        eyeBrowArcStart = 0;
        eyeBrowArcEnd = 0;
        mouthArcStart = 0;
        mouthArcEnd = 0;
        repaint();
    }
    
    /*
     * make face look angry
     */
    public void setAngryFace() {
        bordFaceLeftEyeBrowX1 = 235;
        bordFaceLeftEyeBrowX2 = 285;
        bordFaceRightEyeBrowX1 = 375;
        bordFaceRightEyeBrowX2 = 425;
        bordFaceMouthX1 = 260;
        bordFaceMouthX2 = 400;
        eyeBrowArcStart = 0;
        eyeBrowArcEnd = 0;
        mouthArcStart = 0;
        mouthArcEnd = 0;
        repaint();
    }
    
    /*
     * make face look froce smaile
     */
    public void setwrySmileFace() {
        setBordFaceOff();
        mouthArcStart = 185;
        mouthArcEnd = 175;
        eyeBrowArcStart = 185;
        eyeBrowArcEnd = 175;
        eyeLevel = 17;
        repaint();
        
    }
    
    /*
     * chage hat to cow boy hat
     */
    public void setCowBoyHat() {
        hat1 = cowBoyHat.getImage();
        hatWidth = 400;
        hatHeight = 200;
        hatX = 130;
        hatY = 0;
        repaint();
        
    }
    
    /*
     * chage hat to Base Ball Cap
     */
    public void setBaseBallCap() {
        hat1 = baseBallCap.getImage();
        hatWidth = 300;
        hatHeight = 200;
        hatX = 180;
        hatY = 20;
        repaint();
    }
    
    /*
     * chage hat to Foot Ball Helmet
     */
    public void setFootBallhelmet() {
        hat1 = footBallHemCap.getImage();
        hatWidth = 500;
        hatHeight = 450;
        hatX = 90;
        hatY = 30;
        repaint();
    }
    
    /*
     * chage hat to Chinese Hat
     */
    public void setChineseHat() {
        hat1 = chineseHat.getImage();
        hatWidth = 500;
        hatHeight = 300;
        hatX = 80;
        hatY = 0;
        repaint();
    }
    
    /*
     * chage hat to Mid East Hat
     */
    public void setMidEastHat() {
        hat1 = midEastHat.getImage();
        hatWidth = 220;
        hatHeight = 140;
        hatX = 220;
        hatY = 60;
        repaint();
    }
    
    /*
     * chage hat null
     */
    public void setNoHat() {
        hat1 = null;        
        repaint();
    }
    
    /*
     * when you press mini man on 
     * it set Transformed to false
     * , take out the weapon
     * and give the minman face back
     * then if you press up button it move up by 1,
     * if you press down button it down  up by 1,
     * if you press right button it right up by 1,
     * if you press left button it left up by 1,
     * if you press a it will paly punch sond;
     */
    public void miniMan(int e) {
        Transformed = false;
        weapon = null;        
        miniManTransformX = 0;
        repaint();
 
        if (e == 38) {
            miniManY = miniManY - 20;
            repaint();
        } else if (e == 40) {
            miniManY = miniManY + 20;
            repaint();
        } else if (e == 37) {
            miniManX = miniManX - 20;
            repaint();
        } else if (e == 39) {
            miniManX = miniManX + 20;
            repaint();
        }
        else if (e == 65){
            playSound("SharpPunch.wav");
        }
    }
    
    /*
     * for palying sound
     */
    public void playSound(String fileName) {
        try {
            InputStream in = new FileInputStream(fileName);
            AudioStream play = new AudioStream(in);
            AudioPlayer.player.start(play);
        } catch (FileNotFoundException ex) {
        } catch (IOException e) {
        }
    }
    
    /*
     * when you click transform button
     * the mini man will be the bigface's body
     */
    public void miniManTransformer() {

        Transformed = true;
        class miniManTransformer implements ActionListener {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if (miniManX != 210 && miniManX > 209) {
                    miniManX--;
                    repaint();                    
                    System.out.println(miniManY + " " + miniManX);
                } else if (miniManX != 210 && miniManX < 211) {
                    miniManX++;
                    repaint();
                    System.out.println(miniManY + " " + miniManX);
                } else if (miniManY != 75 && miniManY < 76) {
                    miniManY++;
                    repaint();
                    System.out.println(miniManY + " " + miniManX);
                } else if (miniManY != 75 && miniManY > 74) {
                    miniManY--;
                    repaint();
                    System.out.println(miniManY + "  " + miniManX);                    
                }
                if (miniManY == 75 && miniManX == 210) {
                    timer.stop();                    
                }
            }            
        }
        final int DELAY = 10; // 0.01 second
        timer = new Timer(DELAY, new miniManTransformer());        
        timer.start();
        
        miniManTransformX = -999;
        miniManFaceColor = faceColor;
        playSound("miniManTransformer.wav");
        repaint();
        
    }
    
    /*
     * give the mini man weapon
     */
    public void setWeapon() {
        if (Transformed) {
            weapon = lightsberOff.getImage();            
            repaint();
        }
    }
    
    /*
     * when click the lightsber will turn on,and play LightsaberTurnOn
     * then when you click 'a' it will paly LightsaberAtt
     */
    public void setWeaponOn(int e) {
        if (Transformed) {
            weapon = lightsberOn.getImage();            
            repaint();
            playSound("LightsaberTurnOn.wav");
            if (e == 65){
                playSound("LightsaberAtt.wav");
            }
        }
    }

    /*
     * when click the lightsber will turn on,and play LightsaberTurnOff
     * 
     */
    public void setWeaponOff() {
        if (Transformed) {
            weapon = lightsberOff.getImage();            
            repaint();
            playSound("LightsaberTurnOff.wav");
        }
    }
    
    @Override
    public void paintComponent(Graphics g) {
        final Graphics2D g2 = (Graphics2D) g;
        g2.setColor(faceColor);
        g2.fill(new Ellipse2D.Double(180, 120, 300, 300));//the face
        g2.setColor(Color.BLACK);
        g2.setColor(new Color(red, green, bule));
        g2.fill(new Ellipse2D.Double(260 - (eyeSize / 2), 230 + eyeLevel - (eyeSize / 2), eyeSize, eyeSize));//left eye
        g2.fill(new Ellipse2D.Double(400 - (eyeSize / 2), 230 + eyeLevel - (eyeSize / 2), eyeSize, eyeSize));//right eye
        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(5 + eyeBrowSize));
        g2.drawArc(235, 200 + eyeBrowLevel, 50, 30, eyeBrowArcStart, eyeBrowArcEnd);//left eyeBrow
        g2.drawArc(375, 200 + eyeBrowLevel, 50, 30, eyeBrowArcStart, eyeBrowArcEnd);//right eyeBrow
        g2.drawLine(bordFaceLeftEyeBrowX1, 200 + eyeBrowLevel, bordFaceLeftEyeBrowX2, 200 + eyeBrowLevel);//left eyeBrow Only for bord face
        g2.drawLine(bordFaceRightEyeBrowX1, 200 + eyeBrowLevel, bordFaceRightEyeBrowX2, 200 + eyeBrowLevel);//right eyeBrow Only for bord face
        g2.setStroke(new BasicStroke(5));
        g2.drawArc(240, 300, 170, 50, mouthArcStart, mouthArcEnd);//mouth
        g2.drawLine(bordFaceMouthX1, 340, bordFaceMouthX2, 340);//mouth Only for bord face
        g2.drawImage(hat1, hatX, hatY, hatWidth, hatHeight, this);//for the hat

        //miniMan
        g2.setColor(miniManFaceColor);
        g2.fill(new Ellipse2D.Double(100 + miniManX, 300 + miniManY, 50, 50));//head
        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(2));
        g2.drawLine(113 + miniManX + miniManTransformX, 320 + miniManY, 118 + miniManX + miniManTransformX, 320 + miniManY);//eye
        g2.drawLine(133 + miniManX + miniManTransformX, 320 + miniManY, 138 + miniManX + miniManTransformX, 320 + miniManY);//eye
        g2.drawLine(118 + miniManX + miniManTransformX, 330 + miniManY, 133 + miniManX + miniManTransformX, 330 + miniManY);//mouth
        g2.setColor(Color.red);
        g2.fill(new Rectangle(100 + miniManX, 345 + miniManY, 50, 70));//body
        g2.setColor(Color.BLUE);
        g2.fill(new Rectangle(128 + miniManX, 415 + miniManY, 20, 60));//rightleg
        g2.fill(new Rectangle(102 + miniManX, 415 + miniManY, 20, 60));//leftleg
        g2.setColor(Color.GREEN);
        g2.fill(new Rectangle(150 + miniManX, 347 + miniManY, 15, 45));//right arm
        g2.fill(new Rectangle(85 + miniManX, 347 + miniManY, 15, 45));//legt arm
        
        g2.drawImage(weapon, 355, 275, 200, 200, this);// for the wepon
        
        
    }
}
