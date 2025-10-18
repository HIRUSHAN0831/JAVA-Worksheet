package LW_03;

class Owner {
    private String ownerName;
    private String phoneNo;

    public Owner() {
        ownerName = "Unknown";
        phoneNo = "N/A";
    }

    public Owner(String ownerName, String phoneNo) {
        this.ownerName = ownerName;
        this.phoneNo = phoneNo;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
}

class Bicycle {
    private Owner owner;

    public Bicycle() {
        owner = new Owner();  // default owner
    }

    public Bicycle(String ownerName, String phoneNo) {
        owner = new Owner(ownerName, phoneNo);
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String getOwnerName() {
        return owner.getOwnerName();
    }

    public String getPhoneNo() {
        return owner.getPhoneNo();
    }

    public void setOwnerName(String name) {
        owner.setOwnerName(name);
    }

    public void setPhoneNo(String num) {
        owner.setPhoneNo(num);
    }
}

public class Q03 {
    public static void main(String[] args) {
        Bicycle bike1 = new Bicycle("Hirushan", "0771234567");

        System.out.println("Owner Name: " + bike1.getOwnerName());
        System.out.println("Phone No: " + bike1.getPhoneNo());

        Owner newOwner = new Owner("Kasun", "0719876543");
        bike1.setOwner(newOwner);

        System.out.println("\nAfter changing owner:");
        System.out.println("Owner Name: " + bike1.getOwnerName());
        System.out.println("Phone No: " + bike1.getPhoneNo());
    }
}
