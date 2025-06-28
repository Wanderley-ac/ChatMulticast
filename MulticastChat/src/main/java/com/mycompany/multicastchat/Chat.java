package com.mycompany.multicastchat;

import com.google.gson.Gson;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Chat extends javax.swing.JFrame {

    //Definindo monitoramento e configuração do logger.
    private static final Logger logger = LoggerFactory.getLogger(Chat.class);

    //Inicializa o nome do usuário.
    private String username;

    //Definição do socket.
    private MulticastSocket socket;

    //Definição do endereço multicast.
    private InetAddress multicastGroup;

    //Definição objeto Gson (Usado para trabalhar com o Json).
    private Gson gson = new Gson();

    public Chat(String username) {
        this.username = username;

        initComponents();
        initialConfiguration();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp_inputMessage = new javax.swing.JPanel();
        lbl_inputMessage = new javax.swing.JLabel();
        input_inputMessage = new javax.swing.JTextField();
        btn_send = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txta_chatMessage = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Connect to [ipserver:port]");
        setResizable(false);

        lbl_inputMessage.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        lbl_inputMessage.setText("Enter the message:");

        btn_send.setText("Send");
        btn_send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sendActionPerformed(evt);
            }
        });
        btn_send.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_sendKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jp_inputMessageLayout = new javax.swing.GroupLayout(jp_inputMessage);
        jp_inputMessage.setLayout(jp_inputMessageLayout);
        jp_inputMessageLayout.setHorizontalGroup(
            jp_inputMessageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_inputMessageLayout.createSequentialGroup()
                .addComponent(lbl_inputMessage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(input_inputMessage, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_send, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jp_inputMessageLayout.setVerticalGroup(
            jp_inputMessageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_inputMessageLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jp_inputMessageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_inputMessage)
                    .addComponent(input_inputMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_send, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
        );

        txta_chatMessage.setColumns(20);
        txta_chatMessage.setRows(5);
        txta_chatMessage.setEnabled(false);
        jScrollPane1.setViewportView(txta_chatMessage);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jp_inputMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_inputMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Envia a mensagem para o grupo multicast.
    private void btn_sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sendActionPerformed
        sendMessage();
    }//GEN-LAST:event_btn_sendActionPerformed

    //Envia a mensagem para o grupo multicast (Quando a tecla é pressionada).
    private void btn_sendKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_sendKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) { //Clique na tecla enter
            sendMessage();
        }
    }//GEN-LAST:event_btn_sendKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_send;
    private javax.swing.JTextField input_inputMessage;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jp_inputMessage;
    private javax.swing.JLabel lbl_inputMessage;
    private javax.swing.JTextArea txta_chatMessage;
    // End of variables declaration//GEN-END:variables

    //Define as configurações iniciais do chat.
    private void initialConfiguration() {
        //Modificando o título para os dados do servidor e usuário.
        setTitle("[" + this.username + "] connect to [" + ChatConfig.MULTICAST_ADRESS + ":" + ChatConfig.PORT + "]");

        //Cria a porta (socket) e inicializa a thread de recebimento de dados do grupo.
        try {
            this.socket = new MulticastSocket(ChatConfig.PORT);
            this.multicastGroup = InetAddress.getByName(ChatConfig.MULTICAST_ADRESS);
            this.socket.joinGroup(multicastGroup);

            startReceiverThread(socket, multicastGroup);

        } catch (IOException e) {
            logger.error("Error starting socket", e);
        }
    }

    //Método responsável por garantir o recebimento de dados do grupo por meio de uma thread.
    private void startReceiverThread(MulticastSocket socket, InetAddress multicastGroup) {
        this.gson = new Gson();

        //Criação da thread para evitar bloqueio na comunicação.
        Thread receive = new Thread(() -> {
            //Criação do buffer, para armazenar dados recebidos.
            byte[] buffer = new byte[1024];

            while (true) {
                try {
                    //Criação do pacote (datagrama) para extração de mensagens enviadas pelo grupo.
                    DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

                    //Recebimento de dados da porta de comunicação.
                    socket.receive(packet);

                    //Conversão dos dados para uma String.
                    String jsonData = new String(packet.getData(), 0, packet.getLength());

                    //Conversão da String de Json para um objeto ChatMessage.
                    ChatMessage msg = gson.fromJson(jsonData, ChatMessage.class);

                    logger.info("Message received from {}: {}", msg.getUsername(), msg.getMessage());

                    //Callback ou chamada para modificação na área de texto, atualizando seu conteúdo com o conteúdo recebido.
                    SwingUtilities.invokeLater(() -> {
                        txta_chatMessage.append(String.format("[%s %s] %s: %s\n",
                                msg.getDate(), msg.getTime(), msg.getUsername(), msg.getMessage()));
                        txta_chatMessage.setCaretPosition(txta_chatMessage.getDocument().getLength());
                    });

                } catch (IOException e) {
                    logger.error("Error receiving message ", e);
                    break; // Pode sair do loop se for erro crítico
                }
            }
        });

        //Responsável por encerrar as threads com a finalização do programa.
        receive.setDaemon(true);

        //Responsável por inicializar a thread.
        receive.start();
    }

    private void sendMessage() {
        //Obtenção da mensagem entrada.
        String text = input_inputMessage.getText().trim();

        //Verificação do campo.
        if (text.isEmpty()) {
            return;
        }

        //Conversão da mensagem fornecida em um objeto ChatMessage.
        ChatMessage message = new ChatMessage(
                new SimpleDateFormat("dd/MM/yyyy").format(new Date()),
                new SimpleDateFormat("HH:mm:ss").format(new Date()),
                this.username,
                text);

        try {
            //Conversão do objeto ChatMessage para uma String Json.
            String json = gson.toJson(message);
            
            //Conversão da String Json para bytes.
            byte[] data = json.getBytes();
            
            //Criação do pacote datagrama para envio.
            DatagramPacket packet = new DatagramPacket(data, data.length, multicastGroup, ChatConfig.PORT);
            
            //Envio do pacote para o grupo.
            socket.send(packet);

            logger.info("Message send: {}", text);

            //Limpar o campo de entrada.
            input_inputMessage.setText(""); 

        } catch (IOException e) {
            logger.error("Error send message", e);
            JOptionPane.showMessageDialog(this, "Error send message:\n" + e.getMessage());
        }
    }
}
