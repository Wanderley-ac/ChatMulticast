package com.mycompany.multicastchat;

import java.awt.event.KeyEvent;
import java.net.InetAddress;
import java.net.UnknownHostException;
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
        lbl_serverAddress = new javax.swing.JLabel();
        lblhp_multicastAddress = new javax.swing.JLabel();
        lbl_port = new javax.swing.JLabel();
        lblhp_port = new javax.swing.JLabel();
        input_port = new javax.swing.JFormattedTextField();
        input_multicastAddress = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lbl_username.setText("* Username");

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

        lbl_serverAddress.setText("* Multicast Address");

        lblhp_multicastAddress.setForeground(new java.awt.Color(255, 0, 0));
        lblhp_multicastAddress.setText("* Enter a valid multicast address");

        lbl_port.setText("* Port");

        lblhp_port.setForeground(new java.awt.Color(255, 0, 0));
        lblhp_port.setText("* Enter a valid port");

        input_port.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                input_portFocusGained(evt);
            }
        });
        input_port.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                input_portKeyPressed(evt);
            }
        });

        input_multicastAddress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                input_multicastAddressFocusGained(evt);
            }
        });
        input_multicastAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                input_multicastAddressKeyPressed(evt);
            }
        });

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
                        .addGap(48, 48, 48)
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(loginPanelLayout.createSequentialGroup()
                                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_title)
                                    .addComponent(lbl_username)
                                    .addGroup(loginPanelLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(input_username, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblhp_username))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(loginPanelLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(loginPanelLayout.createSequentialGroup()
                                        .addComponent(btn_clear)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_enter))
                                    .addGroup(loginPanelLayout.createSequentialGroup()
                                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblhp_multicastAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lbl_serverAddress)
                                            .addComponent(input_multicastAddress))
                                        .addGap(31, 31, 31)
                                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblhp_port)
                                            .addComponent(lbl_port)
                                            .addComponent(input_port))))))))
                .addGap(43, 43, 43))
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
                .addGap(18, 18, 18)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_serverAddress)
                    .addComponent(lbl_port))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_port, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(input_multicastAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblhp_multicastAddress)
                    .addComponent(lblhp_port))
                .addGap(0, 63, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_clear)
                    .addComponent(btn_enter))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Checa os campos e prossegue com a comunicação (Mas quando a tecla Enter é pressionada).
    private void input_usernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_usernameKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            sendLogin();
        }
    }//GEN-LAST:event_input_usernameKeyPressed

    //Checa os capos e prossegue com a comunicação.
    private void btn_enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_enterActionPerformed
        sendLogin();
    }//GEN-LAST:event_btn_enterActionPerformed

    //Limpa a entrada e mensagens de erro.
    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        clearFields();
        clearErrorMessages();
    }//GEN-LAST:event_btn_clearActionPerformed

    //Apaga mensagens de erro quando o input é focado (selecionado).
    private void input_usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_input_usernameFocusGained
        lblhp_username.setVisible(Boolean.FALSE);
    }//GEN-LAST:event_input_usernameFocusGained

    private void input_multicastAddressKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_multicastAddressKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            sendLogin();
        }
    }//GEN-LAST:event_input_multicastAddressKeyPressed

    private void input_portKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_portKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            sendLogin();
        }
    }//GEN-LAST:event_input_portKeyPressed

    private void input_multicastAddressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_input_multicastAddressFocusGained
        lblhp_multicastAddress.setVisible(Boolean.FALSE);
    }//GEN-LAST:event_input_multicastAddressFocusGained

    private void input_portFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_input_portFocusGained
        lblhp_port.setVisible(Boolean.FALSE);
    }//GEN-LAST:event_input_portFocusGained

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel birdLabel;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_enter;
    private javax.swing.JFormattedTextField input_multicastAddress;
    private javax.swing.JFormattedTextField input_port;
    private javax.swing.JTextField input_username;
    private javax.swing.JLabel lbl_port;
    private javax.swing.JLabel lbl_serverAddress;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JLabel lbl_username;
    private javax.swing.JLabel lblhp_multicastAddress;
    private javax.swing.JLabel lblhp_port;
    private javax.swing.JLabel lblhp_username;
    private javax.swing.JPanel loginPanel;
    // End of variables declaration//GEN-END:variables

    //Envia os dados.
    private void sendLogin() {
        if (checkFields()) {
            Chat chat = new Chat(input_username.getText(), input_multicastAddress.getText(), Integer.parseInt(input_port.getText()));
            chat.setVisible(Boolean.TRUE);
            this.dispose();
        }
    }

    //Define as configurações iniciais do painel de login.
    private void initialConfiguration() {
        clearFields();
        clearErrorMessages();
    }

    //Verifica a corretude dos campos.
    private boolean checkFields() {
        boolean isCorrect = true;

        if (input_username.getText().isEmpty()) {
            lblhp_username.setText("Enter a username");
            lblhp_username.setVisible(Boolean.TRUE);
            isCorrect = false;
            logger.warn("Empty input for username");
        }
        if (input_multicastAddress.getText().isEmpty()) {
            lblhp_multicastAddress.setText("Enter a multicast adress");
            lblhp_multicastAddress.setVisible(Boolean.TRUE);
            isCorrect = false;
            logger.warn("Empty input for multicast adress");
        }

        if (!verifyIpFormat()) {
            lblhp_multicastAddress.setText("Incorrect format ip adress");
            lblhp_multicastAddress.setVisible(Boolean.TRUE);
            isCorrect = false;
            logger.warn("Incorrect ip adress");
        }

        if (!verifyMulticastIp()) {
            lblhp_multicastAddress.setText("Incorrect multicast ip adress");
            lblhp_multicastAddress.setVisible(Boolean.TRUE);
            isCorrect = false;
            logger.error("Incorrect multicast ip adress");
        }
        if (!verifyNumberFormat()) {
            lblhp_port.setText("Incorrect port format");
            lblhp_port.setVisible(Boolean.TRUE);
            isCorrect = false;
            logger.error("Incorrect port format");
        }
        if (!verifyPortNumber()) {
            lblhp_port.setText("Incorrect port number");
            lblhp_port.setVisible(Boolean.TRUE);
            isCorrect = false;
            logger.warn("Incorrect port number");
        }

        return isCorrect;
    }

    //Limpa campos de entrada.
    private void clearFields() {
        input_username.setText("");
        input_multicastAddress.setText("");
        input_port.setText("");
    }

    //Limpa mensagens de erro.
    private void clearErrorMessages() {
        lblhp_username.setVisible(Boolean.FALSE);
        lblhp_multicastAddress.setVisible(Boolean.FALSE);
        lblhp_port.setVisible(Boolean.FALSE);
    }

    //Verifica se está no formato de ip.
    private boolean verifyIpFormat() {
        try {
            InetAddress ip = InetAddress.getByName(input_multicastAddress.getText());
            return true;
        } catch (UnknownHostException e) {
            return false;
        }
    }

    //Verifica se é um endereço multicast.
    private boolean verifyMulticastIp() {
        try {
            InetAddress ip = InetAddress.getByName(input_multicastAddress.getText());
            return ip.isMulticastAddress();
        } catch (UnknownHostException e) {
            return false;
        }
    }

    //Verifica se é um número.
    private boolean verifyNumberFormat() {
        try {
            int port = Integer.parseInt(input_port.getText());
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    //Verifica se a porta está no intervalo correto.
    private boolean verifyPortNumber() {
        try {
            int port = Integer.parseInt(input_port.getText());

            if (port < 1 || port > 65535) {
                return false;
            } else {
                return true;
            }

        } catch (NumberFormatException e) {
            return false;
        }
    }
}
