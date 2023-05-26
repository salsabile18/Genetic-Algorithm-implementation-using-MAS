package ma.enset.bddc.sma;

import java.util.Arrays;
import java.util.Random;

public class Individual implements Comparable{
    private char [] chromosome = new char[GAUtils.CHROMOSOME_SIZE];
    private int fitness;

    public Individual() {
        Random random=new Random();
        for (int i=0;i<GAUtils.CHROMOSOME_SIZE;i++) {
            int index = random.nextInt(GAUtils.ALPHABETICS.length());
            chromosome[i]= GAUtils.ALPHABETICS.charAt(index);
        }
    }

    public Individual(char[] chromosome) {

        this.chromosome = Arrays.copyOf(chromosome,GAUtils.CHROMOSOME_SIZE);
    }

    public void calculateFintess(){
        fitness=0;
        for (int i = 0; i < GAUtils.CHROMOSOME_SIZE; i++) {
            if(chromosome[i]==GAUtils.TARGET_SOLUTION[i].charAt(i)){
                fitness++;
            }
        }
    }

    public int getFitness() {

        return fitness;
    }

    public int[] getChromosome() {
        return chromosome;
    }

    public void setChromosome(char[] chromosome) {
        this.chromosome = chromosome;
    }

    @Override
    public int compareTo(Object o) {
        Individual individual=(Individual) o;
        if (this.fitness>individual.fitness){
            return  1;
        }else if(this.fitness< individual.fitness){
            return -1;
        }else{
            return 0;
        }
    }


}
//chromosome = huwa jumla (khass tlqa chromosme qui s'appelle "bonjour bdcc")