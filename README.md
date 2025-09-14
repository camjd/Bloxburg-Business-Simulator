# Bloxburg-Business-Simulator
Lab for Object-Oriented Programming (ITSE-2321-201)

## How this was used:
This business simulator is used to create a fictional business by setting up its name, owner, and adding total funds to it. Afterwards a single employee can be created for the business. 
## Where method overloading was implemented:
Method overloading is used when creating the business to allow if users decide to leave out values when creating the `Business` object.

Method overloading in the code:
```java
  // Set the name, owner, available funds, and increment business
  public Business(String name, String owner, double funds) {
      this.name = name;
      this.owner = owner;
      this.funds = funds;
      totalBusinesses++;
  }

  // Constructor for business with only a name, default to no funds and no owner
  public Business(String name){
      this(name, "NA", 0);
  }

  // Constructor for business with name and starting funds, no owner
  public Business(String name, double funds){
      this(name, "NA", funds);
  }
```
## How static fields were used:
A static field was used to apply the tax rate for the `payTaxes()` by multiplying it with the funds, and then subtracting that from the total of the `funds` field.

The static field is declared as `public static final double TAX_RATE = 0.1;`

Example from the code:
```java
  // Deduct taxes from funds
  public void payTaxes(){
      funds -= funds * TAX_RATE;
      System.out.println("Funds after taxes: $" + funds + "\n");
  }
```
