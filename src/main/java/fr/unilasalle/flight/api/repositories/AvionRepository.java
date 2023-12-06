package repositories;


import beans.Avion;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.inject.Model;

import javax.enterprise.context.ApplicationScoped;

@Model
public class AvionRepository implements PanacheRepositoryBase<Avion, Long> {
   // je peux maintenant faire ce que je veux les méthodes panachees


    public  void  ggbhn (){
        this.deleteAll();
    }

    public  List<Avion> finfByOperator(String operatorParametre){
        return find("operator", operatorParametre).list();
    }

    public  void machin()[
            this.find()
     recuper tou les aavion en fonction du farbrican
            recuper un avion par sa clé primaire

    toute les opération du crud


}
