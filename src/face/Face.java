
package face;

/**
 * @author hanlin Shen
 * @version May 7 2013
 *    GUI control used
 *    slider, button, key listener.
 *    I put in image and sound.
 *    used timer to do the animation for Transformer.
 */
public class Face extends javax.swing.JFrame {

    /**
     * Creates new form Face
     */
    public Face() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hatButtonGroup = new javax.swing.ButtonGroup();
        myFace1 = new face.MyFace();
        reset = new javax.swing.JButton();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        eyeSize = new javax.swing.JSlider();
        eyeLevel = new javax.swing.JSlider();
        eyeColor = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Red = new javax.swing.JSlider();
        Green = new javax.swing.JSlider();
        Bule = new javax.swing.JSlider();
        eyeBrowSize = new javax.swing.JSlider();
        eyeBrowLevel = new javax.swing.JSlider();
        face = new javax.swing.JPanel();
        faceColor = new javax.swing.JColorChooser();
        hat = new javax.swing.JPanel();
        cowboyHat = new javax.swing.JCheckBox();
        baseballCap = new javax.swing.JCheckBox();
        footBallHelmet = new javax.swing.JCheckBox();
        chineseHat = new javax.swing.JCheckBox();
        midEastHat = new javax.swing.JCheckBox();
        noHat = new javax.swing.JCheckBox();
        expression = new javax.swing.JPanel();
        happyFace = new javax.swing.JButton();
        sadFace = new javax.swing.JButton();
        boredFace = new javax.swing.JButton();
        wrySmile = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        Transformer = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        armOn = new javax.swing.JButton();
        armOff = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        hatButtonGroup.add(cowboyHat);
        hatButtonGroup.add(baseballCap);
        hatButtonGroup.add(footBallHelmet);
        hatButtonGroup.add(chineseHat);
        hatButtonGroup.add(midEastHat);
        hatButtonGroup.add(noHat);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Face and mini man");
        setBackground(new java.awt.Color(255, 0, 102));

        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        jTabbedPane3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255), 5));
        jTabbedPane3.setToolTipText("");

        eyeSize.setMajorTickSpacing(10);
        eyeSize.setPaintLabels(true);
        eyeSize.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                eyeSizeStateChanged(evt);
            }
        });
        jTabbedPane3.addTab("eye size", eyeSize);

        eyeLevel.setMajorTickSpacing(10);
        eyeLevel.setMaximum(50);
        eyeLevel.setMinimum(-50);
        eyeLevel.setPaintLabels(true);
        eyeLevel.setToolTipText("");
        eyeLevel.setValue(0);
        eyeLevel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        eyeLevel.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                eyeLevelStateChanged(evt);
            }
        });
        jTabbedPane3.addTab("eye level", eyeLevel);

        jLabel4.setText("Red");

        jLabel5.setText("Green");

        jLabel6.setText("Green");

        Red.setMaximum(255);
        Red.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                RedStateChanged(evt);
            }
        });

        Green.setMaximum(255);
        Green.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                GreenStateChanged(evt);
            }
        });

        Bule.setMaximum(255);
        Bule.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                BuleStateChanged(evt);
            }
        });

        javax.swing.GroupLayout eyeColorLayout = new javax.swing.GroupLayout(eyeColor);
        eyeColor.setLayout(eyeColorLayout);
        eyeColorLayout.setHorizontalGroup(
            eyeColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eyeColorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(eyeColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, eyeColorLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 425, Short.MAX_VALUE)
                        .addComponent(Red, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, eyeColorLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Bule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, eyeColorLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Green, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        eyeColorLayout.setVerticalGroup(
            eyeColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eyeColorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(eyeColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Red, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(eyeColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(eyeColorLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(Green, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(eyeColorLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)))
                .addGroup(eyeColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(eyeColorLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Bule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(eyeColorLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)))
                .addContainerGap(276, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("eye color ", eyeColor);

        eyeBrowSize.setMajorTickSpacing(10);
        eyeBrowSize.setMaximum(5);
        eyeBrowSize.setMinimum(-5);
        eyeBrowSize.setPaintLabels(true);
        eyeBrowSize.setToolTipText("");
        eyeBrowSize.setValue(0);
        eyeBrowSize.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                eyeBrowSizeStateChanged(evt);
            }
        });
        jTabbedPane3.addTab("eye brow size", eyeBrowSize);

        eyeBrowLevel.setMajorTickSpacing(10);
        eyeBrowLevel.setMaximum(50);
        eyeBrowLevel.setMinimum(-50);
        eyeBrowLevel.setPaintLabels(true);
        eyeBrowLevel.setValue(0);
        eyeBrowLevel.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                eyeBrowLevelStateChanged(evt);
            }
        });
        jTabbedPane3.addTab("eye brow level", eyeBrowLevel);

        face.setLayout(new java.awt.BorderLayout());

        faceColor.setColor(new java.awt.Color(255, 255, 51));
        faceColor.addHierarchyBoundsListener(new java.awt.event.HierarchyBoundsListener() {
            public void ancestorMoved(java.awt.event.HierarchyEvent evt) {
            }
            public void ancestorResized(java.awt.event.HierarchyEvent evt) {
                faceColorAncestorResized(evt);
            }
        });
        face.add(faceColor, java.awt.BorderLayout.CENTER);

        jTabbedPane3.addTab("face color", face);

        cowboyHat.setText("Cowboy hat");
        cowboyHat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cowboyHatActionPerformed(evt);
            }
        });

        baseballCap.setText("Baseball cap");
        baseballCap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baseballCapActionPerformed(evt);
            }
        });

        footBallHelmet.setText("FootBall Helmet");
        footBallHelmet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                footBallHelmetActionPerformed(evt);
            }
        });

        chineseHat.setText("Chinese hat");
        chineseHat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chineseHatActionPerformed(evt);
            }
        });

        midEastHat.setText("MidEast hat");
        midEastHat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                midEastHatActionPerformed(evt);
            }
        });

        noHat.setText("No Hat");
        noHat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noHatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout hatLayout = new javax.swing.GroupLayout(hat);
        hat.setLayout(hatLayout);
        hatLayout.setHorizontalGroup(
            hatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hatLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(hatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(footBallHelmet)
                    .addComponent(baseballCap)
                    .addComponent(cowboyHat)
                    .addGroup(hatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(chineseHat)
                        .addGroup(hatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(noHat)
                            .addComponent(midEastHat))))
                .addContainerGap(527, Short.MAX_VALUE))
        );
        hatLayout.setVerticalGroup(
            hatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hatLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(cowboyHat)
                .addGap(18, 18, 18)
                .addComponent(baseballCap)
                .addGap(18, 18, 18)
                .addComponent(footBallHelmet)
                .addGap(18, 18, 18)
                .addComponent(chineseHat)
                .addGap(18, 18, 18)
                .addComponent(midEastHat)
                .addGap(18, 18, 18)
                .addComponent(noHat)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("hat", hat);

        happyFace.setText("Happy");
        happyFace.setPreferredSize(new java.awt.Dimension(51, 23));
        happyFace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                happyFaceActionPerformed(evt);
            }
        });

        sadFace.setText("Sad");
        sadFace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sadFaceActionPerformed(evt);
            }
        });

        boredFace.setText("Bored");
        boredFace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boredFaceActionPerformed(evt);
            }
        });

        wrySmile.setText("Wry Smile");
        wrySmile.setPreferredSize(new java.awt.Dimension(51, 23));
        wrySmile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wrySmileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout expressionLayout = new javax.swing.GroupLayout(expression);
        expression.setLayout(expressionLayout);
        expressionLayout.setHorizontalGroup(
            expressionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(expressionLayout.createSequentialGroup()
                .addContainerGap(133, Short.MAX_VALUE)
                .addGroup(expressionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boredFace, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sadFace, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(115, 115, 115)
                .addGroup(expressionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(wrySmile, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(happyFace, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(126, 126, 126))
        );
        expressionLayout.setVerticalGroup(
            expressionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(expressionLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(expressionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sadFace, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(happyFace, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(88, 88, 88)
                .addGroup(expressionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wrySmile, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boredFace, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Expression", expression);

        jButton1.setText("Mini Man On");
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        Transformer.setText("Transformer");
        Transformer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransformerActionPerformed(evt);
            }
        });

        jButton2.setText("Arm");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        armOn.setText("On");
        armOn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                armOnActionPerformed(evt);
            }
        });
        armOn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                armOnKeyPressed(evt);
            }
        });

        armOff.setText("Off");
        armOff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                armOffActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Use button up,down,right and left \nto move the mini man , \npress A to attack.\n\nBefor Mini Man transformed\nhe can't carry a weapon, so \nhe can only use fist to \nattack.\n\nAfter transformed, he will \nbe able to use a weapon \nbut you need to turn it on.");
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(Transformer, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(148, 148, 148)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(armOn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(armOff)
                                .addContainerGap())))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Transformer, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(armOn)
                            .addComponent(armOff))))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Mini Man Control Panel", jPanel1);

        javax.swing.GroupLayout myFace1Layout = new javax.swing.GroupLayout(myFace1);
        myFace1.setLayout(myFace1Layout);
        myFace1Layout.setHorizontalGroup(
            myFace1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myFace1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(myFace1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(myFace1Layout.createSequentialGroup()
                        .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myFace1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(reset)))
                .addContainerGap())
        );
        myFace1Layout.setVerticalGroup(
            myFace1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myFace1Layout.createSequentialGroup()
                .addContainerGap(521, Short.MAX_VALUE)
                .addComponent(reset)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(159, 159, 159))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(myFace1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(myFace1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eyeBrowLevelStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_eyeBrowLevelStateChanged
        myFace1.setEyeBrowLevel(eyeBrowLevel.getValue());
    }//GEN-LAST:event_eyeBrowLevelStateChanged

    private void eyeBrowSizeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_eyeBrowSizeStateChanged
        myFace1.setEyeBrowSize(eyeBrowSize.getValue());
    }//GEN-LAST:event_eyeBrowSizeStateChanged

    private void BuleStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_BuleStateChanged
        myFace1.setEyeColorBule(Bule.getValue());
    }//GEN-LAST:event_BuleStateChanged

    private void GreenStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_GreenStateChanged
        myFace1.setEyeColorGreen(Green.getValue());
    }//GEN-LAST:event_GreenStateChanged

    private void RedStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_RedStateChanged
        myFace1.setEyeColorRed(Red.getValue());
    }//GEN-LAST:event_RedStateChanged

    private void eyeLevelStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_eyeLevelStateChanged
        myFace1.setEyeLevel(eyeLevel.getValue());
    }//GEN-LAST:event_eyeLevelStateChanged

    private void eyeSizeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_eyeSizeStateChanged
        myFace1.setEyeSize(eyeSize.getValue());
    }//GEN-LAST:event_eyeSizeStateChanged

    private void faceColorAncestorResized(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_faceColorAncestorResized
        myFace1.setFaceColor(faceColor.getColor());
    }//GEN-LAST:event_faceColorAncestorResized

    private void cowboyHatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cowboyHatActionPerformed
        myFace1.setCowBoyHat();
    }//GEN-LAST:event_cowboyHatActionPerformed

    private void midEastHatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_midEastHatActionPerformed
        myFace1.setMidEastHat();
    }//GEN-LAST:event_midEastHatActionPerformed

    private void baseballCapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baseballCapActionPerformed
        myFace1.setBaseBallCap();
    }//GEN-LAST:event_baseballCapActionPerformed

    private void happyFaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_happyFaceActionPerformed
        myFace1.setHappyFace();
    }//GEN-LAST:event_happyFaceActionPerformed

    private void sadFaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sadFaceActionPerformed
        myFace1.setSadFace();
    }//GEN-LAST:event_sadFaceActionPerformed

    private void boredFaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boredFaceActionPerformed
        myFace1.setBordFace();
    }//GEN-LAST:event_boredFaceActionPerformed

    private void wrySmileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wrySmileActionPerformed
        myFace1.setwrySmileFace();
    }//GEN-LAST:event_wrySmileActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        myFace1.reset();
    }//GEN-LAST:event_resetActionPerformed

    private void footBallHelmetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_footBallHelmetActionPerformed
        myFace1.setFootBallhelmet();
    }//GEN-LAST:event_footBallHelmetActionPerformed

    private void chineseHatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chineseHatActionPerformed
        myFace1.setChineseHat();
    }//GEN-LAST:event_chineseHatActionPerformed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        myFace1.miniMan(evt.getKeyCode());
    }//GEN-LAST:event_jButton1KeyPressed

    private void TransformerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransformerActionPerformed
        myFace1.miniManTransformer();
    }//GEN-LAST:event_TransformerActionPerformed

    private void noHatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noHatActionPerformed
        myFace1.setNoHat();
    }//GEN-LAST:event_noHatActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        myFace1.setWeapon();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void armOnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_armOnActionPerformed
        myFace1.setWeaponOn(0);
    }//GEN-LAST:event_armOnActionPerformed

    private void armOffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_armOffActionPerformed
        myFace1.setWeaponOff();
    }//GEN-LAST:event_armOffActionPerformed

    private void armOnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_armOnKeyPressed
        myFace1.setWeaponOn(evt.getKeyCode());
    }//GEN-LAST:event_armOnKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Face.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Face.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Face.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Face.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Face().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSlider Bule;
    private javax.swing.JSlider Green;
    private javax.swing.JSlider Red;
    private javax.swing.JButton Transformer;
    private javax.swing.JButton armOff;
    private javax.swing.JButton armOn;
    private javax.swing.JCheckBox baseballCap;
    private javax.swing.JButton boredFace;
    private javax.swing.JCheckBox chineseHat;
    private javax.swing.JCheckBox cowboyHat;
    private javax.swing.JPanel expression;
    private javax.swing.JSlider eyeBrowLevel;
    private javax.swing.JSlider eyeBrowSize;
    private javax.swing.JPanel eyeColor;
    private javax.swing.JSlider eyeLevel;
    private javax.swing.JSlider eyeSize;
    private javax.swing.JPanel face;
    private javax.swing.JColorChooser faceColor;
    private javax.swing.JCheckBox footBallHelmet;
    private javax.swing.JButton happyFace;
    private javax.swing.JPanel hat;
    private javax.swing.ButtonGroup hatButtonGroup;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JCheckBox midEastHat;
    private face.MyFace myFace1;
    private javax.swing.JCheckBox noHat;
    private javax.swing.JButton reset;
    private javax.swing.JButton sadFace;
    private javax.swing.JButton wrySmile;
    // End of variables declaration//GEN-END:variables
}