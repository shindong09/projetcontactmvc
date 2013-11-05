package fr.esiea.contact.model;

public abstract class Adresse {

	protected String numero;
	protected String rue;
	protected String codepostal;
	protected String ville;
	protected String id;
	
	public Adresse( String numero, String rue, String ville, String codepostal, String id) {
		// TODO Auto-generated constructor stub
		this.numero=numero;
		this.rue=rue;
		this.ville=ville;
		this.codepostal=codepostal;
		this.id=id;
	}
	
	public Adresse(){
		
		 LivraisonAdresse livraison=new LivraisonAdresse(numero, ville, numero, id, codepostal);
		 PaiementAdresse paiement=new PaiementAdresse(numero, ville, numero, id, codepostal);
		
	}

	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getCodepostal() {
		return codepostal;
	}

	public void setCodepostal(String codepostal) {
		this.codepostal = codepostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}
	public void setId(String Id){
		this.id=id;
	}
	public String getId(){
		return id;
	}

}
