package fr.esiea.contact.model;

public class Adresse {

	private String numero;
	private String rue;
	private String codepostal;
	private String ville;
	
	public Adresse() {
		// TODO Auto-generated constructor stub
		this.numero=numero;
		this.rue=rue;
		this.ville=ville;
		this.codepostal=codepostal;
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

}
