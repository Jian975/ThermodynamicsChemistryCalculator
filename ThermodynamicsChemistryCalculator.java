import java.util.ArrayList;
import java.util.List;

public class ThermodynamicsChemistryCalculator {

    public static void main(String[] args) {
        List<MoleculeWithNumber> reactants = new ArrayList<>();
        List<MoleculeWithNumber> products = new ArrayList<>();
        ChemicalEquation chemicalEquation;

        //Create your molecules here by referring to the Molecules enum
        Molecule nh3 = Molecules.N_H3_g.getMolecule();
        Molecule o2 = Molecules.O2_g.getMolecule();

        Molecule no = Molecules.N_O_g.getMolecule();
        Molecule h2o = Molecules.H2_O_g.getMolecule();


        //Add the reactants here
        reactants.add(new MoleculeWithNumber(nh3, 4));
        reactants.add(new MoleculeWithNumber(o2, 5));

        //Add the products here
        products.add(new MoleculeWithNumber(no, 4));
        products.add(new MoleculeWithNumber(h2o, 6));

        chemicalEquation = new ChemicalEquation(reactants, products);

        //Change the method being called to get different values
        //Methods:
        //getDeltaH
        //getDeltaG
        //getDeltaS
        double output = chemicalEquation.getDeltaS();

        //Prints output to the console
        System.out.println(output);
    }
}
