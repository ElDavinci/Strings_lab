
class ProductCategory implements checker {
    public String output;
    @Override
    public boolean check(String productCategory) {
        boolean containsDigits = productCategory.matches(".*\\d.*");
        boolean lengthMoreThanTwo = productCategory.length() > 2;
        return !containsDigits && lengthMoreThanTwo;
    }
    public void setOutput(String output) {
        this.output = output;
    }
    public String getOutput() {
        return output;
    }
}





class ProductCode implements checker {
    String output;
    @Override
    public boolean check(String productCode) {
        boolean containsDigits = productCode.matches(".*\\d.*");
        boolean lengthEqualThree = productCode.length() == 3;
        if(containsDigits && lengthEqualThree) {
            
        }
        return containsDigits && lengthEqualThree;
    }
    public void setOutput(String output) {
        this.output = output;
    }
    public String getOutput() {
        return output;
    }
}





class ManufacturingYear implements checker {
    String output;
    @Override
    public boolean check(String manufacturingYear) {
        boolean containsDigits = manufacturingYear.matches(".*\\d.*");
        boolean lengthEqualFour = manufacturingYear.length() == 4;
        return containsDigits && lengthEqualFour;
    }
    public void setOutput(String output) {
        this.output = output;
    }
    public String getOutput() {
        return output;
    }
}







class ReferenceNumber implements checker {
    String output;
    @Override
    public boolean check(String referenceNumber) {
        boolean containsDigits = referenceNumber.matches(".*\\d.*");
        return containsDigits;
    }
    public void setOutput(String output) {
        this.output = output;
    }
    public String getOutput() {
        return output;
    }
}


