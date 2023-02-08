package ImmutableClass;

public class ImmutableMain {
    public static void main(String[] args) {
        Address address = new Address();
        address.setStreet("Park Street");
        address.setZipCode(1099209L);
        address.setAddressLine1("Adddress line 1");
        address.setAddressLine2("Adddress line 2");

        Employee employee = new Employee(109023, "Sean Murphy", "sean.m@kkjava.com", address);
        System.out.println("ID:"+employee.getId());
        System.out.println("Name:"+employee.getName());
        System.out.println("Email:"+employee.getEmail());
        System.out.println("Employee Address::::");
        System.out.println("Street:"+address.getStreet());
        System.out.println("ZipCode:"+address.getZipCode());
        System.out.println("AddressLine1:"+address.getAddressLine1());
        System.out.println("AddressLine2:"+address.getAddressLine2());
        //Let's try to change state of this employee object
        System.out.println("------------------------------------------------------------");

        //Try to modify Employee Address Street value
        employee.getAddress().setStreet("Orchid Street");

        address.setZipCode(533103L);

        System.out.println("ID:"+employee.getId());
        System.out.println("Name:"+employee.getName());
        System.out.println("Email:"+employee.getEmail());
        System.out.println("Employee Address::::");
        System.out.println("Street:"+address.getStreet());
        System.out.println("ZipCode:"+address.getZipCode());
        System.out.println("AddressLine1:"+address.getAddressLine1());
        System.out.println("AddressLine2:"+address.getAddressLine2());
    }
}
