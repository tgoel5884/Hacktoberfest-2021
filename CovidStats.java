public class MyClass {
    public static void main(String args[]) {
      
      CovidStats cs = new CovidStats("mu", 15000,82,0);
      System.out.println(cs.toJson());
    }
}
class CovidStats{
  String country;
  int confirmed;
  int deaths;
  int recovered;
  
  public CovidStats(String country, int confirmed, int deaths, int recovered){
    this.country = country;
    this.confirmed = confirmed;
    this.deaths = deaths;
    this.recovered = recovered;
  }
  
  public String toJson(){
    return ("{\"country\": \"" + this.country
            +"\",\"confirmed\": \"" + this.confirmed
            +"\",\"deaths\": \"" + this.deaths
            +"\",\"recovered\": \"" + this.recovered
            +"\"}");
    }
}
