import java.util.Random;

public class Dice {
    private Integer numDice;

    Dice(Integer numDice){
        this.numDice = numDice;
    }

    public Integer tossAndSum() {
        Random random = new Random();
        Integer sum = 0;

        for(int i=0; i < numDice; i++){
            sum += random.nextInt(6)+1;
        }
        return sum;
    }

    public Integer getNumDice(){
        return numDice;
    }

}

