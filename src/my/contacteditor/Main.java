/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.contacteditor;

import javax.swing.JOptionPane;

/**
 *
 * @author Stingwingi
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Main() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        getFinFrame = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lengthBaget = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        finFrame = new javax.swing.JTextField();
        smallFragmentFrame = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        widthBaget = new javax.swing.JTextField();
        bigFragmentFrame = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        bigFragmentPasp = new javax.swing.JTextField();
        smallFragmentPasp = new javax.swing.JTextField();
        hideFragment = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        xPasp = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        yPasp = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        finPasp = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        getFinPasp = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Калькулятор для расчета материала");
        setAutoRequestFocus(false);
        setFocusCycleRoot(false);
        setForeground(new java.awt.Color(0, 0, 0));
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.setAlignmentX(0.1F);
        jTabbedPane1.setAlignmentY(0.1F);
        jTabbedPane1.setAutoscrolls(true);
        jTabbedPane1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(515, 317));
        jTabbedPane1.setName(""); // NOI18N
        jTabbedPane1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTabbedPane1FocusGained(evt);
            }
        });
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jPanel1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jPanel1.setDoubleBuffered(false);
        jPanel1.setFocusable(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(450, 350));
        jPanel1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPanel1FocusLost(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("Расчет кол-ва материала");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        getFinFrame.setEditable(false);
        getFinFrame.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        getFinFrame.setText("0");
        getFinFrame.setToolTipText("<html>Необходимое кол-во реек для<p>изготовления указанного  кол-ва<p>рам с заданными габаритами");
        getFinFrame.setAutoscrolls(false);
        getFinFrame.setOpaque(false);
        getFinFrame.setSelectionColor(new java.awt.Color(102, 153, 255));
        getFinFrame.setVerifyInputWhenFocusTarget(false);
        getFinFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getFinFrameActionPerformed(evt);
            }
        });
        jPanel1.add(getFinFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 40, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 430, 10));

        lengthBaget.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        lengthBaget.setText("0");
        lengthBaget.setToolTipText("Укажите заводскую длину рейки поставщика.");
        lengthBaget.setAutoscrolls(false);
        lengthBaget.setOpaque(false);
        lengthBaget.setSelectionColor(new java.awt.Color(102, 153, 255));
        jPanel1.add(lengthBaget, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 40, -1));

        jLabel5.setText("Длина рейки");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 390, -1));

        jLabel6.setText("Кол-во рам");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 160, -1, -1));

        finFrame.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        finFrame.setText("0");
        finFrame.setToolTipText("Укажите необходимое кол-во рам.");
        finFrame.setAutoscrolls(false);
        finFrame.setMinimumSize(new java.awt.Dimension(12, 20));
        finFrame.setOpaque(false);
        finFrame.setSelectionColor(new java.awt.Color(102, 153, 255));
        jPanel1.add(finFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 40, -1));

        smallFragmentFrame.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        smallFragmentFrame.setText("0");
        smallFragmentFrame.setToolTipText("Укажите меньшую сторону рамы");
        smallFragmentFrame.setAutoscrolls(false);
        smallFragmentFrame.setOpaque(false);
        smallFragmentFrame.setSelectionColor(new java.awt.Color(102, 153, 255));
        smallFragmentFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smallFragmentFrameActionPerformed(evt);
            }
        });
        jPanel1.add(smallFragmentFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 40, -1));

        jLabel1.setText("Большая сторона рамы");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, -1));

        jLabel2.setText("Меньшая сторона рамы");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 395, -1));

        widthBaget.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        widthBaget.setText("0");
        widthBaget.setToolTipText("<html><p>Введите ширину багета для расчета кол-ва<p>материала по внутренним размерам рамы.<p>Оставьте значение равным нулю для расчета<p>по внешним габаритам рамы");
        widthBaget.setAutoscrolls(false);
        widthBaget.setOpaque(false);
        widthBaget.setSelectionColor(new java.awt.Color(102, 153, 255));
        widthBaget.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                widthBagetActionPerformed(evt);
            }
        });
        jPanel1.add(widthBaget, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 40, -1));

        bigFragmentFrame.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        bigFragmentFrame.setText("0");
        bigFragmentFrame.setToolTipText("Укажите большую сторону рамы");
        bigFragmentFrame.setAutoscrolls(false);
        bigFragmentFrame.setOpaque(false);
        bigFragmentFrame.setSelectionColor(new java.awt.Color(102, 153, 255));
        bigFragmentFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bigFragmentFrameActionPerformed(evt);
            }
        });
        bigFragmentFrame.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bigFragmentFrameKeyPressed(evt);
            }
        });
        jPanel1.add(bigFragmentFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 40, -1));

        jLabel3.setText("Ширина багета");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 395, -1));

        jButton1.setText("Принять");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, -1, -1));

        jButton2.setText("Выход");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, 75, -1));

        jTabbedPane1.addTab("Рама", jPanel1);

        jPanel2.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jPanel2.setDoubleBuffered(false);
        jPanel2.setFocusable(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(450, 350));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bigFragmentPasp.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        bigFragmentPasp.setText("0");
        bigFragmentPasp.setToolTipText("Укажите большую сторону паспарту ");
        bigFragmentPasp.setAutoscrolls(false);
        bigFragmentPasp.setOpaque(false);
        bigFragmentPasp.setSelectionColor(new java.awt.Color(102, 153, 255));
        jPanel2.add(bigFragmentPasp, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 40, -1));

        smallFragmentPasp.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        smallFragmentPasp.setText("0");
        smallFragmentPasp.setToolTipText("Укажите меньшую сторону паспарту ");
        smallFragmentPasp.setAutoscrolls(false);
        smallFragmentPasp.setOpaque(false);
        smallFragmentPasp.setSelectionColor(new java.awt.Color(102, 153, 255));
        jPanel2.add(smallFragmentPasp, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 40, -1));

        hideFragment.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        hideFragment.setText("0");
        hideFragment.setToolTipText("<html><p>Укажите часть паспарту<p>скрытую припуском багета.<p>для расчета изделия \"в свету\"");
        hideFragment.setAutoscrolls(false);
        hideFragment.setOpaque(false);
        hideFragment.setSelectionColor(new java.awt.Color(102, 153, 255));
        jPanel2.add(hideFragment, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 40, -1));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 430, 10));

        xPasp.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        xPasp.setText("0");
        xPasp.setToolTipText("<html>Укажите заводскую<p>длину листа паспарту.");
        xPasp.setAutoscrolls(false);
        xPasp.setOpaque(false);
        xPasp.setSelectionColor(new java.awt.Color(102, 153, 255));
        jPanel2.add(xPasp, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 40, -1));

        jLabel11.setText("Большая сторона");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 185, -1));

        jLabel12.setText("Меньшая сторона");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 395, -1));

        jLabel13.setText("Скрытая часть");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 395, -1));

        jLabel14.setText("Длина листа паспарту");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 170, -1));

        jLabel7.setText("Ширина листа паспарту");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 280, -1));

        yPasp.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        yPasp.setText("0");
        yPasp.setToolTipText("<html>Укажите заводскую<p>ширину листа паспарту.");
        yPasp.setAutoscrolls(false);
        yPasp.setOpaque(false);
        yPasp.setSelectionColor(new java.awt.Color(102, 153, 255));
        yPasp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yPaspActionPerformed(evt);
            }
        });
        jPanel2.add(yPasp, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 40, -1));

        jLabel8.setText("Необходимое кол-во вырезанного паспарту");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 380, -1));

        finPasp.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        finPasp.setText("0");
        finPasp.setToolTipText("<html>Укажите необходимое кол-ва<p>готовых изделий.");
        finPasp.setAutoscrolls(false);
        finPasp.setOpaque(false);
        finPasp.setSelectionColor(new java.awt.Color(102, 153, 255));
        jPanel2.add(finPasp, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 40, -1));

        jLabel9.setText("Расчет необходимого кол-во листов");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        getFinPasp.setEditable(false);
        getFinPasp.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        getFinPasp.setText("0");
        getFinPasp.setToolTipText("<html>Необходимое кол-ва листов паспарту<p>заданых размеров для изготовления<p>указанного кол-ва изделий ");
        getFinPasp.setAutoscrolls(false);
        getFinPasp.setHighlighter(null);
        getFinPasp.setOpaque(false);
        getFinPasp.setSelectionColor(new java.awt.Color(102, 153, 255));
        jPanel2.add(getFinPasp, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 40, -1));

        jButton3.setText("Принять");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, -1, -1));

        jButton4.setText("Выход");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, 75, -1));

        jTabbedPane1.addTab("Паспарту", jPanel2);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jTabbedPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jTabbedPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 302, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        if (bigFragmentFrame.getText().trim().length() == 0 || smallFragmentFrame.getText().length() == 0) {

            JOptionPane.showMessageDialog(null, "Заполните поля для расчета", "Внимание", JOptionPane.ERROR_MESSAGE);
        }

        int bigfragment = Integer.parseInt(bigFragmentFrame.getText());
        int smallfragment = Integer.parseInt(smallFragmentFrame.getText());
        int width = Integer.parseInt(widthBaget.getText());
        int length = Integer.parseInt(lengthBaget.getText());
        int cont_fin_frame = Integer.parseInt(finFrame.getText());
        int cont_small_fragment = 0;
        int cont_big_fragment = 0;
        int temp = length;
        int cont_fin_rek = 1;
        if (bigfragment > length) {
            JOptionPane.showMessageDialog(null, "Большая сторона рамы больше длины рейки", "Внимание", JOptionPane.ERROR_MESSAGE);
        } else if (smallfragment > length) {
            JOptionPane.showMessageDialog(null, "Меньшая сторона рамы больше длины рейки", "Внимание", JOptionPane.ERROR_MESSAGE);
        } else if (smallfragment > bigfragment) {
            JOptionPane.showMessageDialog(null, "Поменяйте местами значения большей и меньшей сторон рамы", "Внимание", JOptionPane.ERROR_MESSAGE);
        } else if (smallfragment <= 0 || bigfragment <= 0) {
            JOptionPane.showMessageDialog(null, "Значение сторон рамы не должны быть отрицательным или равным нулю", "Внимание", JOptionPane.ERROR_MESSAGE);
        }
        while (cont_big_fragment != (cont_fin_frame * 2)) {
            if (length >= bigfragment) {

                length = length - bigfragment;
                cont_big_fragment++;
            }
            if ((length < bigfragment) && (length >= smallfragment) && cont_small_fragment != (cont_fin_frame * 2)) {
                length = length - smallfragment;
                cont_small_fragment++;
            } else if (length < smallfragment) {
                cont_fin_rek++;
                length = temp;
            }
        }

        if (cont_big_fragment == (cont_fin_frame * 2)) {
            while (cont_small_fragment != (cont_fin_frame * 2)) {
                if (length >= smallfragment) {
                    length = length - smallfragment;
                    cont_small_fragment++;
                }
                if (length < smallfragment && cont_small_fragment != (cont_fin_frame * 2)) {
                    cont_fin_rek++;
                    length = temp;
                }
            }
        }
        getFinFrame.setText(String.valueOf(cont_fin_rek));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void smallFragmentFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smallFragmentFrameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_smallFragmentFrameActionPerformed

    private void bigFragmentFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bigFragmentFrameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bigFragmentFrameActionPerformed

    private void bigFragmentFrameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bigFragmentFrameKeyPressed

    }//GEN-LAST:event_bigFragmentFrameKeyPressed

    private void widthBagetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_widthBagetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_widthBagetActionPerformed

    private void getFinFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getFinFrameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getFinFrameActionPerformed

    private void yPaspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yPaspActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yPaspActionPerformed

    private void jTabbedPane1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTabbedPane1FocusGained

    }//GEN-LAST:event_jTabbedPane1FocusGained

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked

    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void jPanel1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel1FocusLost

    }//GEN-LAST:event_jPanel1FocusLost

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (bigFragmentPasp.getText().trim().length() == 0 || smallFragmentPasp.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Заполните поля для расчета", "Внимание", JOptionPane.ERROR_MESSAGE);
        }
        int bigfragment = Integer.parseInt(bigFragmentPasp.getText());
        int smallfragment = Integer.parseInt(smallFragmentPasp.getText());
        int hide = Integer.parseInt(hideFragment.getText());
        int xpasp = Integer.parseInt(xPasp.getText());
        int ypasp = Integer.parseInt(yPasp.getText());
        int fincusok = Integer.parseInt(finPasp.getText());
        int temp = 0;//Переменная для хранения временного значения
        int cusok = 0; // Счетчик кусков
        int end = 1; // Счетчик листов

        if (bigfragment < smallfragment) {
            JOptionPane.showMessageDialog(null, "Поменяйте местами значения меньшей и большей стороны паспарту", "Внимание", JOptionPane.ERROR_MESSAGE);

        } else if (xpasp <= 0 || ypasp <= 0) {

            JOptionPane.showMessageDialog(null, "Введите корректные значения длины и ширины листа паспарту", "Внимание", JOptionPane.ERROR_MESSAGE);

        } else if (bigfragment <= 0 || smallfragment <= 0) {

            JOptionPane.showMessageDialog(null, "Значения большей и меньшей стороны паспарту не должны быть отрицательным или равным нулю", "Внимание", JOptionPane.ERROR_MESSAGE);
        } else if (bigfragment > xpasp && bigfragment > ypasp) {

            JOptionPane.showMessageDialog(null, "Листа паспарту с заданными параметрами не хватит для расчета", "Внимание", JOptionPane.ERROR_MESSAGE);
        }

// Правельнее было бы провести проверку до запуска цикла чтобы на каждом его шагу ее не повторять. Проверяем двумя условиями как лучше резать по длине или ширине и считаем материал
        while (cusok < fincusok) {

            if ((ypasp >= bigfragment) && ((xpasp / smallfragment) * (ypasp / bigfragment) >= ((xpasp / bigfragment) * (ypasp / smallfragment)))) {
                temp = (xpasp / smallfragment) * (ypasp / bigfragment);
                cusok += temp;
                if (smallfragment <= (ypasp % bigfragment)) //проверяем можем ли перевернуть остаток от листа сделать еще куски
                {
                    temp = xpasp / bigfragment;
                    cusok += temp;
                }
                if (cusok < fincusok) {
                    end++;
                }
            }
            if (((xpasp / smallfragment) * (ypasp / bigfragment) < ((xpasp / bigfragment) * (ypasp / smallfragment)))) {
                temp = (xpasp / bigfragment) * (ypasp / smallfragment);
                cusok += temp;

                if (smallfragment <= (xpasp % bigfragment)) //аналогичная проверка
                {
                    temp = ypasp / bigfragment;
                    cusok += temp;
                }
                if (cusok < fincusok) {
                    end++;
                }
            }
        }

        getFinPasp.setText(String.valueOf(end));
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bigFragmentFrame;
    private javax.swing.JTextField bigFragmentPasp;
    private javax.swing.JTextField finFrame;
    private javax.swing.JTextField finPasp;
    private javax.swing.JTextField getFinFrame;
    private javax.swing.JTextField getFinPasp;
    private javax.swing.JTextField hideFragment;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField lengthBaget;
    private javax.swing.JTextField smallFragmentFrame;
    private javax.swing.JTextField smallFragmentPasp;
    private javax.swing.JTextField widthBaget;
    private javax.swing.JTextField xPasp;
    private javax.swing.JTextField yPasp;
    // End of variables declaration//GEN-END:variables
}
