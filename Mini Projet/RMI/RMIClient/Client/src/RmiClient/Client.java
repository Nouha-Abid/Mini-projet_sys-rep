package RmiServer;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.List;

public class Client  {

    public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException{
         // Recherche de l'objet distant dans le registre RMI
        RmiTrait stub = (RmiTrait) Naming.lookup("rmi://localhost:12345/RMI");
        
        //Ajout de quelques taches à l'objet distant

        
        stub.addTask("jouer");
        stub.addTask("open");
        stub.addTask("close");

        // Récupérer de la liste des tâches 
        List<String> tasks = stub.viewTasks();

        // Afficher les taches
        for (String task : tasks){
            System.out.println(task);
        }
       
        

         stub.removeTask("jouer");
        List<String> taskss = stub.viewTasks();

        for (String task : taskss){
            System.out.println(task);
        }


    }
}
