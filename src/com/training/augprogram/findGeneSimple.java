package com.training.augprogram;
//Finding a gene with start codon and stop codon from DNA.
public class findGeneSimple {
    public static String findGene(String dna){
        int startcodon = dna.indexOf("ATG");

        int stopcodon = dna.indexOf("TAA",startcodon+3);

        String gene = "";
        gene = dna.substring(startcodon,stopcodon+3);
        if(startcodon == -1){
           gene = "";
        }
        if(stopcodon == -1){
            gene = "";
        }
        return gene;
    }

    public static void main(String[]args){
        String dna =  "AATGCTAGGGTAATATGGT";
        System.out.println("DNA strand is "+ dna);
        String gene = findGene(dna);
        System.out.println("Gene is " +gene);

         dna =  "CGATGGTTTG";
        System.out.println("DNA strand is "+ dna);
         gene = findGene(dna);
        System.out.println("Gene is " +gene);

         dna =  "ATCCTATGCTTCGGCTGCTGCTAATATGGT";
        System.out.println("DNA strand is "+ dna);
        gene = findGene(dna);
        System.out.println("Gene is " +gene);

         dna =  "ATGCTTCGGCTGCTC";
        System.out.println("DNA strand is "+ dna);
        gene = findGene(dna);
        System.out.println("Gene is " +gene);
    }
}
