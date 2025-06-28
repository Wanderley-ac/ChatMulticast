package com.mycompany.multicastchat;

import java.awt.event.KeyEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Login extends javax.swing.JFrame {

    //Definindo monitoramento e configuração do logger.
    private static final Logger logger = LoggerFactory.getLogger(Login.class);

    public Login() {
        initComponents();
        initialConfiguration();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginPanel = new javax.swing.JPanel();
        lbl_username = new javax.swing.JLabel();
        input_username = new javax.swing.JTextField();
        btn_enter = new javax.swing.JButton();
        birdLabel = new javax.swing.JLabel();
        btn_clear = new javax.swing.JButton();
        lblhp_username = new javax.swing.JLabel();
        lbl_title = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lbl_username.setText("*Username");

        input_username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                input_usernameFocusGained(evt);
            }
        });
        input_username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                input_usernameKeyPressed(evt);
            }
        });

        btn_enter.setText("Enter");
        btn_enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_enterActionPerformed(evt);
            }
        });

        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        lblhp_username.setForeground(new java.awt.Color(255, 0, 0));
        lblhp_username.setText("* Enter a username");

        lbl_title.setFont(new java.awt.Font("MS Gothic", 0, 24)); // NOI18N
        lbl_title.setText("MULTICAST CHAT");

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(birdLabel))
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblhp_username)
                            .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(loginPanelLayout.createSequentialGroup()
                                    .addComponent(lbl_username)
                                    .addGap(261, 261, 261))
                                .addGroup(loginPanelLayout.createSequentialGroup()
                                    .addComponent(btn_clear)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn_enter)))
                            .addComponent(input_username, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_title))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addComponent(birdLabel)
                .addGap(18, 18, 18)
                .addComponent(lbl_title)
                .addGap(18, 18, 18)
                .addComponent(lbl_username)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(input_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblhp_username)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_clear)
                    .addComponent(btn_enter))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Checa os campos e prossegue com a comunicação (Mas quando a tecla Enter é pressionada).
    private void input_usernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_usernameKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) { //Clique na tecla enter
            checkFields();
        }
    }//GEN-LAST:event_input_usernameKeyPressed

    //Checa os capos e prossegue com a comunicação.
    private void btn_enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_enterActionPerformed
        checkFields();
    }//GEN-LAST:event_btn_enterActionPerformed

    //Limpa a entrada e mensagens de erro.
    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        input_username.setText("");
        lblhp_username.setVisible(Boolean.FALSE);
    }//GEN-LAST:event_btn_clearActionPerformed

    //Apaga mensagens de erro quando o input é focado (selecionado).
    private void input_usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_input_usernameFocusGained
        lblhp_username.setVisible(Boolean.FALSE);
    }//GEN-LAST:event_input_usernameFocusGained

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel birdLabel;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_enter;
    private javax.swing.JTextField input_username;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JLabel lbl_username;
    private javax.swing.JLabel lblhp_username;
    private javax.swing.JPanel loginPanel;
    // End of variables declaration//GEN-END:variables

    //Verifica os campos de entrada do login.
    private void checkFields() {
        if (input_username.getText().isEmpty()) {
            lblhp_username.setVisible(Boolean.TRUE);
        } else {
            Chat chat = new Chat(input_username.getText());
            chat.setVisible(Boolean.TRUE);
            this.dispose();
        }
    }

    //Define as configurações iniciais do painel de login.
    private void initialConfiguration() {
        lblhp_username.setVisible(Boolean.FALSE);
    }
}
