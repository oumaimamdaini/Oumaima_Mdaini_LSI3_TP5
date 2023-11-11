package service;
import metier.Compte;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
@WebService(name = "Banque Service")
public class BanqueService {
    @WebMethod(operationName = "Conversion")
    public double conversion(@WebParam double montant) {
        return montant*3.36;
    }
    @WebMethod
    public Compte getCompte(@WebParam int code) {
        return new Compte(code,new Date(),12) ;

    }
    public List<Compte> getComptes(){
        ArrayList<Compte> comptes= new ArrayList<Compte>();
        Compte c1 = new Compte(1,new Date(),8);
        Compte c2 = new Compte(2,new Date(),4);
        comptes.add(c1);
        comptes.add(c2);
        return comptes ;

    }






}
