/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.pa.adts;



/**
 *
 * @author patricia.macedo
 */
public class TADTreeMain {

    /**

* @param args the command line arguments
     */
    public static void main(String[] args) {
        TreeLinked<String> myTree = new TreeLinked("Animal");
        System.out.println(" height 1 " + myTree.height());
        Position<String> root = myTree.root();
        Position<String> posMamifero = myTree.insert(root, "Mamifero");
        Position<String> posAve = myTree.insert(root, "Ave");
        System.out.println(" height 2 " + myTree.height());
        Position<String> posCao= myTree.insert(posMamifero, "Cao");

        Position<String> posGato = myTree.insert(posMamifero, "Gato");
        myTree.insert(posMamifero, "Vaca");
        myTree.insert(posAve, "Papagaio");
        Position<String> posAguia = myTree.insert(posAve, "Aguia");
        myTree.insert(posAguia, "Aguia_Real");
        myTree.insert(posCao, "Caniche");

        System.out.println("TREE " + myTree);

        System.out.println("Elements: ");
        Iterable<Position<String>> elements = myTree.depthOrder();
        for (Position<String> pos : elements) {
            System.out.print(pos.element() + " ");
        }
        System.out.println();

        System.out.println("E externo " + myTree.isExternal(posAguia));
        System.out.println("");
        System.out.println("NUMERO DE ELEMENTOS " + myTree.size());
        System.out.println("ALTURA " + myTree.height());

        int count = 1;
        for (Position<String> pos : myTree.positions())
            System.out.println(count++ + " - " + pos.element());

        System.out.println("ToString");
        System.out.println(myTree);

        myTree.remove(root);
        System.out.println(" height 4 " + myTree.height());
        root = myTree.insert(null,"Animal");
        posMamifero = myTree.insert(root, "Mamifero");
        posAve = myTree.insert(root, "Ave");
        System.out.println("ToString");
        System.out.println(myTree);

    }
}