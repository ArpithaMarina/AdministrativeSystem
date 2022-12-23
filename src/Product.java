public class Product {

    private String id;
    private String name;
    private int qte;
    private String price;
    private String Whoprice;
    private byte[] Image;
    
    public Product(){}
    
    public Product(String Id, String Name, int Qte, String Price,byte[] image, String Whoprice){
    
        this.id = Id;
        this.name = Name;
        this.qte = Qte;
        this.price = Price;
        this.Image = image;
        this.Whoprice = Whoprice;
       
    }
    
    
    public String getID(){
      return id;
    }
    
    public void setID(String ID){
        this.id = ID;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String Name){
        this.name = Name;
    }
    
    public int getQte(){
        return qte;
    }
    
    public void setQte(int Qte){
        this.qte = Qte;
    }
    
    public String getPrice(){
        return price;
    }
    
    public void setPrice(String Price){
        this.price = Price;
    }
    
    public String getWhoprice(){
        return Whoprice;
    }
    
    public void setWhoprice(String Whoprice){
        this.Whoprice = Whoprice;
    }
    
    public byte[] getMyImage(){
        return Image;
    }
}

