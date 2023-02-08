package ImmutableClass;

public class Address {
    private String street;
    private Long zipCode;
    private String addressLine1;
    private String addressLine2;

    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public Long getZipCode() {
        return zipCode;
    }
    public void setZipCode(Long zipCode) {
        this.zipCode = zipCode;
    }
    public String getAddressLine1() {
        return addressLine1;
    }
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }
    public String getAddressLine2() {
        return addressLine2;
    }
    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }
}
