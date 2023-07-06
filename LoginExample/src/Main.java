

/*
    modellare 3 tipi di utenti:
        - admin
        - editor
        - user
    Un utente incapsula gli attributi "username" e "password"

    questi utenti sono inseriti all'interno di un database rappresentato dalla classe ApplicationUsers;
    il database va rappresentato da una struttura dati adeguata (List, Set, Map)
    La classe ApplicationUsers mi permette di verificare se la coppia <username, password> esiste ed é corretta.
    Se esiste allora ritorno il corrispondente utente.
    La classe ApplicationUsers mi permette di creare un utente dati uno username, password e ruolo.

 */
public class Main {
    public static void main(String[] args) {
        ApplicationUser applicationUser = new MapApplicationUser();
        applicationUser.createUser("davide", "12345", Role.ADMIN);
        applicationUser.createUser("matteo", "67890", Role.USER);
        applicationUser.createUser("mara", "abcde", Role.EDITOR);

        applicationUser.login("davide", "12345");
        applicationUser.login("matteo", "12345");
        applicationUser.login("alessio", "12345");
    }
}