package testSpring.model;

import java.time.LocalDateTime;

public class Message {
    
	 private String auteur;
	 private LocalDateTime horaire;
	 private String message;
	
	 public Message(String auteur, String message) {
		this.horaire = LocalDateTime.now();
		this.auteur = auteur;
		this.message = message;
	}
	 
	 public Message() {
		}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public LocalDateTime getHoraire() {
		return horaire;
	}

	public void setHoraire(LocalDateTime horaire) {
		this.horaire = horaire;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
