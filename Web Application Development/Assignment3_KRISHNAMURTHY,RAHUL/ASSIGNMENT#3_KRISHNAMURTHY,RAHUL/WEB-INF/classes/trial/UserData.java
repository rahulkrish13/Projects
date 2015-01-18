package trial;

public class UserData {
    String FirstName,LastName;
    String Email,Address,City,State,Zip,CreditCardNumber,Cvv;
   

    public void setFirstName( String value )
    {
         if (FirstName != null) {
      this.FirstName = FirstName;
    } else {
      this.FirstName = "unknown";
    }
    }

 public void setLastName( String value )
    {
        if (LastName != null) {
      this.LastName = LastName;
    } else {
      this.LastName = "unknown";
    }
    }

    public void setEmail( String value )
    {
        if (Email != null) {
      this.Email = Email;
    } else {
      this.Email = "unknown";
    }
    }

    public void setAddress( String value )
    {
         if (Address != null) {
      this.Address = Address;
    } else {
      this.Address = "unknown";
    }
    }
  public void setCity( String value )
    {
        if (City != null) {
      this.City = City;
    } else {
      this.City = "unknown";
    }
    }
  public void setState( String value )
    {
         if (State != null) {
      this.State = State;
    } else {
      this.State = "unknown";
    }
    }

      public void setZip( String value )
    {
        if (Zip != null) {
      this.Zip = Zip;
    } else {
      this.Zip = "unknown";
    }
    }

      public void setCreditCardNumber( String value )
    {
        if (CreditCardNumber != null) {
      this.CreditCardNumber = CreditCardNumber;
    } else {
      this.CreditCardNumber = "unknown";
    }
    }
  public void setCvv( String value )
    {
         if (Cvv != null) {
      this.Cvv = Cvv;
    } else {
      this.Cvv = "unknown";
    }
    }


    public String getFirstName() { return FirstName; }

      public String getLastName() { return LastName; }

    public String getEmail() { return Email; }

    public String getAddress() { return Address; }


    public String getCity() { return City; }


    public String getState() { return State; }


    public String getZip() { return Zip; }



    public String getCreditCardNumber() { return CreditCardNumber; }


    public String getCvv() { return Cvv; }
}