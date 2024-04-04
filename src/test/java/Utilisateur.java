public class Utilisateur {
    private String nom,prenom,eMail;
    private int age;

    public Utilisateur(String PRENOM,String NOM, String MAIL)
    {
        this.nom=NOM;
        this.prenom=PRENOM;
        this.eMail=MAIL;
        this.age=30;
    }
    public String getNom()
    {
        return nom;
    }
    public String getPrenom()
    {
        return prenom;
    }
    public String getEMail()
    {
        return eMail;
    }
    public int getAge()    {
        return age;
    }
}
