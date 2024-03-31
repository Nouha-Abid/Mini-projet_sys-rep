import java.io.*;
import java.net.*;


public class Client {
    
    private static final String ADDRESS = "localhost";
   
    private static final int PORT = 9090;

    
    public static void main(String[] args) {
        try (
            // Créer une socket client pour se connecter au serveur
            Socket socket = new Socket(ADDRESS,PORT);
            
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in))
        ) {
            
            System.out.print("Entrez votre nom d'utilisateur : ");
            String username = stdIn.readLine();
            // Envoyer le nom d'utilisateur au serveur
            out.println(username);

            String serverResponse;

            // Recevoir et afficher les messages
            while ((serverResponse = in.readLine()) != null) {
                System.out.println(serverResponse);
                System.out.print("> ");
                String userInput = stdIn.readLine();
                if (userInput != null) {
                    out.println(userInput);
                }
            }
        } catch (IOException e) {
            System.out.println("Erreur lors de la connexion au serveur.");
            e.printStackTrace();
        }
    }
}
