package com.mycompany.multicastchat;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class udpClient {

    //Inicializando o arquivo de configuração de logs para a classe udpClient.
    private static final Logger logger = LoggerFactory.getLogger(udpClient.class);

    //Inicializando o método de escaner (input) para utilização.
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        logger.info("Starting UDP Client");

        while (true) {

            //Entrada do IP do servidor.
            System.out.println("\nType the server IP <destination> address (IPv4):");
            String srvIpAddr = sc.nextLine();

            try {
                //Verificando se a String está em um formato IP válido.
                InetAddress.getByName(srvIpAddr);
                break;
            } catch (UnknownHostException e) {
                //Exceção caso haja erro na formatação do IP.
                logger.error("Invalid IP Address [" + srvIpAddr + "]");
            }

            while (true) {

            }
        }
    }
}
