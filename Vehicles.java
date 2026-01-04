class Vehicles {
    String model;
    String name;
    public Vehicles(){

    }
    public Vehicles(String name, String model){
        this.name=name;
        this.model=model;
    }
   public static void main(String[] args){
    Vehicles vechile = new Vehicles("Tata","20");
    System.out.println(vechile.getName());
    System.out.println(vechile.getModel());
   } 
   public void setName(String name){
    this.name=name;
   }
   public String getName(){
    return name;
   }
   public void setModel(String model){
    this.model=model;
   }
   public String getModel(){
    return model;
   }
}