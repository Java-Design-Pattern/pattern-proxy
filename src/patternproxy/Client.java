package patternproxy;
//ce proxy pour separer la couche metier de celle technique 
//on peut l'utiliser pour tester l'authification
//aussi si il l'objet existe dans le cache...
public class Client {
IMetier jpa = new proxy();

public Client() {
	jpa.Sauvgarder();
}

public static  void main(String[] args) {
	new Client();

}
}
