import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // Create an instance of DepartementHashSet
        DepartementHashSet departementHashSet = new DepartementHashSet();

        // Create some Departement objects
        Departement departement1 = new Departement(1, "Department 1", 10);
        Departement departement2 = new Departement(2, "Department 2", 5);
        Departement departement3 = new Departement(3, "Department 3", 15);

        // Add the departements
        departementHashSet.ajouterDepartement(departement1);
        departementHashSet.ajouterDepartement(departement2);
        departementHashSet.ajouterDepartement(departement3);

        // Display the departements
        System.out.println("All Departements:");
        departementHashSet.displayDepartement();

        // Search for a departement by name
        String searchName = "Department 2";
        boolean foundByName = departementHashSet.rechercherDepartement(searchName);
        System.out.println("Found departement by name '" + searchName + "': " + foundByName);

        // Search for a departement by object
        boolean foundByObject = departementHashSet.rechercherDepartement(departement3);
        System.out.println("Found departement by object: " + foundByObject);

        // Remove a departement
        departementHashSet.supprimerDepartement(departement1);

        // Display the departements after removal
        System.out.println("Departements after removal:");
        departementHashSet.displayDepartement();

        // Sort the departements by ID
        TreeSet<Departement> sortedDepartements = departementHashSet.trierDepartementById();
        System.out.println("Sorted Departements by ID:");
        for (Departement departement : sortedDepartements) {
            System.out.println(departement);
        }
    }
}
