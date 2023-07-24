package encapsiswa;
public class encapSiswa {
    private String name;
    private String address;   //ada 4; private,public,protected,default
    private int age;
    
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
      return address;
    }
    public void setAge (int newAge){
        age=newAge;
    }
    public void setName (String newName){
        name=newName;
    }
    public void setAddress (String newAddress){
        address=newAddress;
    }   
    public void cetak (){
    System.out.println("");
    System.out.println("Nama   : "+getName());
    System.out.println("Umur   : "+getAge());
    System.out.println("Alamat : "+getAddress());
        }
    }
    


    

