package ImmutableClass;

public final class Employee {

    // Here id,name and email are already Immutable
    private final Integer id;
    private final String name;
    private final String email;

    /*As Date,Set<String> and Address are Mutable referfeces
    so returns clone or defensive copy from their getter method*/
    private final Address address;

    public Employee(Integer id, String name, String email, Address address) {
        super();
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;

    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }


    public Address getAddress() {
        //Returns clone or defensive copy of Set
        Address empAddress = new Address();
        empAddress.setStreet(address.getStreet());
        empAddress.setZipCode(address.getZipCode());
        empAddress.setAddressLine1(address.getAddressLine1());
        empAddress.setAddressLine2(address.getAddressLine2());
        return empAddress;
    }

}
