
class main{
  public static void main(String[] args) {
    Product p1 = new Product("chair", 500.00);
    Product p2 = new Product("Television", 20000.00);
    Product p3 = new Product("Iphone", 40000.00);
    Product p4 = new Product("OOP Programming", 250.00);

    
    Electronics e2 = new Electronics("Samsung", "Neo QLED");
    Electronics e3 = new Electronics("Apple", "Iphone 99");
    
    Smartphone m1 = new Smartphone("Ios");

    Book b1 = new Book("John Doe", 300);

    p1.showDetails();
    System.out.println("**********************************************************");
    p2.showDetails();
    e2.showDetails();
    System.out.println("**********************************************************");
    p3.showDetails();
    e3.showDetails();
    m1.showDetails();
    System.out.println("**********************************************************");
    p4.showDetails();
    b1.showDetails();
    System.out.println("**********************************************************");
  }
}

class Product{
  public String Name;
  public double Price;

  Product(String name,double price){
    Name = name;
    Price = price;
  }
  
  public void showDetails(){
    System.out.println("Product Name : "+Name);
    System.out.println("Product Price : "+Price);
  }
  
}

class Electronics{
  public String brand;
  public String model;

  Electronics(String Brand,String Model){
    brand = Brand;
    model = Model;
  
  }
  
  public void showDetails(){
    System.out.println("Brand : "+brand);
    System.out.println("Model : "+model);
  }
}

class Book{
  public String author;
  public Integer pages;
  Book(String Author, int Pages){
    author = Author;
    pages = Pages;
    
  }

  public void showDetails(){
    System.out.println("Author : "+author);
    System.out.println("Number of Pages : "+pages);
  }
    
  
}

class Smartphone{
  public String OperatingSystem;

  Smartphone(String operatingSystem){
    OperatingSystem = operatingSystem;
  }
  public void showDetails(){
    System.out.println("OperatingSystem System : "+OperatingSystem);
  }
}