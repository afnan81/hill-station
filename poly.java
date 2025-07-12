class HillStations {

     void location(){
        System.out.println("Location is:");
     }
     void famousfor(){
        System.out.println("Famous For:");
     }

}

class manali extends HillStations{
    void location(){
        System.out.println("manali is in Himali pradesh");
    }
    void famousfor(){
        System.out.println("It is famous for hadimba temple and Adventure Sports");
    }
}

class musoorie extends HillStations{
    void location(){
        System.out.println("Gulmang is in J&K");
    }
    void famousfor(){
        System.out.println("Itsis famous for Skiing");
    }
}

class main{
    public static void main(String args[]){
    HillStations A= new HillStations();
    HillStations m= new manali();
    HillStations mu=new musoorie();

    A.location();
    A.famousfor();

    m.location();
    m.famousfor();

    mu.location();
    mu.famousfor();
    }
}
