package serveur;

import jakarta.xml.ws.Endpoint;
import service.BanqueService;

import static jakarta.xml.ws.Endpoint.publish;

public class ServeurJWS {
    public static void main(String[] args){
        String url ="http://localhost:8084/";
        System.out.println("Le service est publié a l'adresse " +url);
        publish(url,new BanqueService());
    }
}
