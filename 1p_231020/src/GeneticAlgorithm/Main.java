/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeneticAlgorithm;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Marken Tuan Nguyen
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    private static Population population;
    private static Individual[] pop;
    
    private static int numberOfGenes;
    private static int numberOfIndividuals;
        
//    public Main() {
//        this.population = new Population(numberOfIndividuals, numberOfGenes);
//    }
        
    public static void main(String[] args) {
 
        numberOfGenes = 10;
        numberOfIndividuals = 5;
                
        population = new Population(numberOfIndividuals, numberOfGenes);
        System.out.println(Arrays.toString(population.selection()));
       
//        System.out.println("Population of "+population.getIndividuals()+" individual(s).");

    }
    
    
    
}
