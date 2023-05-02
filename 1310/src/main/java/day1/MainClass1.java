package day1;
import javax.persistence.*;
@Entity
class Details{
	@Id
	int id;
	String name;
	String address;
	public Details(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
}

public class MainClass1 {
	public static void main(String[] args) {
	EntityManagerFactory	p=Persistence.createEntityManagerFactory("dev");
	EntityManager c=p.createEntityManager();
	EntityTransaction t=c.getTransaction();
	Details d = new Details(101,"perumal","Tirupattur");
	t.begin();
	c.persist(d);
	t.commit();
		
	}

}
