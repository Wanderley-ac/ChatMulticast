package com.mycompany.multicastchat;

//Inicialização da aplicação pela classe principal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    //Definindo monitoramento e configuração do logger.
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        
        logger.info("Starting the application...");
        
        //Chamada da tela de login (entrada do nome do usuário).
        Login login = new Login();
        login.setLocationRelativeTo(null);
        login.setVisible(true);
    }
}
