package dhbwka.wwi.vertsys.rest.demo;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
public class FernsehprogrammEintrag implements Serializable{
	@Id
	@GeneratedValue
	@NotNull
	private long nummer = 1;
	
	//Struktur, nummer und fernsehsender werden (festgelegt), Elemente für folgende Klassen
	
	@Column(length = 20)
	@Size(min = 3, max = 20, message = "Sender muss zwischen 3 und 20 Zeichen lang sein")
	@NotNull(message = "Sender Name darf nicht leer sein")
	private String fernsehsender= "";
	
	public FernsehprogrammEintrag() {
		
	}

	public void setFernsehsender(String name) {
		this.fernsehsender = name;
	}
}
