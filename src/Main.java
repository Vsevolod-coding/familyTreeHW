import familyTreeSrc.FamilyTree;
import service.Service;

public class Main {
    public static void main(String[] args) {

        Service service = new Service();
        FamilyTree tree = service.familyTreeTest();

//        FamilyTree tree = readTree();
//
//        saveTree(tree);
//
//        System.out.println(tree);

        System.out.println("ORIGINAL tree:\n" + tree);

        System.out.println();

        System.out.println("Sorted by NAME:");
        tree.sortByName();
        System.out.println(tree);

        System.out.println();

        System.out.println("Sorted by AGE:");
        tree.sortByBirthDate();
        System.out.println(tree);

        System.out.println();

        System.out.println("Sorted by CHILDREN QUANTITY:");
        tree.sortByChildrenQuantity();
        System.out.println(tree);
    }
}
