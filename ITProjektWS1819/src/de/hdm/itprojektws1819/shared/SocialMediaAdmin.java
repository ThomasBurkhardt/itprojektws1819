package de.hdm.itprojektws1819.shared;

import java.util.Vector;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import de.hdm.itprojektws1819.shared.bo.Abonnement;
import de.hdm.itprojektws1819.shared.bo.Beitrag;
import de.hdm.itprojektws1819.shared.bo.Kommentar;
import de.hdm.itprojektws1819.shared.bo.Nutzer;
import de.hdm.itprojektws1819.shared.bo.Pinnwand;

@RemoteServiceRelativePath("socialmedia")
public interface SocialMediaAdmin extends RemoteService {

	/**
	 * Initialisierung des Objekts.
	 */
	public void init() throws IllegalArgumentException;

	/**
	 * Nutzer anlegen
	 * 
	 * @param vorname
	 * @param nachname
	 * @param nickname
	 * @param email
	 * @return fertiges Nutzerobjekt
	 * @throws IllegalArgumentException
	 */
	public Nutzer createNutzer(String vorname, String nachname, String nickname, String email)
			throws IllegalArgumentException;

	/**
	 * Pinnwand anlegen
	 * 
	 * @param nutzerID
	 * @return fertiges Pinnwandobjekt
	 * @throws IllegalArgumentException
	 */
	public Pinnwand createPinnwand(int nutzerID) throws IllegalArgumentException;

	/**
	 * Beitrag anlegen
	 * 
	 * @param beitragInhalt
	 * @return fertiges Beitragobjekt
	 * @throws IllegalArgumentException
	 */
	public Beitrag createBeitrag(String beitragInhalt) throws IllegalArgumentException;

	/**
	 * Kommentar anlegen
	 * 
	 * @param beitragID
	 * @param kommentarInhalt
	 * @return fertiges Kommentarobjekt
	 * @throws IllegalArgumentException
	 */
	public Kommentar createKommentar(int beitragID, String kommentarInhalt) throws IllegalArgumentException;

	/**
	 * Abonnement anlegen
	 * 
	 * @param nutzerID
	 * @param pinnwandID
	 * @return fertiges Abonnementobjekt
	 * @throws IllegalArgumentException
	 */
	public Abonnement createAbonnement(int nutzerID, int pinnwandID) throws IllegalArgumentException;
	
	public void saveNutzer(Nutzer n) throws IllegalArgumentException;
	
	public void savePinnwand(Pinnwand p) throws IllegalArgumentException;
	
	public void saveBeitrag(Beitrag b) throws IllegalArgumentException;
	
	public void saveKommentar(Kommentar k) throws IllegalArgumentException;
	
	public void saveAbonnement(Abonnement a) throws IllegalArgumentException;
	
	public void deleteNutzer(Nutzer n) throws IllegalArgumentException;
	
	public void deletePinnwand(Pinnwand p) throws IllegalArgumentException;
	
	public void deleteBeitrag(Beitrag b) throws IllegalArgumentException;
	
	public void deleteKommentar(Kommentar k) throws IllegalArgumentException;
	
	public void deleteAbonnement(Abonnement a) throws IllegalArgumentException;
	
	public Nutzer findNutzerByID(int nutzerID) throws IllegalArgumentException;
	
	public Vector<Nutzer> findNutzerByVorname(String vorname) throws IllegalArgumentException;
	
	public Vector<Nutzer> findNutzerByNachname(String nachname) throws IllegalArgumentException;
	
	public Vector<Nutzer> findNutzerByNickname(String nickname) throws IllegalArgumentException;
	
	public Vector<Nutzer> findAllNutzer() throws IllegalArgumentException;
	
	public Pinnwand findPinnwandByID(int pinnwandID) throws IllegalArgumentException;
	
	public Pinnwand findPinnwandByNutzerID(int nutzerID) throws IllegalArgumentException;
	
	public Beitrag findBeitragByID(int beitragID) throws IllegalArgumentException;
	
	public Vector<Beitrag> findBeitragByNutzerID(int nutzerID) throws IllegalArgumentException;
	
	public Kommentar findKommentarByID(int kommentarID) throws IllegalArgumentException;
	
	public Vector<Kommentar> findKommentarByBeitragID(int beitragID) throws IllegalArgumentException;
	
	public Abonnement findAbonnementByID(int abonnemenetID) throws IllegalArgumentException;
	
	public Vector<Abonnement> findAbonnementByNutzerID(int nutzerID) throws IllegalArgumentException;
	
	public Vector<Abonnement> findAbonnementByPinnwandID(int pinnwandID) throws IllegalArgumentException;
	
}