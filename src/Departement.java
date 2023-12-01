import java.util.Objects;

public class Departement {
    int id;
    String nom;
    int nb_employes;

    public Departement(){
    };

    public Departement(int id, String nom, int nb_employes) {
        this.id = id;
        this.nom = nom;
        this.nb_employes = nb_employes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom()
    {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNb_employes() {
        return nb_employes;
    }

    public void setNb_employes(int nb_employes) {
        this.nb_employes = nb_employes;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Departement departement = (Departement) obj;
        return id == departement.id && nom.equals(departement.nom);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, nom, nb_employes);
    }
    public int compareTo(Departement other) {
        return Integer.compare(this.id, other.getId());
    }

    @Override
    public String toString() {
        return "Département{" +
                "id=" + id +
                ", nomDepartement='" + nom + '\'' +
                ", nombreEmployes=" + nb_employes +
                '}';
    }
}

