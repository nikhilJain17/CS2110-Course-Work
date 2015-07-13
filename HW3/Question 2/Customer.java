// Customer class

class Customer {

      // Note: the assignment calls for many attributes for the customer,
      //       even if they are unused
      // only the name is used thoroughly

      // TODO Implement more of these attributes
      private String name;
      private double id;
      private int age;
      private boolean isMarried;
      private boolean frequentCustomer;

      public Customer(String setName) {
            name = setName;
            id = Math.random() * 10000;
      }

      // Getters and setters
      public void setName(String setName) {
            name = setName;
      }

      public String getName() {
            return name;
      }





}
