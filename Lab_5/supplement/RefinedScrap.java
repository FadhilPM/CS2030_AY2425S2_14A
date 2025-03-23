public class RefinedScrap extends Scrap {
    
    public RefinedScrap(String originalBrand, int originalYear) {
        super(originalBrand, originalYear);
    }
    
    @Override
    public String toString() {
        return "Refined " + super.toString();
    }
}
