package patternproxy;
//couche technique
public class proxy implements IMetier {
ImetierImpl metier;
	@Override
	public void Sauvgarder() {
		 metier = new ImetierImpl();
		 System.out.println("BEGIN TRANSACTION");
		 try {
			 metier.Sauvgarder();
			 System.out.println("COMMIT");
			
		} catch (Exception e) {
			 System.out.println("ROOLBACK");
			// TODO: handle exception
		}
		
				 
	}

}
