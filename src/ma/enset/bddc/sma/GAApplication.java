package ma.enset.bddc.sma;

import java.util.Arrays;

public class GAApplication {


    public static void main(String[] args) {
      GenticAlgorithm ga=new GenticAlgorithm();
      ga.initialize();
      ga.sortPopulation();
      int iter=0;
      while (GAUtils.MAX_ITERATIONS>iter &&  ga.getBestFintness()<GAUtils.CHROMOSOME_SIZE){
          ga.crossover();
          ga.mutation();
          ga.sortPopulation();
          System.out.println("it:"+iter+" "+Arrays.toString(ga.getPopulation()[0].getChromosome()) +" "+ga.getPopulation()[0].getFitness());
          iter++;
      }

    }
}
