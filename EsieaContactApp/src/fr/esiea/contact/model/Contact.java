package fr.esiea.contact.model;

import java.util.UUID;

public class Contact {
   private String lastname;
   private String firstname;
   private String email;
   //private boolean actif;
   private String birthday;
   private String id=UUID.randomUUID().toString();

   public void setLastname(String lastname) {
      this.lastname = lastname;
   }
   public String getLastname() {
      return lastname;
   }

   public void setFirstname( String firstname) {
      this.firstname = firstname;
   }
   public String getFirstname() {
      return firstname;
   }

   public void setEmail(String email) {
      this.email = email;
   }
   public String getEmail() {
      return email;
   }
   /*
	public boolean Active() {
		return actif;
	}
	public void setActive(boolean actif) {
		this.actif = actif;
	}
	*/
	public void setBirthday(String birthday){
		this.birthday=birthday;
	}
	public String getBirthday(){
		return birthday;
	}
	public String getId(){
		return id;
	}
	public void setId(String id){
		this.id=id;
	}
	
	
}