
public class Bins {
    private Integer[] bins;

    Bins(Integer min, Integer max){
        bins = new Integer[max -min +1];

        for(int i = 0; i < bins.length; i++){
            bins[i] = 0;
        }
    }



    public Integer getBin(int i) {
        return null;
    }

    public void incrementBin(int i) {
    }

    public Integer[] getBins() {
        return null;
    }
}
