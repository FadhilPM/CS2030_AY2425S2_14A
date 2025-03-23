public class Scrap {
    private final String originalBrand;
    private final int originalYear;
    
    public Scrap(String originalBrand, int originalYear) {
        this.originalBrand = originalBrand;
        this.originalYear = originalYear;
    }
    
    @Override
    public String toString() {
        return String.format("Scrap from %s [%d]", this.originalBrand, this.originalYear);
    }
}
